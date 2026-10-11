# Extension Validation Report

- Extension: tachiyomi-en.myhentaicomics-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4899971628155084225
- Source name: MyHentaiComics
- Source language: en
- Selected manga input: popular offset 0: The Joy Of Breeding (`.../20251`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 22 | The Joy Of Breeding (`.../20251`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 22 | Suzie Q - Breeding Mount (`.../27424`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 22 | Power & Thunder - Another World 2 (`.../63609`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 22 | Repressed Desire (`.../63587`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Joy Of Breeding (`.../20251`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Joy Of Breeding (`.../20251`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 39 |  |  | <1s |

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
| popular listing | PASS | 22 entries |  |  |  |
| latest listing | PASS | 22 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Joy Of Breeding, URL=`.../20251` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 89/89 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 89/89 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.myhentaicomics.com/.../001_11.jpg <redacted query values: 22>` (image/jpeg, 40977 bytes, 350x490) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../20251` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.myhentaicomics.com/.../001_11.jpg <redacted query values: 22>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Bukkake, Femdom, Anal, Most Popular, Harem, Pregnant \| Impregnation, Foot Fetish, Legendary, Tomboy, Ghettoyouth, Western |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Artists: Ghettoyouth<br>Groups: Western<br>Pages: 39 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 39 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.myhentaicomics.com/.../001.jpg <redacted query values: 22>` (image/jpeg, 222254 bytes, 1064x1500) |  |  |  |
