# Extension Validation Report

- Extension: tachiyomi-all.pixiv-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 4964829535501435742
- Source name: Pixiv
- Source language: en
- Selected manga input: latest offset 0: 閑日 (`.../150734482`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 会社と私生活-オンとオフ- (`.../198059`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | にわさきダイアリ (`.../90658`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | 閑日 (`.../150734482`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | taco drawing (`.../123810`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | 閑日 (`.../150734482`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 閑日 (`.../150734482`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 閑日 (`.../150734482`) |  | <1s |
| pages | `getPageList(chapter)` | success | 4 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=閑日, URL=`.../150734482` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 204/204 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 204/204 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.pximg.net/.../150734482_p0_master1200.jpg` (image/jpeg, 1028654 bytes, 1200x712) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../150734482` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://i.pximg.net/.../150734482_p0_master1200.jpg` was not downloaded |  |  |  |
| details author | PASS | 🐰 |  |  |  |
| details artist | PASS | 🐰 |  |  |  |
| details genres | PASS | 刀剣乱舞, とうらぶ, 一文字則宗, 山鳥毛, 一文字一家 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | ⚠則宗の過去を捏造しているシーンがあります。<br><br>則宗を昔から知る刀たちは、今の彼の姿を見て何を思うのでしょうか……。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.pximg.net/.../150734482_p0.jpg` (image/jpeg, 371011 bytes, 1224x726) |  |  |  |
