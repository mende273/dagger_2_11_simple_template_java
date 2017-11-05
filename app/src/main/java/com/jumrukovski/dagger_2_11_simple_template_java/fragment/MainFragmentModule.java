package com.jumrukovski.dagger_2_11_simple_template_java.fragment;

import com.jumrukovski.dagger_2_11_simple_template_java.injection.scope.PerFragment;

import dagger.Module;
import dagger.Provides;

@Module
public class MainFragmentModule {

    @PerFragment
    @Provides
    MainFragment provideMainFragment(MainFragment fragment) {
        return fragment;
    }
}
