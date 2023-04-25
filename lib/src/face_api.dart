import 'face_library_api.dart';

typedef FaceResultCallback = void Function(FaceResult result);
typedef FaceVoidCallback = void Function();
typedef FaceButtonClickCallback = void Function(String buttonType);

class FaceApi implements FaceResultApi {
  late FaceRequestApi _faceRequestApi;

  FaceApi._internal() {
    _faceRequestApi = FaceRequestApi();
    FaceResultApi.setup(this);
  }

  static final FaceApi _instance = FaceApi._internal();

  factory FaceApi() => _instance; // 工厂函数单例

  FaceResultCallback? _faceErrorCallback;
  FaceResultCallback? _faceRegisterCallback;
  FaceResultCallback? _faceRegisterTipsCallback;
  FaceResultCallback? _faceRecognitionCallback;
  FaceResultCallback? _faceRecognitionTipsCallback;
  FaceResultCallback? _faceDetectedCallback;
  FaceResultCallback? _noFaceDetectedCallback;
  FaceVoidCallback? _manualCancelFaceRegisterCallback;
  FaceVoidCallback? _manualCancelFaceRecognitionCallback;
  FaceButtonClickCallback? _buttonClickCallback;

  void setFaceErrorCallback(FaceResultCallback callback) {
    this._faceErrorCallback = callback;
  }

  void setFaceRegisterCallback(FaceResultCallback callback) {
    this._faceRegisterCallback = callback;
  }

  void setFaceRegisterTipsCallback(FaceResultCallback callback) {
    this._faceRegisterTipsCallback = callback;
  }

  void setFaceRecognitionCallback(FaceResultCallback callback) {
    this._faceRecognitionCallback = callback;
  }

  void setFaceRecognitionTipsCallback(FaceResultCallback callback) {
    this._faceRecognitionTipsCallback = callback;
  }

  void setFaceDetectedCallback(FaceResultCallback callback) {
    this._faceDetectedCallback = callback;
  }

  void setNoFaceDetectedCallback(FaceResultCallback callback) {
    this._noFaceDetectedCallback = callback;
  }

  void setManualCancelFaceRegisterCallback(FaceVoidCallback callback) {
    this._manualCancelFaceRegisterCallback = callback;
  }

  void setManualCancelFaceRecognitionCallback(FaceVoidCallback callback) {
    this._manualCancelFaceRecognitionCallback = callback;
  }

  void setButtonClickCallback(FaceButtonClickCallback callback) {
    this._buttonClickCallback = callback;
  }

  Future<FaceResult> faceRegister(bool isShowPreviewView, String licenseNo) {
    return _faceRequestApi.faceRegister(isShowPreviewView, licenseNo);
  }

  Future<FaceResult> faceRecognition(bool isShowPreviewView) {
    return _faceRequestApi.faceRecognition(isShowPreviewView);
  }

  Future<FaceResult> cancelFaceRegisterAndRecognition() {
    return _faceRequestApi.cancelFaceRegisterAndRecognition();
  }

  Future<FaceResult> addFaceData(FaceInfo faceInfo) {
    return _faceRequestApi.addFaceData(faceInfo);
  }

  Future<FaceResult> removeFaceData(FaceInfo faceInfo) {
    return _faceRequestApi.removeFaceData(faceInfo);
  }

  Future<FaceResult> syncFaceData(List<FaceInfo> faceInfos) {
    return _faceRequestApi.syncFaceData(faceInfos);
  }

  Future<FaceResult> cleanFaceData() {
    return _faceRequestApi.cleanFaceData();
  }

  @override
  void faceErrorCallback(FaceResult result) {
    if (_faceErrorCallback != null) {
      _faceErrorCallback!(result);
    }
  }

  @override
  void faceRegisterCallback(FaceResult result) {
    if (_faceRegisterCallback != null) {
      _faceRegisterCallback!(result);
    }
  }

  @override
  void faceRegisterTipsCallback(FaceResult result) {
    if (_faceRegisterTipsCallback != null) {
      _faceRegisterTipsCallback!(result);
    }
  }

  @override
  void faceRecognitionCallback(FaceResult result) {
    if (_faceRecognitionCallback != null) {
      _faceRecognitionCallback!(result);
    }
  }

  @override
  void faceRecognitionTipsCallback(FaceResult result) {
    if (_faceRecognitionTipsCallback != null) {
      _faceRecognitionTipsCallback!(result);
    }
  }

  @override
  void faceDetectedCallback(FaceResult result) {
    if (_faceDetectedCallback != null) {
      _faceDetectedCallback!(result);
    }
  }

  @override
  void noFaceDetectedCallback(FaceResult result) {
    if (_noFaceDetectedCallback != null) {
      _noFaceDetectedCallback!(result);
    }
  }

  @override
  void manualCancelFaceRegisterCallback() {
    if (_manualCancelFaceRegisterCallback != null) {
      _manualCancelFaceRegisterCallback!();
    }
  }

  @override
  void manualCancelFaceRecognitionCallback() {
    if (_manualCancelFaceRecognitionCallback != null) {
      _manualCancelFaceRecognitionCallback!();
    }
  }

  @override
  void buttonClickCallback(String buttonType) {
    if (_buttonClickCallback != null) {
      _buttonClickCallback!(buttonType);
    }
  }
}
