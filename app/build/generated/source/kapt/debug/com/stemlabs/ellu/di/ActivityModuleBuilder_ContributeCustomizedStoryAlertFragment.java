package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.alert.fragment.AlertFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedStoryAlertFragment.AlertFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedStoryAlertFragment {
  private ActivityModuleBuilder_ContributeCustomizedStoryAlertFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AlertFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AlertFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface AlertFragmentSubcomponent extends AndroidInjector<AlertFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AlertFragment> {}
  }
}
