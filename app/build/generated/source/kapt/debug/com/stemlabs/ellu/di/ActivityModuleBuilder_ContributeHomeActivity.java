package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.home.HomeActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityModuleBuilder_ContributeHomeActivity.HomeActivitySubcomponent.class)
public abstract class ActivityModuleBuilder_ContributeHomeActivity {
  private ActivityModuleBuilder_ContributeHomeActivity() {}

  @Binds
  @IntoMap
  @ClassKey(HomeActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HomeActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface HomeActivitySubcomponent extends AndroidInjector<HomeActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HomeActivity> {}
  }
}
