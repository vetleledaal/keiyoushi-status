# Extension Validation Report

- Extension: tachiyomi-th.godhman-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source theme: mangathemesia
- Source ID: 9132357937461154424
- Source name: GodhMan
- Source language: th
- Selected manga input: popular offset 0: Theater Society (Circles) (`.../theater-society-circles`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Theater Society (Circles) (`.../theater-society-circles`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Collapse & Rewind (`.../collapse-rewind`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | The Breeding Game has Become Reality (`.../the-breeding-game-has-become-reality`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Believe Me! I Offer You My First (`.../believe-me-i-offer-you-my-first`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Theater Society (Circles) (`.../theater-society-circles`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Theater Society (Circles) (`.../theater-society-circles`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 216 | Chapter 1 (`.../theater-society-circles-theater-society-circles-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Theater Society (Circles), URL=`.../theater-society-circles` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i3.wp.com/.../Theater-Society-Circles.jpg <redacted query values: resize>` (image/jpeg, 5468 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../theater-society-circles` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i3.wp.com/.../Theater-Society-Circles.jpg` (image/jpeg, 41231 bytes, 500x750) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Drama, Harem, Romance, School life, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 216 chapters |  |  |  |
| chapter dates | PASS | 216 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.godhman.net/.../Upload-Theater-Society-Circles-1-ABX95-108read.jpg` (image/jpeg, 314870 bytes, 1000x4383) |  |  |  |
