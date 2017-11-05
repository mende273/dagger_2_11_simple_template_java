package com.jumrukovski.dagger_2_11_simple_template_java;

import android.app.Activity;

import com.jumrukovski.dagger_2_11_simple_template_java.injection.scope.PerActivity;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MainActivityModule {

    @Binds
    @PerActivity
    abstract Activity activity(MainActivity mainActivity);
}
