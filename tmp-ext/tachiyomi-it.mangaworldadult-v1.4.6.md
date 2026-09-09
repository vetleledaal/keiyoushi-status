# Extension Validation Report

- Extension: tachiyomi-it.mangaworldadult-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangaworld
- Source ID: 392961957042768607
- Source name: MangaworldAdult
- Source language: it
- Selected manga input: latest offset 0: Matrimoney Game (`.../matrimoney-game`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 16 | Sextudy Group (`.../sextudy-group`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 16 | A Pervert's Daily Life (`.../a-pervert-s-daily-life`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 16 | Matrimoney Game (`.../matrimoney-game`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 16 | I'm the Only Man in This Clan?! (`.../i-m-the-only-man-in-this-clan`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Matrimoney Game (`.../matrimoney-game`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Matrimoney Game (`.../matrimoney-game`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 95 | Capitolo 01 (`.../6758c7f9c68cc93afea5ac21 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 219 |  |  | 1-10s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Matrimoney Game, URL=`.../matrimoney-game` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.mangaworld.mx/.../67578ad997e2723a59fe16ca.jpg <redacted query values: 1788965961711>` (image/jpeg, 43143 bytes, 270x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../matrimoney-game` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.mangaworld.mx/.../67578ad997e2723a59fe16ca.jpg <redacted query values: 1788965961711>` |  |  |  |
| details author | PASS | Studio Moon |  |  |  |
| details artist | PASS | one team |  |  |  |
| details genres | PASS | Adulti, Drammatico, Maturo, Seinen, Smut |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Un gioco per soli coppie sposate, i soldi in palio minacceranno la loro unione?<br><br>Titoli alternativi: Couple Game (Studio Moon), Couple Games (Studio Moon), 부부게임 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 95 chapters |  |  |  |
| chapter dates | PASS | 95 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 219 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.mangaworld.mx/.../1.jpg` (image/jpeg, 1835 bytes, 720x500) |  |  |  |
