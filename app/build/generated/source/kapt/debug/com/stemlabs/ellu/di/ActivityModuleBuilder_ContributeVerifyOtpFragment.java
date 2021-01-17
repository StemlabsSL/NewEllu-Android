package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.loginflow.VerifyOtpFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeVerifyOtpFragment.VerifyOtpFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeVerifyOtpFragment {
  private ActivityModuleBuilder_ContributeVerifyOtpFragment() {}

  @Binds
  @IntoMap
  @ClassKey(VerifyOtpFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      VerifyOtpFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface VerifyOtpFragmentSubcomponent extends AndroidInjector<VerifyOtpFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<VerifyOtpFragment> {}
  }
}
