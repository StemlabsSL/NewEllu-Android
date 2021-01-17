package com.stemlabs.ellu.di;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00e8\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\b\u0010\u0013\u001a\u00020\u0014H\'J\b\u0010\u0015\u001a\u00020\u0016H\'J\b\u0010\u0017\u001a\u00020\u0018H\'J\b\u0010\u0019\u001a\u00020\u001aH\'J\b\u0010\u001b\u001a\u00020\u001cH\'J\b\u0010\u001d\u001a\u00020\u001eH\'J\b\u0010\u001f\u001a\u00020 H\'J\b\u0010!\u001a\u00020\"H\'J\b\u0010#\u001a\u00020$H\'J\b\u0010%\u001a\u00020&H\'J\b\u0010\'\u001a\u00020(H\'J\b\u0010)\u001a\u00020*H\'J\b\u0010+\u001a\u00020,H\'J\b\u0010-\u001a\u00020.H\'J\b\u0010/\u001a\u000200H\'J\b\u00101\u001a\u000202H\'J\b\u00103\u001a\u000204H\'J\b\u00105\u001a\u000206H\'J\b\u00107\u001a\u000208H\'J\b\u00109\u001a\u00020:H\'J\b\u0010;\u001a\u00020<H\'J\b\u0010=\u001a\u00020>H\'J\b\u0010?\u001a\u00020@H\'J\b\u0010A\u001a\u00020BH\'J\b\u0010C\u001a\u00020DH\'J\b\u0010E\u001a\u00020FH\'J\b\u0010G\u001a\u00020HH\'J\b\u0010I\u001a\u00020JH\'J\b\u0010K\u001a\u00020LH\'J\b\u0010M\u001a\u00020NH\'J\b\u0010O\u001a\u00020PH\'J\b\u0010Q\u001a\u00020RH\'J\b\u0010S\u001a\u00020TH\'J\b\u0010U\u001a\u00020VH\'J\b\u0010W\u001a\u00020XH\'J\b\u0010Y\u001a\u00020ZH\'J\b\u0010[\u001a\u00020\\H\'J\b\u0010]\u001a\u00020^H\'J\b\u0010_\u001a\u00020`H\'J\b\u0010a\u001a\u00020bH\'J\b\u0010c\u001a\u00020dH\'J\b\u0010e\u001a\u00020fH\'J\b\u0010g\u001a\u00020hH\'J\b\u0010i\u001a\u00020jH\'J\b\u0010k\u001a\u00020lH\'J\b\u0010m\u001a\u00020nH\'J\b\u0010o\u001a\u00020pH\'J\b\u0010q\u001a\u00020rH\'J\b\u0010s\u001a\u00020tH\'J\b\u0010u\u001a\u00020vH\'\u00a8\u0006w"}, d2 = {"Lcom/stemlabs/ellu/di/ActivityModuleBuilder;", "", "()V", "ProfileFragment", "Lcom/stemlabs/ellu/ui/component/profile/fragment/ProfileFragment;", "SOSProfileFragment", "Lcom/stemlabs/ellu/ui/component/chat/fragment/SOSProfileFragment;", "contributeAboutBandFragment", "Lcom/stemlabs/ellu/ui/component/aboutband/fragment/AboutBandFragment;", "contributeAlarmFragment", "Lcom/stemlabs/ellu/ui/component/alarm/fragment/AlarmFragment;", "contributeCalendarFragment", "Lcom/stemlabs/ellu/ui/component/calendar/fragment/CalendarFragment;", "contributeCallLogFragment", "Lcom/stemlabs/ellu/ui/component/home/CallLogFragment;", "contributeChangePasswordFragment", "Lcom/stemlabs/ellu/ui/component/settings/fragment/ChangePasswordFragment;", "contributeCustomizedAddAlarmFragment", "Lcom/stemlabs/ellu/ui/component/alarm/fragment/AddAlarmFragment;", "contributeCustomizedAddNewEventFragment", "Lcom/stemlabs/ellu/ui/component/calendar/fragment/AddNewEventFragment;", "contributeCustomizedAlarmToneFragment", "Lcom/stemlabs/ellu/ui/component/settings/fragment/CustomizedAlarmToneFragment;", "contributeCustomizedAwareFragment", "Lcom/stemlabs/ellu/ui/component/aware/fragment/AwareFragment;", "contributeCustomizedAwareSelectAPlaceFragment", "Lcom/stemlabs/ellu/ui/component/aware/fragment/AwareSelectAPlaceFragment;", "contributeCustomizedCalenderMainFragment", "Lcom/stemlabs/ellu/ui/component/calendar/fragment/CalenderMainFragment;", "contributeCustomizedContactsToSendFragment", "Lcom/stemlabs/ellu/ui/component/newgroup/ContactsToSendFragment;", "contributeCustomizedDocFragment", "Lcom/stemlabs/ellu/ui/component/chat/medialinkdocs/fragment/DocFragment;", "contributeCustomizedIndividualChatFragment", "Lcom/stemlabs/ellu/ui/component/chat/fragment/IndividualChatFragment;", "contributeCustomizedMediaFragment", "Lcom/stemlabs/ellu/ui/component/chat/medialinkdocs/fragment/MediaFragment;", "contributeCustomizedMediaLinkDocsFragment", "Lcom/stemlabs/ellu/ui/component/chat/medialinkdocs/MediaLinkDocsFragment;", "contributeCustomizedMediaLinkFragment", "Lcom/stemlabs/ellu/ui/component/chat/medialinkdocs/fragment/MediaLinkFragment;", "contributeCustomizedNewGroupFragment", "Lcom/stemlabs/ellu/ui/component/newgroup/NewGroupFragment;", "contributeCustomizedPagerFragment", "Lcom/stemlabs/ellu/ui/component/chat/fragment/PagerFragment;", "contributeCustomizedProximityMapFragment", "Lcom/stemlabs/ellu/ui/component/proximity/fragment/ProximityMapFragment;", "contributeCustomizedResetPasswordFragment", "Lcom/stemlabs/ellu/ui/component/loginflow/ResetPasswordFragment;", "contributeCustomizedResetPasswordSuccessfullyFragment", "Lcom/stemlabs/ellu/ui/component/loginflow/ResetPasswordSuccessfullyFragment;", "contributeCustomizedShareAboutBandDetailFragment", "Lcom/stemlabs/ellu/ui/component/aboutband/fragment/AboutBandDetailFragment;", "contributeCustomizedShareAddNewContactFragment", "Lcom/stemlabs/ellu/ui/component/chat/fragment/AddNewContactFragment;", "contributeCustomizedShareBatteryFragment", "Lcom/stemlabs/ellu/ui/component/aboutband/fragment/BatteryFragment;", "contributeCustomizedShareCustomizeBandDetailFragment", "Lcom/stemlabs/ellu/ui/component/customize/fragment/CustomizeBandDetailFragment;", "contributeCustomizedShareCustomizeBandFragment", "Lcom/stemlabs/ellu/ui/component/customize/fragment/CustomizeBandFragment;", "contributeCustomizedShareCustomizeContactsAllSosPagerFragment", "Lcom/stemlabs/ellu/ui/component/chat/fragment/ContactsAllSosPagerFragment;", "contributeCustomizedShareCustomizeMeetSenderFragment", "Lcom/stemlabs/ellu/ui/component/meet/fragment/MeetSenderFragment;", "contributeCustomizedShareEditSosPagerContactFragment", "Lcom/stemlabs/ellu/ui/component/chat/fragment/EditSosPagerContactFragment;", "contributeCustomizedShareLocationFragment", "Lcom/stemlabs/ellu/ui/component/chat/fragment/ShareLocationFragment;", "contributeCustomizedShareMeetCardAnimationFragment", "Lcom/stemlabs/ellu/ui/component/meet/fragment/MeetCardAnimationFragment;", "contributeCustomizedShareResetBandFragment", "Lcom/stemlabs/ellu/ui/component/aboutband/fragment/ResetBandFragment;", "contributeCustomizedShareUpdateBandFragment", "Lcom/stemlabs/ellu/ui/component/aboutband/fragment/UpdateBandFragment;", "contributeCustomizedSosFragment", "Lcom/stemlabs/ellu/ui/component/sos/SosFragment;", "contributeCustomizedSosSendFragment", "Lcom/stemlabs/ellu/ui/component/sos/SosSendFragment;", "contributeCustomizedStoryAlertFragment", "Lcom/stemlabs/ellu/ui/component/alert/fragment/AlertFragment;", "contributeCustomizedStoryBoardFragment", "Lcom/stemlabs/ellu/ui/component/chat/fragment/StoryBoardFragment;", "contributeCustomizedTipsDetailFragment", "Lcom/stemlabs/ellu/ui/component/aboutband/fragment/TipsDetailFragment;", "contributeCustomizedVideoCallFragment", "Lcom/stemlabs/ellu/ui/component/chat/fragment/VideoCallFragment;", "contributeFaqFragment", "Lcom/stemlabs/ellu/ui/component/settings/fragment/FaqFragment;", "contributeForgotPasswordFragment", "Lcom/stemlabs/ellu/ui/component/loginflow/ForgotPasswordFragment;", "contributeHomeActivity", "Lcom/stemlabs/ellu/ui/component/home/HomeActivity;", "contributeIntroFragment", "Lcom/stemlabs/ellu/ui/component/loginflow/IntroFragment;", "contributeLinkFragment", "Lcom/stemlabs/ellu/ui/component/home/LinkFragment;", "contributeLoginFlowActivity", "Lcom/stemlabs/ellu/ui/component/loginflow/LoginFlowActivity;", "contributeLoginFragment", "Lcom/stemlabs/ellu/ui/component/loginflow/LoginFragment;", "contributeMainChatFragment", "Lcom/stemlabs/ellu/ui/component/home/MainChatFragment;", "contributePrivacyPolicyFragment", "Lcom/stemlabs/ellu/ui/component/settings/fragment/PrivacyPolicyFragment;", "contributeProximityFragment", "Lcom/stemlabs/ellu/ui/component/proximity/fragment/ProximityFragment;", "contributeSecurityFragment", "Lcom/stemlabs/ellu/ui/component/settings/fragment/SecurityFragment;", "contributeSettingsFragment", "Lcom/stemlabs/ellu/ui/component/settings/fragment/SettingsFragment;", "contributeSignUpFragment", "Lcom/stemlabs/ellu/ui/component/loginflow/SignUpFragment;", "contributeSplashActivity", "Lcom/stemlabs/ellu/ui/component/splash/SplashActivity;", "contributeTermsConditionFragment", "Lcom/stemlabs/ellu/ui/component/settings/fragment/TermsConditionFragment;", "contributeVerifyOtpFragment", "Lcom/stemlabs/ellu/ui/component/loginflow/VerifyOtpFragment;", "app_debug"})
@dagger.Module()
public abstract class ActivityModuleBuilder {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.splash.SplashActivity contributeSplashActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.home.HomeActivity contributeHomeActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.loginflow.LoginFlowActivity contributeLoginFlowActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.loginflow.IntroFragment contributeIntroFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.loginflow.LoginFragment contributeLoginFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.loginflow.SignUpFragment contributeSignUpFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.loginflow.ForgotPasswordFragment contributeForgotPasswordFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.loginflow.VerifyOtpFragment contributeVerifyOtpFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.aboutband.fragment.AboutBandFragment contributeAboutBandFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.home.LinkFragment contributeLinkFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.alarm.fragment.AlarmFragment contributeAlarmFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.home.MainChatFragment contributeMainChatFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.home.CallLogFragment contributeCallLogFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.settings.fragment.SettingsFragment contributeSettingsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.settings.fragment.FaqFragment contributeFaqFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.settings.fragment.PrivacyPolicyFragment contributePrivacyPolicyFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.settings.fragment.TermsConditionFragment contributeTermsConditionFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.settings.fragment.ChangePasswordFragment contributeChangePasswordFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.settings.fragment.SecurityFragment contributeSecurityFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.settings.fragment.CustomizedAlarmToneFragment contributeCustomizedAlarmToneFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.alarm.fragment.AddAlarmFragment contributeCustomizedAddAlarmFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.chat.fragment.IndividualChatFragment contributeCustomizedIndividualChatFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.chat.fragment.VideoCallFragment contributeCustomizedVideoCallFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.chat.fragment.StoryBoardFragment contributeCustomizedStoryBoardFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.alert.fragment.AlertFragment contributeCustomizedStoryAlertFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.proximity.fragment.ProximityFragment contributeProximityFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.calendar.fragment.CalendarFragment contributeCalendarFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.aware.fragment.AwareFragment contributeCustomizedAwareFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.aware.fragment.AwareSelectAPlaceFragment contributeCustomizedAwareSelectAPlaceFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.calendar.fragment.AddNewEventFragment contributeCustomizedAddNewEventFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.chat.fragment.ShareLocationFragment contributeCustomizedShareLocationFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.sos.SosFragment contributeCustomizedSosFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.customize.fragment.CustomizeBandFragment contributeCustomizedShareCustomizeBandFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.customize.fragment.CustomizeBandDetailFragment contributeCustomizedShareCustomizeBandDetailFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.chat.fragment.ContactsAllSosPagerFragment contributeCustomizedShareCustomizeContactsAllSosPagerFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.meet.fragment.MeetSenderFragment contributeCustomizedShareCustomizeMeetSenderFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.meet.fragment.MeetCardAnimationFragment contributeCustomizedShareMeetCardAnimationFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.chat.fragment.EditSosPagerContactFragment contributeCustomizedShareEditSosPagerContactFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.chat.fragment.AddNewContactFragment contributeCustomizedShareAddNewContactFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.aboutband.fragment.ResetBandFragment contributeCustomizedShareResetBandFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.aboutband.fragment.AboutBandDetailFragment contributeCustomizedShareAboutBandDetailFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.aboutband.fragment.BatteryFragment contributeCustomizedShareBatteryFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.aboutband.fragment.UpdateBandFragment contributeCustomizedShareUpdateBandFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.sos.SosSendFragment contributeCustomizedSosSendFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.newgroup.NewGroupFragment contributeCustomizedNewGroupFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.profile.fragment.ProfileFragment ProfileFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.chat.fragment.SOSProfileFragment SOSProfileFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.loginflow.ResetPasswordFragment contributeCustomizedResetPasswordFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.loginflow.ResetPasswordSuccessfullyFragment contributeCustomizedResetPasswordSuccessfullyFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.calendar.fragment.CalenderMainFragment contributeCustomizedCalenderMainFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.chat.medialinkdocs.MediaLinkDocsFragment contributeCustomizedMediaLinkDocsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.chat.medialinkdocs.fragment.MediaFragment contributeCustomizedMediaFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.chat.medialinkdocs.fragment.DocFragment contributeCustomizedDocFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.chat.medialinkdocs.fragment.MediaLinkFragment contributeCustomizedMediaLinkFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.newgroup.ContactsToSendFragment contributeCustomizedContactsToSendFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.aboutband.fragment.TipsDetailFragment contributeCustomizedTipsDetailFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.proximity.fragment.ProximityMapFragment contributeCustomizedProximityMapFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.stemlabs.ellu.ui.component.chat.fragment.PagerFragment contributeCustomizedPagerFragment();
    
    public ActivityModuleBuilder() {
        super();
    }
}