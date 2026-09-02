# Extension Validation Report

- Extension: tachiyomi-pt.vegitoons-v1.4.12
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7104462396017692362
- Source name: Vegitoons
- Source language: pt-BR
- Selected manga input: popular offset 0: Estou Te Dizendo, Só Tenho Olhos Para Você (`.../15000`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 26 | Estou Te Dizendo, Só Tenho Olhos Para Você (`.../15000`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 26 | A Bruxa Noturna (`.../14061`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 26 | Limbo - Terra da Névoa (`.../15083`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 26 | Despertar Global: Começando com um Exército de Mortos-Vivos Sintetizado (`.../15925`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Estou Te Dizendo, Só Tenho Olhos Para Você (`.../15000`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Estou Te Dizendo, Só Tenho Olhos Para Você (`.../15000`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 27 | Capítulo 1 (`.../369037`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Estou Te Dizendo, Só Tenho Olhos Para Você, URL=`.../15000` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 105/105 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 105/105 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.vegitoons.black/.../capa` (image/webp (encoding: lossy), 162184 bytes, 1400x1875) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../15000` |  |  |  |
| details thumbnail URL | PASS | `https://api.vegitoons.black/.../capa` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Livres, Ação, Comédia, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Seguindo o conselho de seu amigo imaginário Jason, que lhe disse: "Trate todas as garotas como pedras", Park Jin-yong começa a ver todas as garotas como pedras. Mas então Sunwoo, uma estudante que não se parece com uma pedra, aparece diante dele,e pela primeira vez em cinco anos, a visão do rosto de uma garota faz os circuitos de felicidade de Jin-yong entrarem em ação... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 27 chapters |  |  |  |
| chapter dates | LINT | All 27 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=27 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://api.vegitoons.black/.../0 <redacted query values: tst>` (image/webp (container: extended), 806052 bytes, 800x15000) |  |  |  |
