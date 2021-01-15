package com.stemlabs.ellu.di

import com.stemlabs.ellu.data.error.mapper.ErrorMapper
import com.stemlabs.ellu.data.error.mapper.ErrorMapperInterface
import com.stemlabs.ellu.usecase.errors.ErrorFactory
import com.stemlabs.ellu.usecase.errors.ErrorManager
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

// with @Module we Telling Dagger that, this is a Dagger module
@Module
abstract class ErrorModule {
    @Binds
    @Singleton
    abstract fun provideErrorFactoryImpl(errorManager: ErrorManager): ErrorFactory

    @Binds
    @Singleton
    abstract fun provideErrorMapper(errorMapper: ErrorMapper): ErrorMapperInterface
}