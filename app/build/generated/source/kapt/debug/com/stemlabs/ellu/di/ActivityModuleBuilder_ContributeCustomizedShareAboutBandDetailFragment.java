package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.aboutband.fragment.AboutBandDetailFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedShareAboutBandDetailFragment
          .AboutBandDetailFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedShareAboutBandDetailFragment {
  private ActivityModuleBuilder_ContributeCustomizedShareAboutBandDetailFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AboutBandDetailFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AboutBandDetailFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface AboutBandDetailFragmentSubcomponent
      extends AndroidInjector<AboutBandDetailFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AboutBandDetailFragment> {}
  }
}
