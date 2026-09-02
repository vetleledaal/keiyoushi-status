# Extension Validation Report

- Extension: tachiyomi-en.alphamanga-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
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
- Selected manga input: popular offset 0: An Isekai Adventure Tale of a Former Structural Analysis Researcher (`.../92000221`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | An Isekai Adventure Tale of a Former Structural Analysis Researcher (`.../92000221`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | A Playthrough of a Certain Dude's VRMMO Life (`.../658000067`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | An Isekai Adventure Tale of a Former Structural Analysis Researcher (`.../92000221`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | An Isekai Adventure Tale of a Former Structural Analysis Researcher (`.../92000221`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 14 | Chapter 1: Kaoru's Rebirth (`.../3700`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 40 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=An Isekai Adventure Tale of a Former Structural Analysis Researcher, URL=`92000221` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image-en.alpha-manga.com/.../book_cover_441x627.webp` (image/webp (encoding: lossy), 84884 bytes, 441x627) |  |  |  |
| details identity | PASS | Details preserved selected URL `92000221` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://image-en.alpha-manga.com/.../670x300.webp` (image/webp (encoding: lossy), 94648 bytes, 670x300) |  |  |  |
| details author | PASS | Mamoru Inuya |  |  |  |
| details artist | PASS | KIRISAWA Juzo |  |  |  |
| details genres | PASS | Shonen, Isekai, Reincarnation, Adventure, Cheats |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Clumsy but beautiful Kaori Mochimizu is crushed by a massive machine while protecting a junior colleague during a powerful earthquake in her pharmaceutical company’s research lab. When she comes to, a goddess is standing before her… Reincarnated as a young girl, Kaori begins her second life armed with two powerful skills: “Structural Analysis” and “Structural Editing,” which let her freely examine and modify the status of people and monsters! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 14 chapters |  |  |  |
| chapter dates | PASS | 14 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ot-image-en.alpha-manga.com/.../1080x1536.webp <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/webp (encoding: lossy), 649404 bytes, 1080x1536) |  |  |  |
