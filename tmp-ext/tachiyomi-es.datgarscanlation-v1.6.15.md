# Extension Validation Report

- Extension: tachiyomi-es.datgarscanlation-v1.6.15
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 1626637101814976364
- Source name: Dat-Gar Scan
- Source language: es
- Selected manga input: popular offset 0: Una Historia Sobre Un Abuelo Y Abuela De Regreso A Su Juventud  (`.../una-historia-sobre-un-abuelo-y-abuela_14.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Una Historia Sobre Un Abuelo Y Abuela De Regreso A Su Juventud  (`.../una-historia-sobre-un-abuelo-y-abuela_14.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Fuufu Ijou Koibito Miman  (`.../fuufu-ijou-koibito-miman.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Una Historia Sobre Un Abuelo Y Abuela De Regreso A Su Juventud  (`.../una-historia-sobre-un-abuelo-y-abuela_14.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Una Historia Sobre Un Abuelo Y Abuela De Regreso A Su Juventud  (`.../una-historia-sobre-un-abuelo-y-abuela_14.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 245 | Cap 01 (`.../cap-01_95.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 6 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Una Historia Sobre Un Abuelo Y Abuela De Regreso A Su Juventud , URL=`.../una-historia-sobre-un-abuelo-y-abuela_14.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../imagen_2022-07-18_151124652.png` (image/png, 547090 bytes, 555x797) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../una-historia-sobre-un-abuelo-y-abuela_14.html` |  |  |  |
| details thumbnail URL | PASS | `https://blogger.googleusercontent.com/.../imagen_2022-07-18_151124652.png` |  |  |  |
| details author | PASS | # |  |  |  |
| details artist | PASS | # |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Una historia sobre un abuelo y una abuela que regresaron a su época juvenil: Otro manga corto de Twitter sobre una pareja de de ancianos que volvió a ser joven.. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: title, chapter 58 name, chapter 85 name, chapter 95 name, chapter 106 name, chapter 111 name, chapter 140 name, chapter 150 name |  |  |  |
| chapters | PASS | 245 chapters |  |  |  |
| chapter dates | PASS | 245 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../IMG_20220430_183910_546.jpg` (image/jpeg, 135842 bytes, 794x1280) |  |  |  |
