# Extension Validation Report

- Extension: tachiyomi-en.doujins-v1.6.0
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
- Source ID: 3733450486998805728
- Source name: Doujins
- Source language: en
- Selected manga input: popular offset 0: I, A Guy Who Tells Women Apart By Their Asses, Got Blackmail On My Superior At Work 2 (`.../eco-heeky-i-a-guy-who-tells-women-apart-by-their-asses-got-blackmail-on-my-superior-at-work-2-103658`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 71 | I, A Guy Who Tells Women Apart By Their Asses, Got Blackmail On My Superior At Work 2 (`.../eco-heeky-i-a-guy-who-tells-women-apart-by-their-asses-got-blackmail-on-my-superior-at-work-2-103658`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 1 | A Pushover Girl Who Looks Great in Summer Uniform (`.../poriuretan-a-pushover-girl-who-looks-great-in-summer-uniform-102887`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | That Provocation Would Make Anyone Go UOOOOH!! The Case of I-19 (`.../toragoyashiki-that-provocation-would-make-anyone-go-uooooh-the-case-of-i-19-104300`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | I, A Guy Who Tells Women Apart By Their Asses, Got Blackmail On My Superior At Work 2 (`.../i-a-guy-who-tells-women-apart-by-their-asses-got-blackmail-on-my-superior-at-work-2-103658`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I, A Guy Who Tells Women Apart By Their Asses, Got Blackmail On My Superior At Work 2 (`.../eco-heeky-i-a-guy-who-tells-women-apart-by-their-asses-got-blackmail-on-my-superior-at-work-2-103658`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../eco-heeky-i-a-guy-who-tells-women-apart-by-their-asses-got-blackmail-on-my-superior-at-work-2-103658`) |  | <1s |
| pages | `getPageList(chapter)` | success | 43 |  |  | 1-10s |

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
| popular listing | PASS | 71 entries |  |  |  |
| latest listing | PASS | 1 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=I, A Guy Who Tells Women Apart By Their Asses, Got Blackmail On My Superior At Work 2, URL=`.../i-a-guy-who-tells-women-apart-by-their-asses-got-blackmail-on-my-superior-at-work-2-103658` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 84/84 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 84/84 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.doujins.com/.../f2-tmx4yztj.jpg <redacted query values: st and e> 2x` (image/jpeg, 72158 bytes, 364x520) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../eco-heeky-i-a-guy-who-tells-women-apart-by-their-asses-got-blackmail-on-my-superior-at-work-2-103658` |  |  |  |
| details thumbnail URL | PASS | `https://static.doujins.com/.../f2-tmx4yztj.jpg <redacted query values: st and e> 2x` |  |  |  |
| details author | PASS | Eco Heeky |  |  |  |
| details artist | PASS | Eco Heeky |  |  |  |
| details genres | PASS | ahegao, beauty mark, big ass, big breasts, business suit, hairy, kissing, leg lock, nakadashi, nipple stimulation, x-ray |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 43 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://static.doujins.com/.../n-mxz4c4xd.jpg <redacted query values: st and e>` (image/jpeg, 490842 bytes, 1269x1800) |  |  |  |
