package com.parse.integratingfacebooktutorial;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.parse.Parse;
import com.parse.ParseFacebookUtils;

public class IntegratingFacebookTutorialApplication extends Application {

  static final String TAG = "MyApp";

  @Override
  public void onCreate() {
    super.onCreate();

      FacebookSdk.sdkInitialize(getApplicationContext());

      Parse.initialize(this,
              "YOUR_PARSE_APPLICATION_ID",
              "YOUR_PARSE_CLIENT_ID"
      );

      ParseFacebookUtils.initialize(this);
  }
}
