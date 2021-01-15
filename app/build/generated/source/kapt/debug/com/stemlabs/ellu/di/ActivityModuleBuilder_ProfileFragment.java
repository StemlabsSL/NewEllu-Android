package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.profile.fragment.ProfileFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityModuleBuilder_ProfileFragment.ProfileFragmentSubcomponent.class)
public abstract class ActivityModuleBuilder_ProfileFragment {
  private ActivityModuleBuilder_ProfileFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ProfileFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ProfileFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ProfileFragmentSubcomponent extends AndroidInjector<ProfileFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ProfileFragment> {}
  }
}
