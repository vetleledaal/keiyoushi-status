# Extension Validation Report

- Extension: tachiyomi-es.aquellosquetraducen-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3614780911323505101
- Source name: Aquellos Que Traducen Scan
- Source language: es
- Selected manga input: popular offset 0: Empezando como el Jefe Dragon Negro, Soy Invencible / Black dragon boss (`.../obra.html <redacted query values: id>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 27 | Empezando como el Jefe Dragon Negro, Soy Invencible / Black dragon boss (`.../obra.html <redacted query values: id>`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Empezando como el Jefe Dragon Negro, Soy Invencible / Black dragon boss (`.../obra.html <redacted query values: id>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Empezando como el Jefe Dragon Negro, Soy Invencible / Black dragon boss (`.../obra.html <redacted query values: id>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 29 | Capítulo 73 (`.../lector.html <redacted query values: obra and cap>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 27 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Empezando como el Jefe Dragon Negro, Soy Invencible / Black dragon boss, URL=`.../obra.html <redacted query values: id>` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 28/28 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 28/28 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lh3.googleusercontent.com/.../1xjfdUHB5G59-sw4_YOMpmLGUVVLa1gmS=s0` (image/jpeg, 190496 bytes, 620x876) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../obra.html <redacted query values: id>` |  |  |  |
| details thumbnail URL | PASS | `https://lh3.googleusercontent.com/.../1xjfdUHB5G59-sw4_YOMpmLGUVVLa1gmS=s0` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Accion, Fantasia, Aventura, Sistema de niveles, Apocalíptico, Superpoderes |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 👍 33 · 👎 0 · 3578 visitas<br><br>Su yang un chico que obtuvo una clase inútil \<Guerrero> obtuvo el sistema de trabajo de jefe a tiempo parcial y se convirtió en el Dragon Athos. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 29 chapters |  |  |  |
| chapter dates | PASS | 29 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://lh3.googleusercontent.com/.../1cU9z9srl8E6Bjlp7EpUUHT6TBcKRvWSp=s0` (image/jpeg, 829564 bytes, 1600x2214) |  |  |  |
