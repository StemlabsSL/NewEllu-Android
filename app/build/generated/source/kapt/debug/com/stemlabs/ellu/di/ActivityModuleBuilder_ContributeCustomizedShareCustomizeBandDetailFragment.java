package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.customize.fragment.CustomizeBandDetailFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedShareCustomizeBandDetailFragment
          .CustomizeBandDetailFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedShareCustomizeBandDetailFragment {
  private ActivityModuleBuilder_ContributeCustomizedShareCustomizeBandDetailFragment() {}

  @Binds
  @IntoMap
  @ClassKey(CustomizeBandDetailFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CustomizeBandDetailFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface CustomizeBandDetailFragmentSubcomponent
      extends AndroidInjector<CustomizeBandDetailFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CustomizeBandDetailFragment> {}
  }
}
