# Extension Validation Report

- Extension: tachiyomi-tr.holyscans-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Selected manga input: popular offset 0: Yasak Zindan (`.../yasak-zindan`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Yasak Zindan (`.../yasak-zindan`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Belalı Kız (`.../belali-kiz`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Yasak Zindan (`.../yasak-zindan`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Yasak Zindan (`.../yasak-zindan`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 54 | Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 35 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Yasak Zindan, URL=`.../yasak-zindan` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://holyscans.com.tr/.../locked-cover.png` -> all 20 manga URLs (examples: `.../yasak-zindan`, `.../iki-farkli-tat-asistani`, `.../gunahkar-saman`) |  |  |  |
| thumbnail | PASS | `https://holyscans.com.tr/.../locked-cover.png` (image/png, 228662 bytes, 512x512) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../yasak-zindan` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://holyscans.com.tr/.../cropped-cropped-image.png` was not downloaded |  |  |  |
| details author | PASS | MINSC |  |  |  |
| details artist | PASS | Team Eclipse |  |  |  |
| details genres | PASS | Fantazi, Yetişkin |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Bir grup kahraman, Şeytan Kral’ı yendikten sonra, daha önce gördükleri hiçbir şeye benzemeyen, hayal bile edemeyecekleri sırlar saklayan keşfedilmemiş bir zindan keşfeder. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 54 chapters |  |  |  |
| chapter dates | PASS | 54 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://holyscans.com.tr/.../holy-img-serve.php <redacted query values: p, t, and s>` (image/webp (encoding: lossy), 95392 bytes, 600x4000) |  |  |  |
