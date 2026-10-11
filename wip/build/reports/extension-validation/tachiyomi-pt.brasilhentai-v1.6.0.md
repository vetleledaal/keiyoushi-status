# Extension Validation Report

- Extension: tachiyomi-pt.brasilhentai-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 26
- Lint: 0
- Warnings: 1
- Skipped: 8
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8020430975962445741
- Source name: Brasil Hentai
- Source language: pt-BR
- Selected manga input: popular offset 0: Minha irmã postiça (`.../minha-irma-postica`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | Minha irmã postiça (`.../minha-irma-postica`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 8 | Nós Somos Amigos Otakus (`.../nos-somos-amigos-otakus`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 7 | Dando uma Ajudinha para o Sogro (`.../dando-uma-ajudinha-para-o-sogro`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Minha irmã postiça (`.../minha-irma-postica`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo único (`.../minha-irma-postica`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 7 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 23/23 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 23/23 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://brasilhentai.com/.../sister-bh.jpg` (image/jpeg, 124672 bytes, 600x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../minha-irma-postica` |  |  |  |
| details thumbnail URL | PASS | `https://brasilhentai.com/.../sister-bh.jpg` |  |  |  |
| details author | PASS | ichigo |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Família Sacana |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Ela adora andar pela casa só de calcinha. Postagens relacionadas: Eu fui Seduzido Pela Irmã da Minha Namorada Sexo 24/7 com a Minha Meia-Irmã! A Irmã da Minha noiva tem Rosto Super Raro Minha Meia-Irmã Está Tentando Me Fazer Tomar Um Remédio Para Dormir… Rotina De Sexo Intenso Com Minha Meia-Irmã Eu Não Posso Desobedecer Minha Irmã Mais Velha, Jeanne Minha Querida Irmã, é Muito Fácil de Persuadir 2 Sou Melhor Que a Minha Irmã Mais Velha, Sabia? A Irmã da Minha Noiva Tem Rosto Super Raro Recatada ~ A Minha Irmã Pura Me Devasta Suavemente |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://brasilhentai.com/.../1` to `https://brasilhentai.com` (1 redirects); popular: `https://brasilhentai.com/.../1` to `https://brasilhentai.com/.../3d-hentai-hd` (1 redirects); popular: `https://brasilhentai.com/.../2` to `https://brasilhentai.com/.../2` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
