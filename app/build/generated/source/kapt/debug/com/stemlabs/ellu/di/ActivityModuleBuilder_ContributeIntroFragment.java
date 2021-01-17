package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.loginflow.IntroFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityModuleBuilder_ContributeIntroFragment.IntroFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeIntroFragment {
  private ActivityModuleBuilder_ContributeIntroFragment() {}

  @Binds
  @IntoMap
  @ClassKey(IntroFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      IntroFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface IntroFragmentSubcomponent extends AndroidInjector<IntroFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<IntroFragment> {}
  }
}
