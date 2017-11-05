package com.jumrukovski.dagger_2_11_simple_template_java.injection.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.jumrukovski.dagger_2_11_simple_template_java.MainActivityComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {
        MainActivityComponent.class})
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    SharedPreferences providesPreferences(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
}
