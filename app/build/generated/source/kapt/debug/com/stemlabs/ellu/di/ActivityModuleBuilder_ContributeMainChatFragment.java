package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.home.MainChatFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeMainChatFragment.MainChatFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeMainChatFragment {
  private ActivityModuleBuilder_ContributeMainChatFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MainChatFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainChatFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MainChatFragmentSubcomponent extends AndroidInjector<MainChatFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainChatFragment> {}
  }
}
