# Extension Validation Report

- Extension: tachiyomi-tr.holyscans-v1.4.51
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 22
- Lint: 0
- Warnings: 1
- Skipped: 12
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5655539211698234342
- Source name: Holy Scans
- Source language: tr
- Selected manga input: popular offset 0: Mezuniyet Gecesi Her Şeyi Değiştirdi (`.../mezuniyet-gecesi-her-seyi-degistirdi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Mezuniyet Gecesi Her Şeyi Değiştirdi (`.../mezuniyet-gecesi-her-seyi-degistirdi`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Yan Dairede Bir Gacha Kızı Var! (`.../yan-dairede-bir-gacha-kizi-var`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Mezuniyet Gecesi Her Şeyi Değiştirdi (`.../mezuniyet-gecesi-her-seyi-degistirdi`) |  | <1s |
| details | `fetchMangaDetails(manga)` | error | 0 |  | java.lang.Exception: Manga başlığı bulunamadı | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 13 | Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 41 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | java.lang.Exception: Manga başlığı bulunamadı | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mezuniyet Gecesi Her Şeyi Değiştirdi, URL=`.../mezuniyet-gecesi-her-seyi-degistirdi` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://holyscans.com.tr/.../locked-cover.png` -> all 20 manga URLs (examples: `.../mezuniyet-gecesi-her-seyi-degistirdi`, `.../paranin-oyunu`, `.../harem-a-s`) |  |  |  |
| thumbnail | PASS | `https://holyscans.com.tr/.../locked-cover.png` (image/jpeg, 237060 bytes, 1086x1448; server Content-Type: image/png) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 13 chapters |  |  |  |
| chapter dates | PASS | 13 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://holyscans.com.tr/.../holy-img-serve.php <redacted query values: p, t, and s>` (image/webp (encoding: lossy), 263534 bytes, 600x4000) |  |  |  |
