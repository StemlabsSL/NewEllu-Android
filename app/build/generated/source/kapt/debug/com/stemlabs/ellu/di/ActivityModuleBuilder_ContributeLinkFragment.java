package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.home.LinkFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityModuleBuilder_ContributeLinkFragment.LinkFragmentSubcomponent.class)
public abstract class ActivityModuleBuilder_ContributeLinkFragment {
  private ActivityModuleBuilder_ContributeLinkFragment() {}

  @Binds
  @IntoMap
  @ClassKey(LinkFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LinkFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface LinkFragmentSubcomponent extends AndroidInjector<LinkFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LinkFragment> {}
  }
}
