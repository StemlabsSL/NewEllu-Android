package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.sos.SosSendFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedSosSendFragment.SosSendFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedSosSendFragment {
  private ActivityModuleBuilder_ContributeCustomizedSosSendFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SosSendFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SosSendFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SosSendFragmentSubcomponent extends AndroidInjector<SosSendFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SosSendFragment> {}
  }
}
