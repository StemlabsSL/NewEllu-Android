package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.chat.medialinkdocs.fragment.DocFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedDocFragment.DocFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedDocFragment {
  private ActivityModuleBuilder_ContributeCustomizedDocFragment() {}

  @Binds
  @IntoMap
  @ClassKey(DocFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DocFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface DocFragmentSubcomponent extends AndroidInjector<DocFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DocFragment> {}
  }
}
