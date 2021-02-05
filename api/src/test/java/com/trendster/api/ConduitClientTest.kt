package com.trendster.api

import org.junit.Assert.assertNotNull
import org.junit.Test

class ConduitClientTest {

    private val conduitClient = ConduitClient()

    @Test
    fun `GET articles` () {
        val articles = conduitClient.api.getArticles().execute()
        assertNotNull(articles.body()?.articles)
    }

}