package com.hiltapplication;


import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.android.qualifiers.ApplicationContext;

@Module
@InstallIn(ApplicationComponent.class)
public class ContextModule {


    @Provides
    @Singleton
    public Context provideContext(@ApplicationContext Context myApplication) {
        return myApplication;
    }
}
