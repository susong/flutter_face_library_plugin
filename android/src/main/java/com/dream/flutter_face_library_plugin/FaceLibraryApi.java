// Autogenerated from Pigeon (v3.2.9), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package com.dream.flutter_face_library_plugin;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class FaceLibraryApi {

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class FaceInfo {
    private @Nullable String faceId;
    public @Nullable String getFaceId() { return faceId; }
    public void setFaceId(@Nullable String setterArg) {
      this.faceId = setterArg;
    }

    private @Nullable String faceFeature;
    public @Nullable String getFaceFeature() { return faceFeature; }
    public void setFaceFeature(@Nullable String setterArg) {
      this.faceFeature = setterArg;
    }

    public static final class Builder {
      private @Nullable String faceId;
      public @NonNull Builder setFaceId(@Nullable String setterArg) {
        this.faceId = setterArg;
        return this;
      }
      private @Nullable String faceFeature;
      public @NonNull Builder setFaceFeature(@Nullable String setterArg) {
        this.faceFeature = setterArg;
        return this;
      }
      public @NonNull FaceInfo build() {
        FaceInfo pigeonReturn = new FaceInfo();
        pigeonReturn.setFaceId(faceId);
        pigeonReturn.setFaceFeature(faceFeature);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("faceId", faceId);
      toMapResult.put("faceFeature", faceFeature);
      return toMapResult;
    }
    static @NonNull FaceInfo fromMap(@NonNull Map<String, Object> map) {
      FaceInfo pigeonResult = new FaceInfo();
      Object faceId = map.get("faceId");
      pigeonResult.setFaceId((String)faceId);
      Object faceFeature = map.get("faceFeature");
      pigeonResult.setFaceFeature((String)faceFeature);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class FaceResult {
    private @Nullable Boolean isShowPreviewView;
    public @Nullable Boolean getIsShowPreviewView() { return isShowPreviewView; }
    public void setIsShowPreviewView(@Nullable Boolean setterArg) {
      this.isShowPreviewView = setterArg;
    }

    private @Nullable Long code;
    public @Nullable Long getCode() { return code; }
    public void setCode(@Nullable Long setterArg) {
      this.code = setterArg;
    }

    private @Nullable String msg;
    public @Nullable String getMsg() { return msg; }
    public void setMsg(@Nullable String setterArg) {
      this.msg = setterArg;
    }

    private @Nullable String detail;
    public @Nullable String getDetail() { return detail; }
    public void setDetail(@Nullable String setterArg) {
      this.detail = setterArg;
    }

    private @Nullable String licenseNo;
    public @Nullable String getLicenseNo() { return licenseNo; }
    public void setLicenseNo(@Nullable String setterArg) {
      this.licenseNo = setterArg;
    }

    private @Nullable List<String> licenseNos;
    public @Nullable List<String> getLicenseNos() { return licenseNos; }
    public void setLicenseNos(@Nullable List<String> setterArg) {
      this.licenseNos = setterArg;
    }

    private @Nullable String faceId;
    public @Nullable String getFaceId() { return faceId; }
    public void setFaceId(@Nullable String setterArg) {
      this.faceId = setterArg;
    }

    private @Nullable String faceFeature;
    public @Nullable String getFaceFeature() { return faceFeature; }
    public void setFaceFeature(@Nullable String setterArg) {
      this.faceFeature = setterArg;
    }

    private @Nullable String faceImgPath;
    public @Nullable String getFaceImgPath() { return faceImgPath; }
    public void setFaceImgPath(@Nullable String setterArg) {
      this.faceImgPath = setterArg;
    }

    private @Nullable Long useType;
    public @Nullable Long getUseType() { return useType; }
    public void setUseType(@Nullable Long setterArg) {
      this.useType = setterArg;
    }

    private @Nullable String tag;
    public @Nullable String getTag() { return tag; }
    public void setTag(@Nullable String setterArg) {
      this.tag = setterArg;
    }

    private @Nullable Long which;
    public @Nullable Long getWhich() { return which; }
    public void setWhich(@Nullable Long setterArg) {
      this.which = setterArg;
    }

    public static final class Builder {
      private @Nullable Boolean isShowPreviewView;
      public @NonNull Builder setIsShowPreviewView(@Nullable Boolean setterArg) {
        this.isShowPreviewView = setterArg;
        return this;
      }
      private @Nullable Long code;
      public @NonNull Builder setCode(@Nullable Long setterArg) {
        this.code = setterArg;
        return this;
      }
      private @Nullable String msg;
      public @NonNull Builder setMsg(@Nullable String setterArg) {
        this.msg = setterArg;
        return this;
      }
      private @Nullable String detail;
      public @NonNull Builder setDetail(@Nullable String setterArg) {
        this.detail = setterArg;
        return this;
      }
      private @Nullable String licenseNo;
      public @NonNull Builder setLicenseNo(@Nullable String setterArg) {
        this.licenseNo = setterArg;
        return this;
      }
      private @Nullable List<String> licenseNos;
      public @NonNull Builder setLicenseNos(@Nullable List<String> setterArg) {
        this.licenseNos = setterArg;
        return this;
      }
      private @Nullable String faceId;
      public @NonNull Builder setFaceId(@Nullable String setterArg) {
        this.faceId = setterArg;
        return this;
      }
      private @Nullable String faceFeature;
      public @NonNull Builder setFaceFeature(@Nullable String setterArg) {
        this.faceFeature = setterArg;
        return this;
      }
      private @Nullable String faceImgPath;
      public @NonNull Builder setFaceImgPath(@Nullable String setterArg) {
        this.faceImgPath = setterArg;
        return this;
      }
      private @Nullable Long useType;
      public @NonNull Builder setUseType(@Nullable Long setterArg) {
        this.useType = setterArg;
        return this;
      }
      private @Nullable String tag;
      public @NonNull Builder setTag(@Nullable String setterArg) {
        this.tag = setterArg;
        return this;
      }
      private @Nullable Long which;
      public @NonNull Builder setWhich(@Nullable Long setterArg) {
        this.which = setterArg;
        return this;
      }
      public @NonNull FaceResult build() {
        FaceResult pigeonReturn = new FaceResult();
        pigeonReturn.setIsShowPreviewView(isShowPreviewView);
        pigeonReturn.setCode(code);
        pigeonReturn.setMsg(msg);
        pigeonReturn.setDetail(detail);
        pigeonReturn.setLicenseNo(licenseNo);
        pigeonReturn.setLicenseNos(licenseNos);
        pigeonReturn.setFaceId(faceId);
        pigeonReturn.setFaceFeature(faceFeature);
        pigeonReturn.setFaceImgPath(faceImgPath);
        pigeonReturn.setUseType(useType);
        pigeonReturn.setTag(tag);
        pigeonReturn.setWhich(which);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("isShowPreviewView", isShowPreviewView);
      toMapResult.put("code", code);
      toMapResult.put("msg", msg);
      toMapResult.put("detail", detail);
      toMapResult.put("licenseNo", licenseNo);
      toMapResult.put("licenseNos", licenseNos);
      toMapResult.put("faceId", faceId);
      toMapResult.put("faceFeature", faceFeature);
      toMapResult.put("faceImgPath", faceImgPath);
      toMapResult.put("useType", useType);
      toMapResult.put("tag", tag);
      toMapResult.put("which", which);
      return toMapResult;
    }
    static @NonNull FaceResult fromMap(@NonNull Map<String, Object> map) {
      FaceResult pigeonResult = new FaceResult();
      Object isShowPreviewView = map.get("isShowPreviewView");
      pigeonResult.setIsShowPreviewView((Boolean)isShowPreviewView);
      Object code = map.get("code");
      pigeonResult.setCode((code == null) ? null : ((code instanceof Integer) ? (Integer)code : (Long)code));
      Object msg = map.get("msg");
      pigeonResult.setMsg((String)msg);
      Object detail = map.get("detail");
      pigeonResult.setDetail((String)detail);
      Object licenseNo = map.get("licenseNo");
      pigeonResult.setLicenseNo((String)licenseNo);
      Object licenseNos = map.get("licenseNos");
      pigeonResult.setLicenseNos((List<String>)licenseNos);
      Object faceId = map.get("faceId");
      pigeonResult.setFaceId((String)faceId);
      Object faceFeature = map.get("faceFeature");
      pigeonResult.setFaceFeature((String)faceFeature);
      Object faceImgPath = map.get("faceImgPath");
      pigeonResult.setFaceImgPath((String)faceImgPath);
      Object useType = map.get("useType");
      pigeonResult.setUseType((useType == null) ? null : ((useType instanceof Integer) ? (Integer)useType : (Long)useType));
      Object tag = map.get("tag");
      pigeonResult.setTag((String)tag);
      Object which = map.get("which");
      pigeonResult.setWhich((which == null) ? null : ((which instanceof Integer) ? (Integer)which : (Long)which));
      return pigeonResult;
    }
  }

  public interface Result<T> {
    void success(T result);
    void error(Throwable error);
  }
  private static class FaceRequestApiCodec extends StandardMessageCodec {
    public static final FaceRequestApiCodec INSTANCE = new FaceRequestApiCodec();
    private FaceRequestApiCodec() {}
    @Override
    protected Object readValueOfType(byte type, ByteBuffer buffer) {
      switch (type) {
        case (byte)128:         
          return FaceInfo.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)129:         
          return FaceResult.fromMap((Map<String, Object>) readValue(buffer));
        
        default:        
          return super.readValueOfType(type, buffer);
        
      }
    }
    @Override
    protected void writeValue(ByteArrayOutputStream stream, Object value)     {
      if (value instanceof FaceInfo) {
        stream.write(128);
        writeValue(stream, ((FaceInfo) value).toMap());
      } else 
      if (value instanceof FaceResult) {
        stream.write(129);
        writeValue(stream, ((FaceResult) value).toMap());
      } else 
{
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface FaceRequestApi {
    void faceRegister(@NonNull Boolean isShowPreviewView, @NonNull String licenseNo, Result<FaceResult> result);
    void faceRecognition(@NonNull Boolean isShowPreviewView, Result<FaceResult> result);
    void cancelFaceRegisterAndRecognition(Result<FaceResult> result);
    void addFaceData(@NonNull FaceInfo faceInfo, Result<FaceResult> result);
    void removeFaceData(@NonNull FaceInfo faceInfo, Result<FaceResult> result);
    void syncFaceData(@NonNull List<FaceInfo> faceInfos, Result<FaceResult> result);
    void cleanFaceData(Result<FaceResult> result);

    /** The codec used by FaceRequestApi. */
    static MessageCodec<Object> getCodec() {
      return FaceRequestApiCodec.INSTANCE;
    }

    /** Sets up an instance of `FaceRequestApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, FaceRequestApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceRequestApi.faceRegister", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Boolean isShowPreviewViewArg = (Boolean)args.get(0);
              if (isShowPreviewViewArg == null) {
                throw new NullPointerException("isShowPreviewViewArg unexpectedly null.");
              }
              String licenseNoArg = (String)args.get(1);
              if (licenseNoArg == null) {
                throw new NullPointerException("licenseNoArg unexpectedly null.");
              }
              Result<FaceResult> resultCallback = new Result<FaceResult>() {
                public void success(FaceResult result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.faceRegister(isShowPreviewViewArg, licenseNoArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceRequestApi.faceRecognition", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Boolean isShowPreviewViewArg = (Boolean)args.get(0);
              if (isShowPreviewViewArg == null) {
                throw new NullPointerException("isShowPreviewViewArg unexpectedly null.");
              }
              Result<FaceResult> resultCallback = new Result<FaceResult>() {
                public void success(FaceResult result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.faceRecognition(isShowPreviewViewArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceRequestApi.cancelFaceRegisterAndRecognition", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Result<FaceResult> resultCallback = new Result<FaceResult>() {
                public void success(FaceResult result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.cancelFaceRegisterAndRecognition(resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceRequestApi.addFaceData", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              FaceInfo faceInfoArg = (FaceInfo)args.get(0);
              if (faceInfoArg == null) {
                throw new NullPointerException("faceInfoArg unexpectedly null.");
              }
              Result<FaceResult> resultCallback = new Result<FaceResult>() {
                public void success(FaceResult result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.addFaceData(faceInfoArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceRequestApi.removeFaceData", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              FaceInfo faceInfoArg = (FaceInfo)args.get(0);
              if (faceInfoArg == null) {
                throw new NullPointerException("faceInfoArg unexpectedly null.");
              }
              Result<FaceResult> resultCallback = new Result<FaceResult>() {
                public void success(FaceResult result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.removeFaceData(faceInfoArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceRequestApi.syncFaceData", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              List<FaceInfo> faceInfosArg = (List<FaceInfo>)args.get(0);
              if (faceInfosArg == null) {
                throw new NullPointerException("faceInfosArg unexpectedly null.");
              }
              Result<FaceResult> resultCallback = new Result<FaceResult>() {
                public void success(FaceResult result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.syncFaceData(faceInfosArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceRequestApi.cleanFaceData", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Result<FaceResult> resultCallback = new Result<FaceResult>() {
                public void success(FaceResult result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.cleanFaceData(resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static class FaceResultApiCodec extends StandardMessageCodec {
    public static final FaceResultApiCodec INSTANCE = new FaceResultApiCodec();
    private FaceResultApiCodec() {}
    @Override
    protected Object readValueOfType(byte type, ByteBuffer buffer) {
      switch (type) {
        case (byte)128:         
          return FaceResult.fromMap((Map<String, Object>) readValue(buffer));
        
        default:        
          return super.readValueOfType(type, buffer);
        
      }
    }
    @Override
    protected void writeValue(ByteArrayOutputStream stream, Object value)     {
      if (value instanceof FaceResult) {
        stream.write(128);
        writeValue(stream, ((FaceResult) value).toMap());
      } else 
{
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated class from Pigeon that represents Flutter messages that can be called from Java.*/
  public static class FaceResultApi {
    private final BinaryMessenger binaryMessenger;
    public FaceResultApi(BinaryMessenger argBinaryMessenger){
      this.binaryMessenger = argBinaryMessenger;
    }
    public interface Reply<T> {
      void reply(T reply);
    }
    static MessageCodec<Object> getCodec() {
      return FaceResultApiCodec.INSTANCE;
    }

    public void faceErrorCallback(@NonNull FaceResult faceResultArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceResultApi.faceErrorCallback", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(faceResultArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void faceRegisterCallback(@NonNull FaceResult faceResultArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceResultApi.faceRegisterCallback", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(faceResultArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void faceRegisterTipsCallback(@NonNull FaceResult faceResultArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceResultApi.faceRegisterTipsCallback", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(faceResultArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void faceRecognitionCallback(@NonNull FaceResult faceResultArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceResultApi.faceRecognitionCallback", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(faceResultArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void faceRecognitionTipsCallback(@NonNull FaceResult faceResultArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceResultApi.faceRecognitionTipsCallback", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(faceResultArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void cancelFaceRegisterAndRecognitionCallback(@NonNull FaceResult faceResultArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceResultApi.cancelFaceRegisterAndRecognitionCallback", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(faceResultArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void addFaceDataCallback(@NonNull FaceResult faceResultArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceResultApi.addFaceDataCallback", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(faceResultArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void removeFaceDataCallback(@NonNull FaceResult faceResultArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceResultApi.removeFaceDataCallback", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(faceResultArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void syncFaceDataCallback(@NonNull FaceResult faceResultArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceResultApi.syncFaceDataCallback", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(faceResultArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void cleanFaceDataDataCallback(@NonNull FaceResult faceResultArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceResultApi.cleanFaceDataDataCallback", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(faceResultArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void faceDetectedCallback(@NonNull FaceResult faceResultArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceResultApi.faceDetectedCallback", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(faceResultArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void noFaceDetectedCallback(@NonNull FaceResult faceResultArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceResultApi.noFaceDetectedCallback", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(faceResultArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void manualCancelFaceRegisterCallback(@NonNull FaceResult faceResultArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceResultApi.manualCancelFaceRegisterCallback", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(faceResultArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void manualCancelFaceRecognitionCallback(@NonNull FaceResult faceResultArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceResultApi.manualCancelFaceRecognitionCallback", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(faceResultArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void buttonClickCallback(@NonNull String buttonTypeArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FaceResultApi.buttonClickCallback", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(buttonTypeArg)), channelReply -> {
        callback.reply(null);
      });
    }
  }
  private static Map<String, Object> wrapError(Throwable exception) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", exception.getClass().getSimpleName());
    errorMap.put("details", "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    return errorMap;
  }
}
