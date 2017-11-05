package com.jumrukovski.dagger_2_11_simple_template_java.injection.builders;

import com.jumrukovski.dagger_2_11_simple_template_java.MainActivity;
import com.jumrukovski.dagger_2_11_simple_template_java.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    // we add all our activities here

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();
}
