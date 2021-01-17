package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.aware.fragment.AwareFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedAwareFragment.AwareFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedAwareFragment {
  private ActivityModuleBuilder_ContributeCustomizedAwareFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AwareFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AwareFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface AwareFragmentSubcomponent extends AndroidInjector<AwareFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AwareFragment> {}
  }
}
