import 'package:flutter/foundation.dart';
import 'package:flutter/services.dart';

import 'flutter_face_library_plugin_platform_interface.dart';

/// An implementation of [FlutterFaceLibraryPluginPlatform] that uses method channels.
class MethodChannelFlutterFaceLibraryPlugin extends FlutterFaceLibraryPluginPlatform {
  /// The method channel used to interact with the native platform.
  @visibleForTesting
  final methodChannel = const MethodChannel('flutter_face_library_plugin');

  @override
  Future<String?> getPlatformVersion() async {
    final version = await methodChannel.invokeMethod<String>('getPlatformVersion');
    return version;
  }
}
