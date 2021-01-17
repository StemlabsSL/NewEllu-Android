package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.home.CallLogFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityModuleBuilder_ContributeCallLogFragment.CallLogFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCallLogFragment {
  private ActivityModuleBuilder_ContributeCallLogFragment() {}

  @Binds
  @IntoMap
  @ClassKey(CallLogFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CallLogFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface CallLogFragmentSubcomponent extends AndroidInjector<CallLogFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CallLogFragment> {}
  }
}
