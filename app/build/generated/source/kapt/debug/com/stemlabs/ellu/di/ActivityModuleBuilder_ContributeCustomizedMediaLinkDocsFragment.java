package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.chat.medialinkdocs.MediaLinkDocsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedMediaLinkDocsFragment
          .MediaLinkDocsFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedMediaLinkDocsFragment {
  private ActivityModuleBuilder_ContributeCustomizedMediaLinkDocsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MediaLinkDocsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MediaLinkDocsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MediaLinkDocsFragmentSubcomponent
      extends AndroidInjector<MediaLinkDocsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MediaLinkDocsFragment> {}
  }
}
