# Extension Validation Report

- Extension: tachiyomi-en.kuramanga-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 2
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7076475127850729187
- Source name: KuraManga
- Source language: en
- Selected manga input: popular offset 0: I’ll Be The Matriarch In This Life (`.../illbethematriarchinthislife`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | I’ll Be The Matriarch In This Life (`.../illbethematriarchinthislife`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 31 | unOrdinary (`.../unordinary`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 32 | The Accumulated Snow Is Incredibly Heavy (`.../theaccumulatedsnowisincrediblyheavy`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | I Shall Master This Family (`.../ishallmasterthisfamily`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I’ll Be The Matriarch In This Life (`.../illbethematriarchinthislife`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 260 | Chapter 0 (`.../chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 31 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=I’ll Be The Matriarch In This Life, URL=`.../illbethematriarchinthislife` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Against All Odds, URL=`.../againstallodds` at page 1 offset 21 and page 2 offset 6, title=A Wall Street Genius’s Final Investment Playbook, URL=`.../awallstreetgeniussfinalinvestmentplaybook` at page 1 offset 22 and page 2 offset 12, title=The Saint Who Levels Up as a Necromancer, URL=`.../thesaintwholevelsupasanecromancer` at page 1 offset 23 and page 2 offset 13, title=After Being Expelled, I Awakened a Barrier Skill and Became Unmatched, URL=`.../afterbeingexpellediawakenedabarrierskillandbecameunmatched` at page 1 offset 24 and page 2 offset 14, title=Forced To Become The Heavenly Demon At Swordpoint, URL=`.../forcedtobecometheheavenlydemonatswordpoint` at page 1 offset 25 and page 2 offset 15, title=The Sword Emperor’s Path to Namgung, URL=`.../theswordemperorspathtonamgung` at page 1 offset 26 and page 2 offset 16, title=Reincarnation of the Divine Demon, URL=`.../reincarnationofthedivinedemon` at page 1 offset 27 and page 2 offset 17, title=The Magic Theory of the Regressed Sword Saint, URL=`.../themagictheoryoftheregressedswordsaint` at page 1 offset 28 and page 2 offset 18, title=The Heavenly Demon’s Otherworld Livestream, URL=`.../theheavenlydemonsotherworldlivestream` at page 1 offset 29 and page 2 offset 19, title=Feasting Lord in Another world, URL=`.../feastinglordinanotherworld` at page 1 offset 30 and page 2 offset 20 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 75/75 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 75/75 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://shadowabyss.com/.../cover.jpg <redacted query values: class>` (image/jpeg, 102018 bytes, 500x715) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../illbethematriarchinthislife` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://shadowabyss.com/.../cover.jpg` (image/jpeg, 234332 bytes, 720x1030) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasy, Historical, Shoujo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Florentia was born illegitimate into the wealthiest family in the empire and spent years grateful for the scraps of it. Then her father died, the relatives left her on a doorstep, and the great house she had been so proud of collapsed completely. She drank about it. A carriage finished the job. Now she is seven, everything is standing again... and the Second Prince who ruined her family last time will not stop following her around! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 260 chapters |  |  |  |
| chapter dates | PASS | 260 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://shadowabyss.com/.../0001.jpg` (image/jpeg, 725552 bytes, 720x8100) |  |  |  |
