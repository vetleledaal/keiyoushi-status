# Extension Validation Report

- Extension: tachiyomi-en.renascans-v1.6.27
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3447464472094373275
- Source name: Renascans
- Source language: en
- Selected manga input: latest offset 0: Underworld Invasion (`.../underworld-invasion`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | The Incognito Princess  (`.../the-incognito-princess-j3rbe8x7`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 18 | The Beast's Footprints (`.../the-beasts-footprints-4v75hssr`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Underworld Invasion (`.../underworld-invasion`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Shining Nananana (`.../shining-nananana-8609krnl`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Underworld Invasion (`.../underworld-invasion`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Underworld Invasion (`.../underworld-invasion`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | Chapter 25 (`.../chapter-25`) |  | <1s |
| pages | `getPageList(chapter)` | success | 35 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Underworld Invasion, URL=`underworld-invasion#169` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.renascans.net/.../d3987754-81c8-448c-9b2e-815ba20f2da5.jpg` (image/jpeg, 53357 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `underworld-invasion#169` |  |  |  |
| details thumbnail URL | PASS | `https://storage.renascans.net/.../d3987754-81c8-448c-9b2e-815ba20f2da5.jpg` |  |  |  |
| details author | PASS | Sin Seon Jem |  |  |  |
| details artist | PASS | RAZR |  |  |  |
| details genres | PASS | Manhwa, Fantasy, Adventure, action, Seinen, Tragedy, Sci-fi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A massive war erupts between angels and aliens, with the very fabric of the afterlife at stake. Kim Ria, the last surviving human on Earth who has no lingering attachment to life, and Azazel, an angel who despises the god exiled from the afterlife, become the pivots upon which the fate of both humanity and the afterlife turns. In the afterlife, angels and aliens clash into an all‑out war. At the same time, on Earth, Azazel and Kim Ria undertake a tense survival adventure as they evade pursuit squads hunting the final human.<br><br>Alternative Names: Jeoseungchimgong / Вторжение в загробный мир / 저승침공 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://storage.renascans.net/.../page-0001_0000_1787436241564-95373.webp` (image/webp (encoding: lossy), 539284 bytes, 900x5000) |  |  |  |
