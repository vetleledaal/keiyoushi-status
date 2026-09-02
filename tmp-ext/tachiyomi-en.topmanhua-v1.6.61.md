# Extension Validation Report

- Extension: tachiyomi-en.topmanhua-v1.6.61
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 24
- Lint: 0
- Warnings: 1
- Skipped: 10
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 368848319592333339
- Source name: Top Manhua
- Source language: en
- Selected manga input: popular offset 0: Martial Peak (`.../70217`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Martial Peak (`.../70217`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | I Am Carrying Gold From The Post-Apocalyptic World (`.../74723`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | I Thought You Were A Time-Limited Husband (`.../91299`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | I Will Pay the Price for Deceiving You With My Life (`.../96566`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 15 | Martial Peak (`.../70217`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Peak (`.../70217`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Martial Peak, URL=`70217` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 115/115 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 115/115 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangatop.org/.../post_70217_image-175x238.jpg` (image/jpeg, 11992 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `70217` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangatop.org/.../post_70217_image-193x278.jpg` (image/jpeg, 15181 bytes, 193x278) |  |  |  |
| details author | PASS | Momo (II), Momo (III) |  |  |  |
| details artist | PASS | Momo (II), Pikapi |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Drama, Fantasy, Harem, Historical, Manga, Manhwa, Martial Arts, Romance, Sci-fi, Shounen, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
