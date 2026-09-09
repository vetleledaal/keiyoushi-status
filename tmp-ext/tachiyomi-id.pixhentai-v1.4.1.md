# Extension Validation Report

- Extension: tachiyomi-id.pixhentai-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: oceanwp
- Source ID: 7447468764477211885
- Source name: Pix Hentai
- Source language: id
- Selected manga input: popular offset 0: Chuui Gyaru Houimou (`.../chuui-gyaru-houimou`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 8 | Chuui Gyaru Houimou (`.../chuui-gyaru-houimou`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 8 | Rinkou – A late night tale that tickles the heart. A young woman sneaks into your exhausted life (`.../rinkou-a-late-night-tale-that-tickles-the-heart-a-young-woman-sneaks-into-your-exhausted-life`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Chuui Gyaru Houimou (`.../chuui-gyaru-houimou`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Chuui Gyaru Houimou (`.../chuui-gyaru-houimou`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 1 (`.../chuui-gyaru-houimou`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 38 |  |  | <1s |

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
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Chuui Gyaru Houimou, URL=`.../chuui-gyaru-houimou` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 17/17 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 17/17 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pixhentai.com/.../Chuui-Gyaru-Houimou-cover-200x285.jpg` (image/jpeg, 15210 bytes, 200x285) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../chuui-gyaru-houimou` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://pixhentai.com/.../Chuui-Gyaru-Houimou-cover.jpg` (image/jpeg, 126649 bytes, 680x960) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Big Boobs, Big butt, Blowjob, Doggy, Footjob, Harem, Small Breasts, Small Tits, Sub Indo, Toket Besar, Uncensored, Vanilla |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Baca komik hentai manga sex doujinshi xxx bokep berjudul Chuui Gyaru Houimou. Seorang Otaku, terjebak duduk di antara 4 gyaru nakal saat penentuan tempat duduk di awal semester baru. Otaku merasa harus menghindari mereka sejauh mungkin, tetapi entah kenapa ia justru ikut pergi berkaraoke bersama mereka, hingga akhirnya ia pun dikepung oleh payudara dan berbagai kenikmatan sex. Kelanjutan ceritanya di manga hentai xxx komik dewasa bokep doujin sex di bawah ini. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.openhentai.net/.../Chuui-Gyaru-Houimou-%20(1).webp` (image/webp (container: extended), 574896 bytes, 1360x1920) |  |  |  |
