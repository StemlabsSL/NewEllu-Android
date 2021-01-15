package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.meet.fragment.MeetCardAnimationFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedShareMeetCardAnimationFragment
          .MeetCardAnimationFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedShareMeetCardAnimationFragment {
  private ActivityModuleBuilder_ContributeCustomizedShareMeetCardAnimationFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MeetCardAnimationFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MeetCardAnimationFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MeetCardAnimationFragmentSubcomponent
      extends AndroidInjector<MeetCardAnimationFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MeetCardAnimationFragment> {}
  }
}
