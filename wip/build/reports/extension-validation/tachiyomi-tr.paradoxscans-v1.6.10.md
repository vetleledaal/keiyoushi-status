# Extension Validation Report

- Extension: tachiyomi-tr.paradoxscans-v1.6.10
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
- Source theme: initmanga
- Source ID: 3730980240510982131
- Source name: Paradox Scans
- Source language: tr
- Selected manga input: popular offset 0: Infinite Evolution Starting from Zero (`.../infinite-evolution-starting-from-zero`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Infinite Evolution Starting from Zero (`.../infinite-evolution-starting-from-zero`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Yanlışlıkla Dahi Bir Aktör Sanıldım (`.../yanlislikla-dahi-bir-aktor-sanildim`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Göksel İblis Kuleyi Yıkıyor (`.../goksel-iblis-kuleyi-yikiyor`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Hizmetçinin Ölümünden Lord Blackwood Sorumludur (`.../hizmetcinin-olumunden-lord-blackwood-sorumludur`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Infinite Evolution Starting from Zero (`.../infinite-evolution-starting-from-zero`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Infinite Evolution Starting from Zero (`.../infinite-evolution-starting-from-zero`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 142 | Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Infinite Evolution Starting from Zero, URL=`.../infinite-evolution-starting-from-zero` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 98/98 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 98/98 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://paradoxscans.com/.../Gemini_Generated_Image_80wh3q80wh3q80wh-200x267.png` (image/png, 1361337 bytes, 768x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../infinite-evolution-starting-from-zero` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://paradoxscans.com/.../Gemini_Generated_Image_80wh3q80wh3q80wh-768x1024.png` was not downloaded |  |  |  |
| details author | PASS | utk |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Aksiyon, Büyü, Doğa, Geri Dönüş |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Infinite Evolution Starting from Zero Sıfırdan Başlayan Sonsuz Evrim / 从零开始无限进化<br><br>Tüm çürümüşlüğü ve yozlaşmayı tüketerek, sınırları parçalayarak… Doğuştan gelen göksel bir yetenek, zirvedeki bir bilge… Sonsuz biçimlere bürünerek evrimi aşmak! Yeniden doğuşla, sıfırdan başlayan… sonsuz bir evrim!<br><br>Infinite Evolution Starting from Zero Konusu<br><br>Infinite Evolution Starting from Zero, aksiyon ve fantastik türde popüler bir manhua serisidir. Seride ana karakter sıfırdan başlayarak evrimleşen bir güç sistemi ile giderek güçlenir.<br><br>Infinite Evolution Starting from Zero Türkçe Oku<br><br>Serinin tüm bölümlerini Türkçe çeviri ile Paradox Scans üzerinden hızlı ve yüksek kaliteyle okuyabilirsiniz. Güncel bölümler düzenli olarak eklenmektedir.<br><br>Infinite Evolution Starting from Zero Bölümleri<br><br>Aşağıdan serinin tüm güncel bölümlerine ulaşabilir ve sırasıyla okuyabilirsiniz.<br><br>Alternatif Başlık: 从零开始无限进化 Sıfırdan Başlayan Sonsuz Evrim |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 142 chapters |  |  |  |
| chapter dates | PASS | 142 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://c1.skycdn.online/.../0001.webp` (image/webp (container: extended), 1184168 bytes, 1920x1080) |  |  |  |
