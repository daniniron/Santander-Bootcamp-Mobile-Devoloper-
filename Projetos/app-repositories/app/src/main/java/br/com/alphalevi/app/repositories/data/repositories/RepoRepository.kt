package br.com.alphalevi.app.repositories.data.repositories

import br.com.alphalevi.app.repositories.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}