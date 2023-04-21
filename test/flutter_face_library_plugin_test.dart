import 'package:flutter_test/flutter_test.dart';
import 'package:flutter_face_library_plugin/src/flutter_face_library_plugin.dart';
import 'package:flutter_face_library_plugin/src/flutter_face_library_plugin_platform_interface.dart';
import 'package:flutter_face_library_plugin/src/flutter_face_library_plugin_method_channel.dart';
import 'package:plugin_platform_interface/plugin_platform_interface.dart';

class MockFlutterFaceLibraryPluginPlatform 
    with MockPlatformInterfaceMixin
    implements FlutterFaceLibraryPluginPlatform {

  @override
  Future<String?> getPlatformVersion() => Future.value('42');
}

void main() {
  final FlutterFaceLibraryPluginPlatform initialPlatform = FlutterFaceLibraryPluginPlatform.instance;

  test('$MethodChannelFlutterFaceLibraryPlugin is the default instance', () {
    expect(initialPlatform, isInstanceOf<MethodChannelFlutterFaceLibraryPlugin>());
  });

  test('getPlatformVersion', () async {
    FlutterFaceLibraryPlugin flutterFaceLibraryPlugin = FlutterFaceLibraryPlugin();
    MockFlutterFaceLibraryPluginPlatform fakePlatform = MockFlutterFaceLibraryPluginPlatform();
    FlutterFaceLibraryPluginPlatform.instance = fakePlatform;
  
    expect(await flutterFaceLibraryPlugin.getPlatformVersion(), '42');
  });
}
