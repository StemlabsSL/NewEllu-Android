package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.newgroup.NewGroupFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedNewGroupFragment.NewGroupFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedNewGroupFragment {
  private ActivityModuleBuilder_ContributeCustomizedNewGroupFragment() {}

  @Binds
  @IntoMap
  @ClassKey(NewGroupFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NewGroupFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface NewGroupFragmentSubcomponent extends AndroidInjector<NewGroupFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<NewGroupFragment> {}
  }
}
