# Extension Validation Report

- Extension: tachiyomi-pt.toonbr-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 534693024654050396
- Source name: ToonBr
- Source language: pt-BR
- Selected manga input: popular offset 0: Vingança do Cão de Caça dos Baskerville (`.../vinganca-do-cao-de-caca-dos-baskerville`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 150 | Vingança do Cão de Caça dos Baskerville (`.../vinganca-do-cao-de-caca-dos-baskerville`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 129 | O Mundo Após a Queda (`.../o-mundo-apos-a-queda`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Vingança do Cão de Caça dos Baskerville (`.../vinganca-do-cao-de-caca-dos-baskerville`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Vingança do Cão de Caça dos Baskerville (`.../vinganca-do-cao-de-caca-dos-baskerville`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 152 | Capítulo 0 (`.../94223f23-c935-4efb-9661-dac7f8a11e25`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | 1-10s |

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
| popular listing | PASS | 150 entries |  |  |  |
| latest listing | PASS | 129 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Vingança do Cão de Caça dos Baskerville, URL=`.../vinganca-do-cao-de-caca-dos-baskerville` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 280/280 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 280/280 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn2.toonbr.com/.../0b2d28ee-d558-444a-b210-f313b3f5cf5a.jpeg` (image/webp (encoding: lossy), 210086 bytes, 1400x2002; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../vinganca-do-cao-de-caca-dos-baskerville` |  |  |  |
| details thumbnail URL | PASS | `https://cdn2.toonbr.com/.../0b2d28ee-d558-444a-b210-f313b3f5cf5a.jpeg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ele era o cão de caça da família Baskerville: Vikir. No entanto, a sua lealdade foi recompensada pela lâmina de uma guilhotina suja de calúnias. “Nunca viverei a vida de um cão abatido depois que o coelho for capturado.” No lugar da morte, uma oportunidade inesperada o aguarda. Os olhos de Vikir brilharam vermelhos enquanto ele afiava seus caninos no escuro. “Apenas espere, Hugo. Vou arrancar sua garganta desta vez.” É hora do cão se vingar sangrenta de seu dono. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 152 chapters |  |  |  |
| chapter dates | PASS | 152 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn2.toonbr.com/.../4fa9ba83-eb20-4ac2-a759-9700e94635ba.jpeg` (image/webp (encoding: lossy), 843250 bytes, 2908x2022; server Content-Type: image/jpeg) |  |  |  |
