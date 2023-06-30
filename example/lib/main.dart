import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter_face_library_plugin/flutter_face_library.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatefulWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  String _platformVersion = 'Unknown';
  final _flutterFaceLibraryPlugin = FlutterFaceLibraryPlugin();

  @override
  void initState() {
    super.initState();
    initPlatformState();
  }

  // Platform messages are asynchronous, so we initialize in an async method.
  Future<void> initPlatformState() async {
    String platformVersion;
    // Platform messages may fail, so we use a try/catch PlatformException.
    // We also handle the message potentially returning null.
    try {
      platformVersion = await _flutterFaceLibraryPlugin.getPlatformVersion() ??
          'Unknown platform version';
    } on PlatformException {
      platformVersion = 'Failed to get platform version.';
    }

    // If the widget was removed from the tree while the asynchronous platform
    // message was in flight, we want to discard the reply rather than calling
    // setState to update our non-existent appearance.
    if (!mounted) return;

    setState(() {
      _platformVersion = platformVersion;
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Plugin example app'),
        ),
        body: Center(
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.center,
            children: [
              Text('Running on: $_platformVersion\n'),
              ElevatedButton(
                onPressed: () {
                  FaceApi().faceRegister(true, "粤B12345");
                },
                child: const Text("faceRegister"),
              ),
              ElevatedButton(
                onPressed: () {
                  FaceApi().faceRecognition(true);
                },
                child: const Text("faceRecognition"),
              ),
              ElevatedButton(
                onPressed: () {
                  FaceApi().cancelFaceRegisterAndRecognition();
                },
                child: const Text("cancelFaceRegisterAndRecognition"),
              ),
              ElevatedButton(
                onPressed: () {
                  var faceInfo = FaceInfo(
                    faceId: "faceId_1",
                    faceFeature: "faceFeature_1",
                  );
                  FaceApi().addFaceData(faceInfo);
                },
                child: const Text("addFaceData"),
              ),
              ElevatedButton(
                onPressed: () {
                  var faceInfo = FaceInfo(
                    faceId: "faceId_1",
                    faceFeature: "faceFeature_1",
                  );
                  FaceApi().removeFaceData(faceInfo);
                },
                child: const Text("removeFaceData"),
              ),
              ElevatedButton(
                onPressed: () {
                  var faceInfos = <FaceInfo>[];
                  faceInfos.add(
                    FaceInfo(
                      faceId: "faceId_1",
                      faceFeature: "faceFeature_1",
                    ),
                  );
                  faceInfos.add(
                    FaceInfo(
                      faceId: "faceId_2",
                      faceFeature: "faceFeature_2",
                    ),
                  );
                  FaceApi().syncFaceData(faceInfos);
                },
                child: const Text("syncFaceData"),
              ),
              ElevatedButton(
                onPressed: () {
                  FaceApi().cleanFaceData();
                },
                child: const Text("cleanFaceData"),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
