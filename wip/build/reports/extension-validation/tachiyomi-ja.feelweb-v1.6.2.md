# Extension Validation Report

- Extension: tachiyomi-ja.feelweb-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 1
- Warnings: 0
- Skipped: 8
- Failed: 1
- Retry disposition: REVIEW

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
| popular | `getPopularManga(1)` | success | 273 | 流行りのドレスは着られない (`.../12207421984052449170`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 273 | 流行りのドレスは着られない (`.../12207421984052449170`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 流行りのドレスは着られない (`.../12207421984052449170`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 流行りのドレスは着られない (`.../12207421984052449170`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | 🔒 前編 (`.../12207421984052559748`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: This chapter is either unavailable or must be purchased. | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: This chapter is either unavailable or must be purchased. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 273 entries |  |  |  |
| latest listing | PASS | 273 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=流行りのドレスは着られない, URL=`12207421984052449170` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 547/547 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 547/547 manga have thumbnail URLs |  |  |  |
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
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | This chapter is either unavailable or must be purchased. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
