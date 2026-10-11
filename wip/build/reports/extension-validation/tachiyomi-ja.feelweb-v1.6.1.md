# Extension Validation Report

- Extension: tachiyomi-ja.feelweb-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gigaviewer
- Source ID: 96841390298894778
- Source name: Feel Web
- Source language: ja
- Selected manga input: popular offset 0: 流行りのドレスは着られない (`.../12207421984052449170`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 270 | 流行りのドレスは着られない (`.../12207421984052449170`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 270 | プロトタイプ・ノア (`.../12207421983667965062`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 流行りのドレスは着られない (`.../12207421984052449170`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 流行りのドレスは着られない (`.../12207421984052449170`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 前編 (`.../12207421984052559748`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 28 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 270 entries |  |  |  |
| latest listing | PASS | 270 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=流行りのドレスは着られない, URL=`12207421984052449170` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 541/541 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 541/541 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.feelweb.jp/.../12207421984052449170-7a0e99fae45dbda6d2fd88c3674e0e0d <redacted query values: 1785836555>` (image/jpeg, 586059 bytes, 1337x1920) |  |  |  |
| details identity | PASS | Details preserved selected URL `12207421984052449170` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.feelweb.jp/.../12207421984052449170-7a0e99fae45dbda6d2fd88c3674e0e0d <redacted query values: 1785836555>` |  |  |  |
| details author | PASS | 多磨きらこ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 切り離せない私の体、そんなことは自分が一番わかってる。だけど——。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.feelweb.jp/.../12207421984052881896-aeb2d4703a0b8300c7dbe53b37f9cf8f` (image/jpeg, 708812 bytes, 1337x1920) |  |  |  |
