# Extension Validation Report

- Extension: tachiyomi-es.minuscreators-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7733585535206507786
- Source name: Minus Creators
- Source language: es
- Selected manga input: popular offset 0: La página azul de Mei (`.../196`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 45 | La página azul de Mei (`.../196`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 39 | WATERMAN el superhéroe de la limpieza (`.../206`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Tati Brillitos (recopilación) (`.../451`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | La página azul de Mei (`.../196`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | La página azul de Mei (`.../196`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 29 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 45 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=La página azul de Mei, URL=`.../196` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://minuscreators.com/.../thumb_portada_caa26ead7ef43d5d7736f8bb0edfcbf7.webp` (image/webp (encoding: lossy), 22950 bytes, 360x508) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../196` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://minuscreators.com/.../portada_2543e3b21b794fa1ce6fd65bfe6219df.webp` (image/webp (encoding: lossy), 88206 bytes, 900x1270) |  |  |  |
| details author | PASS | Takeda |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, NSFW, Slice of life, Sobrenatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Golpeada por la pobreza ,Mei (una aspirante a artista) termina en el peor lugar posible: La casa de Ugly Bastard. Desesperada busca abrir una página online con fotos eróticas, pero no queremos hacerla sufrir mucho, pues hay algo muy perturbador escondido dentro de ella. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://minuscreators.com/.../portada_2543e3b21b794fa1ce6fd65bfe6219df.webp` (image/webp (encoding: lossy), 88206 bytes, 900x1270) |  |  |  |
