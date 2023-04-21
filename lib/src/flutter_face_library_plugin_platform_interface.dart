import 'package:plugin_platform_interface/plugin_platform_interface.dart';

import 'flutter_face_library_plugin_method_channel.dart';

abstract class FlutterFaceLibraryPluginPlatform extends PlatformInterface {
  /// Constructs a FlutterFaceLibraryPluginPlatform.
  FlutterFaceLibraryPluginPlatform() : super(token: _token);

  static final Object _token = Object();

  static FlutterFaceLibraryPluginPlatform _instance =
      MethodChannelFlutterFaceLibraryPlugin();

  /// The default instance of [FlutterFaceLibraryPluginPlatform] to use.
  ///
  /// Defaults to [MethodChannelFlutterFaceLibraryPlugin].
  static FlutterFaceLibraryPluginPlatform get instance => _instance;

  /// Platform-specific implementations should set this with their own
  /// platform-specific class that extends [FlutterFaceLibraryPluginPlatform] when
  /// they register themselves.
  static set instance(FlutterFaceLibraryPluginPlatform instance) {
    PlatformInterface.verifyToken(instance, _token);
    _instance = instance;
  }

  Future<String?> getPlatformVersion() {
    throw UnimplementedError('platformVersion() has not been implemented.');
  }
}
