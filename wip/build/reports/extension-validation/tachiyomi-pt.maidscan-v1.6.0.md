# Extension Validation Report

- Extension: tachiyomi-pt.maidscan-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: greenshit
- Source ID: 7624757094973334315
- Source name: Maid Scan
- Source language: pt-BR
- Selected manga input: popular offset 0: Uma Princesa que Lê a Sorte (`.../10714`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 26 | Uma Princesa que Lê a Sorte (`.../10714`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 26 | A Tradutora do Tirano (`.../10721`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 26 |  O Vilão Descobriu A Minha Identidade (`.../10343`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 26 | O Motivo Pelo Qual A Vilã Empunhou Uma Espada (`.../14377`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Uma Princesa que Lê a Sorte (`.../10714`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Uma Princesa que Lê a Sorte (`.../10714`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 153 | Capítulo 1 (`.../235043`) |  | <1s |
| pages | `getPageList(chapter)` | success | 22 |  |  | 1-10s |

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
| popular listing | PASS | 26 entries |  |  |  |
| latest listing | PASS | 26 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Uma Princesa que Lê a Sorte, URL=`.../10714` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 105/105 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 105/105 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.verdinha.wtf/.../resource.jpg <redacted query values: width>` (image/jpeg, 46083 bytes, 300x429) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../10714` |  |  |  |
| details thumbnail URL | PASS | `https://api.verdinha.wtf/.../resource.jpg <redacted query values: width>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Shoujo / Romances, Comédia, Fantasia, Romance, Escolar, Magia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A atriz Lee Sia não é apenas assombrada por fantasmas há anos, ela também é atormentada por sonhos de uma garota chamada Camilla Sorfell morrendo repetidamente nas mãos de seu padrasto e meio-irmão. Apesar de seus esforços para ignorar os sonhos, quando um acidente no trabalho a faz acordar como Camilla, ela é forçada a buscar a ajuda de vários fantasmas para conquistar sua família e evitar ser morta. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 153 chapters |  |  |  |
| chapter dates | PASS | 153 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.verdinha.wtf/.../00a.webp` (image/webp (encoding: lossless), 335212 bytes, 760x497) |  |  |  |
