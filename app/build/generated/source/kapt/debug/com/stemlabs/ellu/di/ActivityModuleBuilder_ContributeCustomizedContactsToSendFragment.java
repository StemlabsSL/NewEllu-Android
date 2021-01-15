package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.newgroup.ContactsToSendFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedContactsToSendFragment
          .ContactsToSendFragmentSubcomponent.class
)
public abstract class ActivityModuleBuilder_ContributeCustomizedContactsToSendFragment {
  private ActivityModuleBuilder_ContributeCustomizedContactsToSendFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ContactsToSendFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ContactsToSendFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ContactsToSendFragmentSubcomponent
      extends AndroidInjector<ContactsToSendFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ContactsToSendFragment> {}
  }
}
