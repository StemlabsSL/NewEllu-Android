// Generated by Dagger (https://dagger.dev).
package com.stemlabs.ellu.ui.component.splash;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SplashViewModel_Factory implements Factory<SplashViewModel> {
  @Override
  public SplashViewModel get() {
    return newInstance();
  }

  public static SplashViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SplashViewModel newInstance() {
    return new SplashViewModel();
  }

  private static final class InstanceHolder {
    private static final SplashViewModel_Factory INSTANCE = new SplashViewModel_Factory();
  }
}