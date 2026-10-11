# Extension Validation Report

- Extension: tachiyomi-tr.koreliscans-v1.6.19
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
| popular | `getPopularManga(1)` | success | 10 | Lookism (`.../lookism`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | Tanrılarla Yükseliş (`.../tanrilarla-yukselis`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | Zirve Seviye Çaylak (`.../zirve-seviye-caylak`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Nihayetin Ardındaki Başlangıç (`.../nihayetin-ardindaki-baslangic`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Lookism (`.../lookism`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lookism (`.../lookism`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 629 | Bölüm 1 (`.../lookism-bolum-1`) |  | <1s |
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
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image.nabicix.com/.../lookism.webp` (image/webp (encoding: lossy), 94378 bytes, 1047x1502) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lookism` |  |  |  |
| details thumbnail URL | PASS | `https://image.nabicix.com/.../lookism.webp` |  |  |  |
| details author | PASS | PARK Tae Jun |  |  |  |
| details artist | PASS | PARK Tae Jun |  |  |  |
| details genres | PASS | Aksiyon, Drama, Komedi, Macera, Manhwa, Okul hayatı, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Lookism Oku Daniel Park; yoksul, aşırı kilolu ve dış görünüşü nedeniyle okulunda her gün ağır zorbalıklara uğrayan bir lise öğrencisidir. Yaşadığı kabustan kaçmak ve sıfırdan başlamak için okulunu değiştirip yeni bir semte taşınır. Ancak yeni hayatının ilk sabahında onu inanılmaz bir sürpriz beklemektedir: Daniel uyandığında karşısında kusursuz, son derece yakışıklı ve atletik ikinci bir beden bulur. Biri uyuduğunda diğeri uyanan bu iki farklı beden arasında mekik dokuyan Daniel, bir yandan popülaritenin ve yeni hayatının avantajlarını tadarken diğer yandan bu gizemli olayın perde arkasını çözmeye çalışır. Dış görünüş gerçekten her şey midir? Daniel, iki farklı hayat arasında gerçek kimliğini bulabilecek mi? Lookism Türkçe manga ve webtoon bölümlerini en güncel, hızlı ve yüksek kaliteli çeviriyle Nabicix’te hemen okumaya başlayın!<br><br>Alternative Names: <br>- 외모지상주의<br>- Görünüşçülük |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 629 chapters |  |  |  |
| chapter dates | PASS | 629 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.nabicix.com/.../001_1.webp` (image/webp (encoding: lossy), 651568 bytes, 760x16383) |  |  |  |
