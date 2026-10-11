# Extension Validation Report

- Extension: tachiyomi-pt.egotoons-v1.6.10
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
- Source ID: 4749792168996703143
- Source name: Ego Toons
- Source language: pt-BR
- Selected manga input: popular offset 0: O Gênio Supremo da Academia (`.../12598`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | O Gênio Supremo da Academia (`.../12598`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Roteiro Quebrado (`.../11287`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | O vilão de cabelos amarelos no romance da personagem principal feminina quer felicidade (`.../11334`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Transmissão do Deus da Espada (`.../520`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | O Gênio Supremo da Academia (`.../12598`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | O Gênio Supremo da Academia (`.../12598`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 113 | Capítulo 1 (`.../1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=O Gênio Supremo da Academia, URL=`.../12598` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://egotoons.com/.../capa <redacted query values: v>` (image/webp (encoding: lossy), 50058 bytes, 552x780) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12598` |  |  |  |
| details thumbnail URL | PASS | `https://egotoons.com/.../capa <redacted query values: v>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | manhua, Ação, Drama, Fantasia, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Sinopse traduzida Shuichi era um estudante comum do ensino médio na sociedade moderna. Após perder o pai, lutou desesperadamente para proteger sua mãe e sua irmã. No entanto, sofreu um bullying brutal na escola e acabou perdendo a vida em um acidente inesperado. Quando abriu os olhos novamente, descobriu que havia reencarnado como Lucas Ryan, um jovem nobre de outro mundo! Ao que tudo indica, Lucas havia despertado a ira do Deus da Magia e morreu sem jamais receber o dom da magia. Agora, a alma de Shuichi habita seu corpo e, ao mesmo tempo, recebe a bênção de Marte, o Deus da Guerra! Porém, nesse novo mundo, os magos são reverenciados, enquanto aqueles que seguem o caminho das artes marciais são desprezados. Depois de ganhar uma segunda chance como Lucas, Shuichi se recusa a passar a nova vida sendo menosprezado por todos ao seu redor. Se a magia reina absoluta neste mundo, ele seguirá um caminho diferente. **Dominando as artes marciais, Lucas conquistará a glória com os próprios punhos! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 113 chapters |  |  |  |
| chapter dates | PASS | 113 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://api.egotoons.com/.../0 <redacted query values: tst>` (image/webp (encoding: lossy), 933044 bytes, 800x14940) |  |  |  |
