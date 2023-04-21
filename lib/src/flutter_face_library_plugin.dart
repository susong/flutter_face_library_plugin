import 'flutter_face_library_plugin_platform_interface.dart';

class FlutterFaceLibraryPlugin {
  Future<String?> getPlatformVersion() {
    return FlutterFaceLibraryPluginPlatform.instance.getPlatformVersion();
  }
}
