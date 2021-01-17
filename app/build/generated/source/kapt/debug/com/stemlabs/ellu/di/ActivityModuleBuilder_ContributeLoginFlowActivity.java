package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.loginflow.LoginFlowActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeLoginFlowActivity.LoginFlowActivitySubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeLoginFlowActivity {
  private ActivityModuleBuilder_ContributeLoginFlowActivity() {}

  @Binds
  @IntoMap
  @ClassKey(LoginFlowActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LoginFlowActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface LoginFlowActivitySubcomponent extends AndroidInjector<LoginFlowActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LoginFlowActivity> {}
  }
}
