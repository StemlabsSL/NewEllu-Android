package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.chat.fragment.PagerFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedPagerFragment.PagerFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedPagerFragment {
  private ActivityModuleBuilder_ContributeCustomizedPagerFragment() {}

  @Binds
  @IntoMap
  @ClassKey(PagerFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      PagerFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface PagerFragmentSubcomponent extends AndroidInjector<PagerFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<PagerFragment> {}
  }
}
