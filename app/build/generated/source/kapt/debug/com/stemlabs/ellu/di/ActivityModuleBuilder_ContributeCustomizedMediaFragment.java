package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.chat.medialinkdocs.fragment.MediaFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedMediaFragment.MediaFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedMediaFragment {
  private ActivityModuleBuilder_ContributeCustomizedMediaFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MediaFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MediaFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MediaFragmentSubcomponent extends AndroidInjector<MediaFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MediaFragment> {}
  }
}
