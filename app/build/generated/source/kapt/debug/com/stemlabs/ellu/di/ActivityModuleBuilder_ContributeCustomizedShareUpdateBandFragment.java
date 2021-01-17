package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.aboutband.fragment.UpdateBandFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedShareUpdateBandFragment
          .UpdateBandFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedShareUpdateBandFragment {
  private ActivityModuleBuilder_ContributeCustomizedShareUpdateBandFragment() {}

  @Binds
  @IntoMap
  @ClassKey(UpdateBandFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      UpdateBandFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface UpdateBandFragmentSubcomponent extends AndroidInjector<UpdateBandFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<UpdateBandFragment> {}
  }
}
