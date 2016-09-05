
package com.RNKeyPair;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;

import java.util.HashMap;

public class RNKeyPairModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNKeyPairModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNKeyPair";
  }

  @ReactMethod
  public void generate(Callback callback) {
    WritableNativeMap keys = new WritableNativeMap();
    keys.putString("public","123");
    keys.putString("private","345");
    callback.invoke(keys);
  }
}