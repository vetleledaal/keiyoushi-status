# Extension Validation Report

- Extension: tachiyomi-en.dankefurslesen-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 3
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: guya
- Source ID: 370316150648855996
- Source name: Danke fürs Lesen
- Source language: en
- Selected manga input: popular offset 0: "When you're crossdressing, what do you do about your underwear?" (`.../xdress-underwear`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 656 | "When you're crossdressing, what do you do about your underwear?" (`.../xdress-underwear`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 656 | The 100 Girlfriends Who Really, Really, Really, Really, Really Love You (`.../100-girlfriends`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | "When you're crossdressing, what do you do about your underwear?" (`.../xdress-underwear`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | "When you're crossdressing, what do you do about your underwear?" (`.../xdress-underwear`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 0 - Oneshot (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 2 |  |  | <1s |

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
| popular listing | PASS | 656 entries |  |  |  |
| latest listing | PASS | 656 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title="When you're crossdressing, what do you do about your underwear?", URL=`xdress-underwear` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 1313/1313 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1313/1313 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://danke.moe/.../48732.png` (image/png, 937051 bytes, 2048x1604) |  |  |  |
| details identity | PASS | Details preserved selected URL `xdress-underwear` |  |  |  |
| details thumbnail URL | PASS | `https://danke.moe/.../48732.png` |  |  |  |
| details author | PASS | Dokuganru |  |  |  |
| details artist | PASS | Dokuganru |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 2 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://danke.moe/.../1_w.png <redacted query values: v3>` (image/png, 1014081 bytes, 2048x1604) |  |  |  |
