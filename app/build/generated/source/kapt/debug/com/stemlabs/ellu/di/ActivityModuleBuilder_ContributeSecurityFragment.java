package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.settings.fragment.SecurityFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeSecurityFragment.SecurityFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeSecurityFragment {
  private ActivityModuleBuilder_ContributeSecurityFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SecurityFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SecurityFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SecurityFragmentSubcomponent extends AndroidInjector<SecurityFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SecurityFragment> {}
  }
}
