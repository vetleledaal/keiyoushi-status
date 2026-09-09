# Extension Validation Report

- Extension: tachiyomi-tr.korelimanga-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 28
- Lint: 2
- Warnings: 2
- Skipped: 2
- Failed: 3
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: initmanga
- Source ID: 1381583102051609700
- Source name: Koreli Manga
- Source language: tr
- Selected manga input: latest offset 0: Manager Kim Aksiyon · Dövüş Sanatları · Hayatta Kalma Manager Kim   (`.../manager-kim`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 |  Aksiyon To Not Die (`.../to-not-die`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Manager Kim Aksiyon · Dövüş Sanatları · Hayatta Kalma Manager Kim   (`.../manager-kim`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Sonsuz Döngüde Hapsolan Aksiyon · Doğaüstü · Dövüş Sanatları Sonsuz Döngüde Hapsolan   (`.../sonsuz-dongude-hapsolan`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 4 | Manager Kim (`.../manager-kim`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Manager Kim (`.../manager-kim`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 210 | Bölüm 1 (`.../chapter-1`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 21 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Manager Kim, URL=`.../manager-kim` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://korelimanga.com/.../Manager-Kim-300x400.webp` (image/webp (encoding: lossy), 22974 bytes, 300x400) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Manager Kim Aksiyon · Dövüş Sanatları · Hayatta Kalma Manager Kim   to Manager Kim |  |  |  |
| details thumbnail URL | FAIL | Thumbnail URL `data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIzMDAiIGhlaWdodD0iNDAwIiB2aWV3Qm94PSIwIDAgMzAwIDQwMCI+PHJlY3Qgd2lkdGg9IjEwMCUiIGhlaWdodD0iMTAwJSIgc3R5bGU9ImZpbGw6I2NmZDRkYjtmaWxsLW9wYWNpdHk6IDAuMTsiLz48L3N2Zz4=` is not an absolute HTTP(S) URL (data scheme) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Aksiyon, Dövüş Sanatları, Hayatta Kalma, bitirmek için 14 saat |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “Lütfen gözlük takan adama dokunma…” Hakkındadır” Bölüm başkanı Kim, işini bırakan Sadece kızı Minji için özel ajan olarak görev yaptı ve normal olmayı seçti.” Sonra bir gün Minji sessizce ortadan kayboldu ve Müdür Kim, kendisini izleyen ülkeyi düşmana çevirerek kızını aramaya başladı.<br><br>Alternatif Başlık: 김부장 , Manager Kim, Yönetici Kim |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 210 chapters |  |  |  |
| chapter dates | PASS | 210 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | FAIL | 21 of 21 pages have invalid URLs: page 1: imageUrl=`data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI3NjAiIGhlaWdodD0iMTYzODMiIHZpZXdCb3g9IjAgMCA3NjAgMTYzODMiPjxyZWN0IHdpZHRoPSIxMDAlIiBoZWlnaHQ9IjEwMCUiIHN0eWxlPSJmaWxsOiNjZmQ0ZGI7ZmlsbC1vcGFjaXR5OiAwLjE7Ii8+PC9zdmc+` (data scheme), page 2: imageUrl=`data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI3NjAiIGhlaWdodD0iMTYzODMiIHZpZXdCb3g9IjAgMCA3NjAgMTYzODMiPjxyZWN0IHdpZHRoPSIxMDAlIiBoZWlnaHQ9IjEwMCUiIHN0eWxlPSJmaWxsOiNjZmQ0ZGI7ZmlsbC1vcGFjaXR5OiAwLjE7Ii8+PC9zdmc+` (data scheme), page 3: imageUrl=`data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI3NjAiIGhlaWdodD0iMTYzODMiIHZpZXdCb3g9IjAgMCA3NjAgMTYzODMiPjxyZWN0IHdpZHRoPSIxMDAlIiBoZWlnaHQ9IjEwMCUiIHN0eWxlPSJmaWxsOiNjZmQ0ZGI7ZmlsbC1vcGFjaXR5OiAwLjE7Ii8+PC9zdmc+` (data scheme), page 4: imageUrl=`data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI3NjAiIGhlaWdodD0iMTYzODMiIHZpZXdCb3g9IjAgMCA3NjAgMTYzODMiPjxyZWN0IHdpZHRoPSIxMDAlIiBoZWlnaHQ9IjEwMCUiIHN0eWxlPSJmaWxsOiNjZmQ0ZGI7ZmlsbC1vcGFjaXR5OiAwLjE7Ii8+PC9zdmc+` (data scheme), page 5: imageUrl=`data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI3NjAiIGhlaWdodD0iMTYzODMiIHZpZXdCb3g9IjAgMCA3NjAgMTYzODMiPjxyZWN0IHdpZHRoPSIxMDAlIiBoZWlnaHQ9IjEwMCUiIHN0eWxlPSJmaWxsOiNjZmQ0ZGI7ZmlsbC1vcGFjaXR5OiAwLjE7Ii8+PC9zdmc+` (data scheme), and 16 more | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI3NjAiIGhlaWdodD0iMTYzODMiIHZpZXdCb3g9IjAgMCA3NjAgMTYzODMiPjxyZWN0IHdpZHRoPSIxMDAlIiBoZWlnaHQ9IjEwMCUiIHN0eWxlPSJmaWxsOiNjZmQ0ZGI7ZmlsbC1vcGFjaXR5OiAwLjE7Ii8+PC9zdmc+` at pages 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI3NjAiIGhlaWdodD0iMTYzODMiIHZpZXdCb3g9IjAgMCA3NjAgMTYzODMiPjxyZWN0IHdpZHRoPSIxMDAlIiBoZWlnaHQ9IjEwMCUiIHN0eWxlPSJmaWxsOiNjZmQ0ZGI7ZmlsbC1vcGFjaXR5OiAwLjE7Ii8+PC9zdmc+` could not be downloaded: java.lang.IllegalArgumentException: Expected URL scheme 'http' or 'https' but was 'data' | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
