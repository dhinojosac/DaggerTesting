package com.dhinojosac.android.daggertesting;

import android.app.Application;

/**
 * Created by negro-PC on 26-Dec-16.
 */
public class App extends Application {
    private ApplicationComponent component;

    @Override
    public  void onCreate(){
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }
}
