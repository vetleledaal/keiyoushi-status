# Extension Validation Report

- Extension: tachiyomi-tr.holyscans-v1.4.51
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 23
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
- Selected manga input: popular offset 0: Aşk Seferi (`.../ask-seferi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Aşk Seferi (`.../ask-seferi`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Şanslı Mia! (`.../lucky-mia`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Aşk Seferi (`.../ask-seferi`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | error | 0 |  | java.lang.Exception: Manga başlığı bulunamadı | <1s |
| chapters | `fetchChapterList(manga)` | success | 32 | Bölüm 1 (`.../bolum-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 39 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Aşk Seferi, URL=`.../ask-seferi` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://holyscans.com.tr/.../locked-cover.png` -> all 20 manga URLs (examples: `.../ask-seferi`, `.../sihirli-kizlar-hizmetinizde`, `.../uvey-kardesimi-yola-getirecegim`) |  |  |  |
| thumbnail | PASS | `https://holyscans.com.tr/.../locked-cover.png` (image/jpeg, 237060 bytes, 1086x1448; server Content-Type: image/png) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 32 chapters |  |  |  |
| chapter dates | PASS | 32 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 39 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://holyscans.com.tr/.../holy-img-serve.php <redacted query values: p, t, and s>` (image/webp (container: extended), 150678 bytes, 600x4000) |  |  |  |
