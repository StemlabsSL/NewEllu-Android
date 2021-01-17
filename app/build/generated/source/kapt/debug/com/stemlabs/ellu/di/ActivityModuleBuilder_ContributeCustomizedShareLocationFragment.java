package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.chat.fragment.ShareLocationFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedShareLocationFragment
          .ShareLocationFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedShareLocationFragment {
  private ActivityModuleBuilder_ContributeCustomizedShareLocationFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ShareLocationFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ShareLocationFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ShareLocationFragmentSubcomponent
      extends AndroidInjector<ShareLocationFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ShareLocationFragment> {}
  }
}
