package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.splash.SplashActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityModuleBuilder_ContributeSplashActivity.SplashActivitySubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeSplashActivity {
  private ActivityModuleBuilder_ContributeSplashActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SplashActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SplashActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface SplashActivitySubcomponent extends AndroidInjector<SplashActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SplashActivity> {}
  }
}
