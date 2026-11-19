# Extension Validation Report

- Extension: tachiyomi-pt.baozinho-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3067506059118108232
- Source name: Baozinho
- Source language: pt-BR
- Selected manga input: popular offset 0: Gênio do Teletransporte da Academia Mágica (`.../genio-do-teletransporte-da-academia-magica`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Gênio do Teletransporte da Academia Mágica (`.../genio-do-teletransporte-da-academia-magica`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | O Suporte Definitivo (`.../o-suporte-definitivo`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Gênio do Teletransporte da Academia Mágica (`.../genio-do-teletransporte-da-academia-magica`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Gênio do Teletransporte da Academia Mágica (`.../genio-do-teletransporte-da-academia-magica`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 57 | Capítulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 98 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Gênio do Teletransporte da Academia Mágica, URL=`genio-do-teletransporte-da-academia-magica` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.baozinho.com/.../0dab5f68f02e9379.png` (image/png, 20030266 bytes, 4000x5600) |  |  |  |
| details identity | PASS | Details preserved selected URL `genio-do-teletransporte-da-academia-magica` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.baozinho.com/.../0dab5f68f02e9379.png` |  |  |  |
| details author | PASS | Eunmilhi |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Ação, Aventura, Fantasia, Escolar, Sistema de Jogo, Magia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Eu, reencarnado logo no pior personagem de todos, Baek Yuseol?!<br>Dificuldade absurda, desempenho deplorável.<br>Em um mundo onde todo mundo usa magia, só por ser incapaz de conjurar feitiços,<br>ele é o maior lixo da história dos jogos, um personagem que até os jogadores veteranos evitam... Baek Yuseol.<br><br>\\[Com a Conclusão de um Final Ruim, 90% do Aether World foi destruído.\\]<br>\\[Que alcance o Final Verdadeiro.\\]<br><br>E eu acabei possuindo o corpo desse mesmo Baek Yuseol.<br><br>A única habilidade mágica concedida a mim... "Teletransporte".<br>Eu sou o mago mais rápido do mundo.<br>Agora, preciso sobreviver na Academia Stella, um lugar infestado de magos geniais!<br><br>**Nomes alternativos:**<br>- Gênio do Teletransporte da Academia de Magia<br>- Quick Teleporting Genius from Magic School<br>- Magic Academy's Genius Blinker<br>- I Became a Flashing Genius at the Magic Academy<br>- 마법학교 앞점멸 천재가 되었다<br>- 魔法学院的闪现天才 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 57 chapters |  |  |  |
| chapter dates | PASS | 57 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 98 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.baozinho.com/.../e0ac8137edf4214c.webp` (image/webp (encoding: lossy), 316050 bytes, 1080x3000) |  |  |  |
