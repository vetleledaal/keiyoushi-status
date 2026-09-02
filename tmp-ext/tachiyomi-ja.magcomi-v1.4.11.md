# Extension Validation Report

- Extension: tachiyomi-ja.magcomi-v1.4.11
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 27
- Lint: 1
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8643773902904736600
- Source name: MAGCOMI
- Source language: ja
- Selected manga input: popular offset 0: あなたとわたしの死に戻り (`.../12207421983656985562`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 99 | あなたとわたしの死に戻り (`.../12207421983656985562`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | あなたとわたしの死に戻り (`.../12207421983656985562`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | あなたとわたしの死に戻り (`.../12207421983656985562`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 6 | 第1話「わたしの結婚・表」 (`.../12207421983656985562`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 50 |  |  | <1s |

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
| popular listing | PASS | 99 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=あなたとわたしの死に戻り, URL=`.../12207421983656985562` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.magcomi.com%2Fpublic%2Fseries-thumbnail%2F12207421983656985269-faa5ad02ebdd396ed669fef256e09261%3F1777975778` (image/jpeg, 188348 bytes, 1320x880) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12207421983656985562` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.magcomi.com%2Fpublic%2Fseries-thumbnail%2F12207421983656985269-faa5ad02ebdd396ed669fef256e09261%3F1777975778` (image/jpeg, 60362 bytes, 484x323) |  |  |  |
| details author | PASS | 杓子ねこ.../%E3%81%97%E3%82%83%E3%81%91%E3%81%B5%E3%82%8C |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 【毎月第1火曜日更新】異能の家系に生まれ、政略結婚をすることになった未咲。きっと幸せになれる──…。そう思っていたのに……。そしてあらぬ罪を着せられて死にゆく中で最後に聞こえたのは弟・累の声だった。目を覚ますと、そこは「1年前」の世界。すべてが巻き戻り、なにかが違う。その影にはいつも累の姿があって──。和風ファンタジー×ループ。愛と惨劇の螺旋がはじまる。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn-img.magcomi.com/.../12207421983672109865-b9ec4556207cc1af52c9eef7d6e4fca5` (image/jpeg, 355992 bytes, 1025x1457) |  |  |  |
