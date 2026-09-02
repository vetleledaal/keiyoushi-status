# Extension Validation Report

- Extension: tachiyomi-ja.kuragebunch-v1.4.9
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
- Source ID: 3000787516439188863
- Source name: Kurage Bunch
- Source language: ja
- Selected manga input: popular offset 0: ファーストペンギン・レクイエム (`.../12207421983893652478`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 187 | ファーストペンギン・レクイエム (`.../12207421983893652478`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ファーストペンギン・レクイエム (`.../12207421983893652478`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | ファーストペンギン・レクイエム (`.../12207421983893652478`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 4 | 第1話 命の保証のない仕事 (`.../12207421983893652478`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 40 |  |  | <1s |

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
| popular listing | PASS | 187 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ファーストペンギン・レクイエム, URL=`.../12207421983893652478` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 188/188 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 188/188 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.kuragebunch.com%2Fpublic%2Fseries-thumbnail%2F12207421983893646743-dc8b9fa3f1adf31d32e131f392b773a2%3F1782738168` (image/jpeg, 13744 bytes, 160x160) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12207421983893652478` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.kuragebunch.com%2Fpublic%2Fseries-thumbnail%2F12207421983893646743-dc8b9fa3f1adf31d32e131f392b773a2%3F1782738168` (image/jpeg, 91938 bytes, 484x484) |  |  |  |
| details author | PASS | タダノなつ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 人知れず深淵に潜む ［怪異］。それと対峙しなければならない者たちがいる。――その名は「リーダーズ（先導隊）」。人類守護を強制された憐れなファーストペンギンたちである。自身の出自さえ知らないリーダーズの少女、キノとアズは、いつか自由の身になることを夢見て今日も死と隣り合わせの任務へ向かう。宿命を背負った少女たちの怪異捜索ストーリー！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn-img.kuragebunch.com/.../12207421983905646101-dbb11144ed75e27e78d9e3eece3429af` (image/jpeg, 288869 bytes, 1350x1920) |  |  |  |
