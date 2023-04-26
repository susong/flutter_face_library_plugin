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
  FaceResultCallback? _cancelFaceRegisterAndRecognitionCallback;
  FaceResultCallback? _addFaceDataCallback;
  FaceResultCallback? _removeFaceDataCallback;
  FaceResultCallback? _syncFaceDataCallback;
  FaceResultCallback? _cleanFaceDataDataCallback;
  FaceResultCallback? _faceDetectedCallback;
  FaceResultCallback? _noFaceDetectedCallback;
  FaceResultCallback? _manualCancelFaceRegisterCallback;
  FaceResultCallback? _manualCancelFaceRecognitionCallback;
  FaceButtonClickCallback? _buttonClickCallback;

  void setFaceErrorCallback(FaceResultCallback callback) {
    _faceErrorCallback = callback;
  }

  void setFaceRegisterCallback(FaceResultCallback callback) {
    _faceRegisterCallback = callback;
  }

  void setFaceRegisterTipsCallback(FaceResultCallback callback) {
    _faceRegisterTipsCallback = callback;
  }

  void setFaceRecognitionCallback(FaceResultCallback callback) {
    _faceRecognitionCallback = callback;
  }

  void setFaceRecognitionTipsCallback(FaceResultCallback callback) {
    _faceRecognitionTipsCallback = callback;
  }

  void setCancelFaceRegisterAndRecognitionCallback(
      FaceResultCallback callback) {
    _cancelFaceRegisterAndRecognitionCallback = callback;
  }

  void setAddFaceDataCallback(FaceResultCallback callback) {
    _addFaceDataCallback = callback;
  }

  void setRemoveFaceDataCallback(FaceResultCallback callback) {
    _removeFaceDataCallback = callback;
  }

  void setSyncFaceDataCallback(FaceResultCallback callback) {
    _syncFaceDataCallback = callback;
  }

  void setCleanFaceDataDataCallback(FaceResultCallback callback) {
    _cleanFaceDataDataCallback = callback;
  }

  void setFaceDetectedCallback(FaceResultCallback callback) {
    _faceDetectedCallback = callback;
  }

  void setNoFaceDetectedCallback(FaceResultCallback callback) {
    _noFaceDetectedCallback = callback;
  }

  void setManualCancelFaceRegisterCallback(FaceResultCallback callback) {
    _manualCancelFaceRegisterCallback = callback;
  }

  void setManualCancelFaceRecognitionCallback(FaceResultCallback callback) {
    _manualCancelFaceRecognitionCallback = callback;
  }

  void setButtonClickCallback(FaceButtonClickCallback callback) {
    _buttonClickCallback = callback;
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
  void cancelFaceRegisterAndRecognitionCallback(FaceResult result) {
    if (_cancelFaceRegisterAndRecognitionCallback != null) {
      _cancelFaceRegisterAndRecognitionCallback!(result);
    }
  }

  @override
  void addFaceDataCallback(FaceResult result) {
    if (_addFaceDataCallback != null) {
      _addFaceDataCallback!(result);
    }
  }

  @override
  void removeFaceDataCallback(FaceResult result) {
    if (_removeFaceDataCallback != null) {
      _removeFaceDataCallback!(result);
    }
  }

  @override
  void syncFaceDataCallback(FaceResult result) {
    if (_syncFaceDataCallback != null) {
      _syncFaceDataCallback!(result);
    }
  }

  @override
  void cleanFaceDataDataCallback(FaceResult result) {
    if (_cleanFaceDataDataCallback != null) {
      _cleanFaceDataDataCallback!(result);
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
  void manualCancelFaceRegisterCallback(FaceResult result) {
    if (_manualCancelFaceRegisterCallback != null) {
      _manualCancelFaceRegisterCallback!(result);
    }
  }

  @override
  void manualCancelFaceRecognitionCallback(FaceResult result) {
    if (_manualCancelFaceRecognitionCallback != null) {
      _manualCancelFaceRecognitionCallback!(result);
    }
  }

  @override
  void buttonClickCallback(String buttonType) {
    if (_buttonClickCallback != null) {
      _buttonClickCallback!(buttonType);
    }
  }
}
