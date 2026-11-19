# Extension Validation Report

- Extension: tachiyomi-tr.mindafansub-v1.6.60
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 8477380026777524321
- Source name: Minda Fansub
- Source language: tr
- Selected manga input: popular offset 0: Jinx (`.../57`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Jinx (`.../57`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | The Third Ending (`.../78`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Flashlight (`.../334`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Aşk Delisi (`.../1179`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Juyeon’s Jinx (`.../590`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jinx (`.../57`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 115 | Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 2: title=Jinx, URL=`57` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 103/103 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 103/103 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mindafansub.nl/.../jinxyeni-193x278-1-175x238.webp` (image/webp (encoding: lossy), 6034 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `57` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mindafansub.nl/.../jinxyeni-193x278-1.webp` (image/webp (encoding: lossy), 13436 bytes, 193x278) |  |  |  |
| details author | PASS | Mingwa |  |  |  |
| details artist | PASS | Mingwa |  |  |  |
| details genres | PASS | BL, Drama, Manhwa, Müstehcen, Orijinal Dilinden Çevrilenler, Webtoon, Yaoi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Karma dövüş sanatları hafif ağır sıklet şampiyonu ‘Joo Jaekyung’. Yenilmezlik efsanesi yazsa da, aslında onun da gizli bir uğursuzluğu var.Yani, maçtan önceki gün tatmin edici seks yapmak kazanmasının anahtarıdır! Jaekyung uğursuzluğu fizyoterapist ‘ Kim Dan’ aracılığıyla çözmeye çalışmaya kalkarsa… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 115 chapters |  |  |  |
| chapter dates | PASS | 115 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://yaoicdn.xyz/.../0000.jpg` (image/jpeg, 136007 bytes, 1131x1600) |  |  |  |
