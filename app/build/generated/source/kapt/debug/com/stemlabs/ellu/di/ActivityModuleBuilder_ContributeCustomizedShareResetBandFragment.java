package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.aboutband.fragment.ResetBandFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedShareResetBandFragment.ResetBandFragmentSubcomponent
          .class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedShareResetBandFragment {
  private ActivityModuleBuilder_ContributeCustomizedShareResetBandFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ResetBandFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ResetBandFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ResetBandFragmentSubcomponent extends AndroidInjector<ResetBandFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ResetBandFragment> {}
  }
}
