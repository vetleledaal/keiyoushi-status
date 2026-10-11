# Extension Validation Report

- Extension: tachiyomi-en.oppaistream-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1938195875614354298
- Source name: Oppai Stream
- Source language: en
- Selected manga input: popular offset 0: The Hole is Open (`.../manhwa <redacted query values: m>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | The Hole is Open (`.../manhwa <redacted query values: m>`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | Go Ahead, Mom (`.../manhwa <redacted query values: m>`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | Gear that’s Way Too Good (`.../manhwa <redacted query values: m>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 36 | I’m Here for You (`.../manhwa <redacted query values: m>`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Hole is Open (`.../manhwa <redacted query values: m>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Hole is Open (`.../manhwa <redacted query values: m>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 152 | Chapter 1 (`.../page <redacted query values: m and c>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 67 |  |  | 1-10s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Hole is Open, URL=`.../manhwa <redacted query values: m>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://myspacecat.pictures/.../cover.png <redacted query values: v> 16:02:12` (image/png, 199993 bytes, 350x490) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manhwa <redacted query values: m>` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://myspacecat.pictures/.../cover.png <redacted query values: v>` was not downloaded |  |  |  |
| details author | PASS | Kimtuk |  |  |  |
| details artist | PASS | Kimtuk |  |  |  |
| details genres | PASS | drama, romance, bigboobs, blackhair, brownhair, pinkhair |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | JA-KANG inherited his grandfather’s store. In the secret room, there is a secret “hole” ?! Read The Hole is Open pornhwa for free |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 152 chapters |  |  |  |
| chapter dates | PASS | 152 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 67 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://myspacecat.pictures/.../1.jpg <redacted query values: v>` (image/jpeg, 196278 bytes, 720x2500) |  |  |  |
