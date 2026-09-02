# Extension Validation Report

- Extension: tachiyomi-tr.moondaisyscans-v1.4.38
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2732049206654972364
- Source name: Moon Daisy Scans
- Source language: tr
- Selected manga input: popular offset 0: Kiss Me If You Can (`.../kiss-me-if-you-can`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Kiss Me If You Can (`.../kiss-me-if-you-can`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Faul’ün Başlangıcı (`.../faulun-baslangici`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Hashtag: My First Love (`.../hashtag-my-first-love`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Play After Call (`.../play-after-call`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | Kiss Me If You Can (`.../kiss-me-if-you-can`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Kiss Me If You Can (`.../kiss-me-if-you-can`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 53 | Bölüm 1 (`.../kiss-me-if-you-can-1-bolum`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 0 |  |  | 1-10s |

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
| details description | PASS | \[KISS ME IF YOU CAN NOVELINA ERİŞMEK İÇİN TIKLAYIN\] Hollywood’un en büyük yıldızlarından biri olan, Miller ailesinin kuduz köpeği ‘Chase Miller’ ile bir kazaya benzeyen tek gecelik bir ilişki sonrası çocuk sahibi olan Joshua çocuğunu tek başına büyütmektedir. Bir gün fenalaşan annesinin hastane masraflarını karşılamak için tekrar Chase’in koruması olarak çalışmaya başlar. Joshua, Chase’in kendisini hatırlamaması karşısında bir süre rahatlar ancak bu çokta uzun sürmez. Çünkü sadece güzel bir yüze sahip olan bu karakteri bozuk adamla her göz göze geldiklerinde, kalbi hızla çarpıyordur. Ve istemese de onunla sürekli bir araya geliyordur… “Bir şekilde 6 ay dayanmalıyım. O kuduz köpek, Chase Miller’ın yanında.”<br><br>Alternative Names: Bésame si puedes, 키스 미 이프 유 캔, Kiss Me If You Can manhwa, Kiss Me if You Can manhwa |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 53 chapters |  |  |  |
| chapter dates | LINT | All 53 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=53 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
