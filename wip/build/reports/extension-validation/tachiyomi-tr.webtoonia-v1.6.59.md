# Extension Validation Report

- Extension: tachiyomi-tr.webtoonia-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 2519173041052749659
- Source name: Webtoonia
- Source language: tr
- Selected manga input: popular offset 0: Aşk Bağımlısı (`.../1658`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Aşk Bağımlısı (`.../1658`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | Ay Parladıkça (`.../2629`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Tuzun Tadı (`.../2028`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Bal Kaplı Tuzak (`.../2111`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Aşk Bağımlısı (`.../1658`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Aşk Bağımlısı (`.../1658`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 20 | Bölüm 1 - 💦 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Okumak için WebView üzerinden giriş yapın | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Okumak için WebView üzerinden giriş yapın | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Aşk Bağımlısı, URL=`1658` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://webtoonia.fun/.../tall-350x476.jpg` (image/jpeg, 61109 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `1658` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://webtoonia.fun/.../tall.jpg` (image/jpeg, 220751 bytes, 420x560) |  |  |  |
| details author | PASS | moseoli |  |  |  |
| details artist | PASS | Pu-Pa |  |  |  |
| details genres | PASS | Dram, Günlük Hayat, Okul Hayatı, Romantik, Yetişkin |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Liseden mezun olur olmaz, Yewon, evli ve büyüleyici Han Ju-eon’la yasak bir ilişkiye sürüklenir. Bunun yanlış olduğunu biliyordur ama umurunda değildir. Çünkü aşıktır.<br><br>“Bunu senin ağzından duymak istiyorum. O adamla ilişki mi yaşıyorsun?”<br><br>“Evet! İlişki yaşıyoruz. Ne olmuş yani?”<br><br>Durumlar kontrolden çıkmaya başlar; sınıf arkadaşları Jeong Hwa-ik onları yakalar ve Yewon’a kendi teklifini sunar. İster öfke, ister merak, ister daha karanlık bir şey yüzünden olsun, Yewon kabul eder.<br><br>“Ben başkasıyla yatsam da sen karını terk etmeyeceksin, değil mi?”<br><br>Alternative Names: 정크? 정크! / Junk? Junk! / Love Junkie / Aşk Tiryakisi / Liebesjunkies im Rausch / ジャンク？ジャンク！/ 垃圾？垃圾！/ Junk Love |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 20 chapters |  |  |  |
| chapter dates | LINT | All 20 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=20 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Okumak için WebView üzerinden giriş yapın |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
