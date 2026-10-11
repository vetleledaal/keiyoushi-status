# Extension Validation Report

- Extension: tachiyomi-ja.comicdays-v1.6.1
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
- Source ID: 5332604811772266259
- Source name: Comic Days
- Source language: ja
- Selected manga input: popular offset 0: 君の髪が気になるんだ (`.../12207421984290134195`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 352 | 君の髪が気になるんだ (`.../12207421984290134195`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 352 | ポッピン・ポッピン・ペナルティ (`.../12207421983829522259`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 君の髪が気になるんだ (`.../12207421984290134195`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 君の髪が気になるんだ (`.../12207421984290134195`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | ＃１ (`.../12207421984290137273`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 38 |  |  | 1-10s |

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
| popular listing | PASS | 352 entries |  |  |  |
| latest listing | PASS | 352 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=君の髪が気になるんだ, URL=`12207421984290134195` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 705/705 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 705/705 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.comic-days.com/.../12207421984290134195-e44f694a0a82c8473b335cf26b792343 <redacted query values: 1790585504>` (image/jpeg, 518550 bytes, 1125x633) |  |  |  |
| details identity | PASS | Details preserved selected URL `12207421984290134195` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.comic-days.com/.../12207421984290134195-e44f694a0a82c8473b335cf26b792343 <redacted query values: 1790585504>` |  |  |  |
| details author | PASS | 兼田りょう |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 野球部を引退したばかりの鈴原は彼女から突然別れを告げられ、その現場を教室の隣の席の宮下に見られてしまう。卒業も近づく高3の夏、引退して髪を伸ばし始めた鈴原は、毎日髪型を変える宮下のことがやけに気になってしまい——君と髪と恋の物語、始まります。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.comic-days.com/.../12207421984318280559-b9ac6918b8b09001220bd422853e4982` (image/jpeg, 358911 bytes, 1125x1600) |  |  |  |
