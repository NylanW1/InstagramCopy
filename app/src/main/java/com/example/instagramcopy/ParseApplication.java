package com.example.instagramcopy;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("7HfHdnvINW5uMNQGQyBn7bTcCM6OuaeC5MzF8aYw")
                .clientKey("bbFPGXCIl44iAaxRRDz9J0w3zocM2zBEpO8scOPR")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

