# Extension Validation Report

- Extension: tachiyomi-ja.piccoma-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 13
- Lint: 1
- Warnings: 1
- Skipped: 19
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7159690625157327655
- Source name: Piccoma
- Source language: ja
- Selected manga input: popular offset 0: 元・世界１位のサブキャラ育成日記 ～廃プレイヤー、異世界を攻略中！～ (`.../11929 <redacted query values: etype>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | 元・世界１位のサブキャラ育成日記 ～廃プレイヤー、異世界を攻略中！～ (`.../11929 <redacted query values: etype>`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | 引退した殺し屋は癒やされたい (`.../204732`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | 鶴子はまだ四十五だから！ (`.../183613`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | 元・世界１位のサブキャラ育成日記 ～廃プレイヤー、異世界を攻略中！～ (`.../11929`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | error | 0 |  | java.lang.NullPointerException | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 0 |  |  | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=元・世界１位のサブキャラ育成日記 ～廃プレイヤー、異世界を攻略中！～, URL=`.../11929` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 112/112 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 112/112 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://piccoma.kakaocdn.net/.../cover_x3` -> 2 manga URLs (examples: `.../11929 <redacted query values: etype>`, `.../11929`) |  |  |  |
| thumbnail | PASS | `https://piccoma.kakaocdn.net/.../cover_x3` (image/jpeg, 278107 bytes, 823x1170; server Content-Type: application/octet-stream) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | SKIP | No details metadata to check |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
