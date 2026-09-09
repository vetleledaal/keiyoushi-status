# Extension Validation Report

- Extension: tachiyomi-es.onfmangas-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 29
- Lint: 0
- Warnings: 1
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 438553037668091848
- Source name: ONF MANGAS
- Source language: es
- Selected manga input: popular offset 0: Un tasador engañado por la meritocracia: tras abandonar la patria que me trataba como a un esclavo, empecé como héroe de la nación enemiga. (`.../un-tasador-enganado-por-la-meritocracia-tras-abandonar-la-patria-que-me-trataba-como-a-un-esclavo-empece-como-heroe-de-la-nacion-enemiga`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 33 | Un tasador engañado por la meritocracia: tras abandonar la patria que me trataba como a un esclavo, empecé como héroe de la nación enemiga. (`.../un-tasador-enganado-por-la-meritocracia-tras-abandonar-la-patria-que-me-trataba-como-a-un-esclavo-empece-como-heroe-de-la-nacion-enemiga`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Hitokui no Youkai ni Kuwareru Hanashi (`.../hitokui-no-youkai-ni-kuwareru-hanashi`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Asesino Divino, Yo Soy la Sombra (`.../asesino-divino-yo-soy-la-sombra`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Un tasador engañado por la meritocracia: tras abandonar la patria que me trataba como a un esclavo, empecé como héroe de la nación enemiga. (`.../un-tasador-enganado-por-la-meritocracia-tras-abandonar-la-patria-que-me-trataba-como-a-un-esclavo-empece-como-heroe-de-la-nacion-enemiga`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Un tasador engañado por la meritocracia: tras abandonar la patria que me trataba como a un esclavo, empecé como héroe de la nación enemiga. (`.../un-tasador-enganado-por-la-meritocracia-tras-abandonar-la-patria-que-me-trataba-como-a-un-esclavo-empece-como-heroe-de-la-nacion-enemiga`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 30 | Capítulo 1.00 (`.../un-tasador-enganado-por-la-meritocracia-tras-abandonar-la-patria-que-me-trataba-como-a-un-esclavo-empece-como-heroe-de-la-nacion-enemiga-capitulo-1-00`) |  | <1s |
| pages | `fetchPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 33 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Un tasador engañado por la meritocracia: tras abandonar la patria que me trataba como a un esclavo, empecé como héroe de la nación enemiga., URL=`.../un-tasador-enganado-por-la-meritocracia-tras-abandonar-la-patria-que-me-trataba-como-a-un-esclavo-empece-como-heroe-de-la-nacion-enemiga` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 58/58 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 58/58 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://onfmangas.com/.../img.webp <redacted query values: u, w, and v>` (image/jpeg, 52376 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../un-tasador-enganado-por-la-meritocracia-tras-abandonar-la-patria-que-me-trataba-como-a-un-esclavo-empece-como-heroe-de-la-nacion-enemiga` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://d33y4i2dmzjqjh.cloudfront.net/.../9cf038273d46a110224e821662a7839a.webp <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/webp (encoding: lossy), 37300 bytes, 300x450) |  |  |  |
| details author | PASS | Autor Desconocido |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Acción, Fantasía, Magia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | «Tienes verdadero talento. Son tus circunstancias las que te han frenado». Aruto es un joven tasador obligado a trabajar como un esclavo en el reino de Dramd, gobernado por la nobleza. Su vida cambia por completo cuando Beralt, un soldado de la nación enemiga, el Imperio Glaus, lo descubre. En un país que se rige exclusivamente por el mérito, el extraordinario talento de Aruto como tasador es reconocido, ¡y de repente se convierte en candidato a oficial! Nada más alistarse, el alto mando, repleto de poderosos, deposita grandes esperanzas en él, pero los compañeros que le asignan son todos inadaptados a los que se considera casos perdidos... ¡Una fantasía desenfadada sobre el ascenso a la cima, en la que se descubre el talento oculto de sus compañeros y se forja un nuevo destino! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 30 chapters |  |  |  |
| chapter dates | PASS | 30 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 403 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
