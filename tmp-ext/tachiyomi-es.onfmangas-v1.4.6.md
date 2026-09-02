# Extension Validation Report

- Extension: tachiyomi-es.onfmangas-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 28
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
- Selected manga input: latest offset 0: La favorita del jefe / Rosa (`.../la-favorita-del-jefe-rosa`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 33 | Un tasador engañado por la meritocracia: tras abandonar la patria que me trataba como a un esclavo, empecé como héroe de la nación enemiga. (`.../un-tasador-enganado-por-la-meritocracia-tras-abandonar-la-patria-que-me-trataba-como-a-un-esclavo-empece-como-heroe-de-la-nacion-enemiga`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | La favorita del jefe / Rosa (`.../la-favorita-del-jefe-rosa`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | El gran duque del norte (`.../el-gran-duque-del-norte`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | La favorita del jefe / Rosa (`.../la-favorita-del-jefe-rosa`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | La favorita del jefe / Rosa (`.../la-favorita-del-jefe-rosa`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo 1.00 (`.../la-favorita-del-jefe-rosa-capitulo-1-00`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=La favorita del jefe / Rosa, URL=`.../la-favorita-del-jefe-rosa` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 58/58 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 58/58 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://onfmangas.com/.../img.webp <redacted query values: u, w, and v>` (image/webp (encoding: lossy), 17806 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../la-favorita-del-jefe-rosa` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://onfmangas.com/.../img.webp <redacted query values: u, w, and v>` (image/webp (encoding: lossy), 17806 bytes, 300x450) |  |  |  |
| details author | PASS | Autor Desconocido |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Recuentos de la vida, Niños |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Cuando estaban en la preparatoria, Kelsey y Eric estaban apasionadamente enamorados. Entonces, un día, él desapareció sin decir palabra, dejándola plantada en su baile de graduación. Han pasado diez años desde entonces... ¡Ahora es un empresario exitoso que vive al lado de sus padres! Todavía la emociona, pero es difícil de leer. Kelsey se niega a dejarse llevar por él. Necesita enfocarse en cosas más importantes: como madre soltera, necesita desesperadamente un trabajo en su compañía. Este volumen también incluye la historia de Rosa. El destino parece haber cruzado los caminos de Selena, cuidadora del anciano Godfrey, y Ethan, un empresario hecho a sí mismo que construyó su carrera desde la nada. Están peleando por los derechos de una pintura, pero esta misteriosa pintura tiene una historia mucho más rica y mágica de lo que jamás imaginaron. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 403 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
