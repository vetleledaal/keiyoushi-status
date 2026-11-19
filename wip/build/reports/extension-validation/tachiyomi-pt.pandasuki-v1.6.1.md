# Extension Validation Report

- Extension: tachiyomi-pt.pandasuki-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 831719512603467994
- Source name: Panda Suki
- Source language: pt-BR
- Selected manga input: popular offset 0: Casamento Psicopata (`.../casamento-psicopata`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 13 | Casamento Psicopata (`.../casamento-psicopata`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Casamento Psicopata (`.../casamento-psicopata`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Casamento Psicopata (`.../casamento-psicopata`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Casamento Psicopata (`.../casamento-psicopata`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 76 | Capitulo 0 (`.../pa-capitulo-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 13 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Casamento Psicopata, URL=`casamento-psicopata` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 24/24 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 24/24 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pandasuki.net/.../capa2_casamento_piscopata.png` (image/png, 81548 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `casamento-psicopata` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://pandasuki.net/.../capa2_casamento_piscopata.png.webp` (image/webp (encoding: lossy), 32982 bytes, 300x400) |  |  |  |
| details author | PASS | Dry Fish Girl |  |  |  |
| details artist | PASS | Hot Fuzzy Comics |  |  |  |
| details genres | PASS | +18, Drama, Josei, Romance, Suspense Psicológico |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A história gira em torno de Han Seoryeong, uma dona de casa cega que viveu dois anos de um casamento aparentemente perfeito. Um dia, seu marido desaparece sem deixar rastros. Determinada a encontrá-lo, Seoryeong mergulha em uma busca que a leva a descobrir segredos perturbadores sobre o homem com quem se casou.<br><br>**Ano de lançamento:** 2024<br><br>**Títulos alternativos:**<br>- Casamento Psicopático<br>- Casamento Feliz |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 76 chapters |  |  |  |
| chapter dates | PASS | 76 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://pandasuki.net/.../casamento-psicopata_cap-1-768x7680.jpg.webp` (image/webp (encoding: lossy), 269484 bytes, 768x7680) |  |  |  |
