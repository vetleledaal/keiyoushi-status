package dev.vetle.extstats.runtime

import android.icu.text.BreakIterator
import android.icu.text.Collator
import android.icu.text.Normalizer2
import android.icu.text.RuleBasedCollator
import android.icu.text.StringSearch
import java.text.StringCharacterIterator
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class IcuTextCompatTest {
    @Test
    fun `supports ProjectSuki text normalization and search`() {
        assertEquals("abc", Normalizer2.getNFKCCasefoldInstance().normalize("ＡＢC"))

        val collator = Collator.getInstance() as RuleBasedCollator
        collator.setCaseLevel(true)
        collator.setStrength(Collator.PRIMARY)
        collator.setDecomposition(Collator.CANONICAL_DECOMPOSITION)
        val search = StringSearch("ana", StringCharacterIterator("banana"), collator)
        search.setOverlapping(true)

        assertEquals(1, search.first())
        assertEquals("ana", search.matchedText)
        assertEquals(3, search.next())

        search.setTarget(StringCharacterIterator("cabana"))
        search.setPattern("ban")
        assertEquals(2, search.first())
    }

    @Test
    fun `supports ProjectSuki word and character boundaries`() {
        val words = BreakIterator.getWordInstance()
        words.setText(StringCharacterIterator("one two"))
        assertEquals(0, words.first())
        assertTrue(words.next() > 0)
        assertTrue(words.ruleStatus >= 0)

        val characters = BreakIterator.getCharacterInstance()
        characters.setText(StringCharacterIterator("ab"))
        assertEquals(0, characters.first())
        assertEquals(1, characters.next())
        assertEquals(2, characters.next())
        assertEquals(BreakIterator.DONE, characters.next())
    }
}
