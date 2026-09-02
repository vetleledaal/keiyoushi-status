# Extension Validation Report

- Extension: tachiyomi-en.manhuaplusorg-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5075089422240578347
- Source name: ManhuaPlus (Unoriginal)
- Source language: en
- Selected manga input: latest offset 0: The Knight King Who Returned with a God (`.../the-knight-king-who-returned-with-a-god`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 42 | Magic Emperor (`.../demon-magic-emperor`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 42 | Revenge of the Baskerville Bloodhound (`.../revenge-of-the-iron-blooded-sword-hound`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | The Knight King Who Returned with a God (`.../the-knight-king-who-returned-with-a-god`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | A Dragonslayer's Peerless Regression (`.../a-dragonslayer-s-peerless-regression`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Knight King Who Returned with a God (`.../the-knight-king-who-returned-with-a-god`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Knight King Who Returned with a God (`.../the-knight-king-who-returned-with-a-god`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 180 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| popular listing | PASS | 42 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Knight King Who Returned with a God, URL=`.../the-knight-king-who-returned-with-a-god` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 133/133 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 133/133 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhuaplus.org/.../the-knight-king-who-returned-with-a-god.jpg` (image/jpeg, 56211 bytes, 360x467) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-knight-king-who-returned-with-a-god` |  |  |  |
| details thumbnail URL | PASS | `https://manhuaplus.org/.../the-knight-king-who-returned-with-a-god.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | I returned to Earth after hunting demons in the otherworld for three hundred years. However, I did not return alone. **Official Translations** Simplified Chinese Traditional Chinese |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 180 chapters |  |  |  |
| chapter dates | PASS | 180 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.manhuaplus.cc/.../09-52-01-5825315154440989.webp` (image/webp (encoding: lossy), 188196 bytes, 1200x800) |  |  |  |
