package com.jumrukovski.dagger_2_11_simple_template_java.injection.builders;

import com.jumrukovski.dagger_2_11_simple_template_java.fragment.MainFragment;
import com.jumrukovski.dagger_2_11_simple_template_java.fragment.MainFragmentModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBuilder {

    @ContributesAndroidInjector(modules = MainFragmentModule.class)
    abstract MainFragment provideMainFragment();
}
