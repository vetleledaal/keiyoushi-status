# Extension Validation Report

- Extension: tachiyomi-en.lgbtics-v1.6.61
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 4306337471481207984
- Source name: Lgbtics
- Source language: en
- Selected manga input: popular offset 0: Sisters Boyfriend [ShadBase] (`.../sisters-boyfriend-shadbase`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Sisters Boyfriend [ShadBase] (`.../sisters-boyfriend-shadbase`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Ibiza Girl’s Trip [Ekynoxe] (`.../ibiza-girls-trip-ekynoxe`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Prince’s Secret Elliot and the Servant [RedCherry] (`.../princes-secret-elliot-and-the-servant-redcherry`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Spiderman – No Way out [XyaaAi] (`.../spiderman-no-way-out-xyaaai`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sisters Boyfriend [ShadBase] (`.../sisters-boyfriend-shadbase`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sisters Boyfriend [ShadBase] (`.../sisters-boyfriend-shadbase`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | 1. Sisters Boyfriend [ShadBase] (`.../1-sisters-boyfriend-shadbase`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sisters Boyfriend \[ShadBase\], URL=`.../sisters-boyfriend-shadbase` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lgbtics.com/.../Sisters-Boyfriend-ShadBase-350x476.webp` (image/webp (encoding: lossy), 22306 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sisters-boyfriend-shadbase` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://lgbtics.com/.../Sisters-Boyfriend-ShadBase-193x278.webp` (image/webp (encoding: lossy), 9848 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | ShadBase |  |  |  |
| details genres | PASS | Anal, Crossdressing, Femboy, Lingerie, Males Only, Muscle, Sex Toys, Western, Yaoi / Gay |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Rating: 3.7/5<br><br>… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://lgbtics.com/.../NovelCrow01.webp` (image/webp (encoding: lossy), 272442 bytes, 1200x2486) |  |  |  |
