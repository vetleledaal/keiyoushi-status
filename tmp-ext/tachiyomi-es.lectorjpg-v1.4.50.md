# Extension Validation Report

- Extension: tachiyomi-es.lectorjpg-v1.4.50
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 2
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4439526602175493484
- Source name: LectorJPG
- Source language: es
- Selected manga input: popular offset 0: Vecino de a lado-SIN CENSURA (`.../me-alegra-verte`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 6 | Vecino de a lado-SIN CENSURA (`.../me-alegra-verte`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Amor magnético (`.../amor-magnetico`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Ahora Buscaré Una Nueva Famlia (`.../ahora-buscare-una-nueva-famlia`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Vecino de a lado-SIN CENSURA (`.../me-alegra-verte`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Vecino de a lado-SIN CENSURA (`.../me-alegra-verte`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 16 | Capitulo 1 (`.../48711`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 11 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Vecino de a lado-SIN CENSURA, URL=`me-alegra-verte` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 31/31 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 31/31 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.lectorjpg.com/.../29778cfc-5389-4495-96b1-6dd9ffe26a71.webp` (image/webp (container: extended), 35762 bytes, 600x900) |  |  |  |
| details identity | PASS | Details preserved selected URL `me-alegra-verte` |  |  |  |
| details thumbnail URL | PASS | `https://media.lectorjpg.com/.../29778cfc-5389-4495-96b1-6dd9ffe26a71.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Ko Ideum es un ermitaño empedernido que solo sabe hacer una cosa: escribir apasionadas historias BL eróticas. Solo hay un pequeño problema: Ideum es completamente virgen. Para estimular su mente (entre otras cosas), Ideum se dedica a... bueno, a "cuidarse" frente a la ventana, imaginando todo tipo de escenarios sensuales para despertar su creatividad. Claro, puede que haya un apartamento justo enfrente, pero nadie ha vivido allí en años... ¡hasta ahora! En medio de su sesión de autoerotismo, levanta la vista y ve a un hombre mirándolo fijamente desde el otro lado de la calle; y no cualquier hombre, sino el ícono bisexual y futura celebridad, el estudiante de actuación Kwon Jaeyi. Algunos podrían decir que su situación es demasiado cercana para su comodidad... pero tal vez sea la distancia perfecta para algo más. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 16 chapters |  |  |  |
| chapter dates | PASS | 16 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://media.lectorjpg.com/.../d752e4a7-90aa-424c-b3d8-b49ca0777a9b.webp` (image/webp (encoding: lossy), 612216 bytes, 904x16000) |  |  |  |
