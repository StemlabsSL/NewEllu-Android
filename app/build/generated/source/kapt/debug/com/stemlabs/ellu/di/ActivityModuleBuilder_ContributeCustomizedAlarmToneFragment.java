package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.settings.fragment.CustomizedAlarmToneFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedAlarmToneFragment
          .CustomizedAlarmToneFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedAlarmToneFragment {
  private ActivityModuleBuilder_ContributeCustomizedAlarmToneFragment() {}

  @Binds
  @IntoMap
  @ClassKey(CustomizedAlarmToneFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CustomizedAlarmToneFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface CustomizedAlarmToneFragmentSubcomponent
      extends AndroidInjector<CustomizedAlarmToneFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CustomizedAlarmToneFragment> {}
  }
}
