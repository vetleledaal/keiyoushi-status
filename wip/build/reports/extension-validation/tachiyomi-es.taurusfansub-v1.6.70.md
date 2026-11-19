# Extension Validation Report

- Extension: tachiyomi-es.taurusfansub-v1.6.70
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 5157867187592331768
- Source name: Taurus Fansub
- Source language: es
- Selected manga input: popular offset 0: Después de dejar de actuar como un perro, me convertí en un Magnate Celestial Urbano (`.../despues-de-dejar-de-actuar-como-un-perro-me-converti-en-un-magnate-celestial-urbano`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Después de dejar de actuar como un perro, me convertí en un Magnate Celestial Urbano (`.../despues-de-dejar-de-actuar-como-un-perro-me-converti-en-un-magnate-celestial-urbano`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Mi Evolución a Partir de un Árbol Gigante (`.../mi-evolucion-a-partir-de-un-arbol-gigante`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Después de dejar de actuar como un perro, me convertí en un Magnate Celestial Urbano (`.../despues-de-dejar-de-actuar-como-un-perro-me-converti-en-un-magnate-celestial-urbano`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | La evolución de la serpiente inmortal (`.../la-evolucion-de-la-serpiente-inmortal`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Después de dejar de actuar como un perro, me convertí en un Magnate Celestial Urbano (`.../despues-de-dejar-de-actuar-como-un-perro-me-converti-en-un-magnate-celestial-urbano`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Después de dejar de actuar como un perro, me convertí en un Magnate Celestial Urbano (`.../despues-de-dejar-de-actuar-como-un-perro-me-converti-en-un-magnate-celestial-urbano`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 353 | Capitulo 0 (`.../capitulo-0`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Después de dejar de actuar como un perro, me convertí en un Magnate Celestial Urbano, URL=`.../despues-de-dejar-de-actuar-como-un-perro-me-converti-en-un-magnate-celestial-urbano` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://lectortaurus.com/.../IMG_20250826_150657.png` -> all 48 manga URLs (examples: `.../despues-de-dejar-de-actuar-como-un-perro-me-converti-en-un-magnate-celestial-urbano`, `.../el-esposo-de-la-emperatriz-es-realmente-invencible`, `.../subiendo-de-nivel-10-000-anos-en-el-futuro`) |  |  |  |
| thumbnail | PASS | `https://lectortaurus.com/.../IMG_20250826_150657.png` (image/png, 7026 bytes, 90x100) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../despues-de-dejar-de-actuar-como-un-perro-me-converti-en-un-magnate-celestial-urbano` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://lectortaurus.com/.../1000666858.jpg` (image/jpeg, 742534 bytes, 1680x2240) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acción, VIP |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Lin Xin era sólo un lamebotas ordinario, pero después de ser abandonado, adquirió un sistema de Dios de la riqueza y ¡obtuvo Miles de billones! Lo malo es que sólo puede gastar el dinero en chicas. Para gastar todo este dinero, Lin Xin se embarcó en un inusual viaje de contraataque del magnate celestial urbano. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 353 chapters |  |  |  |
| chapter dates | PASS | 353 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://lectortaurus.com/.../001.webp` (image/webp (encoding: lossy), 125328 bytes, 1600x500) |  |  |  |
