# Extension Validation Report

- Extension: tachiyomi-ja.zerosumonline-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8525996702535864887
- Source name: Zerosum Online
- Source language: ja
- Selected manga input: popular offset 0: 死神と令嬢 (`.../shinirei`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 104 | 死神と令嬢 (`.../shinirei`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 死神と令嬢 (`.../shinirei`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 死神と令嬢 (`.../shinirei`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | 第一幕 (`.../2284`) |  | <1s |
| pages | `getPageList(chapter)` | success | 57 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 104 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=死神と令嬢, URL=`.../shinirei` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 105/105 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 105/105 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://contents.zerosumonline.com/.../191.webp` (image/webp (encoding: lossy), 28350 bytes, 350x493) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../shinirei` |  |  |  |
| details thumbnail URL | PASS | `https://contents.zerosumonline.com/.../191.webp` |  |  |  |
| details author | PASS | 漫画：宮本福助　原作：別府マコト |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | アンカー侯爵家の美貌の令嬢ユーリア<br>傲慢で冷酷な「悪女」と噂される令嬢――。<br>それに耐えかねた第四王子はユーリアとの婚約を破棄。<br>その後、ユーリアは「死神」と呼ばれるヴィンクラー辺境伯の後妻になることが決められる。<br>しかし、彼女には秘密があって……!?<br>「悪役令嬢ですが、幸せになってみせますわ！」アンソロジーコミック掲載の読切が大好評につき待望の連載化です――!!<br><br>Alternative Title: シニガミトレイジョウ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 57 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://contents.zerosumonline.com/.../1.webp` (image/webp (encoding: lossy), 140590 bytes, 960x1374) |  |  |  |
