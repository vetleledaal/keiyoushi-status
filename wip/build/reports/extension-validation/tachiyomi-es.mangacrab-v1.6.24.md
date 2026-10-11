# Extension Validation Report

- Extension: tachiyomi-es.mangacrab-v1.6.24
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6167683270485370369
- Source name: Manga Crab
- Source language: es
- Selected manga input: popular offset 0: Tengo Una Nueva Carrera Al Azar Cada Semana (`.../tengo-una-nueva-carrera-al-azar-cada-semana`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Tengo Una Nueva Carrera Al Azar Cada Semana (`.../tengo-una-nueva-carrera-al-azar-cada-semana`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Cuanto más fuerte es mi oponente, más fuerte me vuelvo. Mi nivel de cultivo no tiene límites (`.../cuanto-mas-fuerte-es-mi-oponente-mas-fuerte-me-vuelvo-mi-nivel-de-cultivo-no-tiene-limites`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Artes Marciales Supremas: ¡Ser un Genio Es Solo el Inicio de Mi Ascensión! (`.../artes-marciales-supremas-ser-un-genio-es-solo-el-inicio-de-mi-ascension`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Esclavo De Las Sombras (`.../esclavo-de-las-sombras`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | Tengo Una Nueva Carrera Al Azar Cada Semana (`.../tengo-una-nueva-carrera-al-azar-cada-semana`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tengo Una Nueva Carrera Al Azar Cada Semana (`.../tengo-una-nueva-carrera-al-azar-cada-semana`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 925 | Capitulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 43 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tengo Una Nueva Carrera Al Azar Cada Semana, URL=`.../tengo-una-nueva-carrera-al-azar-cada-semana` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangacrab.org/.../420-5.jpg` (image/jpeg, 59888 bytes, 420x560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tengo-una-nueva-carrera-al-azar-cada-semana` |  |  |  |
| details thumbnail URL | PASS | `https://mangacrab.org/.../420-5.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ciencia Ficción, Comedia, Exclusivo, Harem, Manhua, Sistema |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Después de ser despedido por la compañía, Lin Yi obtuvo por error el sistema completo de experiencia profesional. Lin Yi confió en los diversos arreglos profesionales y las generosas recompensas otorgadas por el sistema para lograr su ambición y el camino de ser rico paso a paso, para convertirse en el todoterreno definitivo para dominar el mundo. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 648 name |  |  |  |
| chapters | PASS | 925 chapters |  |  |  |
| chapter dates | PASS | 925 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 43 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mangacrab.org/.../encript.php <redacted query values: t and sig>` (image/webp (encoding: lossy), 220764 bytes, 800x1362) |  |  |  |
