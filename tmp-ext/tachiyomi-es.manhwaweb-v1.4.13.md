# Extension Validation Report

- Extension: tachiyomi-es.manhwaweb-v1.4.13
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5943212552955476721
- Source name: ManhwaWeb
- Source language: es
- Selected manga input: latest offset 0: Asciendo a la Divinidad con mi Habilidad de Nigromante (`.../asciendo-a-la-divinidad-con-mi-habilidad-de-nigromante_1788320926512`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 17 | La Venganza del Sabueso de Sangre de Hierro (`.../comic-el-men-de-la-venzanza_1694253402800`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 105 | Asciendo a la Divinidad con mi Habilidad de Nigromante (`.../asciendo-a-la-divinidad-con-mi-habilidad-de-nigromante_1788320926512`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Asciendo a la Divinidad con mi Habilidad de Nigromante (`.../asciendo-a-la-divinidad-con-mi-habilidad-de-nigromante_1788320926512`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Asciendo a la Divinidad con mi Habilidad de Nigromante (`.../asciendo-a-la-divinidad-con-mi-habilidad-de-nigromante_1788320926512`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 8 | Capítulo 1 (`.../asciendo-a-la-divinidad-con-mi-habilidad-de-nigromante_1788320926512-1_01`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | PASS | 105 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Asciendo a la Divinidad con mi Habilidad de Nigromante, URL=`manhwa/asciendo-a-la-divinidad-con-mi-habilidad-de-nigromante_1788320926512` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 123/123 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 123/123 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img2mw.xyz/.../cover_1788356619566icdsfern.webp` (image/webp (encoding: lossy), 617840 bytes, 1536x2048) |  |  |  |
| details identity | PASS | Details preserved selected URL `manhwa/asciendo-a-la-divinidad-con-mi-habilidad-de-nigromante_1788320926512` |  |  |  |
| details thumbnail URL | PASS | `https://img2mw.xyz/.../cover_1788356619566icdsfern.webp` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Accion, Academia, Fantasia, Aventura, Sobrenatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Con la llegada de la era del cambio de clase global, Chen Mo despierta una clase oculta única: el Maestro de Fusión. Desde simples esqueletos hasta espectros errantes, cualquier ser puede ser fusionado y evolucionado para perfeccionar implacablemente a su legión de no-muertos. Dejando un inmenso mar de huesos a su paso, esta calamidad arrasará el continente, mientras él, dependiendo únicamente de su propio poder, aniquila a los enemigos más formidables de los cielos. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img2mw.xyz/.../001.webp` (image/webp (encoding: lossy), 116598 bytes, 1330x1920) |  |  |  |
