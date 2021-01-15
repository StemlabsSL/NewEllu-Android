package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.settings.fragment.TermsConditionFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeTermsConditionFragment.TermsConditionFragmentSubcomponent
          .class
)
public abstract class ActivityModuleBuilder_ContributeTermsConditionFragment {
  private ActivityModuleBuilder_ContributeTermsConditionFragment() {}

  @Binds
  @IntoMap
  @ClassKey(TermsConditionFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TermsConditionFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface TermsConditionFragmentSubcomponent
      extends AndroidInjector<TermsConditionFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TermsConditionFragment> {}
  }
}
