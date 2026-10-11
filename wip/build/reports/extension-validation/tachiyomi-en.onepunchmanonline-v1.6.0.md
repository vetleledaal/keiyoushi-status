# Extension Validation Report

- Extension: tachiyomi-en.onepunchmanonline-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 26
- Lint: 1
- Warnings: 1
- Skipped: 8
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 897097334505121559
- Source name: One Punch Man Online
- Source language: en
- Selected manga input: popular offset 0: One Punch Man (`<redacted URL #1: manga resource; relative; no scheme>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 1 | One Punch Man (`<redacted URL #1: selected resource; relative; no scheme>`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | One Punch Man (`<redacted URL #1: selected resource; relative; no scheme>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Punch Man (`<redacted URL #1: selected resource; relative; no scheme>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 251 | One-Punch Man – Chapter 232 (`.../one-punch-man-chapter-232`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Punch Man, URL=`/` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 2/2 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 2/2 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://1punchman.com/.../9782380712018_1_75.jpg` (image/jpeg, 76603 bytes, 420x646) |  |  |  |
| details identity | PASS | Details preserved selected URL `/` |  |  |  |
| details thumbnail URL | PASS | `https://1punchman.com/.../9782380712018_1_75.jpg` |  |  |  |
| details author | PASS | ONE |  |  |  |
| details artist | PASS | Murata Yusuke |  |  |  |
| details genres | PASS | Action, Comedy, Superhero, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | One-Punch Man is a superhero who has trained so hard that his hair has fallen out, and who can overcome any enemy with one punch. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 251 chapters |  |  |  |
| chapter dates | LINT | All 251 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=251 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `.../one-punch-man-chapter-241-3` at offsets 0, 241, `.../one-punch-man-chapter-240-1` at offsets 1, 242, `.../one-punch-man-chapter-239` at offsets 2, 243, `.../one-punch-man-chapter-238` at offsets 3, 244, `.../one-punch-man-chapter-237` at offsets 4, 245, `.../one-punch-man-chapter-236` at offsets 5, 246, `.../one-punch-man-chapter-235` at offsets 6, 247, `.../one-punch-man-chapter-234` at offsets 7, 248, `.../one-punch-man-chapter-233` at offsets 8, 249, `.../one-punch-man-chapter-232` at offsets 9, 250 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | chapters: `https://1punchman.com` to `https://w20.1punchman.com` (1 redirects) |  |  |  |
| page load | PASS | `https://scans-hot.planeptune.us/.../0232-001.png` (image/jpeg, 283488 bytes, 1200x1707; server Content-Type: image/png) |  |  |  |
