# Extension Validation Report

- Extension: tachiyomi-tr.korelimanga-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 3
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: initmanga
- Source ID: 1381583102051609700
- Source name: Koreli Manga
- Source language: tr
- Selected manga input: popular offset 0: To Not Die (`.../to-not-die`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 48 | To Not Die (`.../to-not-die`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 48 | Zombi Peder (`.../zombi-peder`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 48 | Manager Kim (`.../manager-kim`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 48 | Sonsuz Döngüde Hapsolan (`.../sonsuz-dongude-hapsolan`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | To Not Die (`.../to-not-die`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | To Not Die (`.../to-not-die`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 111 | Bölüm 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 21 |  |  | <1s |

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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=To Not Die, URL=`.../to-not-die` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 24 manga entries; Popular page 2 repeats 24 manga entries; Latest page 1 repeats 24 manga entries; Latest page 2 repeats 24 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 193/193 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 193/193 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://korelimanga.com/.../To-Not-Die-300x400.webp` (image/webp (encoding: lossy), 18034 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../to-not-die` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://korelimanga.com/.../To-Not-Die-450x600.webp` (image/webp (encoding: lossy), 33022 bytes, 450x600) |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Aksiyon, Dövüş Sanatları, Hayatta Kalma, Okul Hayatı, bitirmek için 7 saat 24 dakika |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dajun, her gün okulda zorbalığa uğrayan bir lise öğrencidir. Tam hayattan vazgeçmenin eşiğindeyken televizyonda bir röportaja denk gelir. Ona zorbalık yapan sınıf arkadaşlarını öldüren bir katildi. Dajun gördüklerinden ilham alır ve intikam almaya karar verir. İntikamı başarılı oldu, ancak hayatı istenmeyen bir yöne doğru gitti. Okuldan atılan Dajun, garip bir kaçak ailesine katılır. Genç kaçak Dajun, artık okulundaki zorbalardan muzdarip değil, bunun yerine artık sokaklarda daha da gaddar haydutlara karşı hayatta kalması gerekiyor.<br><br>Alternatif Başlık: 죽지 않으려면 , To Not Die, Ölmemek İçin, Sokakta Hayatta Kalma Kılavuzu |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 111 chapters |  |  |  |
| chapter dates | LINT | All 111 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=111 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://korelimanga.com/.../2` to `https://korelimanga.com/.../2` (1 redirects); popular: `https://korelimanga.com/.../3` to `https://korelimanga.com/.../3` (1 redirects); popular: `https://korelimanga.com/.../4` to `https://korelimanga.com/.../4` (1 redirects); popular: `https://korelimanga.com/.../5` to `https://korelimanga.com/.../5` (1 redirects); popular: `https://korelimanga.com/.../6` to `https://korelimanga.com/.../6` (1 redirects) |  |  |  |
| page load | PASS | `https://korelimanga.com/.../0001.webp` (image/webp (encoding: lossy), 638106 bytes, 760x16383) |  |  |  |
