# Extension Validation Report

- Extension: tachiyomi-es.taurusfansub-v1.4.61
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5157867187592331768
- Source name: Taurus Fansub
- Source language: es
- Selected manga input: popular offset 0: Después de dejar de actuar como un perro, me convertí en un Magnate Celestial Urbano (`.../despues-de-dejar-de-actuar-como-un-perro-me-converti-en-un-magnate-celestial-urbano`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | Después de dejar de actuar como un perro, me convertí en un Magnate Celestial Urbano (`.../despues-de-dejar-de-actuar-como-un-perro-me-converti-en-un-magnate-celestial-urbano`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 12 | Soy el Dios de los Goblins (`.../soy-el-dios-de-los-goblins`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Carnicero Marcial De Rango Divino (`.../puedo-destruir-los-10000-mundos-con-un-cuchillo-carnicero`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Despertar del guerrero del Rayo Clase SSS (`.../despertar-del-guerrero-del-rayo-clase-sss`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Después de dejar de actuar como un perro, me convertí en un Magnate Celestial Urbano (`.../despues-de-dejar-de-actuar-como-un-perro-me-converti-en-un-magnate-celestial-urbano`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Después de dejar de actuar como un perro, me convertí en un Magnate Celestial Urbano (`.../despues-de-dejar-de-actuar-como-un-perro-me-converti-en-un-magnate-celestial-urbano`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 337 | Capitulo 0 (`https://lectortaurus.com/.../capitulo-0 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Después de dejar de actuar como un perro, me convertí en un Magnate Celestial Urbano, URL=`.../despues-de-dejar-de-actuar-como-un-perro-me-converti-en-un-magnate-celestial-urbano` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lectortaurus.com/.../1000666858.jpg` (image/jpeg, 742534 bytes, 1680x2240) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../despues-de-dejar-de-actuar-como-un-perro-me-converti-en-un-magnate-celestial-urbano` |  |  |  |
| details thumbnail URL | PASS | `https://lectortaurus.com/.../1000666858.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acción, Artes Marciales, Comedia, Cultivación, Ecchi, Fantasía, Harem, Manhua, Puto-Amo, Romance, Sistema, Vida Escolar |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Lin Xin era sólo un lamebotas ordinario, pero después de ser abandonado, adquirió un sistema de Dios de la riqueza y ¡obtuvo Miles de billones! Lo malo es que sólo puede gastar el dinero en chicas. Para gastar todo este dinero, Lin Xin se embarcó en un inusual viaje de contraataque del magnate celestial urbano. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 337 chapters |  |  |  |
| chapter dates | PASS | 337 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 337 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://lectortaurus.com/.../001.webp` (image/webp (encoding: lossy), 125328 bytes, 1600x500) |  |  |  |
