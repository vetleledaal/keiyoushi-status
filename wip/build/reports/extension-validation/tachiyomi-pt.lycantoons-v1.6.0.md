# Extension Validation Report

- Extension: tachiyomi-pt.lycantoons-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9117178890425713139
- Source name: Lycan Toons
- Source language: pt-BR
- Selected manga input: latest offset 0: Invocador da Calamidade (`.../invocador-da-calamidade`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Acham que eu sou um gênio do futebol (`.../acham-que-eu-sou-um-genio-do-futebol`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Cale a Boca, Dragão Maligno! Não Quero Mais Criar um Filho com Você (`.../cale-a-boca-dragao-maligno-nao-quero-mais-criar-um-filho-com-voce`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Invocador da Calamidade (`.../invocador-da-calamidade`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Guia da Reforma da Nobre Dama (`.../guia-da-reforma-da-nobre-dama`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Invocador da Calamidade (`.../invocador-da-calamidade`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Invocador da Calamidade (`.../invocador-da-calamidade`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | Capítulo 1 (`.../1 <redacted query values: pages>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Invocador da Calamidade, URL=`.../invocador-da-calamidade` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://cdn.lycantoons.com/.../cover-1790536536426.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../invocador-da-calamidade` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.lycantoons.com/.../cover-1790536536426.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Renascido em outro mundo, pelo bem da raça humana, convocarei todos os chefes com nível de desastre natural! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://cdn.lycantoons.com/.../page-0.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
