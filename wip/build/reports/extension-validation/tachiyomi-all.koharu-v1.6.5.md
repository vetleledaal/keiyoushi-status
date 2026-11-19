# Extension Validation Report

- Extension: tachiyomi-all.koharu-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 1484902275639232927
- Source name: SchaleNetwork
- Source language: en
- Selected manga input: popular offset 0: [Kansai Orange (Arai Kei)] Knock-Up Game (`.../978190285bad`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | [Kansai Orange (Arai Kei)] Knock-Up Game (`.../978190285bad`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | [Yamanashi Musume (Shituzhi & Tulip)] I Spent the Whole Time Fucking My Girlfriend's Friend While She Went on a Trip 1 (`.../5a9520b29fc9`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | [diletta] Everyone Secretly Wants Ayumi, but She’s Only Got Eyes for Me (`.../3623d2aa8fa9`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | [Ocha Ocha Honpo (Chabashira Tatekichi)] My Friend's Dad's a Hunk 17 (`.../28086edbd44f`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [Kansai Orange (Arai Kei)] Knock-Up Game (`.../978190285bad`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Kansai Orange (Arai Kei)] Knock-Up Game (`.../978190285bad`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../978190285bad`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IllegalStateException: Captcha needs interaction, but the app isn't in the foreground | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IllegalStateException: Captcha needs interaction, but the app isn't in the foreground | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Kansai Orange (Arai Kei)\] Knock-Up Game, URL=`11246/978190285bad` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hikari.erocdn.net/.../320.jpg` (image/jpeg, 32041 bytes, 320x452) |  |  |  |
| details identity | PASS | Details preserved selected URL `11246/978190285bad` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hikari.erocdn.net/.../896.jpg` (image/jpeg, 139731 bytes, 896x1266) |  |  |  |
| details author | PASS | Kansai Orange |  |  |  |
| details artist | PASS | Arai Kei |  |  |  |
| details genres | PASS | Arai Kei, Kansai Orange, Anal, Cheating, Love Hotel, Netorare, Squirting, Ahegao ♀, Beauty Mark ♀, Big Breasts ♀, Blowjob ♀, Busty ♀, Lactation ♀, Mating Press ♀, Milf ♀, Nakadashi ♀, Paizuri ♀, Ponytail ♀, Pubic Hair ♀, X-ray ♀, Condom ♂, Ugly Bastard ♂, Group, Mmf Threesome, Uncensored |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Circles: Kansai Orange<br><br>Posted: 2023-05-07T03:20:31.989Z<br>Pages: 73<br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Captcha needs interaction, but the app isn't in the foreground |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
