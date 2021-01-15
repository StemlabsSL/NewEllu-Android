package com.stemlabs.ellu.data.remote

import com.stemlabs.ellu.data.Resource
import com.stemlabs.ellu.data.remote.dto.*

interface RemoteDataSource {
    suspend fun requestLanguage(): Resource<LanguageModel>
}
