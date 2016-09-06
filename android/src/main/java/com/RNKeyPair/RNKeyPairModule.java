
package com.RNKeyPair;

import android.util.Base64;

import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.security.spec.X509EncodedKeySpec;

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
  public void generate(Callback callback)  {
    WritableNativeMap keys = new WritableNativeMap();

    try {

      KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
      kpg.initialize(2048);
      KeyPair keyPair = kpg.genKeyPair();
      byte[] publicKey = keyPair.getPublic().getEncoded();
      byte[] privateKey = keyPair.getPrivate().getEncoded();

      X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(publicKey);
      KeyFactory keyFact = KeyFactory.getInstance("RSA", "BC");
      String keyString = Base64.encodeToString(keyFact.generatePublic(x509KeySpec).getEncoded(),0);

      keys.putString("public", keyString);
      keys.putString("private", "345");
    }
    catch(InvalidKeySpecException e){
      // don't care
    }
    catch(NoSuchAlgorithmException e) {
    }
    catch(NoSuchProviderException e) {
    }

    callback.invoke(keys);
  }
}