package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.sos.SosFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedSosFragment.SosFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedSosFragment {
  private ActivityModuleBuilder_ContributeCustomizedSosFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SosFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SosFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SosFragmentSubcomponent extends AndroidInjector<SosFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SosFragment> {}
  }
}
