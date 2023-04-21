import 'package:pigeon/pigeon.dart';

class FaceInfo {
  String? faceId;
  String? faceFeature;
}

class FaceResult {
  bool? isShowPreviewView;
  int? code;
  String? msg;
  String? detail;
  String? licenseNo;
  List<String?>? licenseNos;
  String? faceId;
  String? faceFeature;
  String? faceImgPath;
  int? useType;
  String? tag;
  int? which;
}

@HostApi()
abstract class FaceRequestApi {
  @async
  FaceResult faceRegister(bool isShowPreviewView, String licenseNo);

  @async
  FaceResult faceRecognition(bool isShowPreviewView);

  @async
  FaceResult cancelFaceRegisterAndRecognition();

  @async
  FaceResult addFaceData(FaceInfo faceInfo);

  @async
  FaceResult removeFaceData(FaceInfo faceInfo);

  @async
  FaceResult syncFaceData(List<FaceInfo> faceInfos);

  @async
  FaceResult cleanFaceData();
}

@FlutterApi()
abstract class FaceResultApi {
  void faceErrorCallback(FaceResult faceResult);

  void faceRegisterCallback(FaceResult faceResult);

  void faceRegisterTipsCallback(FaceResult faceResult);

  void faceRecognitionCallback(FaceResult faceResult);

  void faceRecognitionTipsCallback(FaceResult faceResult);

  void faceDetectedCallback(FaceResult faceResult);

  void noFaceDetectedCallback(FaceResult faceResult);

  void manualCancelFaceRegisterCallback();

  void manualCancelFaceRecognitionCallback();

  void buttonClickCallback(String buttonType);
}
