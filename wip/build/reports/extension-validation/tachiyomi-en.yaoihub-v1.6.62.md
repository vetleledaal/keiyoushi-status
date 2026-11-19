# Extension Validation Report

- Extension: tachiyomi-en.yaoihub-v1.6.62
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 6718273076571980404
- Source name: Yaoihub
- Source language: en
- Selected manga input: popular offset 0: Dear. Door [Uncensored Version R19+] (`.../169`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Dear. Door [Uncensored Version R19+] (`.../169`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | The Sacred Serpent’s Seduction (`.../77`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Shutline (`.../210`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Flashlight [Official] {Uncensored} (`.../159`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Dear. Door [Uncensored Version R19+] (`.../169`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Dear. Door [Uncensored Version R19+] (`.../169`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 166 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Dear. Door \[Uncensored Version R19+\], URL=`169` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://yaoihub.org/.../dear-door-uncensored-version-r19-350x476.jpg` (image/jpeg, 29690 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `169` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://yaoihub.org/.../dear-door-uncensored-version-r19-193x278.jpg` (image/jpeg, 12401 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adult, Demons, Fantasy, Full color, Mature, Mystery, Smut, Supernatural, Webtoon, Yaoi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | After the loss of his fiancée, police officer Kyungjoon resigned himself to a life of watering his house plants and catching two-bit criminals. But after a police investigation into a mysterious cult goes supernatural, he finds himself face-to-face with “Lord Cain,” a demon king in desperate need of mana in order to survive. Good news: Kyungjoon’s body serves as a “door” through which Cain can enter Hell and restore his mana. Bad news: the method of opening that door is… not so safe for work…<br><br>DEAR. DOOR<br><br>ⓒ Pluto<br><br>Published by TAPAS MEDIA 2021<br><br>Alternative Names: 디어 도어,Dear Door |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 166 chapters |  |  |  |
| chapter dates | PASS | 166 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.tomatomanga.com/.../0000.jpg` (image/webp (encoding: lossy), 37574 bytes, 641x967; server Content-Type: image/jpeg) |  |  |  |
