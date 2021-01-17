/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stemlabs.ellu.di

import com.stemlabs.ellu.ui.component.aboutband.fragment.*
import com.stemlabs.ellu.ui.component.alarm.fragment.AddAlarmFragment
import com.stemlabs.ellu.ui.component.alarm.fragment.AlarmFragment
import com.stemlabs.ellu.ui.component.alert.fragment.AlertFragment
import com.stemlabs.ellu.ui.component.aware.fragment.AwareFragment
import com.stemlabs.ellu.ui.component.calendar.fragment.CalendarFragment
import com.stemlabs.ellu.ui.component.aware.fragment.AwareSelectAPlaceFragment
import com.stemlabs.ellu.ui.component.calendar.fragment.AddNewEventFragment
import com.stemlabs.ellu.ui.component.calendar.fragment.CalenderMainFragment
import com.stemlabs.ellu.ui.component.chat.fragment.*
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.MediaLinkDocsFragment
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.fragment.DocFragment
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.fragment.MediaFragment
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.fragment.MediaLinkFragment
import com.stemlabs.ellu.ui.component.customize.fragment.CustomizeBandDetailFragment
import com.stemlabs.ellu.ui.component.customize.fragment.CustomizeBandFragment
import com.stemlabs.ellu.ui.component.home.CallLogFragment
import com.stemlabs.ellu.ui.component.home.HomeActivity
import com.stemlabs.ellu.ui.component.home.LinkFragment
import com.stemlabs.ellu.ui.component.home.*
import com.stemlabs.ellu.ui.component.loginflow.*
import com.stemlabs.ellu.ui.component.newgroup.NewGroupFragment
import com.stemlabs.ellu.ui.component.meet.fragment.MeetCardAnimationFragment
import com.stemlabs.ellu.ui.component.meet.fragment.MeetSenderFragment
import com.stemlabs.ellu.ui.component.newgroup.ContactsToSendFragment
import com.stemlabs.ellu.ui.component.profile.fragment.ProfileFragment
import com.stemlabs.ellu.ui.component.proximity.fragment.ProximityFragment
import com.stemlabs.ellu.ui.component.proximity.fragment.ProximityMapFragment
import com.stemlabs.ellu.ui.component.settings.fragment.*
import com.stemlabs.ellu.ui.component.sos.SosFragment
import com.stemlabs.ellu.ui.component.sos.SosSendFragment
import com.stemlabs.ellu.ui.component.splash.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class ActivityModuleBuilder {

    @ContributesAndroidInjector()
    abstract fun contributeSplashActivity(): SplashActivity

    @ContributesAndroidInjector()
    abstract fun contributeHomeActivity(): HomeActivity

    @ContributesAndroidInjector()
    abstract fun contributeLoginFlowActivity(): LoginFlowActivity

    @ContributesAndroidInjector
    abstract fun contributeIntroFragment(): IntroFragment

    @ContributesAndroidInjector
    abstract fun contributeLoginFragment(): LoginFragment

    @ContributesAndroidInjector
    abstract fun contributeSignUpFragment(): SignUpFragment

    @ContributesAndroidInjector
    abstract fun contributeForgotPasswordFragment(): ForgotPasswordFragment

    @ContributesAndroidInjector
    abstract fun contributeVerifyOtpFragment(): VerifyOtpFragment

    @ContributesAndroidInjector
    abstract fun contributeAboutBandFragment(): AboutBandFragment

    @ContributesAndroidInjector
    abstract fun contributeLinkFragment(): LinkFragment

    @ContributesAndroidInjector
    abstract fun contributeAlarmFragment(): AlarmFragment

    @ContributesAndroidInjector
    abstract fun contributeMainChatFragment(): MainChatFragment

    @ContributesAndroidInjector
    abstract fun contributeCallLogFragment(): CallLogFragment

    @ContributesAndroidInjector
    abstract fun contributeSettingsFragment(): SettingsFragment

    @ContributesAndroidInjector
    abstract fun contributeFaqFragment(): FaqFragment

    @ContributesAndroidInjector
    abstract fun contributePrivacyPolicyFragment(): PrivacyPolicyFragment

    @ContributesAndroidInjector
    abstract fun contributeTermsConditionFragment(): TermsConditionFragment

    @ContributesAndroidInjector
    abstract fun contributeChangePasswordFragment(): ChangePasswordFragment

    @ContributesAndroidInjector
    abstract fun contributeSecurityFragment(): SecurityFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedAlarmToneFragment(): CustomizedAlarmToneFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedAddAlarmFragment(): AddAlarmFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedIndividualChatFragment(): IndividualChatFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedVideoCallFragment(): VideoCallFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedStoryBoardFragment(): StoryBoardFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedStoryAlertFragment(): AlertFragment

    @ContributesAndroidInjector
    abstract fun contributeProximityFragment(): ProximityFragment

    @ContributesAndroidInjector
    abstract fun contributeCalendarFragment(): CalendarFragment


    @ContributesAndroidInjector
    abstract fun contributeCustomizedAwareFragment(): AwareFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedAwareSelectAPlaceFragment(): AwareSelectAPlaceFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedAddNewEventFragment(): AddNewEventFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedShareLocationFragment(): ShareLocationFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedSosFragment(): SosFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedShareCustomizeBandFragment(): CustomizeBandFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedShareCustomizeBandDetailFragment(): CustomizeBandDetailFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedShareCustomizeContactsAllSosPagerFragment(): ContactsAllSosPagerFragment


    @ContributesAndroidInjector
    abstract fun contributeCustomizedShareCustomizeMeetSenderFragment(): MeetSenderFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedShareMeetCardAnimationFragment(): MeetCardAnimationFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedShareEditSosPagerContactFragment(): EditSosPagerContactFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedShareAddNewContactFragment(): AddNewContactFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedShareResetBandFragment(): ResetBandFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedShareAboutBandDetailFragment(): AboutBandDetailFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedShareBatteryFragment(): BatteryFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedShareUpdateBandFragment(): UpdateBandFragment


    @ContributesAndroidInjector
    abstract fun contributeCustomizedSosSendFragment(): SosSendFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedNewGroupFragment(): NewGroupFragment

    @ContributesAndroidInjector
    abstract fun ProfileFragment(): ProfileFragment

    @ContributesAndroidInjector
    abstract fun SOSProfileFragment(): SOSProfileFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedResetPasswordFragment(): ResetPasswordFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedResetPasswordSuccessfullyFragment(): ResetPasswordSuccessfullyFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedCalenderMainFragment(): CalenderMainFragment


    @ContributesAndroidInjector
    abstract fun contributeCustomizedMediaLinkDocsFragment(): MediaLinkDocsFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedMediaFragment(): MediaFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedDocFragment(): DocFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedMediaLinkFragment(): MediaLinkFragment
  @ContributesAndroidInjector
    abstract fun contributeCustomizedContactsToSendFragment(): ContactsToSendFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedTipsDetailFragment(): TipsDetailFragment
    @ContributesAndroidInjector
    abstract fun contributeCustomizedProximityMapFragment(): ProximityMapFragment

    @ContributesAndroidInjector
    abstract fun contributeCustomizedPagerFragment(): PagerFragment
}