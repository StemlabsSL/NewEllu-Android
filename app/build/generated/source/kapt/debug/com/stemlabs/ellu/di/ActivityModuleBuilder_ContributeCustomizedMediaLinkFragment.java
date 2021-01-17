package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.chat.medialinkdocs.fragment.MediaLinkFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedMediaLinkFragment.MediaLinkFragmentSubcomponent
          .class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedMediaLinkFragment {
  private ActivityModuleBuilder_ContributeCustomizedMediaLinkFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MediaLinkFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MediaLinkFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MediaLinkFragmentSubcomponent extends AndroidInjector<MediaLinkFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MediaLinkFragment> {}
  }
}
