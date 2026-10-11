# Extension Validation Report

- Extension: tachiyomi-ja.nicovideoseiga-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 1
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1452408892924080686
- Source name: Nicovideo Seiga
- Source language: ja
- Selected manga input: popular offset 0: 宇崎ちゃんは遊びたい！ (`.../31616`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | 宇崎ちゃんは遊びたい！ (`.../31616`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | クセ強彼女は床にいざなう (`.../68558`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | 宇崎ちゃんは遊びたい！ (`.../31616`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 宇崎ちゃんは遊びたい！ (`.../31616`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 171 | 第1話（前半） (`.../286847`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 9 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=宇崎ちゃんは遊びたい！, URL=`31616` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 44/44 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 43/44 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://deliver.cdn.nicomanga.jp/.../23215539q <redacted query values: 1790681591>` (image/jpeg, 7757 bytes, 160x90) |  |  |  |
| details identity | PASS | Details preserved selected URL `31616` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://deliver.cdn.nicomanga.jp/.../16409463qa <redacted query values: 1741333872>` (image/jpeg, 49072 bytes, 320x320) |  |  |  |
| details author | PASS | 丈(著者) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ウザい！ カワイイ！ でもウザい！<br>SNSで話題の、態度とか、色々デッカい ウザカワ系後輩ラブコメ！<br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 171 chapters |  |  |  |
| chapter dates | PASS | 171 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://drm.cdn.nicomanga.jp/.../7666512p.webp <redacted query values: 1565699880>` (image/webp (container: extended), 86928 bytes, 650x935; server Content-Type: application/octet-stream) |  |  |  |
