package com.codepath.loginactivity;

import android.app.Application;

import com.codepath.loginactivity.Post;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("codepath-ig")
                .clientKey("CodepathIGKey")
                .server("https://codepath-ig.herokuapp.com/parse").build());
    }
}