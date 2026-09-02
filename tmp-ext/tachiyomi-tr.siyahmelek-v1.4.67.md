# Extension Validation Report

- Extension: tachiyomi-tr.siyahmelek-v1.4.67
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 30
- Lint: 2
- Warnings: 2
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3737240362254347902
- Source name: Siyah Melek
- Source language: tr
- Selected manga input: popular offset 0:  Büyükler İçin Secret Class (`.../secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 |  Büyükler İçin Secret Class (`.../secret-class`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 |  Royal Family   (`.../royal-family`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 |  The Man Who Devours   (`.../the-man-who-devours`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 10 | Secret Class (`.../secret-class`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Secret Class (`.../secret-class`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 309 | Bölüm 1 (`.../bolum-1`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 21 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`.../secret-class` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 78/78 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 78/78 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://siyahmelek.live/.../Secret-Class-200x267.jpg` (image/jpeg, 20045 bytes, 200x267) |  |  |  |
| details identity | UNUSUAL | Details changed selected title  Büyükler İçin Secret Class to Secret Class |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://siyahmelek.live/.../Secret-Class-300x400.jpg` (image/jpeg, 37745 bytes, 300x400) |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Büyükler İçin, güncel, Harem, Komedi, Romantik, Slice of life, Türkçe, Webtoon, Bitmesine 11 saat 25 dakika kaldı |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 13 yaşında yetim kalan Dae Ho, babasının arkadaşı tarafından evlat edinildi. Bununla birlikte, yetişkinlikte Dae Ho, erkekler ve kadınlar arasındaki ilişki hakkında hiçbir şey bilmiyordu. Teyzesi ve kız kardeşleri, Dae Ho’ya gizli bir şekilde ders vermeye karar verdiler… Bu hikaye, iki kızı ve bir erkek çocuğu olan kocasını aldatan bir eş hakkında. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 309 chapters |  |  |  |
| chapter dates | PASS | 309 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://s300.melek.mom/.../0001.jpg` (image/jpeg, 777233 bytes, 858x9600) |  |  |  |
