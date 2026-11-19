# Extension Validation Report

- Extension: tachiyomi-es.datgarscanlation-v1.6.20
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Selected manga input: popular offset 0: Tsumi to Batsu no Spica (`.../tsumi-to-batsu-no-spica.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Tsumi to Batsu no Spica (`.../tsumi-to-batsu-no-spica.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | World of Leadale (In the Land of Leadale, Leadale no Daichi nite) (`.../in-land-of-leadale.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tsumi to Batsu no Spica (`.../tsumi-to-batsu-no-spica.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tsumi to Batsu no Spica (`.../tsumi-to-batsu-no-spica.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 61 | Cap 01  (`.../cap-01.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 52 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tsumi to Batsu no Spica, URL=`.../tsumi-to-batsu-no-spica.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../IMG_20260207_004030_959.jpg` (image/jpeg, 129139 bytes, 600x853) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tsumi-to-batsu-no-spica.html` |  |  |  |
| details thumbnail URL | PASS | `https://blogger.googleusercontent.com/.../IMG_20260207_004030_959.jpg` |  |  |  |
| details author | PASS | Inoryuu Hajime |  |  |  |
| details artist | PASS | Seo Chishio |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | En una preparatoria común, lleva una vida mediocre el profesor Hatori. Un día, se da cuenta de que una de sus alumnas, Tsumugi Spica, está siendo acosada. En el camino de regreso bajo la lluvia, por casualidad se queda a solas con ella. “¡Yo me encargaré de esto!”, le dice Hatori para tranquilizarla, pero Tsumugi le toma la mano suavemente y, sonriendo, le responde: «El profesor Hatori es un mentiroso, ¿verdad?» Un profesor y una alumna… dos personas que no deberían acercarse demasiado. Ella, con un encanto inquietante, transforma por completo la vida “normal” de Hatori. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 13 name, chapter 17 name, chapter 23 name, chapter 24 name, chapter 25 name, chapter 26 name, chapter 32 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 46 name, chapter 48 name, chapter 52 name, chapter 61 name |  |  |  |
| chapters | PASS | 61 chapters |  |  |  |
| chapter dates | PASS | 61 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../00_00.5.jpg` (image/jpeg, 469759 bytes, 1055x1500) |  |  |  |
