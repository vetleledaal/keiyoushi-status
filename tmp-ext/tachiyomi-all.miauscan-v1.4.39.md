# Extension Validation Report

- Extension: tachiyomi-all.miauscan-v1.4.39
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 2886862669347225416
- Source name: Miau Scan
- Source language: es
- Selected manga input: latest offset 0: Mi vida como un perdedor (`.../mi-vida-como-un-perdedor`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Negocio Matrimonial (`.../condicion-matrimoni4l`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Terminé con mi esposo, ahora iré a hacer dinero (`.../termine-con-mi-esposo-ahora-ire-a-hacer-dinero`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Mi vida como un perdedor (`.../mi-vida-como-un-perdedor`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Labios Tan Filosos Como Un Cuchillo (`.../labios-tan-filosos-como-un-cuchillo`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Mi vida como un perdedor (`.../mi-vida-como-un-perdedor`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Mi vida como un perdedor (`.../mi-vida-como-un-perdedor`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 36 | Capítulo 1 (`.../mi-vida-como-un-perdedor-capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mi vida como un perdedor, URL=`.../mi-vida-como-un-perdedor` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://leemiau.com/.../mi-vida-como-un-perdedor-b72b1214d5-210x300.webp` (image/webp (encoding: lossy), 19408 bytes, 210x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mi-vida-como-un-perdedor` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://leemiau.com/.../mi-vida-como-un-perdedor-b72b1214d5.webp` (image/webp (container: extended), 90614 bytes, 350x500) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Mi vida se arruinó después de que me acosaras en el instituto. Entonces, ¿por qué tienes que ser feliz y exitoso? ¡Te daré a probar de tu propia medicina! Ahora |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 36 chapters |  |  |  |
| chapter dates | PASS | 36 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://leemiau.com/.../mi-vida-como-un-perdedor-capitulo-1-pagina-1-4e598c4c50.webp` (image/webp (encoding: lossy), 571858 bytes, 800x11190) |  |  |  |
