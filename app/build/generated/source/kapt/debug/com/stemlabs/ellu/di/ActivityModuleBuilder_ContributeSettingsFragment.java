package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.settings.fragment.SettingsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeSettingsFragment.SettingsFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeSettingsFragment {
  private ActivityModuleBuilder_ContributeSettingsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SettingsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SettingsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SettingsFragmentSubcomponent extends AndroidInjector<SettingsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SettingsFragment> {}
  }
}
