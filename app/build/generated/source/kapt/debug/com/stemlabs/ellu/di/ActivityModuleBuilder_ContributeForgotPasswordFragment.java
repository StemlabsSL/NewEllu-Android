package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.loginflow.ForgotPasswordFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeForgotPasswordFragment.ForgotPasswordFragmentSubcomponent
          .class
)
public abstract class ActivityModuleBuilder_ContributeForgotPasswordFragment {
  private ActivityModuleBuilder_ContributeForgotPasswordFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ForgotPasswordFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ForgotPasswordFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ForgotPasswordFragmentSubcomponent
      extends AndroidInjector<ForgotPasswordFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ForgotPasswordFragment> {}
  }
}
