# Extension Validation Report

- Extension: tachiyomi-ja.zerosumonline-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Selected manga input: popular offset 0: ジゼル・オデットの流儀　－禍の令嬢と13番目の王子－ (`.../giselle`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | ジゼル・オデットの流儀　－禍の令嬢と13番目の王子－ (`.../giselle`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | ジゼル・オデットの流儀　－禍の令嬢と13番目の王子－ (`.../giselle`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ジゼル・オデットの流儀　－禍の令嬢と13番目の王子－ (`.../giselle`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | 第一幕 (`.../2849`) |  | <1s |
| pages | `getPageList(chapter)` | success | 63 |  |  | <1s |

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
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ジゼル・オデットの流儀　－禍の令嬢と13番目の王子－, URL=`.../giselle` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://contents.zerosumonline.com/.../198.webp` (image/webp (encoding: lossy), 33698 bytes, 350x494) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../giselle` |  |  |  |
| details thumbnail URL | PASS | `https://contents.zerosumonline.com/.../198.webp` |  |  |  |
| details author | PASS | にび |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 【一部残酷な表現を含みます】<br>第十三王子オズワルドは、幼い日に起きたある出来事を忘れられずにいた。<br>その日、母と妹は血と「ごめんね」の手紙を残し、白いローブを纏った女と共に消えてしまった。<br>何年もの間、その女の行方を追っていたオズワルドは、目的の女性と酷似した美貌の令嬢ジゼル・オデットと巡り会う。彼女はオデット公爵家によって死んだことにされていた禍の令嬢。<br>怪異ひしめく王宮を舞台に、美しくもおそろしい令嬢と不遇な王子が失われた真実を追い求める。<br>気鋭の新人が描くホラー×ファンタジー！<br><br>Alternative Title: ジゼル・オデットノリュウギ　―ワザワイノレイジョウトジュウサンバンメノオウジ― |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 63 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://contents.zerosumonline.com/.../1.webp` (image/webp (encoding: lossy), 155926 bytes, 960x1388) |  |  |  |
