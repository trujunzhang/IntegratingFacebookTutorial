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
              "cFOCgoE6v77JoeGXkF5cK5az4FLM5twfdOCGBphU",
              "eJ5fVdx0SO8cXrZ8mTxxwREK34wpZ6VMcHBumKZl"
      );

      ParseFacebookUtils.initialize(this);
  }
}
