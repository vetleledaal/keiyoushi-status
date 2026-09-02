# Extension Validation Report

- Extension: tachiyomi-ja.senmanga-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 33
- Lint: 1
- Warnings: 0
- Skipped: 1
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7715542271185249444
- Source name: Sen Manga
- Source language: ja
- Selected manga input: popular offset 0: Tensei Shitara Joban de Shinu Naka Boss Datta - Heroine Kenzokuka de Ikinokoru (`.../tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Tensei Shitara Joban de Shinu Naka Boss Datta - Heroine Kenzokuka de Ikinokoru (`.../tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Isekai Koushoku Musou Roku: Isekai Tensei no Chie to Chikara o, Tada Hitasura ×××× Suru Tame ni Tsukau (`.../isekai-koushoku-musou-roku-isekai-tensei-no-chie-to-chikara-o-tada-hitasura-xxxx-suru-tame-ni-tsukau`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 39 | Kaoru Hana wa Rin to Saku (`.../kaoru-hana-wa-rin-to-saku`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 24 | Tensei Shitara Joban de Shinu Naka Boss Datta - Heroine Kenzokuka de Ikinokoru (`.../tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Tensei Shitara Joban de Shinu Naka Boss Datta - Heroine Kenzokuka de Ikinokoru (`.../tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 179 | Chapter 1.1 (`.../1.1.158300`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 15 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 39 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tensei Shitara Joban de Shinu Naka Boss Datta - Heroine Kenzokuka de Ikinokoru, URL=`tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | HTTP error 500 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 111/111 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 111/111 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rawkuma.net/.../i501209.jpg` (image/jpeg, 31472 bytes, 281x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru` |  |  |  |
| details thumbnail URL | PASS | `https://rawkuma.net/.../i501209.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action,Adult,Adventure,Comedy,Fantasy,Harem,Romance,Shounen |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 事故に遭って目が覚めたら、ゲームの序盤で死ぬ中ボスに転生! やがて襲ってくるはずの勇者に殺されないために、××して女たちを眷属にして仲間を増やせ! 興奮必至の異世界サバイバルファンタジー! Toyo Akutsu unfortunately died in an accident, but the next moment he was somehow reincarnated in the world of a famous RPG as Ashnold, the weakest of the Four Heavenly Kings. At this rate, he will lose to the Hero and die. Even if they were miraculously defeated, the Heroes would raise \[…\] |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 179 chapters |  |  |  |
| chapter dates | PASS | 179 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://rcdn.kyut.dev/.../1.webp` (image/webp (encoding: lossy), 171428 bytes, 960x1365) |  |  |  |
