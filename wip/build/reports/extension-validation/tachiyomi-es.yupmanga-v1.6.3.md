# Extension Validation Report

- Extension: tachiyomi-es.yupmanga-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 1
- Warnings: 1
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4437245120973625796
- Source name: Yupmanga
- Source language: es
- Selected manga input: popular offset 0: No sabía que sería así (`.../99UBHZ8E7V5JJ`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | No sabía que sería así (`.../99UBHZ8E7V5JJ`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | El Señor del Hielo (`.../BIUTSHAVKBPT4`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 36 | ¿Hola, señor veterinario? (`.../ASM5V94P339EC`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | No sabía que sería así (`.../99UBHZ8E7V5JJ`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | No sabía que sería así (`.../99UBHZ8E7V5JJ`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Tomo - 01 (`.../1.00`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: No se pudo cargar el capítulo | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: No se pudo cargar el capítulo | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=No sabía que sería así, URL=`99UBHZ8E7V5JJ` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.yupmanga.com/.../image-proxy-v2.php <redacted query values: chapter, page, and context>` (image/webp (encoding: lossy), 26672 bytes, 247x362) |  |  |  |
| details identity | PASS | Details preserved selected URL `99UBHZ8E7V5JJ` |  |  |  |
| details thumbnail URL | PASS | `https://www.yupmanga.com/.../image-proxy-v2.php <redacted query values: chapter, page, and context>` |  |  |  |
| details author | PASS | Doppeum |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Josei, Romance, Slice of life, Yaoi (boys' love) |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Tras un día agotador de trabajo, Yunho llega a casa y descubre que alguien ha entrado en su apartamento. Abre la puerta con el corazón desbocado y se topa con Kangsik, el compañero de oficina que siempre tenía a todas las mujeres pendientes de él. Esa noche de reencuentro inesperado termina en algo que ninguno de los dos había previsto, y desde entonces Yunho no logra ordenar lo que siente. Mientras intenta entender su relación con Kangsik, descubre una faceta de sí mismo que jamás había imaginado. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No se pudo cargar el capítulo |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://www.yupmanga.com/.../reader_v2.php <redacted query values: chapter, token, and page>` to `https://www.yupmanga.com/.../box-modal.php <redacted query values: chapter, token, page, and adg>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
