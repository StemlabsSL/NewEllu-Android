package com.stemlabs.ellu.data

import com.stemlabs.ellu.data.remote.dto.*
import kotlinx.coroutines.flow.Flow


interface DataRepositorySource {
    suspend fun requestLanguages(): Flow<Resource<LanguageModel>>
}
