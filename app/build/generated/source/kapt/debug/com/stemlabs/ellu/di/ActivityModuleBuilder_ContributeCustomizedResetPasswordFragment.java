package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.loginflow.ResetPasswordFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedResetPasswordFragment
          .ResetPasswordFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedResetPasswordFragment {
  private ActivityModuleBuilder_ContributeCustomizedResetPasswordFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ResetPasswordFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ResetPasswordFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ResetPasswordFragmentSubcomponent
      extends AndroidInjector<ResetPasswordFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ResetPasswordFragment> {}
  }
}
