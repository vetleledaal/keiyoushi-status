# Extension Validation Report

- Extension: tachiyomi-pt.vegitoons-v1.4.12
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: greenshit
- Source ID: 7104462396017692362
- Source name: Vegitoons
- Source language: pt-BR
- Selected manga input: latest offset 0: Me Escolha! (`.../1053`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 26 | Estou Te Dizendo, Só Tenho Olhos Para Você (`.../15000`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 26 | O Santo da Espada Reencarnou em uma Família Nobre de Magos (`.../15908`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 26 | Me Escolha! (`.../1053`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 26 | Eu Não Quero Aprender Maldições (`.../5578`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Me Escolha! (`.../1053`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Me Escolha! (`.../1053`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 218 | Capítulo 01 (`.../12557`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Me Escolha!, URL=`.../1053` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 105/105 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 105/105 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.vegitoons.black/.../capa` (image/jpeg, 706713 bytes, 780x1115) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1053` |  |  |  |
| details thumbnail URL | PASS | `https://api.vegitoons.black/.../capa` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Livres, Ação, Aventura, Fantasia, Shounen, Isekai, Estratégia, Família, Jogo, Magia, Sistema |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | <Pick Me Up!>, um jogo de gacha extremamente difícil. ‘Loki’, o 5º no ranking mundial, perde a cabeça ao limpar uma masmorra. O quê? Eu sou um personagem do jogo? Quando acordou, ‘Loki’ havia se tornado um herói de nível 1. Para retornar à Terra, ele precisa liderar heróis novatos para passar pelo 100º andar da masmorra! “Vocês mexeram com a pessoa errada.” A história do implacável mestre Loki, que não tolera uma única derrota, começa. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 218 chapters |  |  |  |
| chapter dates | LINT | All 218 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=218 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | latest: `https://api.vegitoons.black/.../capa` to `https://api.vegitoons.black/.../capa <redacted query values: tst>` (1 redirects) |  |  |  |
| page load | PASS | `https://api.vegitoons.black/.../0 <redacted query values: tst>` (image/jpeg, 633037 bytes, 1241x955) |  |  |  |
