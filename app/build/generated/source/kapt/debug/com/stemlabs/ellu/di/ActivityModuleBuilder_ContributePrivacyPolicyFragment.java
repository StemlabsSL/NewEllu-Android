package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.settings.fragment.PrivacyPolicyFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributePrivacyPolicyFragment.PrivacyPolicyFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributePrivacyPolicyFragment {
  private ActivityModuleBuilder_ContributePrivacyPolicyFragment() {}

  @Binds
  @IntoMap
  @ClassKey(PrivacyPolicyFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      PrivacyPolicyFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface PrivacyPolicyFragmentSubcomponent
      extends AndroidInjector<PrivacyPolicyFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<PrivacyPolicyFragment> {}
  }
}
