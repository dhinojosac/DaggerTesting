package com.dhinojosac.android.daggertesting;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by negro-PC on 26-Dec-16.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MainActivity target);

}
