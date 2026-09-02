# Extension Validation Report

- Extension: tachiyomi-pt.montetai-v1.4.55
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 21
- Lint: 0
- Warnings: 0
- Skipped: 14
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7427054289018024291
- Source name: Monte Tai
- Source language: pt-BR
- Selected manga input: popular offset 0: Necromante: Rei dos Mortos (`.../necromante-rei-dos-mortos`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Necromante: Rei dos Mortos (`.../necromante-rei-dos-mortos`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Fui Confundido com um Gênio Monstruoso (`.../fui-confundido-com-um-genio-monstruoso`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Necromante: Rei dos Mortos (`.../necromante-rei-dos-mortos`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Necromante: Rei dos Mortos (`.../necromante-rei-dos-mortos`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | error | 0 |  | java.lang.NullPointerException | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Necromante: Rei dos Mortos, URL=`.../necromante-rei-dos-mortos` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://montetaiscanlator.xyz/.../capa-necromante.gif` (image/gif (format: 89a), 18138129 bytes, 380x566) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../necromante-rei-dos-mortos` |  |  |  |
| details thumbnail URL | PASS | `https://montetaiscanlator.xyz/.../capa-necromante.gif` |  |  |  |
| details author | PASS | 慢途的猪 |  |  |  |
| details artist | PASS | 黑鸟社 |  |  |  |
| details genres | PASS | Ação, Artes Marciais, Demônios, Harém, Magia, Manhua, Manhwa, Necromante, Obra MonteTai, Overpowered, Reencarnação, Shounen, Sistema |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | O jogo emergiu na realidade, as regras do mundo foram viradas de cabeça para baixo e a humanidade entrou na era de se tornar jogadores com o mundo configurado como um palco de jogo. A única maneira de se tornar um jogador é subir de nível para se tornar mais forte é a única maneira de chegar ao topo do mundo! No dia da fusão mundial, Lin Moyue escolheu assumir a única classe oculta, Necromante. A partir daí, Lin Moyu não morreria até que suas criaturas invocadas desaparecessem. “Eu me sento no trono de ossos como o Deus dos mortos e ando entre a vida e a morte. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
