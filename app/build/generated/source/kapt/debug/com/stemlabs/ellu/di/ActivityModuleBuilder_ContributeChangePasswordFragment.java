package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.settings.fragment.ChangePasswordFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeChangePasswordFragment.ChangePasswordFragmentSubcomponent
          .class
)
public abstract class ActivityModuleBuilder_ContributeChangePasswordFragment {
  private ActivityModuleBuilder_ContributeChangePasswordFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ChangePasswordFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ChangePasswordFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ChangePasswordFragmentSubcomponent
      extends AndroidInjector<ChangePasswordFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ChangePasswordFragment> {}
  }
}
