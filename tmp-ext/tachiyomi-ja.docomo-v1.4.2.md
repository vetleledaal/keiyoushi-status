# Extension Validation Report

- Extension: tachiyomi-ja.docomo-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 28
- Lint: 3
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2833994049092509182
- Source name: Docomo
- Source language: ja
- Selected manga input: popular offset 0: 魔入りました！入間くん　50 (`.../2000`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | 魔入りました！入間くん　50 (`.../2000`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 50 | ハズレ嫁は最強の天才公爵様と再婚しました。２ (`.../2000`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | 魔入りました！入間くん (`.../2000`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 魔入りました！入間くん　50 (`.../2000`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 50 | 魔入りました！入間くん　1 (`.../view <redacted query values: cid, cti, and cc>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 198 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 2 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mw-cds.akamaized.net/.../cover.jpg <redacted query values: ivm>` (image/jpeg, 26003 bytes, 165x256) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2000` |  |  |  |
| details thumbnail URL | PASS | `https://mw-cds.akamaized.net/.../cover.jpg <redacted query values: ivm>` |  |  |  |
| details author | PASS | 西修 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少年マンガ |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | アメリを出産し、容体が急変した人間・メリーゼ。この危機を、アンリは救うことができるのか――!? さまざまな悪魔たちの想いが交錯する＜アンリ編＞フィナーレ！ そして、悪魔学校新学期×衝撃新章突入！【電子版特典：『魔入りました！入間くん 僕同盟のゲーム道』第1話を特別掲載！】 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 50 chapters |  |  |  |
| chapter dates | LINT | All 50 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=50 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 198 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://d21agqkwgk4jud.cloudfront.net/.../10dd850fdbe1dae85c.jpeg` (image/jpeg, 352592 bytes, 777x1200) |  |  |  |
