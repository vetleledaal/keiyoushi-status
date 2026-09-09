# Extension Validation Report

- Extension: tachiyomi-ja.asacomi-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 6455606609436338494
- Source name: Asacomi
- Source language: ja
- Selected manga input: popular offset 0: ある設計士の忌録 (`.../be8c33aa38f8e`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | ある設計士の忌録 (`.../be8c33aa38f8e`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | 猫を拾った話。 (`.../da8497824b617`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | ある設計士の忌録 (`.../be8c33aa38f8e`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ある設計士の忌録 (`.../be8c33aa38f8e`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ある設計士の忌録 (`.../be8c33aa38f8e`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 80 | 箱-① (`.../6720c9dde5f93`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ある設計士の忌録, URL=`.../be8c33aa38f8e` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 77/77 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 77/77 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20241217190922066CAD1F3BF50285356DDD2077AC3EFDB45-lg.webp` (image/webp (encoding: lossy), 50398 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../be8c33aa38f8e` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20241217190922066CAD1F3BF50285356DDD2077AC3EFDB45.png` (image/png, 4932837 bytes, 2560x1344) |  |  |  |
| details author | PASS | 鯛夢 |  |  |  |
| details artist | PASS | 鯛夢 |  |  |  |
| details genres | PASS | コミックZOTTO, ホラー |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 『HONKOWA』誌上で大反響!! 工務店を営む“私”が仕事の上で時折出会う、安易に手出しできないブラック案件。そんなときに彼が頼るのは、とある筋から知り合った、不思議な力を持つ男、“先生”。その男は法外なギャラと引き換えに、磁場や霊力がうごめく様々な土地建物の、闇に包まれた秘密を解き明かしていく。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 80 chapters |  |  |  |
| chapter dates | PASS | 80 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.asacomi.jp/.../master-1734417099953-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 13, 11, 10, 4, 7, 2, 0, 6, 15, 3, 1, 12, 5, 8, 9\]` (image/jpeg, 571550 bytes, 1350x1920) |  |  |  |
