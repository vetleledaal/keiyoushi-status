# Extension Validation Report

- Extension: tachiyomi-es.novamanhwa-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 2716608619626653265
- Source name: Nova Manhwas
- Source language: es
- Selected manga input: latest offset 0: How to make a “Girl” Fall in Love Parte 2 (`.../how-to-make-a-girl-fall-in-love-parte-2`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Yo, el Maestro Malvado, Llevo a mis Discípulas a ser Invencibles en Todo el Mundo (`.../yo-el-maestro-malvado-llevo-a-mis-discipulas-a-ser-invencibles-en-todo-el-mundo`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | El Niño Sepulturero Demoniaco (`.../el-nino-sepulturero-demoniaco`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | How to make a “Girl” Fall in Love Parte 2 (`.../how-to-make-a-girl-fall-in-love-parte-2`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | El Niño Sepulturero Demoniaco (`.../el-nino-sepulturero-demoniaco`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | How to make a “Girl” Fall in Love Parte 2 (`.../how-to-make-a-girl-fall-in-love-parte-2`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 18 | Capítulo 93 (`.../how-to-make-a-girl-fall-in-love-capitulo-93`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../Pal_Doctol.jpg <redacted query values: resize>` (image/jpeg, 18213 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../how-to-make-a-girl-fall-in-love-parte-2` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i0.wp.com/.../Pal_Doctol.jpg` (image/jpeg, 670198 bytes, 2882x4096) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Boys love, Comedia, Romance, School life, Slice of life, Travestismo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kenshirou Midou es un popular chico de secundaria que tiene un secreto que no le puede contar a nadie: Ama los cosméticos. En un intento de probar su habilidad con éstos, le pide a su amigo de la infancia Hiura Mihate que le dejara practicar con el, pero se termina viendo…¿Demasiado bien? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 18 chapters |  |  |  |
| chapter dates | PASS | 18 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i1.wp.com/.../KYGSiib.jpg` (image/webp (encoding: lossy), 90758 bytes, 832x1248) |  |  |  |
