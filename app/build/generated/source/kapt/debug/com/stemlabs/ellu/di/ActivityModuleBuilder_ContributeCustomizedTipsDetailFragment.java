package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.aboutband.fragment.TipsDetailFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedTipsDetailFragment.TipsDetailFragmentSubcomponent
          .class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedTipsDetailFragment {
  private ActivityModuleBuilder_ContributeCustomizedTipsDetailFragment() {}

  @Binds
  @IntoMap
  @ClassKey(TipsDetailFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TipsDetailFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface TipsDetailFragmentSubcomponent extends AndroidInjector<TipsDetailFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TipsDetailFragment> {}
  }
}
