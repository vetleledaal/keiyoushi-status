# Extension Validation Report

- Extension: tachiyomi-es.ikigaimangas-v1.4.35
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 25
- Lint: 1
- Warnings: 1
- Skipped: 6
- Failed: 4
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7749406396573482811
- Source name: Ikigai Mangas
- Source language: es
- Selected manga input: popular offset 0: En Está Vida Seré La Matriarca (`.../en-esta-vida-sere-la-matriarca`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 100 | En Está Vida Seré La Matriarca (`.../en-esta-vida-sere-la-matriarca`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Amor de Caramelo de Menta (`.../amor-de-caramelo-de-menta`) |  | 10s+ |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Piel verde (`.../piel-verde`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.Exception: Ocurrio un error al obtener la lista de series | 10s+ |
| details | `fetchMangaDetails(manga)` | success | 1 | En Está Vida Seré La Matriarca (`.../en-esta-vida-sere-la-matriarca`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 235 | Capítulo 0 (`.../914360329776005122`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 0 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | java.lang.Exception: Ocurrio un error al obtener la lista de series | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | SKIP | Ocurrio un error al obtener la lista de series |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 140/140 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 140/140 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://image2.ikigaimangas.cloud/.../czM6Ly9pa2lnYWktY2RuL3Nlcmllcy9jb3ZlcnMvOTExNzk0MDQzNTgwMDIyNzg2L2JmNTliNTljLTY3YWUtNDgxMy1hNzE2LWQwODE4NGYxMWZiNC53ZWJw.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `en-esta-vida-sere-la-matriarca` |  |  |  |
| details thumbnail URL | FAIL | Differs from selected listing thumbnail; Thumbnail URL `https://image2.ikigaimangas.cloud/.../czM6Ly9pa2lnYWktY2RuL3Nlcmllcy9jb3ZlcnMvOTExNzk0MDQzNTgwMDIyNzg2L2JmNTliNTljLTY3YWUtNDgxMy1hNzE2LWQwODE4NGYxMWZiNC53ZWJw.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasía, Shoujo, Regresion, Romance, Drama, Histórico |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | La gran familia Lombardi estuvo una vez en la cima del imperio. Tras la muerte de su patriarca, el destino de la familia y el de Firentia, nacida de un lombardo y una campesina, se arruinan a manos de sus inútiles y crueles primos. Pero cuando se reencarne en su yo de siete años, trabajará para proteger el honor de la familia, ganarse el favor de su abuelo Lulac y evitar la muerte de su propio padre. En esta vida, solo hay una forma de que ella gane: convertirse en la cabeza de su poderoso hogar. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 235 chapters |  |  |  |
| chapter dates | LINT | 1 of 235 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://visualikigai.com` to `https://visorikigai.gettocaboca.com` (3 redirects); popular: `https://visualikigai.com/.../clasificacion` to `https://visualikigai.treefy.online/.../clasificacion` (2 redirects); popular: `https://visualikigai.com <redacted query values: pagina>` to `https://visualikigai.treefy.online <redacted query values: pagina>` (2 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` to `https://visorikigai.gettocaboca.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca` to `https://visorikigai.gettocaboca.com/.../en-esta-vida-sere-la-matriarca` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` to `https://visorikigai.gettocaboca.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com <redacted query values: pagina>` to `https://visualikigai.treefy.online <redacted query values: pagina>` (2 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` to `https://visorikigai.gettocaboca.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` to `https://visorikigai.gettocaboca.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` to `https://visorikigai.gettocaboca.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` to `https://visorikigai.gettocaboca.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` to `https://visorikigai.gettocaboca.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` to `https://visorikigai.gettocaboca.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` to `https://visorikigai.gettocaboca.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` to `https://visorikigai.gettocaboca.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../914360329776005122` to `https://visualikigai.treefy.online/.../914360329776005122` (2 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
