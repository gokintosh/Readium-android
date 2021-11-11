package io.gokul.api

import com.gokul.api.ReadiumClient
import org.junit.Assert.assertNotNull
import org.junit.Test

class ReadiumClientTest {

    private val readiumClient=ReadiumClient()

    @Test
    fun `Get Articles`(){
        val articles=readiumClient.api.getArticles().execute()
        assertNotNull(articles.body()?.articles)
    }
}