package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.proximity.fragment.ProximityFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeProximityFragment.ProximityFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeProximityFragment {
  private ActivityModuleBuilder_ContributeProximityFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ProximityFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ProximityFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ProximityFragmentSubcomponent extends AndroidInjector<ProximityFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ProximityFragment> {}
  }
}
