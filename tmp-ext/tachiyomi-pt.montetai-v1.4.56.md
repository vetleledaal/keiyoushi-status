# Extension Validation Report

- Extension: tachiyomi-pt.montetai-v1.4.56
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 31
- Lint: 0
- Warnings: 2
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 7427054289018024291
- Source name: Monte Tai
- Source language: pt-BR
- Selected manga input: latest offset 0: Me Escolha, Infinite Gacha (`.../me-escolhe`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Necromante: Rei dos Mortos (`.../necromante-rei-dos-mortos`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Me Escolha, Infinite Gacha (`.../me-escolhe`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Me Escolha, Infinite Gacha (`.../me-escolhe`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Me Escolha, Infinite Gacha (`.../me-escolhe`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 218 | Capitulo 1 (`https://montetaiscanlator.xyz/.../capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Me Escolha, Infinite Gacha, URL=`.../me-escolhe` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://montetaiscanlator.xyz/.../8896-350x476.png` (image/png, 311614 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../me-escolhe` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://montetaiscanlator.xyz/.../8896.png` (image/png, 2376243 bytes, 1048x1501) |  |  |  |
| details author | PASS | Cho U-Ne,Hermod |  |  |  |
| details artist | PASS | Wasakbasak |  |  |  |
| details genres | PASS | Ação, Aventura, Comédia, Estratégia, Fantasia, Jogo, Reencarnação, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | um jogo de gacha extremamente difícil. ‘Loki’, o 5º no ranking mundial, perde a cabeça ao limpar uma masmorra. O quê? Eu sou um personagem do jogo? Quando acordou, ‘Loki’ havia se tornado um herói de nível 1. Para retornar à Terra, ele precisa liderar heróis novatos para passar pelo 100º andar da masmorra! “Vocês mexeram com a pessoa errada.” A história do implacável mestre Loki, que não tolera uma única derrota, começa. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 218 chapters |  |  |  |
| chapter dates | PASS | 218 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 218 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.montetaiscanlator.xyz/.../1---8037b890b4f5f678550f279903b2f2e4.jpg` (image/jpeg, 151313 bytes, 1241x955) |  |  |  |
