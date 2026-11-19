# Extension Validation Report

- Extension: tachiyomi-en.toonhub-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 7889116924213609541
- Source name: Toon Hub
- Source language: en
- Selected manga input: popular offset 0: They All Want Me (`.../they-all`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 78 | They All Want Me (`.../they-all`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 78 | Stand And Deliver, Your Grace (`.../stand-and-deliver-your-grace`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | They All Want Me (`.../they-all`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | They All Want Me (`.../they-all`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | Episode 1: Birthday Gift (`.../episode-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | <1s |

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
| popular listing | PASS | 78 entries |  |  |  |
| latest listing | PASS | 78 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=They All Want Me, URL=`they-all` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 157/157 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 157/157 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-toonhub.toon-hub.com/.../They_all_want_me_mini_1789660886711_original.webp <redacted query values: v>` (image/webp (encoding: lossy), 165408 bytes, 644x904) |  |  |  |
| details identity | PASS | Details preserved selected URL `they-all` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-toonhub.toon-hub.com/.../They_all_want_me_mini_1789660886711_original.webp <redacted query values: v>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Fantasy, Exclusive, Harem, Comedy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A shy guy wanted to be noticed. Suddenly gets a power that makes every woman in LA want him. The catch? The one woman he's falling for is his unwilling handler — immune to his magic and the only one who can help him deal with the chaos his newfound abilities create. Level up, seduce, survive...<br><br>**Tags:** crazy women, super powers, magic legacy · **Age rating:** 18+ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-toonhub.toon-hub.com/.../They_all_want_me_e000_00_1793813939163.webp <redacted query values: v>` (image/webp (encoding: lossy), 1612 bytes, 1000x35) |  |  |  |
