package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.alarm.fragment.AlarmFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityModuleBuilder_ContributeAlarmFragment.AlarmFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeAlarmFragment {
  private ActivityModuleBuilder_ContributeAlarmFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AlarmFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AlarmFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface AlarmFragmentSubcomponent extends AndroidInjector<AlarmFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AlarmFragment> {}
  }
}
