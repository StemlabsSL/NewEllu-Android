package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.calendar.fragment.CalenderMainFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedCalenderMainFragment
          .CalenderMainFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedCalenderMainFragment {
  private ActivityModuleBuilder_ContributeCustomizedCalenderMainFragment() {}

  @Binds
  @IntoMap
  @ClassKey(CalenderMainFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CalenderMainFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface CalenderMainFragmentSubcomponent extends AndroidInjector<CalenderMainFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CalenderMainFragment> {}
  }
}
