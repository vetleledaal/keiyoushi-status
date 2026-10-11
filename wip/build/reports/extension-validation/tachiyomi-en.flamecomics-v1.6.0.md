# Extension Validation Report

- Extension: tachiyomi-en.flamecomics-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8531542650987673943
- Source name: Flame Comics
- Source language: en
- Selected manga input: popular offset 0: 30 Years Have Passed Since the Prologue (`.../165`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 154 | 30 Years Have Passed Since the Prologue (`.../165`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | The Sand Mage of the Scorched Desert (`.../161`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 30 Years Have Passed Since the Prologue (`.../165`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 30 Years Have Passed Since the Prologue (`.../165`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 18 | Chapter 1 - Prologue (`.../9ead4fdb0be9dedf`) |  | <1s |
| pages | `getPageList(chapter)` | success | 25 |  |  | 1-10s |

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
| popular listing | PASS | 154 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=30 Years Have Passed Since the Prologue, URL=`.../165` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 179/179 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 179/179 manga have thumbnail URLs |  |  |  |
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
| chapters | PASS | 18 chapters |  |  |  |
| chapter dates | PASS | 18 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.flamecomics.xyz/.../30YRS-1-00.jpg <redacted query values: 1785000643>` (image/jpeg, 432571 bytes, 1778x1000) |  |  |  |
