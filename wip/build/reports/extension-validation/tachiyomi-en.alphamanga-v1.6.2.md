# Extension Validation Report

- Extension: tachiyomi-en.alphamanga-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Selected manga input: popular offset 0: Reincarnated and Abandoned, but Now I'm Living Happily After Being Taken In (`.../295000559`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Reincarnated and Abandoned, but Now I'm Living Happily After Being Taken In (`.../295000559`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | The Carefree Frontier Life of the Strongest F-Ranked Adventurer (`.../998000381`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Reincarnated and Abandoned, but Now I'm Living Happily After Being Taken In (`.../295000559`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Reincarnated and Abandoned, but Now I'm Living Happily After Being Taken In (`.../295000559`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | Chapter 1 (`.../4458`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Reincarnated and Abandoned, but Now I'm Living Happily After Being Taken In, URL=`295000559` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image-en.alpha-manga.com/.../book_cover_441x627.webp` (image/webp (encoding: lossy), 113144 bytes, 441x627) |  |  |  |
| details identity | PASS | Details preserved selected URL `295000559` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://image-en.alpha-manga.com/.../670x300.webp` (image/webp (encoding: lossy), 82482 bytes, 670x300) |  |  |  |
| details author | PASS | Toroneko |  |  |  |
| details artist | PASS | Miyako Mitsunari |  |  |  |
| details genres | PASS | Shojo, Isekai, Cheats, Reincarnation, Leisurely |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Milly was reincarnated as a baby with memories of her past life—but just five months in, she's abandoned out in the cold...! She narrowly survives after being taken in by a couple named Joe and Marissa, but life among commoners in this other world turns out to be pretty rough... A filthy room covered in dust and stains, and none of the delicious food she had in her previous life! On top of that, the restaurant-inn the couple runs—the "Shaded Cat Inn"—is struggling to stay afloat!? Determined to repay the kindness of those who saved her, Milly sets out to turn the place around using cheat magic and the knowledge she carried over from her past life—. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ot-image-en.alpha-manga.com/.../1080x1536.webp <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/webp (encoding: lossy), 676408 bytes, 1080x1536) |  |  |  |
