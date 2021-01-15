package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.calendar.fragment.AddNewEventFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedAddNewEventFragment.AddNewEventFragmentSubcomponent
          .class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedAddNewEventFragment {
  private ActivityModuleBuilder_ContributeCustomizedAddNewEventFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AddNewEventFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AddNewEventFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface AddNewEventFragmentSubcomponent extends AndroidInjector<AddNewEventFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AddNewEventFragment> {}
  }
}
