# Extension Validation Report

- Extension: tachiyomi-pt.hanmokkuscan-v1.6.14
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2374282752350973310
- Source name: Hanmokku Scan
- Source language: pt-BR
- Selected manga input: popular offset 0: Cultivator From the Future (`.../cultivator-from-future.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Cultivator From the Future (`.../cultivator-from-future.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 15 | I Reincarnated as a Minor Villain in My Favorite Game World – Using My Game Knowledge to Live Freely, I Somehow Ended Up Famous Everywhere (`.../i-reincarnated-as-minor-villain-in-my.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Cultivator From the Future (`.../cultivator-from-future.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 89 | Capítulo 00 - Prólogo (`.../capitulo-00.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 7 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 25/25 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 25/25 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../eb5c44ac-9081-4068-ab75-a7a406207207.jpg.512.jpg` (image/jpeg, 23322 bytes, 150x200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cultivator-from-future.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../eb5c44ac-9081-4068-ab75-a7a406207207.jpg.512.jpg` (image/jpeg, 136044 bytes, 512x683) |  |  |  |
| details author | PASS | Green Cream Anime |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Artes Marciais, Fantasia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Sinopse: Tecnologia alienígena e artes marciais humanas, qual das duas será a mais forte no final? Após a invasão do alienígenas a humano se viu a beira da extinção. Durante a primeira investida os humanos aguentaram com muitas baixas, mas com a segunda investida o nosso protagonista Tang Ming morreu. Ao desperta descobre que ganhou uma segunda chance e agora terá 20 anos para se preparar para o ataque. Para ficar mais forte, ele terá ajuda da deusa do passado, uma garota genial, uma moça linda de pernas longas e uma princesa estrangeira estão todas sob o seu comando.<br><br>Nome(s) alternativo(s): Magician From the Future, 这个修士来自未来 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 10 name |  |  |  |
| chapters | PASS | 89 chapters |  |  |  |
| chapter dates | PASS | 89 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../01.jpg` (image/jpeg, 1452919 bytes, 1280x4347) |  |  |  |
