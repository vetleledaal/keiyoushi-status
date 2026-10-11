# Extension Validation Report

- Extension: tachiyomi-es.mangatv-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 7214040353404261084
- Source name: Manga  TV
- Source language: es
- Selected manga input: popular offset 0: Mairimashita Senpai (`.../mairimashita-senpai`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Mairimashita Senpai (`.../mairimashita-senpai`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Perspectiva Divina (`.../perspectiva-divina`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Mairimashita Senpai (`.../mairimashita-senpai`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mairimashita Senpai (`.../mairimashita-senpai`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 52 | Capítulo 1 Mairimashita Senpai | Paradise Akai Fansub (`.../a4b63ed8743e44`) |  | <1s |
| pages | `getPageList(chapter)` | success | 45 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mairimashita Senpai, URL=`.../mairimashita-senpai` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.mangatv.net/.../5e8e227811e74.jpg` (image/jpeg, 26012 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mairimashita-senpai` |  |  |  |
| details thumbnail URL | PASS | `https://img.mangatv.net/.../5e8e227811e74.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | You got me, sempai!, Mairimashita senpai, Vida escolar, Romance |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | "Senpai, haces que mi corazón se acelere, ¿lo sabes?". Serina llega a la escuela un día y descubre que su escritorio ha sido vandalizado, alguien ha rayado la letra de una canción de amor en este... y ese alguien resulta ser Mizukawa-senpai, un chico que es un año mayor que ella. Quiere conocerlo mejor, pero si su comportamiento frío es un indicio, ¡no tiene ninguna posibilidad! Además, parece que él podría ser simplemente complicado, no malo, y antes de que ella se dé cuenta, ¡comienzan a salir! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 52 chapters |  |  |  |
| chapter dates | PASS | 52 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | FAIL | 45 of 45 pages have invalid URLs: page 1: imageUrl=`https:��i���jx��޷����l�)����u�ڭ款` (malformed URL), page 2: imageUrl=`https:��i���jx��޷����l�)����u�ڭ款` (malformed URL), page 3: imageUrl=`https:��i���jx��޷����l�)����u�ڭ款` (malformed URL), page 4: imageUrl=`https:��i���jx��޷����l�)����u�ڭ款` (malformed URL), page 5: imageUrl=`https:��i���jx��޷����l�)����u�ڭ款` (malformed URL), and 40 more | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `https:��i���jx��޷����l�)����u�ڭ款` at pages 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45 |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https:��i���jx��޷����l�)����u�ڭ款` could not be downloaded: java.lang.IllegalArgumentException: Invalid URL host: "��i���jx��޷����l�)����u�ڭ款" | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
