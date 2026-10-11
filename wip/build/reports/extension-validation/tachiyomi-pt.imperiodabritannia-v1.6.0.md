# Extension Validation Report

- Extension: tachiyomi-pt.imperiodabritannia-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangotheme
- Source ID: 7355004027880350247
- Source name: Sagrado Império da Britannia
- Source language: pt-BR
- Selected manga input: popular offset 0: Imperador Demoníaco (`.../1404 <redacted query values: slug>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Imperador Demoníaco (`.../1404 <redacted query values: slug>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | O Exilado Cavaleiro Pesado Reencarnado é Incomparável com o Conhecimento do Jogo (`.../1513 <redacted query values: slug>`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | O Grande Soberano Demônio Celestial - A Ascensão do Supremo Demônio Celestial (`.../2476 <redacted query values: slug>`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | The Great Devil Emperor Development System (`.../2172 <redacted query values: slug>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Imperador Demoníaco (`.../1404 <redacted query values: slug>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 931 | Capitulo 0.1 (`.../0.1 <redacted query values: slug>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 2: title=Imperador Demoníaco, URL=`.../1404 <redacted query values: slug>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.imperiodabritannia.net/.../cover.gif` (image/gif (format: 89a), 9773589 bytes, 344x640) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1404 <redacted query values: slug>` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.imperiodabritannia.net/.../cover.gif` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Artes Marciais, Aventura, Cultivo, Fantasia, Sagrado império da britannia, Shounen, Sobrenatural, Xuanhuan |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Zhuo Yifan era um magic emperor ou poderia ser chamado de imperador demônio porque ele tinha um livro do imperador antigo chamado Livro dos Nove Segredos, ele foi alvo de todos os especialistas e foi traído e morto por seus alunos. Então sua alma entra e volta à vida em um servo da família chamado Zhuo Fan. Alguma magia demoníaca o impede, ele deve unir as memórias de criança e não pode ignorar a família e a amante a quem serve. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 931 chapters |  |  |  |
| chapter dates | PASS | 931 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `.../206 <redacted query values: slug>` at offsets 715, 716, `.../5 <redacted query values: slug>` at offsets 919, 920, `.../1 <redacted query values: slug>` at offsets 926, 927 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.imperiodabritannia.net/.../1789852189541_pagina_001.jpg` (image/jpeg, 604279 bytes, 1308x1190) |  |  |  |
