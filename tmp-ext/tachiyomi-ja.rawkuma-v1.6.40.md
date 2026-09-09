# Extension Validation Report

- Extension: tachiyomi-ja.rawkuma-v1.6.40
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: natsuid
- Source ID: 5746834068092446709
- Source name: Rawkuma
- Source language: ja
- Selected manga input: popular offset 0: Tensei Shitara Joban de Shinu Naka Boss Datta – Heroine Kenzokuka de Ikinokoru (`.../%7B%22id%22:58247,%22slug%22:%22tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru%22%7D`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Tensei Shitara Joban de Shinu Naka Boss Datta – Heroine Kenzokuka de Ikinokoru (`.../%7B%22id%22:58247,%22slug%22:%22tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru%22%7D`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | One Piece (`.../%7B%22id%22:7,%22slug%22:%22one-piece%22%7D`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 23 | Nanashi Hime wa Fuda wo Mekuru (`.../%7B%22id%22:398685,%22slug%22:%22nanashi-hime-wa-fuda-wo-mekuru%22%7D`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Naisho no Yoshuu (`.../%7B%22id%22:398661,%22slug%22:%22naisho-no-yoshuu%22%7D`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tensei Shitara Joban de Shinu Naka Boss Datta – Heroine Kenzokuka de Ikinokoru (`.../%7B%22id%22:58247,%22slug%22:%22tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru%22%7D`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 180 | Chapter 1.1 (`.../chapter-1.1.158300`) |  | 1-10s |
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
| latest listing | PASS | 23 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Diamond no Kouzai, URL=`{"id":83472,"slug":"diamond-no-kouzai"}` at page 1 offset 22 and page 2 offset 1 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 95/95 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 95/95 manga have thumbnail URLs |  |  |  |
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
| chapters | PASS | 180 chapters |  |  |  |
| chapter dates | PASS | 180 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://rcdn.kyut.dev/.../1.webp` (image/webp (encoding: lossy), 171428 bytes, 960x1365) |  |  |  |
