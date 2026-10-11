# Extension Validation Report

- Extension: tachiyomi-en.comicland-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 2
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6347123306532384776
- Source name: ComicLand
- Source language: en
- Selected manga input: popular offset 0: Where Did All the Men Go? (`.../where-did-all-the-men-go`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Where Did All the Men Go? (`.../where-did-all-the-men-go`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Perfect Half (`.../perfect-half`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | My Unholy House Fairy (Uncensored) (`.../my-unholy-house-fairy-uncensored`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Where Did All the Men Go? (`.../where-did-all-the-men-go`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Where Did All the Men Go? (`.../where-did-all-the-men-go`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 25 | Chapter 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Where Did All the Men Go?, URL=`where-did-all-the-men-go` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 91/91 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 91/91 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.comicland.org/.../cover.jpg` (image/png, 482047 bytes, 540x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `where-did-all-the-men-go` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.comicland.org/.../cover.jpg` |  |  |  |
| details author | PASS | Team Biyam |  |  |  |
| details artist | PASS | Prodifi |  |  |  |
| details genres | PASS | Drama, Borderline H, Explicit Sex, Full Color, Romance, Nudity, Sexual Content, Comedy, School Life |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | David wakes up in an alternate reality where men are in short supply and the government is prepared to take extreme measures to solve the birth rate crisis. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 25 chapters |  |  |  |
| chapter dates | LINT | All 25 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=25 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.comicland.org/.../001.jpg` (image/png, 3025762 bytes, 720x8750) |  |  |  |
