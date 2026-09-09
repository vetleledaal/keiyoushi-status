# Extension Validation Report

- Extension: tachiyomi-en.alphamanga-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 370653027333714265
- Source name: Alpha Manga
- Source language: en
- Selected manga input: popular offset 0: Satisfied Now That I’m Dead? (`.../612000555`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Satisfied Now That I’m Dead? (`.../612000555`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | This is No Time for the Villainess to Bully the Heroine! (`.../571000385`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Satisfied Now That I’m Dead? (`.../612000555`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Satisfied Now That I’m Dead? (`.../612000555`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 7 | Chapter 1 (`.../4109`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 38 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Satisfied Now That I’m Dead?, URL=`612000555` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image-en.alpha-manga.com/.../book_cover_441x627.webp` (image/webp (encoding: lossy), 86188 bytes, 441x627) |  |  |  |
| details identity | PASS | Details preserved selected URL `612000555` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://image-en.alpha-manga.com/.../670x300.webp` (image/webp (encoding: lossy), 76654 bytes, 670x300) |  |  |  |
| details author | PASS | Matibari |  |  |  |
| details artist | PASS | Abatamo |  |  |  |
| details genres | PASS | Shojo, Isekai, Romance, Rekt, BrokenEngagement |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The news of the accidental death of Lady Rorona Ryus arrived just one day after her fiancé, the Crown Prince, had called off their engagement. Rorona had been condemned for crimes she didn't commit—falsely accused of tormenting her younger sister—yet she had accepted the charges with startling indifference. They say her body was discovered inside an overturned carriage on a suburban road, her face crushed beyond recognition. Upon hearing of her death, Rorona’s sister rejoiced. "Now the Crown Prince is finally mine," she thought. The Crown Prince merely laughed. "I wish she’d died sooner," he remarked. However, they were blissfully unaware of one thing: Rorona’s death would bring far more than just "good fortune" to their doorstep... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | PASS | 7 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ot-image-en.alpha-manga.com/.../1080x1536.webp <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/webp (encoding: lossy), 449458 bytes, 1080x1536) |  |  |  |
