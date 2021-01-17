package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.aware.fragment.AwareSelectAPlaceFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedAwareSelectAPlaceFragment
          .AwareSelectAPlaceFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedAwareSelectAPlaceFragment {
  private ActivityModuleBuilder_ContributeCustomizedAwareSelectAPlaceFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AwareSelectAPlaceFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AwareSelectAPlaceFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface AwareSelectAPlaceFragmentSubcomponent
      extends AndroidInjector<AwareSelectAPlaceFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AwareSelectAPlaceFragment> {}
  }
}
