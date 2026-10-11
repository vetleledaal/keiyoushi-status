# Extension Validation Report

- Extension: tachiyomi-tr.paradoxscans-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 2
- Warnings: 2
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

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
| popular | `getPopularManga(1)` | success | 24 | Infinite Evolution Starting from Zero (`.../infinite-evolution-starting-from-zero`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | İmparatoriçe Karımı Şoke Ettikten Sonra Yenilmez Oldum (`.../imparatorice-karimi-soke-ettikten-sonra-yenilmez-oldum`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | The Novel’s Extra (`.../romandaki-figuran`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Evcilleştirme Ustası (`.../taming-master`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Infinite Evolution Starting from Zero (`.../infinite-evolution-starting-from-zero`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Infinite Evolution Starting from Zero (`.../infinite-evolution-starting-from-zero`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 133 | Bölüm 1 (`.../bolum-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

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
| thumbnail | PASS | `https://paradoxscans.com/.../Gemini_Generated_Image_80wh3q80wh3q80wh-200x267.png` (image/png, 120792 bytes, 200x267) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../infinite-evolution-starting-from-zero` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://paradoxscans.com/.../Gemini_Generated_Image_80wh3q80wh3q80wh-300x400.png` (image/png, 255329 bytes, 300x400) |  |  |  |
| details author | PASS | utk |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Aksiyon, Büyü, Doğa, Geri Dönüş, Bitirmek için 8 sa 48 dk |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Infinite Evolution Starting from Zero Sıfırdan Başlayan Sonsuz Evrim / 从零开始无限进化 Tüm çürümüşlüğü ve yozlaşmayı tüketerek, sınırları parçalayarak… Doğuştan gelen göksel bir yetenek, zirvedeki bir bilge… Sonsuz biçimlere bürünerek evrimi aşmak! Yeniden doğuşla, sıfırdan başlayan… sonsuz bir evrim! Infinite Evolution Starting from Zero Konusu Infinite Evolution Starting from Zero, aksiyon ve fantastik türde popüler bir manhua serisidir. Seride ana karakter sıfırdan başlayarak evrimleşen bir güç sistemi ile giderek güçlenir. Infinite Evolution Starting from Zero Türkçe Oku Serinin tüm bölümlerini Türkçe çeviri ile Paradox Scans üzerinden hızlı ve yüksek kaliteyle okuyabilirsiniz. Güncel bölümler düzenli olarak eklenmektedir. Infinite Evolution Starting from Zero Bölümleri Aşağıdan serinin tüm güncel bölümlerine ulaşabilir ve sırasıyla okuyabilirsiniz.<br><br>Alternatif Başlık: 从零开始无限进化 Sıfırdan Başlayan Sonsuz Evrim |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 133 chapters |  |  |  |
| chapter dates | LINT | All 133 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=133 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://paradoxscans.com/.../2` to `https://paradoxscans.com/.../2` (1 redirects); popular: `https://paradoxscans.com/.../3` to `https://paradoxscans.com/.../3` (1 redirects); popular: `https://paradoxscans.com/.../4` to `https://paradoxscans.com/.../4` (1 redirects); popular: `https://paradoxscans.com/.../5` to `https://paradoxscans.com/.../5` (1 redirects); popular: `https://paradoxscans.com/.../6` to `https://paradoxscans.com/.../6` (1 redirects); popular: `https://paradoxscans.com/.../7` to `https://paradoxscans.com/.../7` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
