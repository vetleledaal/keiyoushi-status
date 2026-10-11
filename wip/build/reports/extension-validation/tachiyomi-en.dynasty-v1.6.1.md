# Extension Validation Report

- Extension: tachiyomi-en.dynasty-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 0
- Warnings: 3
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 669095474988166464
- Source name: Dynasty Scans
- Source language: en
- Selected manga input: popular offset 0: Triangle Of Betrayal (`.../triangle_of_betrayal`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | Triangle Of Betrayal (`.../triangle_of_betrayal`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 8 | The Guy She Was Interested in Wasn't a Guy At All (`.../the_guy_she_was_interested_in_wasnt_a_guy_at_all`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 8 | The Guy She Was Interested in Wasn't a Guy At All (`.../the_guy_she_was_interested_in_wasnt_a_guy_at_all`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Triangle of Betrayal (`.../triangle_of_betrayal`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Triangle of Betrayal (`.../triangle_of_betrayal`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../triangle_of_betrayal`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 8 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Triangle of Betrayal, URL=`.../triangle_of_betrayal` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 23/23 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 19/23 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `<redacted URL #1: resource; absolute; valid web scheme; workstation or local network; query parameters: permalink>` (image/webp (encoding: lossy), 218922 bytes, 1438x2048) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Triangle Of Betrayal to Triangle of Betrayal |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://dynasty-scans.com/.../01.webp` (image/webp (encoding: lossy), 218922 bytes, 1438x2048) |  |  |  |
| details author | PASS | Sinogiasa |  |  |  |
| details artist | PASS | Sinogiasa |  |  |  |
| details genres | PASS | Childhood friends, Netorare, NSFW, Drama, Cheating, Twins, Telling twins apart, Love triangle, Yuri, Dubious consent |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Type: Chapter<br><br>Scanlator:<br>• Rehashed Scans<br><br>Anthology:<br>• Cheating & NTR Yuri Anthology<br>• Oneshots<br><br>Released: 2026-10-06 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://dynasty-scans.com/.../01.webp` (image/webp (encoding: lossy), 218922 bytes, 1438x2048) |  |  |  |
