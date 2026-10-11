# Extension Validation Report

- Extension: tachiyomi-tr.holyscans-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 0
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5655539211698234342
- Source name: Holy Scans
- Source language: tr
- Selected manga input: popular offset 0: Şanslı Mia! (`.../lucky-mia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Şanslı Mia! (`.../lucky-mia`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Biri Bana Sponsor Olsun! (`.../biri-bana-sponsor-olsun`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Şanslı Mia! (`.../lucky-mia`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Şanslı Mia! (`.../lucky-mia`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 42 | Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Şanslı Mia!, URL=`.../lucky-mia` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://holyscans.com.tr/.../locked-cover.png` -> all 20 manga URLs (examples: `.../lucky-mia`, `.../annen-baska-seviye`, `.../dunyada-erkek-kalmadi-mi`) |  |  |  |
| thumbnail | PASS | `https://holyscans.com.tr/.../locked-cover.png` (image/png, 2717040 bytes, 1051x1497) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lucky-mia` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://holyscans.com.tr/.../ea2e3528-7558-4aa3-93e2-8352d72afe39.png` was not downloaded |  |  |  |
| details author | PASS | Temi |  |  |  |
| details artist | PASS | Temi |  |  |  |
| details genres | PASS | Josei, Komedi, Romantizm, Yetişkin |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Küçük kız kardeşiyle birlikte hayata tutunmaya çalışan ve çocukluğunda geçirdiği o talihsiz trafik kazasından beri kısmetsizlikten yüzü gülmeyen bir üniversite öğrencisinin hayatı nasıl değişebilir? Lucky Mia serisinde, tek amacı dikkat çekmeden, tamamen sıradan ve sakin bir yaşam sürmek olan Nam Eun-ho’nun şans eseri altüst olan dünyasını okuyacaksınız. Lucky Mia: Talihsiz Bir Hayat ve Beklenmedik Arzu Eun-ho’nun kendi halindeki bu sönük hayatı, kampüsün en popüler, en göz alıcı kızlarından birinin aniden onunla yollarını kesiştirmesiyle tamamen yön değiştirir. Lucky Mia evreninde; bu popüler kızın Eun-ho’ya karşı hissettiği o ani ve yoğun arzu, kahramanımızın başına talih kuşu mu konduracak, yoksa onu çok daha büyük ve karmaşık bir bahtsızlığın içine mi sürükleyecek? Kampüs hayatının eğlenceli dinamiklerini ve içinizi ısıtacak tatlı bir aşk hikayesini soluksuz takip edeceksiniz. Lucky Mia İncelemeleri ve Detayları Bu eğlenceli romantik komedi, dram ve kampüs hayatı odaklı sürükleyici serinin küresel okuyucu puanlamalarına, karakter analizlerine ve güncel bölüm listelerine doğrudan MangaUpdates sayfası üzerinden ulaşabilirsiniz. Eğer romantik komedi, kampüs hayatı ve dram/yaşamdan kesitler temalı bu tarz sürükleyici hikayeleri seviyorsanız, sitemizdeki Tüm Manga ve Webtoon Serilerimize kesinlikle göz atmalısınız. Keyifli okumalar! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 42 chapters |  |  |  |
| chapter dates | PASS | 42 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://holyscans.com.tr/.../holy-img-serve.php <redacted query values: p, t, and s>` (image/webp (container: extended), 179164 bytes, 690x7527) |  |  |  |
