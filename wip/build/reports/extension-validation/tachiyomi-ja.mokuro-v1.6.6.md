# Extension Validation Report

- Extension: tachiyomi-ja.mokuro-v1.6.6
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3707487231227345638
- Source name: Mokuro
- Source language: ja
- Selected manga input: popular offset 0: #ゾンビさがしてます (`<redacted URL #1: manga resource; relative; no scheme>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 1073 | #ゾンビさがしてます (`<redacted URL #1: selected resource; relative; no scheme>`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 1073 | レインアパート (`.../Rain%20Apartment`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | #ゾンビさがしてます (`<redacted URL #1: selected resource; relative; no scheme>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | #ゾンビさがしてます (`<redacted URL #1: selected resource; relative; no scheme>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | -Zombie-Sagashitemasu-01 (`<redacted URL #2: selected resource; relative; no scheme>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 173 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 1073 entries |  |  |  |
| latest listing | PASS | 1073 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=#ゾンビさがしてます, URL=`#Zombie Sagashitemasu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 2147/2147 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 2147/2147 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mokuro.moe/.../cover <redacted query values: path>` (image/jpeg, 41426 bytes, 247x350; server Content-Type: image/webp) |  |  |  |
| details identity | PASS | Details preserved selected URL `#Zombie Sagashitemasu` |  |  |  |
| details thumbnail URL | PASS | `https://mokuro.moe/.../cover <redacted query values: path>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | English: #ImLookingForZombies<br>Romaji: #Zombie Sagashitemasu<br>Synonyms: #LookingForZombies, #I'm Looking For Zombie, #좀비를 찾습니다<br><br>\[AniList\](https://anilist.co/.../150463)<br>\[MyAnimeList\](https://myanimelist.net/.../148820) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 173 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mokuro.moe/.../-Zombie-Sagashitemasu-01.cbz` (image/jpeg, 384291 bytes, 1080x1530; server Content-Type: application/vnd.comicbook+zip) |  |  |  |
