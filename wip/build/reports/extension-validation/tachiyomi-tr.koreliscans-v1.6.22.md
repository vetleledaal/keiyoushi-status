# Extension Validation Report

- Extension: tachiyomi-tr.koreliscans-v1.6.22
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1475942648540931708
- Source name: Koreli Scans
- Source language: tr
- Selected manga input: popular offset 0: Lookism (`.../lookism`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Lookism (`.../lookism`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | Deli İblisin Dönüşü (`.../deli-iblisin-donusu`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | Lookism (`.../lookism`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Köpek Köpeği Isırır (`.../kopek-kopegi-isirir`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Lookism (`.../lookism`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lookism (`.../lookism`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 636 | Bölüm 1 (`.../lookism-bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lookism, URL=`.../lookism` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 42/42 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 42/42 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image.nabicix.com/.../lookismd.webp` (image/webp (encoding: lossy), 94378 bytes, 1047x1502) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lookism` |  |  |  |
| details thumbnail URL | PASS | `https://image.nabicix.com/.../lookismd.webp` |  |  |  |
| details author | PASS | PARK Tae Jun |  |  |  |
| details artist | PASS | PARK Tae Jun |  |  |  |
| details genres | PASS | Aksiyon, Drama, Komedi, Macera, Manhwa, Okul hayatı, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kilolu ve dış görünüşü nedeniyle sürekli aşağılanıp amansız bir zorbalığa maruz kalan lise öğrencisi Daniel Park, yaşadığı eziklikten kaçmak için başka bir şehre taşınmaya karar verir. Ancak okuluna başlamadan önce mucizevi ve mantığa sığmayan bir olay gerçekleşir; uykudan uyandığında kendini tamamen kusursuz, yakışıklı ve atletik yapılı ikinci bir bedende bulur. Artık iki farklı bedene sahiptir: Biri gündüzleri kullandığı yakışıklı ve popüler beden, diğeri ise gerçek ve zayıf olan orijinal bedeni. Bir bedeni uyurken diğerini kullanabildiği bu tuhaf döngü sayesinde Daniel, dış görünüşe dayalı önyargıların hüküm sürdüğü toplumun ve okul hayatının karanlık yüzüyle yüzleşmeye başlar. Sadece okul koridorlarında değil, sokak çetelerinin ve gizli suç ağlarının arasında da hayatta kalmak zorundadır. Toplumsal algıları ve dövüş sanatlarını konu alarak soluk soluğa bir okuma deneyimi sunan Lookism webtoon serisini, yüksek çözünürlüklü görseller ve kesintisiz Lookism Türkçe webtoon oku imkanıyla Nabicix üzerinden güncel olarak takip edebilirsiniz!<br><br>Alternative Names: <br>- 외모지상주의<br>- Görünüşçülük |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 636 chapters |  |  |  |
| chapter dates | PASS | 636 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.nabicix.com/.../001_1.webp` (image/webp (encoding: lossy), 651568 bytes, 760x16383) |  |  |  |
