# Extension Validation Report

- Extension: tachiyomi-ja.mangakingdom-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 22
- Lint: 0
- Warnings: 1
- Skipped: 12
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3806352284314527898
- Source name: Manga Kingdom
- Source language: ja
- Selected manga input: popular offset 0: 軍人婿さんと大根嫁さん (`.../195262`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 100 | 軍人婿さんと大根嫁さん (`.../195262`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 100 | カモフラージュ夫婦【フルカラー】【タテヨミ】 (`.../178659`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 100 | あなたと奏でるカプリッチオ【タテヨミ】 (`.../240441`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 軍人婿さんと大根嫁さん (`.../195262`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 軍人婿さんと大根嫁さん (`.../195262`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | error | 0 |  | java.lang.NullPointerException | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=軍人婿さんと大根嫁さん, URL=`195262` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 301/301 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 301/301 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cf.image-cdn.k-manga.jp/.../b195262_10_200.jpg` (image/jpeg, 27023 bytes, 200x285) |  |  |  |
| details identity | PASS | Details preserved selected URL `195262` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cf.image-cdn.k-manga.jp/.../b195262_1_320.jpg` (image/jpeg, 50560 bytes, 320x455) |  |  |  |
| details author | PASS | コマkoma |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 女性漫画, 恋愛 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
