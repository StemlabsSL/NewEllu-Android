package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.loginflow.LoginFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityModuleBuilder_ContributeLoginFragment.LoginFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeLoginFragment {
  private ActivityModuleBuilder_ContributeLoginFragment() {}

  @Binds
  @IntoMap
  @ClassKey(LoginFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LoginFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface LoginFragmentSubcomponent extends AndroidInjector<LoginFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LoginFragment> {}
  }
}
