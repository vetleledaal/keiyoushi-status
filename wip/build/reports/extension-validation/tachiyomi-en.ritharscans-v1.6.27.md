# Extension Validation Report

- Extension: tachiyomi-en.ritharscans-v1.6.27
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 1
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: keyoapp
- Source ID: 8220771912098311271
- Source name: RitharScans
- Source language: en
- Selected manga input: popular offset 0: Geemu Chuuban De Shinu Akuyaku Kizoku Ni Tensei Shita Node, Hazure Skill "tame" Wo Kushi Shite Saikyou Wo Mezashite Mita (`.../3c5afb0a-0f72-4c33-a5fc-2113fdf48d9e`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Geemu Chuuban De Shinu Akuyaku Kizoku Ni Tensei Shita Node, Hazure Skill "tame" Wo Kushi Shite Saikyou Wo Mezashite Mita (`.../3c5afb0a-0f72-4c33-a5fc-2113fdf48d9e`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Saikyou no Kenjin, Henkyou no Mura Musume ni Umarekawaru. (`.../b34cc0ea-8eee-473d-9d4a-0ec5ad2d28b2`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Saikyou no Seibishi (`.../db3717d9-3a0c-4cb4-b341-01270daff8fc`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Behind the Scenes of the Hero's Journey (`.../21a44b15-98d3-4fcd-b70c-dc0e4d709236`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Geemu Chuuban De Shinu Akuyaku Kizoku Ni Tensei Shita Node, Hazure Skill "tame" Wo Kushi Shite Saikyou Wo Mezashite Mita (`.../3c5afb0a-0f72-4c33-a5fc-2113fdf48d9e`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 65 | Chapter 01 (`.../96035d57-f1bd-4431-a65b-35331a57367c`) |  | <1s |
| pages | `getPageList(chapter)` | success | 60 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | SKIP | HTTP error 404 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 88/88 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 88/88 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.ritharscans.com/.../300x450.webp` (image/webp (encoding: lossy), 29450 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../3c5afb0a-0f72-4c33-a5fc-2113fdf48d9e` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.ritharscans.com/.../600x900.webp` (image/webp (encoding: lossy), 74566 bytes, 600x900) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Japanese, Action, Comedy, Drama, Fantasy, Harem, Isekai, Adventure |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
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
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.ritharscans.com/.../001.jpg` (image/jpeg, 864842 bytes, 1115x1600) |  |  |  |
