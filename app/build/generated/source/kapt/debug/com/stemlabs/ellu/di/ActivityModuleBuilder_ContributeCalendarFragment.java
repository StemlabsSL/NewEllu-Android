package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.calendar.fragment.CalendarFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCalendarFragment.CalendarFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCalendarFragment {
  private ActivityModuleBuilder_ContributeCalendarFragment() {}

  @Binds
  @IntoMap
  @ClassKey(CalendarFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CalendarFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface CalendarFragmentSubcomponent extends AndroidInjector<CalendarFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CalendarFragment> {}
  }
}
