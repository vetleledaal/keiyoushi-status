@file:Suppress("PropertyName")

package eu.kanade.tachiyomi.source.model

import kotlinx.serialization.json.JsonObject

class SChapterImpl : SChapter {
    override lateinit var url: String
    override lateinit var name: String
    override var chapter_number: Float = -1F
    override var scanlator: String? = null
    override var date_upload: Long = 0L
    override var memo: JsonObject = JsonObject(emptyMap())
}
