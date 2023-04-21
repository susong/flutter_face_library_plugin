package com.dream.flutter_face_library_plugin;

import androidx.annotation.NonNull;

import com.mf.face.helper.FaceHelper;

import java.util.List;

public class FaceRequestApiImpl implements FaceLibraryApi.FaceRequestApi {
    @Override
    public void faceRegister(@NonNull Boolean isShowPreviewView, @NonNull String licenseNo, FaceLibraryApi.Result<FaceLibraryApi.FaceResult> result) {
        FaceHelper.getInstance().faceRegister(isShowPreviewView, licenseNo);
        result.success(new FaceLibraryApi.FaceResult());
    }

    @Override
    public void faceRecognition(@NonNull Boolean isShowPreviewView, FaceLibraryApi.Result<FaceLibraryApi.FaceResult> result) {
        FaceHelper.getInstance().faceRecognition(isShowPreviewView);
        result.success(new FaceLibraryApi.FaceResult());
    }

    @Override
    public void cancelFaceRegisterAndRecognition(FaceLibraryApi.Result<FaceLibraryApi.FaceResult> result) {
        FaceHelper.getInstance().cancelFaceRegisterAndRecognition();
        result.success(new FaceLibraryApi.FaceResult());
    }

    @Override
    public void addFaceData(@NonNull FaceLibraryApi.FaceInfo faceInfo, FaceLibraryApi.Result<FaceLibraryApi.FaceResult> result) {
        FaceHelper.getInstance().syncFaceData(faceInfo.getFaceId(), faceInfo.getFaceFeature());
        result.success(new FaceLibraryApi.FaceResult());
    }

    @Override
    public void removeFaceData(@NonNull FaceLibraryApi.FaceInfo faceInfo, FaceLibraryApi.Result<FaceLibraryApi.FaceResult> result) {
        result.success(new FaceLibraryApi.FaceResult());
    }

    @Override
    public void syncFaceData(@NonNull List<FaceLibraryApi.FaceInfo> faceInfos, FaceLibraryApi.Result<FaceLibraryApi.FaceResult> result) {
        for (FaceLibraryApi.FaceInfo faceInfo : faceInfos) {
            FaceHelper.getInstance().syncFaceData(faceInfo.getFaceId(), faceInfo.getFaceFeature());
        }
        result.success(new FaceLibraryApi.FaceResult());
    }

    @Override
    public void cleanFaceData(FaceLibraryApi.Result<FaceLibraryApi.FaceResult> result) {
        FaceHelper.getInstance().removeFaceData();
        result.success(new FaceLibraryApi.FaceResult());
    }
}
