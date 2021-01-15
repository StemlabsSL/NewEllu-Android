package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.alarm.fragment.AddAlarmFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedAddAlarmFragment.AddAlarmFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedAddAlarmFragment {
  private ActivityModuleBuilder_ContributeCustomizedAddAlarmFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AddAlarmFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AddAlarmFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface AddAlarmFragmentSubcomponent extends AndroidInjector<AddAlarmFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AddAlarmFragment> {}
  }
}
