package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.customize.fragment.CustomizeBandFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedShareCustomizeBandFragment
          .CustomizeBandFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedShareCustomizeBandFragment {
  private ActivityModuleBuilder_ContributeCustomizedShareCustomizeBandFragment() {}

  @Binds
  @IntoMap
  @ClassKey(CustomizeBandFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CustomizeBandFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface CustomizeBandFragmentSubcomponent
      extends AndroidInjector<CustomizeBandFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CustomizeBandFragment> {}
  }
}
