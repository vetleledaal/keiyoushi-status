# Extension Validation Report

- Extension: tachiyomi-ja.nicovideoseiga-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 27
- Lint: 1
- Warnings: 1
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1452408892924080686
- Source name: Nicovideo Seiga
- Source language: ja
- Selected manga input: popular offset 0: 宇崎ちゃんは遊びたい！ (`.../31616`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | 宇崎ちゃんは遊びたい！ (`.../31616`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | クセ強彼女は床にいざなう (`.../68558`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | kotlinx.serialization.json.JsonDecodingException: Expected string value for a non-null key 'square_image_url', got null literal instead at path: \$.square_image_url<br>Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.<br>JSON input: .....are_image_url":null,"rating":{"violence":null,"adult":null}} | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 宇崎ちゃんは遊びたい！ (`.../31616`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 170 | 第1話（前半） (`.../286847`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 9 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | ERROR | kotlinx.serialization.json.JsonDecodingException: Expected string value for a non-null key 'square_image_url', got null literal instead at path: \$.square_image_url<br>Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.<br>JSON input: .....are_image_url":null,"rating":{"violence":null,"adult":null}} | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | SKIP | Expected string value for a non-null key 'square_image_url', got null literal instead at path: \$.square_image_url<br>Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.<br>JSON input: .....are_image_url":null,"rating":{"violence":null,"adult":null}} |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 40/40 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 40/40 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://deliver.cdn.nicomanga.jp/.../21950749q <redacted query values: 1787287279>` (image/jpeg, 8601 bytes, 160x90) |  |  |  |
| details identity | PASS | Details preserved selected URL `31616` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://deliver.cdn.nicomanga.jp/.../16409463qa <redacted query values: 1741333872>` (image/jpeg, 49072 bytes, 320x320) |  |  |  |
| details author | PASS | 丈(著者) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ウザい！ カワイイ！ でもウザい！<br>SNSで話題の、態度とか、色々デッカい ウザカワ系後輩ラブコメ！<br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 170 chapters |  |  |  |
| chapter dates | PASS | 170 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://drm.cdn.nicomanga.jp/.../7666512p.webp <redacted query values: 1565699880>` (image/webp (container: extended), 86928 bytes, 650x935; server Content-Type: application/octet-stream) |  |  |  |
