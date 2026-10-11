# Extension Validation Report

- Extension: tachiyomi-es.yupmanga-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4437245120973625796
- Source name: Yupmanga
- Source language: es
- Selected manga input: popular offset 0: La metamorfosis de la salvación (`.../9WGCCBUFP16A9`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | La metamorfosis de la salvación (`.../9WGCCBUFP16A9`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | Seitokai Yakuindomo (`.../9DKRUICSH9YF4`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 36 | Tadaima, Okaeri (`.../DS3GU1K08KWY4`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | La metamorfosis de la salvación (`.../9WGCCBUFP16A9`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | La metamorfosis de la salvación (`.../9WGCCBUFP16A9`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | Tomo - 01 (`.../PyNJthfp_XlL8cpzTubbuVzsLx-alzr4EIAawRNlHvy31-P1pX7kQN0nPHrd32hrbv46RIGAW6lUPpX2koUb`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 0 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=La metamorfosis de la salvación, URL=`9WGCCBUFP16A9` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.yupmanga.com/.../image-proxy-v2.php <redacted query values: chapter, page, and context>` (image/webp (encoding: lossy), 26382 bytes, 247x362) |  |  |  |
| details identity | PASS | Details preserved selected URL `9WGCCBUFP16A9` |  |  |  |
| details thumbnail URL | PASS | `https://www.yupmanga.com/.../image-proxy-v2.php <redacted query values: chapter, page, and context>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Josei, Psicológico, Romance, Yaoi (boys' love) |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Enmarcada dentro de la antología de historias cortas de MrBlue, esta intensa obra autoconclusiva creada por Ttung Gae —la reconocida artista detrás del fenómeno «Rosas y champagne»— explora los límites de la redención y los vínculos afectivos al borde del abismo. Atrapados en una realidad hostil y asfixiante donde escapar del destino parece una tarea imposible, sus protagonistas se ven envueltos en una dinámica cargada de tensión emocional y pasiones oscuras, donde alcanzar la verdadera salvación exigirá desprenderse de las ataduras del pasado y pagar un doloroso precio. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | LINT | All 2 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=2 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://www.yupmanga.com/.../reader_v2.php <redacted query values: chapter, token, and page>` to `https://www.yupmanga.com/.../box-modal.php <redacted query values: chapter, token, page, and adg>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
