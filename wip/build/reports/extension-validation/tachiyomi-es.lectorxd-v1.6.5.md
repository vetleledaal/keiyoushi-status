# Extension Validation Report

- Extension: tachiyomi-es.lectorxd-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 17
- Lint: 0
- Warnings: 0
- Skipped: 18
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4078570629457850125
- Source name: LectorXD
- Source language: es
- Selected manga input: popular offset 0: Dominio Absoluto del Nivel 0 -Soy Invencible Con mis Habilidades de Análisis- (`.../dominio-absoluto-del-nivel-0-soy-invencible-con-mis-habilidades-de-an-lisis`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Dominio Absoluto del Nivel 0 -Soy Invencible Con mis Habilidades de Análisis- (`.../dominio-absoluto-del-nivel-0-soy-invencible-con-mis-habilidades-de-an-lisis`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | El Herrero Genio del Juego (`.../el-herrero-genio-del-juego`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | DIEZ MIL INTENTOS DE ASESINAR AL LÍDER DE LA SECTA (`.../diez-mil-intentos-de-asesinar-al-l-der-de-la-secta`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | El primer chef de artes marciales (`.../el-primer-chef-de-artes-marciales`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Dominio Absoluto del Nivel 0 -Soy Invencible Con mis Habilidades de Análisis- (`.../dominio-absoluto-del-nivel-0-soy-invencible-con-mis-habilidades-de-an-lisis`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Dominio Absoluto del Nivel 0 -Soy Invencible Con mis Habilidades de Análisis-, URL=`.../dominio-absoluto-del-nivel-0-soy-invencible-con-mis-habilidades-de-an-lisis` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s1.cdnlxd.xyz/.../dominio-absoluto-del-nivel-0-soy-invencible-con-mis-habilidades-de-an-lisis_1789277193528.webp` (image/webp (encoding: lossy), 80198 bytes, 300x440) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | SKIP | No details metadata to check |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
