package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.chat.fragment.SOSProfileFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityModuleBuilder_SOSProfileFragment.SOSProfileFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_SOSProfileFragment {
  private ActivityModuleBuilder_SOSProfileFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SOSProfileFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SOSProfileFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SOSProfileFragmentSubcomponent extends AndroidInjector<SOSProfileFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SOSProfileFragment> {}
  }
}
