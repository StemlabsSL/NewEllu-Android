package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.chat.fragment.StoryBoardFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedStoryBoardFragment.StoryBoardFragmentSubcomponent
          .class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedStoryBoardFragment {
  private ActivityModuleBuilder_ContributeCustomizedStoryBoardFragment() {}

  @Binds
  @IntoMap
  @ClassKey(StoryBoardFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      StoryBoardFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface StoryBoardFragmentSubcomponent extends AndroidInjector<StoryBoardFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<StoryBoardFragment> {}
  }
}
