package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.chat.fragment.AddNewContactFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedShareAddNewContactFragment
          .AddNewContactFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedShareAddNewContactFragment {
  private ActivityModuleBuilder_ContributeCustomizedShareAddNewContactFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AddNewContactFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AddNewContactFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface AddNewContactFragmentSubcomponent
      extends AndroidInjector<AddNewContactFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AddNewContactFragment> {}
  }
}
