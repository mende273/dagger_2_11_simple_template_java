package com.jumrukovski.dagger_2_11_simple_template_java.injection.component;

import android.app.Application;

import com.jumrukovski.dagger_2_11_simple_template_java.App;
import com.jumrukovski.dagger_2_11_simple_template_java.injection.builders.ActivityBuilder;
import com.jumrukovski.dagger_2_11_simple_template_java.injection.builders.FragmentBuilder;
import com.jumrukovski.dagger_2_11_simple_template_java.injection.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class,
        FragmentBuilder.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(App app);
}
