package com.stemlabs.ellu.data

import com.stemlabs.ellu.data.local.LocalData
import com.stemlabs.ellu.data.remote.RemoteData
import com.stemlabs.ellu.data.remote.dto.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject



class DataRepository @Inject
constructor(private val remoteRepository: RemoteData, private val localRepository: LocalData) : DataRepositorySource {

    override suspend fun requestLanguages(): Flow<Resource<LanguageModel>> {
        return flow {
//                emit(Resource.Loading())
            emit(remoteRepository.requestLanguage())
        }.flowOn(Dispatchers.IO)
    }

}
