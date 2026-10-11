# Extension Validation Report

- Extension: tachiyomi-pt.acervoeremita-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7769570061083458124
- Source name: AcervoEremita
- Source language: pt-BR
- Selected manga input: popular offset 0:  Senhora Fera (`.../10374`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 |  Senhora Fera (`.../10374`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | A Vingança do Cão de Caça dos Baskerville (`.../216`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Me Tornei um Tirano num Jogo de Defesa (`.../14802`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Eu Dominei a Academia Com uma Única Faca de Sashimi (`.../4049`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 12 |  Senhora Fera (`.../10374`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Senhora Fera (`.../10374`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 120 | Capítulo 1 (`.../205993`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 18 |  |  | <1s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title= Senhora Fera, URL=`10374` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 60/60 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 60/60 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://assets.acervoeremita.com/.../senhora-fera.webp` (image/webp (encoding: lossless), 1002802 bytes, 715x1038) |  |  |  |
| details identity | UNUSUAL | Details changed selected title  Senhora Fera to Senhora Fera |  |  |  |
| details thumbnail URL | PASS | `https://assets.acervoeremita.com/.../senhora-fera.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Romance, Shoujo |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | O único objetivo na vida de Elise, a princesa do Reino de Grandia, é sobreviver. Ela se casou com o duque Jin Jo, o louco de Landel. “Eu esperava conseguir amor”, mas ele nem sequer prestou atenção nela. Então um dia, a maldição começou. A maldição trocou o corpo do meu marido e o meu! Podemos quebrar a maldição e voltar atrás? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 120 chapters |  |  |  |
| chapter dates | PASS | 120 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://acervoeremita.com/.../1.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 502 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
