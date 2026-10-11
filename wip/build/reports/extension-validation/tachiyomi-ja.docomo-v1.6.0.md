# Extension Validation Report

- Extension: tachiyomi-ja.docomo-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 28
- Lint: 3
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2833994049092509182
- Source name: Docomo
- Source language: ja
- Selected manga input: popular offset 0: 転生したらスライムだった件（３３） (`.../2000`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 転生したらスライムだった件（３３） (`.../2000`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | 暗殺スキルで異世界最強　～錬金術と暗殺術を極めた俺は、世界を陰から支配する～ 8巻 (`.../2000`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 転生したらスライムだった件 (`.../2000`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 転生したらスライムだった件（３３） (`.../2000`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 33 | 転生したらスライムだった件（１） (`.../58a5db94be01f33cbce4f9016cc866ac7b064d4acdf7e29919da5e4d4008500b`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 244 |  |  | 1-10s |

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
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 1 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mw-cds.akamaized.net/.../cover.jpg <redacted query values: ivm>` (image/jpeg, 19756 bytes, 180x256) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2000` |  |  |  |
| details thumbnail URL | PASS | `https://mw-cds.akamaized.net/.../cover.jpg <redacted query values: ivm>` |  |  |  |
| details author | PASS | 川上泰樹, 伏瀬 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少年マンガ |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 北方から悪魔の軍勢がイングラシア王国へと迫っていると知り、混乱する西方諸国評議会（カウンシル・オブ・ウエスト）の議員達。しかしそこには、リムルの命を受け評議会に派遣されたテスタロッサの姿があった。一方、マリアと戦っていたルミナスは夜想宮廷(ナイトガーデン)の聖櫃に封印されていた”あるもの”がなくなっていることに気づき激怒する。さらにラファエルさえも理解できない事態がリムルの目の前で起こるのだった！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 33 chapters |  |  |  |
| chapter dates | LINT | All 33 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=33 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 244 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://d21agqkwgk4jud.cloudfront.net/.../10c9d450a764993684.jpeg` (image/jpeg, 259858 bytes, 1125x1600) |  |  |  |
