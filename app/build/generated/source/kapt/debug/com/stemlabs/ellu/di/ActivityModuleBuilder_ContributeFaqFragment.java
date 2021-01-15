package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.settings.fragment.FaqFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityModuleBuilder_ContributeFaqFragment.FaqFragmentSubcomponent.class)
public abstract class ActivityModuleBuilder_ContributeFaqFragment {
  private ActivityModuleBuilder_ContributeFaqFragment() {}

  @Binds
  @IntoMap
  @ClassKey(FaqFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FaqFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface FaqFragmentSubcomponent extends AndroidInjector<FaqFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<FaqFragment> {}
  }
}
