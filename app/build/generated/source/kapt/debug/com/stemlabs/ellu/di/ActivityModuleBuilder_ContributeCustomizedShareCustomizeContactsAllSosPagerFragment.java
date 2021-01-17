package com.stemlabs.ellu.di;

import com.stemlabs.ellu.ui.component.chat.fragment.ContactsAllSosPagerFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModuleBuilder_ContributeCustomizedShareCustomizeContactsAllSosPagerFragment
          .ContactsAllSosPagerFragmentSubcomponent.class
)
public abstract
class ActivityModuleBuilder_ContributeCustomizedShareCustomizeContactsAllSosPagerFragment {
  private ActivityModuleBuilder_ContributeCustomizedShareCustomizeContactsAllSosPagerFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ContactsAllSosPagerFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ContactsAllSosPagerFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ContactsAllSosPagerFragmentSubcomponent
      extends AndroidInjector<ContactsAllSosPagerFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ContactsAllSosPagerFragment> {}
  }
}
