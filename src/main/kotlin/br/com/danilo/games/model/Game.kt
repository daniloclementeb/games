package br.com.danilo.games.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Game(@Id val id: String? = null,
                var nome: String,
                var urlImage: String,
                var anoLancamento: Integer);