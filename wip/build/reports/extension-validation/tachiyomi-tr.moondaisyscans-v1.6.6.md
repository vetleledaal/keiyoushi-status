# Extension Validation Report

- Extension: tachiyomi-tr.moondaisyscans-v1.6.6
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 0
- Warnings: 2
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 2732049206654972364
- Source name: Moon Daisy Scans
- Source language: tr
- Selected manga input: popular offset 0: Kiss Me If You Can (`.../kiss-me-if-you-can`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Kiss Me If You Can (`.../kiss-me-if-you-can`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Faul’ün Başlangıcı (`.../faulun-baslangici`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Tabetemo Oishiku Arimasen (`.../tabetemo-oishikuarimasen`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Sign (`.../sign`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Kiss Me If You Can (`.../kiss-me-if-you-can`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kiss Me If You Can (`.../kiss-me-if-you-can`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 55 | Bölüm 1 (`.../kiss-me-if-you-can-1-bolum`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kiss Me If You Can, URL=`.../kiss-me-if-you-can` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 83/83 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 83/83 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../imgi_3_tall.jpeg <redacted query values: resize>` (image/jpeg, 14105 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kiss-me-if-you-can` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.wp.com/.../imgi_3_tall.jpeg` (image/jpeg, 220334 bytes, 840x1120) |  |  |  |
| details author | PASS | SANHO (III), Zig |  |  |  |
| details artist | PASS | Giho |  |  |  |
| details genres | PASS | Drama, Omegaverse, Romantik, Yaoi, Yetişkin |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | \[KISS ME IF YOU CAN NOVELINA ERİŞMEK İÇİN TIKLAYIN\] Hollywood’un en büyük yıldızlarından biri olan, Miller ailesinin kuduz köpeği ‘Chase Miller’ ile bir kazaya benzeyen tek gecelik bir ilişki sonrası çocuk sahibi olan Joshua çocuğunu tek başına büyütmektedir. Bir gün fenalaşan annesinin hastane masraflarını karşılamak için tekrar Chase’in koruması olarak çalışmaya başlar. Joshua, Chase’in kendisini hatırlamaması karşısında bir süre rahatlar ancak bu çokta uzun sürmez. Çünkü sadece güzel bir yüze sahip olan bu karakteri bozuk adamla her göz göze geldiklerinde, kalbi hızla çarpıyordur. Ve istemese de onunla sürekli bir araya geliyordur… “Bir şekilde 6 ay dayanmalıyım. O kuduz köpek, Chase Miller’ın yanında.”<br><br>Alternative Names: <br>- Bésame si puedes<br>- 키스 미 이프 유 캔<br>- Kiss Me If You Can manhwa<br>- Kiss Me if You Can manhwa |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 55 chapters |  |  |  |
| chapter dates | PASS | 55 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://moondaisyscans.pro/.../kiss-me-if-you-can-1-bolum` to `https://moondaisyscans.pro/.../kiss-me-if-you-can` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
