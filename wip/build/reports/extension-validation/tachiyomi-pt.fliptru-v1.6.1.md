# Extension Validation Report

- Extension: tachiyomi-pt.fliptru-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 2
- Warnings: 2
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4098680004758739934
- Source name: Fliptru
- Source language: pt-BR
- Selected manga input: popular offset 0: Sense Life (`.../sense-life`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Sense Life (`.../sense-life`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 13 | Jack do Limbo (`.../jack-do-limbo-remake`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 13 | Jack do Limbo (`.../jack-do-limbo-remake`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sense Life (`.../sense-life`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sense Life (`.../sense-life`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | 001 - Um acordo até a morte (`.../001`) |  | <1s |
| pages | `getPageList(chapter)` | success | 62 |  |  | <1s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 13 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sense Life, URL=`.../sense-life` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Jack do Limbo, URL=`.../jack-do-limbo-remake` at page 1 offset 0 and page 2 offset 0, title=O Experimento Rainha Vermelha, URL=`.../o-experimento-rainha-vermelha` at page 1 offset 12 and page 2 offset 1 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 39/39 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 38/39 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.fliptru.com.br/.../bannerred.png` (image/png, 448317 bytes, 600x379) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sense-life` |  |  |  |
| details thumbnail URL | PASS | `https://media.fliptru.com.br/.../bannerred.png` |  |  |  |
| details author | PASS | Glitch_Tellend |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Noah é um garoto pacato que procura por um sentido para sua vida, seus dias cotidianos irão sumir após encontrar Kaleb, um usuário de drogas que tem uma grande recompensa por sua cabeça.<br><br>Gênero: Ação<br><br>Autor: @Glitch_Tellend |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | LINT | All 10 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=10 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 62 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.fliptru.com.br/.../capa.webp` (image/webp (encoding: lossless), 842972 bytes, 900x1516; server Content-Type: WebP) |  |  |  |
