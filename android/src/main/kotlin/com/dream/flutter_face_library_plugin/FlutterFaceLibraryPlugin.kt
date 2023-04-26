package com.dream.flutter_face_library_plugin

import androidx.annotation.NonNull
import com.mf.face.entity.FaceRecognitionEntity
import com.mf.face.entity.FaceRegisterEntity
import com.mf.face.entity.FaceTipsEntity
import com.mf.face.helper.FaceHelper
import com.mf.face.listener.FaceHelperListener

import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result

/** FlutterFaceLibraryPlugin */
class FlutterFaceLibraryPlugin : FlutterPlugin, MethodCallHandler {
    /// The MethodChannel that will the communication between Flutter and native Android
    ///
    /// This local reference serves to register the plugin with the Flutter Engine and unregister it
    /// when the Flutter Engine is detached from the Activity
    private lateinit var channel: MethodChannel

    override fun onAttachedToEngine(@NonNull binding: FlutterPlugin.FlutterPluginBinding) {
        channel = MethodChannel(binding.binaryMessenger, "flutter_face_library_plugin")
        channel.setMethodCallHandler(this)
        FaceLibraryApi.FaceRequestApi.setup(
            binding.binaryMessenger,
            FaceRequestApiImpl()
        )
        val faceResultApi = FaceLibraryApi.FaceResultApi(binding.binaryMessenger)
        FaceHelper.getInstance().setListener(object : FaceHelperListener {
            override fun onError(code: Int, msg: String?) {
                val result = FaceLibraryApi.FaceResult()
                result.code = code.toLong()
                result.msg = msg
                faceResultApi.faceErrorCallback(result) { }
            }

            override fun onFaceRegisterTipsResult(entity: FaceTipsEntity?) {
                val result = FaceLibraryApi.FaceResult()
                result.isShowPreviewView = entity?.isShowPreviewView
                result.code = entity?.code?.toLong()
                result.msg = entity?.msg
                result.detail = entity?.detail
                result.useType = entity?.useType?.toLong()
                result.tag = entity?.tag
                result.which = entity?.which?.toLong()
                faceResultApi.faceRegisterTipsCallback(result) { }
            }

            override fun onFaceRecognitionTipsResult(entity: FaceTipsEntity?) {
                val result = FaceLibraryApi.FaceResult()
                result.isShowPreviewView = entity?.isShowPreviewView
                result.code = entity?.code?.toLong()
                result.msg = entity?.msg
                result.detail = entity?.detail
                result.useType = entity?.useType?.toLong()
                result.tag = entity?.tag
                result.which = entity?.which?.toLong()
                faceResultApi.faceRecognitionTipsCallback(result) { }
            }

            override fun onFaceRegisterResult(entity: FaceRegisterEntity?) {
                val result = FaceLibraryApi.FaceResult()
                result.isShowPreviewView = entity?.isShowPreviewView
                result.code = entity?.code?.toLong()
                result.msg = entity?.msg
                result.detail = entity?.detail
                result.licenseNo = entity?.licenseNo
                result.faceId = entity?.faceId
                result.faceFeature = entity?.faceFeature
                result.faceImgPath = entity?.faceImgPath
                result.useType = entity?.useType?.toLong()
                result.tag = entity?.tag
                result.which = entity?.which?.toLong()
                faceResultApi.faceRegisterCallback(result) { }
            }

            override fun onFaceRecognitionResult(entity: FaceRecognitionEntity?) {
                val result = FaceLibraryApi.FaceResult()
                result.isShowPreviewView = entity?.isShowPreviewView
                result.code = entity?.code?.toLong()
                result.msg = entity?.msg
                result.detail = entity?.detail
                result.faceId = entity?.faceId
                result.useType = entity?.useType?.toLong()
                result.tag = entity?.tag
                result.which = entity?.which?.toLong()
                faceResultApi.faceRecognitionCallback(result) { }
            }

            override fun onCancelFaceRegisterAndRecognitionResult(code: Int, msg: String?) {
                val result = FaceLibraryApi.FaceResult()
                result.code = code.toLong()
                result.msg = msg
                faceResultApi.cancelFaceRegisterAndRecognitionCallback(result) {}
            }

            override fun onSyncFaceDataResult(code: Int, msg: String?) {
                val result = FaceLibraryApi.FaceResult()
                result.code = code.toLong()
                result.msg = msg
                faceResultApi.syncFaceDataCallback(result) {}
            }

            override fun onRemoveFaceDataResult(code: Int, msg: String?) {
                val result = FaceLibraryApi.FaceResult()
                result.code = code.toLong()
                result.msg = msg
                faceResultApi.cleanFaceDataDataCallback(result) {}
            }

            override fun onManualCancelFaceRegister() {
                val result = FaceLibraryApi.FaceResult()
                faceResultApi.manualCancelFaceRegisterCallback(result) { }
            }

            override fun onManualCancelFaceRecognition() {
                val result = FaceLibraryApi.FaceResult()
                faceResultApi.manualCancelFaceRecognitionCallback(result) { }
            }

            override fun onPickCarByPlate() {
                faceResultApi.buttonClickCallback("pick_car_by_plate") { }
            }

            override fun onPickCarByBerth() {
                faceResultApi.buttonClickCallback("pick_car_by_berth") { }
            }
        })
        // 启动人脸识别服务
        FaceHelper.getInstance().startFaceService(binding.applicationContext)
    }

    override fun onDetachedFromEngine(@NonNull binding: FlutterPlugin.FlutterPluginBinding) {
        channel.setMethodCallHandler(null)
        FaceHelper.getInstance().stopFaceService(binding.applicationContext)
        FaceLibraryApi.FaceRequestApi.setup(binding.binaryMessenger, null)
        FaceHelper.getInstance().setListener(null)
    }

    override fun onMethodCall(@NonNull call: MethodCall, @NonNull result: Result) {
        if (call.method == "getPlatformVersion") {
            result.success("Android ${android.os.Build.VERSION.RELEASE}")
        } else {
            result.notImplemented()
        }
    }
}
