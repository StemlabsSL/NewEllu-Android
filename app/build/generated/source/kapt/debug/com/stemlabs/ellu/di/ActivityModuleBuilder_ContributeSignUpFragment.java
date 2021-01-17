package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.loginflow.SignUpFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityModuleBuilder_ContributeSignUpFragment.SignUpFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeSignUpFragment {
  private ActivityModuleBuilder_ContributeSignUpFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SignUpFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SignUpFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SignUpFragmentSubcomponent extends AndroidInjector<SignUpFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SignUpFragment> {}
  }
}
