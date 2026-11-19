# Extension Validation Report

- Extension: tachiyomi-ja.comicseasons-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 5198063407173750376
- Source name: Comic Seasons
- Source language: ja
- Selected manga input: popular offset 0: 回って避ける (`.../12207421984513305450`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 52 | 回って避ける (`.../12207421984513305450`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 52 | 回って避ける (`.../12207421984513305450`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 回って避ける (`.../12207421984513305450`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 回って避ける (`.../12207421984513305450`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 読み切り (`.../12207421984513315666`) |  | 1-10s |
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
| popular listing | PASS | 52 entries |  |  |  |
| latest listing | PASS | 52 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=回って避ける, URL=`12207421984513305450` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 105/105 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 105/105 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.comic-seasons.com/.../12207421984513305450-b22a7170f8e3b428a75355b7c5984df9 <redacted query values: 1794469296>` (image/jpeg, 12919017 bytes, 5000x5000) |  |  |  |
| details identity | PASS | Details preserved selected URL `12207421984513305450` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.comic-seasons.com/.../12207421984513305450-b22a7170f8e3b428a75355b7c5984df9 <redacted query values: 1794469296>` |  |  |  |
| details author | PASS | 路田行 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 胸が焼けるほど嬉しくて、怖くて消えた。――「回避型」の目線で描く読み切り28P |  |  |  |
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
| page load | PASS | `https://cdn-img.comic-seasons.com/.../12207421984513354990-28fa030921314e906221fda922256608` (image/jpeg, 953080 bytes, 1260x1788) |  |  |  |
