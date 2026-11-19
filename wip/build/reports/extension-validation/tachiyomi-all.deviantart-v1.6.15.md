# Extension Validation Report

- Extension: tachiyomi-all.deviantart-v1.6.15
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 0
- Warnings: 1
- Skipped: 7
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5211324870873630158
- Source name: DeviantArt
- Source language: all
- Selected manga input: popular offset 0: Here, have some funny candy. (`.../Here,-have-some-funny-candy.-1404105878`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 28 | Here, have some funny candy. (`.../Here,-have-some-funny-candy.-1404105878`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 60 | Here, have some funny candy. (`.../Here,-have-some-funny-candy.-1404105878`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Here, have some funny candy. (`.../Here,-have-some-funny-candy.-1404105878`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Art (`.../Here,-have-some-funny-candy.-1404105878`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | 1-10s |

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
| popular listing | PASS | 28 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Here, have some funny candy., URL=`.../Here,-have-some-funny-candy.-1404105878` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 88/88 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 88/88 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/.../here_have_some_funny_candy__by_souurasaka_dn7yv12-pre.jpg <redacted query values: token>` (image/jpeg, 154590 bytes, 690x1158) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../Here,-have-some-funny-candy.-1404105878` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/.../here_have_some_funny_candy__by_souurasaka_dn7yv12-400t.jpg <redacted query values: token>` (image/jpeg, 32377 bytes, 238x400) |  |  |  |
| details author | PASS | SouUrasaka |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | gallery:SouUrasaka, by:SouUrasaka |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Click tag to show artist's gallery |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/.../dn7yv12-e8cdbef2-ac77-463a-839f-6a62097c5c90.png <redacted query values: token>` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
