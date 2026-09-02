# Extension Validation Report

- Extension: tachiyomi-es.nexusscanlation-v1.4.4
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
- Source ID: 4086183896761281232
- Source name: NexusScanlation
- Source language: es
- Selected manga input: latest offset 0: Hacen Falta Hombres (`.../hacen-falta-hombres`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Hacen Falta Hombres (`.../hacen-falta-hombres`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Domando a mi Noona (`.../domando-a-mi-noona`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 20 | Hacen Falta Hombres (`.../hacen-falta-hombres`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Nivel cardiaco (`.../nivel-cardiaco`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Hacen Falta Hombres (`.../hacen-falta-hombres`) |  | 10s+ |
| details | `fetchMangaDetails(manga)` | success | 1 | Hacen Falta Hombres (`.../hacen-falta-hombres`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | success | 22 | Capítulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hacen Falta Hombres, URL=`hacen-falta-hombres` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Nivel cardiaco, URL=`nivel-cardiaco` at page 1 offset 19 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.nexusscanlation.com/.../portada.jpg` (image/jpeg, 42847 bytes, 459x555) |  |  |  |
| details identity | PASS | Details preserved selected URL `hacen-falta-hombres` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.nexusscanlation.com/.../portada.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adulto, Ciencia Ficción, Comedia, Ecchi, Escolar, Fantasía, Harem, Reencarnación, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Debido a la misandria, los hombres desaparecieron y la humanidad quedó al borde de la extinción. ¡Los pocos hombres restantes evolucionaron hasta convertirse en ‘hombres Egen’?! En medio de esta crisis absoluta que amenaza la supervivencia de la humanidad, Kang Dae-geun, un hombre chapado a la antigua, recibe la misión de ayudar a la reproducción humana. Y así termina cargando con derechos y responsabilidades literalmente al nivel del poder estatal... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 22 chapters |  |  |  |
| chapter dates | PASS | 22 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.nexusscanlation.com/.../001.jpg` (image/webp (container: extended), 271404 bytes, 720x7380; server Content-Type: image/jpeg) |  |  |  |
