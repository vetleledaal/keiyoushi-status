package dev.vetle.extstats.runtime

import android.util.JsonReader
import android.util.JsonToken
import java.io.StringReader
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class JsonReaderCompatTest {
    @Test
    fun `streams nested JSON values`() {
        JsonReader(StringReader("""{"name":"MangaLix","items":[1,2.5,null,true],"ignored":{"id":7}}""")).use { reader ->
            assertEquals(JsonToken.BEGIN_OBJECT, reader.peek())
            reader.beginObject()
            assertEquals("name", reader.nextName())
            assertEquals("MangaLix", reader.nextString())
            assertEquals("items", reader.nextName())
            reader.beginArray()
            assertEquals(1, reader.nextInt())
            assertEquals(2.5, reader.nextDouble())
            reader.nextNull()
            assertTrue(reader.nextBoolean())
            reader.endArray()
            assertEquals("ignored", reader.nextName())
            reader.skipValue()
            assertFalse(reader.hasNext())
            reader.endObject()
            assertEquals(JsonToken.END_DOCUMENT, reader.peek())
        }
    }

    @Test
    fun `supports lenient JSON`() {
        JsonReader(StringReader("['value']")).use { reader ->
            reader.isLenient = true
            assertTrue(reader.isLenient)
            reader.beginArray()
            assertEquals("value", reader.nextString())
            reader.endArray()
        }
    }
}
