# Extension Validation Report

- Extension: tachiyomi-en.vizshonenjump-v1.6.29
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 29
- Lint: 2
- Warnings: 2
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 5065732785260259278
- Source name: VIZ Shonen Jump
- Source language: en
- Selected manga input: popular offset 0: One Piece (`.../one-piece`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 9 | One Piece (`.../one-piece`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 283 | Haunted Peak (`.../haunted-peak`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | One Piece (`.../one-piece`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../one-piece`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1192 | Ch. 1 (`.../5090`) |  | <1s |
| pages | `getPageList(chapter)` | success | 55 |  |  | 1-10s |

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
| popular listing | PASS | 9 entries |  |  |  |
| latest listing | PASS | 283 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece, URL=`one-piece` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 296/296 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 296/296 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://dw9to29mmj727.cloudfront.net/.../31-SeriesThumbnailsManga_BOF__400x320.jpg` -> 2 manga URLs (examples: `boys-over-flowers`, `boys-over-flowers-jewelry-box`) |  |  |  |
| thumbnail | PASS | `https://dw9to29mmj727.cloudfront.net/.../526-SeriesThumb_OP_400x320.png` (image/png, 307505 bytes, 400x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `one-piece` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://dwgkfo5b3odmw.cloudfront.net/.../thumb-196468-OnePiece_GN112_C1_Web-3-RjXnpWDHRJHMG3ps8cj5tQ.jpg` (image/jpeg, 252530 bytes, 600x900) |  |  |  |
| details author | PASS | Eiichiro Oda |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Join Monkey D. Luffy and his swashbuckling crew in their search for the ultimate treasure, the One Piece. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1192 chapters |  |  |  |
| chapter dates | LINT | 1144 of 1192 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1144 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://d2vs6ffylckc3p.cloudfront.net/.../0.jpg <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/jpeg, 15627 bytes, 800x1200) |  |  |  |
