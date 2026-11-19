package dev.vetle.extstats.runtime

import eu.kanade.tachiyomi.source.model.Filter

class LegacyFilterGroup<V>(name: String, state: List<V>) : Filter.Group<V>(name, state)
