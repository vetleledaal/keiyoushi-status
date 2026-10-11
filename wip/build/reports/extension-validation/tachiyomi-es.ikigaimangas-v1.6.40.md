# Extension Validation Report

- Extension: tachiyomi-es.ikigaimangas-v1.6.40
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 1
- Warnings: 3
- Skipped: 3
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7749406396573482811
- Source name: Ikigai Mangas
- Source language: es
- Selected manga input: popular offset 0: En Está Vida Seré La Matriarca (`.../en-esta-vida-sere-la-matriarca`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | En Está Vida Seré La Matriarca (`.../en-esta-vida-sere-la-matriarca`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | El Maestro Espadachín Alentado Por Las Estrellas (`.../el-maestro-espadachin-alentado-por-las-estrellas`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Piel verde (`.../piel-verde`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 0: Expected start of the object '{', but had '<' instead at path: \$<br>JSON input: <!DOCTYPE html><html lang="es"..... | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | En Está Vida Seré La Matriarca (`.../en-esta-vida-sere-la-matriarca`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 239 | Capítulo 0 (`.../914360329776005122`) |  | 10s+ |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 0: Expected start of the object '{', but had '<' instead at path: \$<br>JSON input: <!DOCTYPE html><html lang="es"..... | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | SKIP | Unexpected JSON token at offset 0: Expected start of the object '{', but had '<' instead at path: \$<br>JSON input: <!DOCTYPE html><html lang="es"..... |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 140/140 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 140/140 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image2.ikigaimangas.cloud/.../czM6Ly9pa2lnYWktY2RuL3Nlcmllcy9jb3ZlcnMvOTExNzk0MDQzNTgwMDIyNzg2L2JmNTliNTljLTY3YWUtNDgxMy1hNzE2LWQwODE4NGYxMWZiNC53ZWJw.webp` (image/webp (container: extended), 120174 bytes, 400x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `en-esta-vida-sere-la-matriarca` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://image2.ikigaimangas.cloud/.../czM6Ly9pa2lnYWktY2RuL3Nlcmllcy9jb3ZlcnMvOTExNzk0MDQzNTgwMDIyNzg2L2JmNTliNTljLTY3YWUtNDgxMy1hNzE2LWQwODE4NGYxMWZiNC53ZWJw.webp` (image/webp (container: extended), 115708 bytes, 350x500) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasía, Shoujo, Regresion, Romance, Drama, Histórico |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | La gran familia Lombardi estuvo una vez en la cima del imperio. Tras la muerte de su patriarca, el destino de la familia y el de Firentia, nacida de un lombardo y una campesina, se arruinan a manos de sus inútiles y crueles primos. Pero cuando se reencarne en su yo de siete años, trabajará para proteger el honor de la familia, ganarse el favor de su abuelo Lulac y evitar la muerte de su propio padre. En esta vida, solo hay una forma de que ella gane: convertirse en la cabeza de su poderoso hogar. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 239 chapters |  |  |  |
| chapter dates | LINT | 1 of 239 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `https://image3.ikigaimangas.cloud/.../bannerikigai.png` at pages 7, 13 |  |  |  |
| redirects | UNUSUAL | popular: `https://visualikigai.com` to `https://visualikigai.cmpunjabrashancard.pk` (3 redirects); popular: `https://visualikigai.com/.../clasificacion` to `https://visualikigai.cmpunjabrashancard.pk/.../clasificacion` (3 redirects); popular: `https://visualikigai.com <redacted query values: pagina>` to `https://visualikigai.cmpunjabrashancard.pk <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca` to `https://visualikigai.cmpunjabrashancard.pk/.../en-esta-vida-sere-la-matriarca` (3 redirects); popular: `https://visualikigai.com <redacted query values: pagina>` to `https://visualikigai.cmpunjabrashancard.pk <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com <redacted query values: qfunc>` to `https://visualikigai.cmpunjabrashancard.pk <redacted query values: qfunc>` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca` to `https://visualikigai.cmpunjabrashancard.pk/.../en-esta-vida-sere-la-matriarca` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` to `https://visualikigai.cmpunjabrashancard.pk/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` to `https://visualikigai.cmpunjabrashancard.pk/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` to `https://visualikigai.cmpunjabrashancard.pk/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` to `https://visualikigai.cmpunjabrashancard.pk/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` to `https://visualikigai.cmpunjabrashancard.pk/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` to `https://visualikigai.cmpunjabrashancard.pk/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` to `https://visualikigai.cmpunjabrashancard.pk/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` to `https://visualikigai.cmpunjabrashancard.pk/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` to `https://visualikigai.cmpunjabrashancard.pk/.../en-esta-vida-sere-la-matriarca <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../914360329776005122` to `https://visualikigai.cmpunjabrashancard.pk/.../914360329776005122` (3 redirects) |  |  |  |
| page load | PASS | `https://image3.ikigaimangas.cloud/.../BannerConcursoTiktok.jpg` (image/jpeg, 537233 bytes, 1277x602) |  |  |  |
