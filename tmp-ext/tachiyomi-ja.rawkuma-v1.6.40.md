# Extension Validation Report

- Extension: tachiyomi-ja.rawkuma-v1.6.40
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5746834068092446709
- Source name: Rawkuma
- Source language: ja
- Selected manga input: popular offset 0: Tensei Shitara Joban de Shinu Naka Boss Datta – Heroine Kenzokuka de Ikinokoru (`.../%7B%22id%22:58247,%22slug%22:%22tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru%22%7D`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Tensei Shitara Joban de Shinu Naka Boss Datta – Heroine Kenzokuka de Ikinokoru (`.../%7B%22id%22:58247,%22slug%22:%22tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru%22%7D`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Isekai Koushoku Musou Roku: Isekai Tensei no Chie to Chikara o, Tada Hitasura ×××× Suru Tame ni Tsukau (`.../%7B%22id%22:58163,%22slug%22:%22isekai-koushoku-musou-roku-isekai-tensei-no-chie-to-chikara-o-tada-hitasura-xxxx-suru-tame-ni-tsukau%22%7D`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Shiba-Tsuki Bukken (`.../%7B%22id%22:136479,%22slug%22:%22shiba-tsuki-bukken%22%7D`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Fairy Tail: 100 Years Quest (`.../%7B%22id%22:342161,%22slug%22:%22fairy-tail-100-years-quest%22%7D`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tensei Shitara Joban de Shinu Naka Boss Datta – Heroine Kenzokuka de Ikinokoru (`.../%7B%22id%22:58247,%22slug%22:%22tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru%22%7D`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 179 | Chapter 1.1 (`.../chapter-1.1.158300`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 96/96 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 96/96 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rawkuma.net/.../i501209.jpg` (image/jpeg, 31472 bytes, 281x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `{"id":58247,"slug":"tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru"}` |  |  |  |
| details thumbnail URL | PASS | `https://rawkuma.net/.../i501209.jpg` |  |  |  |
| details author | PASS | INASHITA Shinai |  |  |  |
| details artist | PASS | Seiji (Friendly Land) |  |  |  |
| details genres | PASS | Action, Adult, Adventure, Comedy, Fantasy, Harem, Romance, Shounen, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 事故に遭って目が覚めたら、ゲームの序盤で死ぬ中ボスに転生! やがて襲ってくるはずの勇者に殺されないために、××して女たちを眷属にして仲間を増やせ! 興奮必至の異世界サバイバルファンタジー!<br><br>Toyo Akutsu unfortunately died in an accident, but the next moment he was somehow reincarnated in the world of a famous RPG as Ashnold, the weakest of the Four Heavenly Kings. At this rate, he will lose to the Hero and die. Even if they were miraculously defeated, the Heroes would raise their level and return. To survive, he has no choice but to use the forbidden bug technique 「Betrayal Bug」 to make the Hero’s group become his followers and control their bodies and minds.<br><br>Will Akutsu (Ash) be able to subjugate all the heroines, build a harem, and survive the death flag event?<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 179 chapters |  |  |  |
| chapter dates | PASS | 179 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://rcdn.kyut.dev/.../1.webp` (image/webp (encoding: lossy), 171428 bytes, 960x1365) |  |  |  |
