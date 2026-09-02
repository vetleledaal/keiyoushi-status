# Extension Validation Report

- Extension: tachiyomi-all.koharu-v1.4.20
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 1484902275639232927
- Source name: SchaleNetwork
- Source language: en
- Selected manga input: popular offset 0: [Kansai Orange (Arai Kei)] Knock-Up Game (`.../978190285bad`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 40 | [Kansai Orange (Arai Kei)] Knock-Up Game (`.../978190285bad`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 40 | [Yamanashi Musume (Shituzhi & Tulip)] I Spent the Whole Time Fucking My Girlfriend's Friend While She Went on a Trip 1 (`.../5a9520b29fc9`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 40 | [Shituzhi] Passionate Gyaru Fuckfest (`.../5b5a8975839e`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 40 | [Asakawa (Hayaku 〇〇 ni Naritai)] Gravity -Drawn to You- Episode 2 (`.../b1a89d0bd191`) |  | 10s+ |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | [Kansai Orange (Arai Kei)] Knock-Up Game (`.../978190285bad`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | [Kansai Orange (Arai Kei)] Knock-Up Game (`.../978190285bad`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../978190285bad`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.io.IOException: Open webview to refresh token | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.io.IOException: Open webview to refresh token | REVIEW | INSUFFICIENT_EVIDENCE |  |
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
| details description | PASS | Circles: Kansai Orange<br><br>Posted: Sunday, 7 May 2023 05:20 (CEST)<br>Pages: 73<br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Open webview to refresh token |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
