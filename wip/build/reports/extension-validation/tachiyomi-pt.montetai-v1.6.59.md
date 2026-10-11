# Extension Validation Report

- Extension: tachiyomi-pt.montetai-v1.6.59
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 7427054289018024291
- Source name: Monte Tai
- Source language: pt-BR
- Selected manga input: popular offset 0: Necromante: Rei dos Mortos (`.../1895`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | Necromante: Rei dos Mortos (`.../1895`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 16 | Logando 10.000 Anos No Futuro (`.../2893`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 16 | Um Pintor Que Desenha Dungeons (`.../4659`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 16 | Evolução de Mascotes Monstruosos (`.../2489`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Necromante: Rei dos Mortos (`.../1895`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Necromante: Rei dos Mortos (`.../1895`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 316 | Capitulo 01 (`.../capitulo-01`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Necromante: Rei dos Mortos, URL=`1895` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://montetaiscanlator.xyz/.../capa-necromante.gif` (image/gif (format: 89a), 18138129 bytes, 380x566) |  |  |  |
| details identity | PASS | Details preserved selected URL `1895` |  |  |  |
| details thumbnail URL | PASS | `https://montetaiscanlator.xyz/.../capa-necromante.gif` |  |  |  |
| details author | PASS | 慢途的猪 |  |  |  |
| details artist | PASS | 黑鸟社 |  |  |  |
| details genres | PASS | Ação, Artes Marciais, Demônios, Harém, Magia, Manhua, Manhwa, Necromante, Obra MonteTai, Overpowered, Reencarnação, Shounen, Sistema |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | O jogo emergiu na realidade, as regras do mundo foram viradas de cabeça para baixo e a humanidade entrou na era de se tornar jogadores com o mundo configurado como um palco de jogo. A única maneira de se tornar um jogador é subir de nível para se tornar mais forte é a única maneira de chegar ao topo do mundo! No dia da fusão mundial, Lin Moyue escolheu assumir a única classe oculta, Necromante. A partir daí, Lin Moyu não morreria até que suas criaturas invocadas desaparecessem. “Eu me sento no trono de ossos como o Deus dos mortos e ando entre a vida e a morte. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 316 chapters |  |  |  |
| chapter dates | PASS | 316 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.montetaiscanlator.xyz/.../1---_19553_0_0.jpg` (image/jpeg, 281550 bytes, 1333x1000) |  |  |  |
