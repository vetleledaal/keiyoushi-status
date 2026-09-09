# Extension Validation Report

- Extension: tachiyomi-pt.verdinha-v1.4.12
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: greenshit
- Source ID: 3410911112857734134
- Source name: Verdinha
- Source language: pt-BR
- Selected manga input: latest offset 0: Demônio Celestial Cósmico 3077 (`.../7679`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 26 | Nanotecnologia Marcial (`.../200`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 26 | O Antigo Soberano da Eternidade (`.../454`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 26 | Demônio Celestial Cósmico 3077 (`.../7679`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 26 | Guia de Sobrevivência do Caçador de Bestas Demoníacas (`.../14715`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Demônio Celestial Cósmico 3077 (`.../7679`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Demônio Celestial Cósmico 3077 (`.../7679`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 103 | Capítulo 1 (`.../95529`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.lang.Exception: Acesso negado. É necessário estar autenticado e ter VIP ativo para acessar este conteúdo. | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Demônio Celestial Cósmico 3077, URL=`.../7679` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 105/105 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 105/105 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.verdinha.wtf/.../67d7008508803.png <redacted query values: width>` (image/jpeg, 37464 bytes, 300x389) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../7679` |  |  |  |
| details thumbnail URL | PASS | `https://api.verdinha.wtf/.../67d7008508803.png <redacted query values: width>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Livres, Ação, Comédia, Fantasia, Artes Marciais, Demônios, Ficção Científica |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Após incontáveis anos, o Demônio Celestial, selado no Monte Tai, finalmente despertou, apenas para descobrir que a humanidade havia há muito abandonado a Terra encharcada de radiação e agora explorava os confins da galáxia. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 103 chapters |  |  |  |
| chapter dates | PASS | 103 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Acesso negado. É necessário estar autenticado e ter VIP ativo para acessar este conteúdo. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
