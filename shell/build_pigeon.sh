#!/usr/bin/env bash

mkdir -p ./android/src/main/java/com/dream/flutter_face_library_plugin
mkdir -p ./lib/src/
flutter pub run pigeon \
  --input ./pigeons/face_api.dart \
  --dart_out ./lib/src/face_library_api.dart \
  --java_out ./android/src/main/java/com/dream/flutter_face_library_plugin/FaceLibraryApi.java \
  --java_package "com.dream.flutter_face_library_plugin"

# 输出当前时间
time=$(date "+%Y-%m-%d %H:%M:%S")
echo "Finish at ${time}"