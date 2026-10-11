# Extension Validation Report

- Extension: tachiyomi-all.comicgrowl-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 299423548273637501
- Source name: Comic Growl
- Source language: all
- Selected manga input: popular offset 0: 魔法使いの嫁 (`.../42831552a0d66`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | 魔法使いの嫁 (`.../42831552a0d66`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | いろは堂あやかし語り (`.../27b542b581343`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | [ENG]BanG Dream! YUME∞MITA Arale ∞ Aralebulation (`.../738c13a43086c`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 魔法使いの嫁 (`.../42831552a0d66`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 魔法使いの嫁 (`.../42831552a0d66`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 285 | 1 (`.../100daaf157782`) |  | <1s |
| pages | `getPageList(chapter)` | success | 46 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=魔法使いの嫁, URL=`42831552a0d66` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20250217122007748F1EEE902D7E326FD61C38D8BAB4D2CFA-lg.webp` (image/webp (encoding: lossy), 48220 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `42831552a0d66` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20250217122007748F1EEE902D7E326FD61C38D8BAB4D2CFA.png` (image/png, 4489328 bytes, 2560x1344) |  |  |  |
| details author | PASS | ヤマザキコレ |  |  |  |
| details artist | PASS | ヤマザキコレ |  |  |  |
| details genres | PASS | アニメ化, ファンタジー・SF, 恋愛 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 羽鳥チセ15歳。身寄りもなく、生きる希望も術も持たぬ彼女を金で買ったのはひと為らざる魔法使いだった……。人とひと為らざる者が交わる英国を舞台に描かれる、本格異類婚姻幻想譚。<br>【更新予定】第125話-②：10/16(金)｜第126話-①：11/6(金)｜第126話-②：11/20(金) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 285 chapters |  |  |  |
| chapter dates | PASS | 285 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.comic-growl.com/.../master-1739954104605-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 8, 2, 11, 6, 5, 0, 12, 1, 13, 14, 15, 10, 7, 3, 4\]` (image/jpeg, 478448 bytes, 1350x1920) |  |  |  |
