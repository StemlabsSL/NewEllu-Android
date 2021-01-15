package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.chat.fragment.VideoCallFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedVideoCallFragment.VideoCallFragmentSubcomponent
          .class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedVideoCallFragment {
  private ActivityModuleBuilder_ContributeCustomizedVideoCallFragment() {}

  @Binds
  @IntoMap
  @ClassKey(VideoCallFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      VideoCallFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface VideoCallFragmentSubcomponent extends AndroidInjector<VideoCallFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<VideoCallFragment> {}
  }
}
