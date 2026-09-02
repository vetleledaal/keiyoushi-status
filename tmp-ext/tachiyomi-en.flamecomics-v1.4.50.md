# Extension Validation Report

- Extension: tachiyomi-en.flamecomics-v1.4.50
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8531542650987673943
- Source name: Flame Comics
- Source language: en
- Selected manga input: popular offset 0: 30 Years Have Passed Since the Prologue (`.../165`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | 30 Years Have Passed Since the Prologue (`.../165`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Destined Murderer (`.../148`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Is It Bad That the Main Character's a Roleplayer? (`.../163`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 30 Years Have Passed Since the Prologue (`.../165`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 30 Years Have Passed Since the Prologue (`.../165`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 12 | Chapter 1 - Prologue (`.../9ead4fdb0be9dedf`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 25 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=30 Years Have Passed Since the Prologue, URL=`.../165` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.flamecomics.xyz/.../thumbnail.webp <redacted query values: 1786358505>` (image/webp (encoding: lossless), 1048746 bytes, 800x1039) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../165` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.flamecomics.xyz/.../thumbnail.webp <redacted query values: 1786358505>` |  |  |  |
| details author | PASS | Markellaha |  |  |  |
| details artist | PASS | Studio GreenKirin |  |  |  |
| details genres | PASS | Manhwa, Academy, Action, Adventure, Comedy, Fantasy, Harem, Mystery, School Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | I 'transmigrated' into a world I've never seen.I spent 30 years, thinking it was a traditional RPG.Having retired after becoming a war hero, I was now waiting to meet the ending.But somehow-The 30 years I've spent till now was just a prologue, and this world was actually an academy genre?<br><br>Alternative Names:<br>- 30 Years Since the Prologue |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | PASS | 12 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.flamecomics.xyz/.../30YRS-1-00.jpg <redacted query values: 1785000643>` (image/jpeg, 432571 bytes, 1778x1000) |  |  |  |
