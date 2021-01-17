package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.loginflow.ResetPasswordSuccessfullyFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedResetPasswordSuccessfullyFragment
          .ResetPasswordSuccessfullyFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedResetPasswordSuccessfullyFragment {
  private ActivityModuleBuilder_ContributeCustomizedResetPasswordSuccessfullyFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ResetPasswordSuccessfullyFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ResetPasswordSuccessfullyFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ResetPasswordSuccessfullyFragmentSubcomponent
      extends AndroidInjector<ResetPasswordSuccessfullyFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ResetPasswordSuccessfullyFragment> {}
  }
}
