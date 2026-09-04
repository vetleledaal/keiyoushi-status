package dev.vetle.extstats.runtime

import kotlin.test.Test
import kotlin.test.assertEquals

class HtmlCompatTest {
    @Test
    fun `flag overload preserves reached text behavior`() {
        val source = "<p>Hello <strong>world</strong></p>"
        val html = Class.forName("android.text.Html")
        val expected = html.getMethod("fromHtml", String::class.java).invoke(null, source).toString()
        val flagOverload = html.getMethod("fromHtml", String::class.java, Integer.TYPE)

        assertEquals(expected, flagOverload.invoke(null, source, 0).toString())
        assertEquals(expected, flagOverload.invoke(null, source, 63).toString())
    }
}
