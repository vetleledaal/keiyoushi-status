# Extension Validation Report

- Extension: tachiyomi-pt.mangasbrasuka-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 20
- Lint: 1
- Warnings: 1
- Skipped: 13
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9021069622172695017
- Source name: Mangas Brasuka
- Source language: pt-BR
- Selected manga input: popular offset 0: Blue Lock (`.../blue-lock`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 455 | Blue Lock (`.../blue-lock`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 100 | FOG LAND (`.../fog-land`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Blue Lock (`.../blue-lock`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Blue Lock (`.../blue-lock`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 455 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Blue Lock, URL=`blue-lock` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 556/556 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 556/556 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://aurora.snipercache.com/.../1787714990744-blue-lock.webp <redacted query values: sig and exp>` (image/webp (encoding: lossy), 268674 bytes, 900x1346) |  |  |  |
| details identity | PASS | Details preserved selected URL `blue-lock` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://aurora.snipercache.com/.../1787714990744-blue-lock.webp <redacted query values: sig and exp>` (image/webp (encoding: lossy), 268674 bytes, 900x1346) |  |  |  |
| details author | PASS | Kaneshiro Muneyuki, Nomura Yuusuke |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Drama, Esportes |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Após uma derrota desastrosa na Copa do Mundo de 2018, a seleção japonesa luta para se reerguer. Mas o que está faltando? Um atacante absoluto, capaz de conduzi-los à vitória. A União de Futebol do Japão está determinada a criar um jogador que tenha fome de gols e sede de vitória, alguém que possa ser o elemento decisivo para virar uma partida perdida... e, para isso, reuniu 300 dos jovens mais talentosos do país. Quem surgirá para liderar o time... e será que conseguirá superar, na força e no ego, todos aqueles que cruzarem seu caminho? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
