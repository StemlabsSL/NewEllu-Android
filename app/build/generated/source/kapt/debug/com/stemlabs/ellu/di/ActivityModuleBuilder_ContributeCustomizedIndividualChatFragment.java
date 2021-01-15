package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.chat.fragment.IndividualChatFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedIndividualChatFragment
          .IndividualChatFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedIndividualChatFragment {
  private ActivityModuleBuilder_ContributeCustomizedIndividualChatFragment() {}

  @Binds
  @IntoMap
  @ClassKey(IndividualChatFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      IndividualChatFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface IndividualChatFragmentSubcomponent
      extends AndroidInjector<IndividualChatFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<IndividualChatFragment> {}
  }
}
