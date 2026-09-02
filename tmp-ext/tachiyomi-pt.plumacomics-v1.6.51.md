# Extension Validation Report

- Extension: tachiyomi-pt.plumacomics-v1.6.51
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 2
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7420625896970441024
- Source name: Pluma Comics
- Source language: pt-BR
- Selected manga input: popular offset 0:  (`.../682`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Necromante: Rei dos Mortos (`.../682`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Eu mudo de carreira aleatoriamente toda semana. (`.../165`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Invocador de Demônios do Abismo (`.../173`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Ascensão do Rei Cogumelo (`.../32`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Necromante: Rei dos Mortos (`.../682`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 |  (`.../682`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 303 | Capítulo 1 (`.../67865`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Necromante: Rei dos Mortos, URL=`682` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 120/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://plumacomics.cloud/.../necromante-o-rei-da-calamidade.webp` (image/webp (encoding: lossy), 95288 bytes, 460x650) |  |  |  |
| details identity | PASS | Details preserved selected URL `682` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://plumacomics.cloud/.../necromante-o-rei-da-calamidade.webp` was not downloaded |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | O jogo emergiu na realidade, as regras do mundo foram viradas de cabeça para baixo e a humanidade entrou na era de se tornar jogadores com o mundo configurado como um palco de jogo. A única maneira de se tornar um jogador é subir de nível para se tornar mais forte é a única maneira de chegar ao topo do mundo! No dia da fusão mundial, Lin Moyue escolheu assumir a única classe oculta, Necromante. A partir daí, Lin Moyue não morreria até que suas criaturas invocadas desaparecessem. “Eu me sento no trono de ossos como o Deus dos mortos e ando entre a vida e a morte.” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 303 chapters |  |  |  |
| chapter dates | PASS | 303 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.orionmanhuas.com/.../0001.jpg <redacted query values: expires and sig>` (image/jpeg, 2674695 bytes, 800x16298) |  |  |  |
