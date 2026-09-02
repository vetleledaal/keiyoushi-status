# Extension Validation Report

- Extension: tachiyomi-tr.korelimanga-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 27
- Lint: 2
- Warnings: 2
- Skipped: 2
- Failed: 3
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1381583102051609700
- Source name: Koreli Manga
- Source language: tr
- Selected manga input: popular offset 0:  Aksiyon To Not Die (`.../to-not-die`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 |  Aksiyon To Not Die (`.../to-not-die`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Manager Kim Aksiyon · Dövüş Sanatları · Hayatta Kalma Manager Kim   (`.../manager-kim`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Sonsuz Döngüde Hapsolan Aksiyon · Doğaüstü · Dövüş Sanatları Sonsuz Döngüde Hapsolan   (`.../sonsuz-dongude-hapsolan`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | To Not Die (`.../to-not-die`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | To Not Die (`.../to-not-die`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 111 | Bölüm 1 (`.../chapter-1`) |  | 1-10s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=To Not Die, URL=`.../to-not-die` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 69/69 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 69/69 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://korelimanga.com/.../To-Not-Die-300x400.webp` (image/webp (encoding: lossy), 18034 bytes, 300x400) |  |  |  |
| details identity | UNUSUAL | Details changed selected title  Aksiyon To Not Die to To Not Die |  |  |  |
| details thumbnail URL | FAIL | Thumbnail URL `data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIzMDAiIGhlaWdodD0iNDAwIiB2aWV3Qm94PSIwIDAgMzAwIDQwMCI+PHJlY3Qgd2lkdGg9IjEwMCUiIGhlaWdodD0iMTAwJSIgc3R5bGU9ImZpbGw6I2NmZDRkYjtmaWxsLW9wYWNpdHk6IDAuMTsiLz48L3N2Zz4=` is not an absolute HTTP(S) URL (data scheme) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Aksiyon, Dövüş Sanatları, Hayatta Kalma, Okul Hayatı, bitirmek için 7 saat 24 dakika |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dajun, her gün okulda zorbalığa uğrayan bir lise öğrencidir. Tam hayattan vazgeçmenin eşiğindeyken televizyonda bir röportaja denk gelir. Ona zorbalık yapan sınıf arkadaşlarını öldüren bir katildi. Dajun gördüklerinden ilham alır ve intikam almaya karar verir. İntikamı başarılı oldu, ancak hayatı istenmeyen bir yöne doğru gitti. Okuldan atılan Dajun, garip bir kaçak ailesine katılır. Genç kaçak Dajun, artık okulundaki zorbalardan muzdarip değil, bunun yerine artık sokaklarda daha da gaddar haydutlara karşı hayatta kalması gerekiyor.<br><br>Alternatif Başlık: 죽지 않으려면 , To Not Die, Ölmemek İçin, Sokakta Hayatta Kalma Kılavuzu |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 111 chapters |  |  |  |
| chapter dates | PASS | 111 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | FAIL | 21 of 21 pages have invalid URLs: page 1: imageUrl=`data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI3NjAiIGhlaWdodD0iMTYzODMiIHZpZXdCb3g9IjAgMCA3NjAgMTYzODMiPjxyZWN0IHdpZHRoPSIxMDAlIiBoZWlnaHQ9IjEwMCUiIHN0eWxlPSJmaWxsOiNjZmQ0ZGI7ZmlsbC1vcGFjaXR5OiAwLjE7Ii8+PC9zdmc+` (data scheme), page 2: imageUrl=`data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI3NjAiIGhlaWdodD0iMTYzODMiIHZpZXdCb3g9IjAgMCA3NjAgMTYzODMiPjxyZWN0IHdpZHRoPSIxMDAlIiBoZWlnaHQ9IjEwMCUiIHN0eWxlPSJmaWxsOiNjZmQ0ZGI7ZmlsbC1vcGFjaXR5OiAwLjE7Ii8+PC9zdmc+` (data scheme), page 3: imageUrl=`data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI3NjAiIGhlaWdodD0iMTYzODMiIHZpZXdCb3g9IjAgMCA3NjAgMTYzODMiPjxyZWN0IHdpZHRoPSIxMDAlIiBoZWlnaHQ9IjEwMCUiIHN0eWxlPSJmaWxsOiNjZmQ0ZGI7ZmlsbC1vcGFjaXR5OiAwLjE7Ii8+PC9zdmc+` (data scheme), page 4: imageUrl=`data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI3NjAiIGhlaWdodD0iMTYzODMiIHZpZXdCb3g9IjAgMCA3NjAgMTYzODMiPjxyZWN0IHdpZHRoPSIxMDAlIiBoZWlnaHQ9IjEwMCUiIHN0eWxlPSJmaWxsOiNjZmQ0ZGI7ZmlsbC1vcGFjaXR5OiAwLjE7Ii8+PC9zdmc+` (data scheme), page 5: imageUrl=`data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI3NjAiIGhlaWdodD0iMTYzODMiIHZpZXdCb3g9IjAgMCA3NjAgMTYzODMiPjxyZWN0IHdpZHRoPSIxMDAlIiBoZWlnaHQ9IjEwMCUiIHN0eWxlPSJmaWxsOiNjZmQ0ZGI7ZmlsbC1vcGFjaXR5OiAwLjE7Ii8+PC9zdmc+` (data scheme), and 16 more | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI3NjAiIGhlaWdodD0iMTYzODMiIHZpZXdCb3g9IjAgMCA3NjAgMTYzODMiPjxyZWN0IHdpZHRoPSIxMDAlIiBoZWlnaHQ9IjEwMCUiIHN0eWxlPSJmaWxsOiNjZmQ0ZGI7ZmlsbC1vcGFjaXR5OiAwLjE7Ii8+PC9zdmc+` at pages 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 |  |  |  |
| page load | FAIL | First page URL `data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI3NjAiIGhlaWdodD0iMTYzODMiIHZpZXdCb3g9IjAgMCA3NjAgMTYzODMiPjxyZWN0IHdpZHRoPSIxMDAlIiBoZWlnaHQ9IjEwMCUiIHN0eWxlPSJmaWxsOiNjZmQ0ZGI7ZmlsbC1vcGFjaXR5OiAwLjE7Ii8+PC9zdmc+` could not be downloaded: java.lang.IllegalArgumentException: Expected URL scheme 'http' or 'https' but was 'data' | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
