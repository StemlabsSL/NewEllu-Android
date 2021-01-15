package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.meet.fragment.MeetSenderFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedShareCustomizeMeetSenderFragment
          .MeetSenderFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedShareCustomizeMeetSenderFragment {
  private ActivityModuleBuilder_ContributeCustomizedShareCustomizeMeetSenderFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MeetSenderFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MeetSenderFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MeetSenderFragmentSubcomponent extends AndroidInjector<MeetSenderFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MeetSenderFragment> {}
  }
}
