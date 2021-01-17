package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.chat.fragment.EditSosPagerContactFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedShareEditSosPagerContactFragment
          .EditSosPagerContactFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedShareEditSosPagerContactFragment {
  private ActivityModuleBuilder_ContributeCustomizedShareEditSosPagerContactFragment() {}

  @Binds
  @IntoMap
  @ClassKey(EditSosPagerContactFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EditSosPagerContactFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface EditSosPagerContactFragmentSubcomponent
      extends AndroidInjector<EditSosPagerContactFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<EditSosPagerContactFragment> {}
  }
}
