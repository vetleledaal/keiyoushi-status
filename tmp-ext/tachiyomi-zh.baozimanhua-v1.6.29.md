# Extension Validation Report

- Extension: tachiyomi-zh.baozimanhua-v1.6.29
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5724751873601868259
- Source name: 包子漫画
- Source language: zh
- Selected manga input: latest offset 0: 少年泰坦V7 (`.../shaoniantaitanv7-dccomics`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | 武煉巔峰 (`.../wuliandianfeng-pikapi`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 36 | 都是黑絲惹的禍 (`.../dushiheisiredehuo-daoshangproject`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 48 | 少年泰坦V7 (`.../shaoniantaitanv7-dccomics`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 87 | 少年泰坦V7 (`.../shaoniantaitanv7-dccomics`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 少年泰坦V7 (`.../shaoniantaitanv7-dccomics`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 第01卷 (`.../page_direct <redacted query values: comic_id, section_slot, and chapter_slot>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 6 |  |  | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=少年泰坦V7, URL=`.../shaoniantaitanv7-dccomics` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 207/207 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 207/207 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static-tw.baozimh.com/.../shaoniantaitanv7-dccomics.jpg <redacted query values: w, h, and q>` (image/jpeg, 30574 bytes, 285x375) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../shaoniantaitanv7-dccomics` |  |  |  |
| details thumbnail URL | PASS | `https://static-tw.baozimh.com/.../shaoniantaitanv7-dccomics.jpg <redacted query values: w, h, and q>` |  |  |  |
| details author | PASS | DC Comics |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | DC全新的少年團體誕生！一羣年輕的超能力者們，結識於線上，卻要在線下共同調查一起網友的謀殺案，而他們爲自己選定了心儀的導師——那便是紅頭罩！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://s1.bzcdn.net/.../1.jpg` could not be downloaded: java.io.EOFException: SSL peer shut down incorrectly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
