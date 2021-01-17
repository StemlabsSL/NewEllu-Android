package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.proximity.fragment.ProximityMapFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedProximityMapFragment
          .ProximityMapFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedProximityMapFragment {
  private ActivityModuleBuilder_ContributeCustomizedProximityMapFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ProximityMapFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ProximityMapFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ProximityMapFragmentSubcomponent extends AndroidInjector<ProximityMapFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ProximityMapFragment> {}
  }
}
