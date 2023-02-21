package com.example.giphyadvancedpagingapplication.data.model


sealed class GifsSearchResult {
    data class Success(val data: List<GifObject>) : GifsSearchResult()
    data class Error(val error: Exception) : GifsSearchResult()
}