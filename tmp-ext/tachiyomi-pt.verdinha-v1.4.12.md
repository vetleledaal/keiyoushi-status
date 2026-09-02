# Extension Validation Report

- Extension: tachiyomi-pt.verdinha-v1.4.12
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3410911112857734134
- Source name: Verdinha
- Source language: pt-BR
- Selected manga input: popular offset 0: Nanotecnologia Marcial (`.../200`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 26 | Nanotecnologia Marcial (`.../200`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 26 | O Antigo Soberano da Eternidade (`.../454`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 26 | Caçador de Ilusões de Outro Mundo (`.../14053`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 26 | Gene Supremo - Super gene (`.../15107`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Nanotecnologia Marcial (`.../200`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Nanotecnologia Marcial (`.../200`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 327 | Capítulo 1 (`.../12838`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.lang.Exception: Acesso negado. É necessário estar autenticado e ter VIP ativo para acessar este conteúdo. | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Acesso negado. É necessário estar autenticado e ter VIP ativo para acessar este conteúdo. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 26 entries |  |  |  |
| latest listing | PASS | 26 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Nanotecnologia Marcial, URL=`.../200` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 106/106 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 106/106 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.verdinha.wtf/.../34.png <redacted query values: width>` (image/jpeg, 53548 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../200` |  |  |  |
| details thumbnail URL | PASS | `https://api.verdinha.wtf/.../34.png <redacted query values: width>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Livres, Ação, Fantasia, Sobrenatural, Artes Marciais, Murim, Overpower, Sistema, Tela de Sistema |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Depois de ser desprezado e ter sua vida posta em perigo, um órfão do Culto Demoníaco, Cheon Yeo-Woon, recebe a visita inesperada de seu descendente do futuro, que insere uma nano máquina no corpo de Cheon Yeo-Woon, que muda drasticamente a vida de Cheon Yeo-Woon após sua ativação. A história da jornada de Cheon Yeo-Woon de contornar o Culto Demoníaco e se tornar o melhor artista marcial apenas começou. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 327 chapters |  |  |  |
| chapter dates | PASS | 327 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Acesso negado. É necessário estar autenticado e ter VIP ativo para acessar este conteúdo. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
