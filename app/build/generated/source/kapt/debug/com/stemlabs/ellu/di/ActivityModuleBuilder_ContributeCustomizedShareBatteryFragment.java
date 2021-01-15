package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.aboutband.fragment.BatteryFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedShareBatteryFragment.BatteryFragmentSubcomponent
          .class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedShareBatteryFragment {
  private ActivityModuleBuilder_ContributeCustomizedShareBatteryFragment() {}

  @Binds
  @IntoMap
  @ClassKey(BatteryFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      BatteryFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface BatteryFragmentSubcomponent extends AndroidInjector<BatteryFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<BatteryFragment> {}
  }
}
