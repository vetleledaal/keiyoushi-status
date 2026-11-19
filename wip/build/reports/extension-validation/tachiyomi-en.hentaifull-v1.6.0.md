# Extension Validation Report

- Extension: tachiyomi-en.hentaifull-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5224200195412086514
- Source name: HentaiFull
- Source language: en
- Selected manga input: popular offset 0: Stop Smoking (`.../stop-smoking`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | Stop Smoking (`.../stop-smoking`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | I Will Teach You Self Defense (`.../i-will-teach-you-self-defense`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | I Didn’t Sign Up For This Raw (`.../i-didnt-sign-up-for-this-raw`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Stop Smoking (`.../stop-smoking`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Stop Smoking (`.../stop-smoking`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 112 | Chapter 1 (`.../chapter-1-ch70553`) |  | <1s |
| pages | `getPageList(chapter)` | success | 344 |  |  | <1s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Stop Smoking, URL=`stop-smoking` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 78/78 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 78/78 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.hentaifull.net/.../stop-smoking.jpg` (image/jpeg, 14587 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `stop-smoking` |  |  |  |
| details thumbnail URL | PASS | `https://media.hentaifull.net/.../stop-smoking.jpg` |  |  |  |
| details author | PASS | Momobird |  |  |  |
| details artist | PASS | Momobird |  |  |  |
| details genres | PASS | Manhwa, Hentai, Comedy, Drama, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Even though I get teased for being short and bullied at work, my house is paradise!!<br><br>... I thought it was like that, but the neighbors are smoking like crazy!!<br><br>I couldn't stand it anymore and went to look for them, but I met a fierce-looking, heavy-duty gangster, Na Se-young!<br><br>**Alternative Names:**<br>- 담배피지 마세요!<br>- Someone Stop Her!<br>- Deja de fumar |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 112 chapters |  |  |  |
| chapter dates | PASS | 112 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 344 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.hentaifull.net/.../0.jpg` (image/jpeg, 52837 bytes, 720x500) |  |  |  |
