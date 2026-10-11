# Extension Validation Report

- Extension: tachiyomi-tr.eldermanga-v1.6.9
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
- Source theme: uzaymanga
- Source ID: 5412929724953013469
- Source name: Elder Manga
- Source language: tr
- Selected manga input: popular offset 0: Kıyamette Sığınak Kurdum (`.../kiyamette-siginak-kurdum`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Kıyamette Sığınak Kurdum (`.../kiyamette-siginak-kurdum`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Tarikat Liderine Selam Olsun (`.../tarikat-liderine-selam-olsun`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Akıl Sağlığı: KAPALI | Güç: SINIRSIZ (`.../akil-sagligi-kapali-guc-sinirsiz`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Sonsuz Yükseliş: Engelleri Parçalayan Azim (`.../sonsuz-yukselis-engelleri-parcalayan-azim`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kıyamette Sığınak Kurdum (`.../kiyamette-siginak-kurdum`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kıyamette Sığınak Kurdum (`.../kiyamette-siginak-kurdum`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 633 | Bölüm 1 (`.../1-bolum-oku`) |  | <1s |
| pages | `getPageList(chapter)` | success | 46 |  |  | 1-10s |

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
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kıyamette Sığınak Kurdum, URL=`.../kiyamette-siginak-kurdum` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 89/89 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 89/89 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-el.efsaneler2.can.re/.../thumbnail.avif` (image/avif (format: avif), 7668 bytes, 211x272) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kiyamette-siginak-kurdum` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-el.efsaneler2.can.re/.../thumbnail.avif` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Dram, Fantastik, Aksiyon, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dünya buzul çağına sürüklenir ve insanlığın %95'i yok olur! Kahramanımız Zhang Yi önceki hayatında, iyi kalbi sayesinde yardım ettiği insanlar tarafından trajik bir şekilde öldürülmüştür.<br><br>Ama korkmayın, çünkü Zhang Yi yeniden doğdu ve şimdi müthiş bir güce sahip - uzay manipülasyonu! Buzlu kıyamet için erzak istifleyerek tamamen çılgına döndü ve donmuş çorak topraklara hükmetmeye hazır! Geçmişte kendisine zarar verenlere yüz kat daha fazla acı çektirmeye yemin ediyor! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 633 chapters |  |  |  |
| chapter dates | PASS | 633 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-el.efsaneler2.can.re/.../0.avif` (image/avif (format: avif), 100367 bytes, 1920x1375) |  |  |  |
