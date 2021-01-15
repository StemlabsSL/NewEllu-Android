package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.aboutband.fragment.AboutBandFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeAboutBandFragment.AboutBandFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeAboutBandFragment {
  private ActivityModuleBuilder_ContributeAboutBandFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AboutBandFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AboutBandFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface AboutBandFragmentSubcomponent extends AndroidInjector<AboutBandFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AboutBandFragment> {}
  }
}
