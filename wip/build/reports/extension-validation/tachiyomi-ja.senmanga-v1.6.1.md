# Extension Validation Report

- Extension: tachiyomi-ja.senmanga-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7715542271185249444
- Source name: Sen Manga
- Source language: ja
- Selected manga input: popular offset 0: Tensei Shitara Joban de Shinu Naka Boss Datta - Heroine Kenzokuka de Ikinokoru (`.../tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Tensei Shitara Joban de Shinu Naka Boss Datta - Heroine Kenzokuka de Ikinokoru (`.../tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Saijaku na Boku wa "Kabenuke Bugs" de Nariagaru (`.../saijaku-na-boku-wa-kabenuke-bugs-de-nariagaru`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 39 | Danzai Sareru Koushaku Reijou, Umarekawatte Last Boss no Ouhi-sama no Kodomo ni Narimasu (`.../danzai-sareru-koushaku-reijou-umarekawatte-last-boss-no-ouhi-sama-no-kodomo-ni-narimasu`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | Tensei Shitara Joban de Shinu Naka Boss Datta - Heroine Kenzokuka de Ikinokoru (`.../tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tensei Shitara Joban de Shinu Naka Boss Datta - Heroine Kenzokuka de Ikinokoru (`.../tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 190 | Chapter 1.1 (`.../1.1.158300`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 39 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tensei Shitara Joban de Shinu Naka Boss Datta - Heroine Kenzokuka de Ikinokoru, URL=`tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
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
| chapters | PASS | 190 chapters |  |  |  |
| chapter dates | PASS | 190 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.rawkuma.com/.../1.webp` (image/webp (encoding: lossy), 171428 bytes, 960x1365) |  |  |  |
