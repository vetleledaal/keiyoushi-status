# Extension Validation Report

- Extension: tachiyomi-ja.comicborder-v1.6.1
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
- Source theme: gigaviewer
- Source ID: 1077630719925082256
- Source name: Comic Border
- Source language: ja
- Selected manga input: popular offset 0: バイクが趣味の地味子の日常 (`.../2550912964458140785`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 49 | バイクが趣味の地味子の日常 (`.../2550912964458140785`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | バイクが趣味の地味子の日常 (`.../2550912964458140785`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | バイクが趣味の地味子の日常 (`.../2550912964458140785`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 26 | 第1話 (`.../2550912964458142344`) |  | <1s |
| pages | `getPageList(chapter)` | success | 35 |  |  | <1s |

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
| popular listing | PASS | 49 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=バイクが趣味の地味子の日常, URL=`2550912964458140785` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 50/50 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 50/50 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.comicborder.com/.../2550912964458140785-e632504467d1ac241fb5f59c30f436e3 <redacted query values: 1777602555>` (image/jpeg, 2836835 bytes, 2917x1625) |  |  |  |
| details identity | PASS | Details preserved selected URL `2550912964458140785` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.comicborder.com/.../2550912964458140785-e632504467d1ac241fb5f59c30f436e3 <redacted query values: 1777602555>` |  |  |  |
| details author | PASS | 端坂梨海 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 訳あって生まれ育った東京から、叔父の住む福井へ引っ越すことになった近藤翔太。初めてづくしの新生活に戸惑いながらも、同じ下宿に住んでいる森村蒔の助けもあり、なんとか新生活を始めることができた。しかし親切な隣人の森村蒔はとある趣味を持っていて───。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 26 chapters |  |  |  |
| chapter dates | PASS | 26 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.comicborder.com/.../2550912964619250131-13196206d1e447c3128205aa109d45df` (image/jpeg, 413752 bytes, 914x1300) |  |  |  |
