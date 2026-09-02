# Extension Validation Report

- Extension: tachiyomi-en.ritharscans-v1.6.24
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8220771912098311271
- Source name: RitharScans
- Source language: en
- Selected manga input: popular offset 0: Geemu Chuuban De Shinu Akuyaku Kizoku Ni Tensei Shita Node, Hazure Skill "tame" Wo Kushi Shite Saikyou Wo Mezashite Mita (`.../3c5afb0a-0f72-4c33-a5fc-2113fdf48d9e`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 5 | Geemu Chuuban De Shinu Akuyaku Kizoku Ni Tensei Shita Node, Hazure Skill "tame" Wo Kushi Shite Saikyou Wo Mezashite Mita (`.../3c5afb0a-0f72-4c33-a5fc-2113fdf48d9e`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 262 | Geemu Chuuban De Shinu Akuyaku Kizoku Ni Tensei Shita Node, Hazure Skill "tame" Wo Kushi Shite Saikyou Wo Mezashite Mita (`.../3c5afb0a-0f72-4c33-a5fc-2113fdf48d9e`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Geemu Chuuban De Shinu Akuyaku Kizoku Ni Tensei Shita Node, Hazure Skill "tame" Wo Kushi Shite Saikyou Wo Mezashite Mita (`.../3c5afb0a-0f72-4c33-a5fc-2113fdf48d9e`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 65 | Chapter 01 (`.../96035d57-f1bd-4431-a65b-35331a57367c`) |  | <1s |
| pages | `getPageList(chapter)` | success | 60 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | PASS | 262 entries |  |  |  |
| search listing | SKIP | HTTP error 404 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 267/267 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 267/267 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ritharscans.com/.../300x450.webp <redacted query values: w>` (image/webp (encoding: lossy), 67498 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../3c5afb0a-0f72-4c33-a5fc-2113fdf48d9e` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Drama, Fantasy, harem, Isekai, Adventure |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | The protagonist was reincarnated as a villainous aristocrat from the popular romance action RPG "Symphonia of Swords and Magic"! Although he is destined to be defeated midway through the game, he develops the hidden power of the skill "Tame" and grows at an astonishing speed. Eventually, he gains powers that surpass even the final boss, and as he rewrites his fate, the main heroines start to gather around him for some reason.<br><br>Alternative Titles:<br>- Sign in to add Type Manga Score 7.54 Publication Status Releasing Users Tracking 84 Chapters Available 4 I Reincarnated as a Villainous Noble Who Died in the Mid Game, So I Used the Useless Skill “Tame” to Become the Strongest<br>- ゲーム中盤で死ぬ悪役貴族に転生したので、外れスキル【テイム】を駆使して最強を目指してみた, |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 65 chapters |  |  |  |
| chapter dates | PASS | 65 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 60 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ritharscans.com/.../001.jpg` (image/jpeg, 864842 bytes, 1115x1600) |  |  |  |
