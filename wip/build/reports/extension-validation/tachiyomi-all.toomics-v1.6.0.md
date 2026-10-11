# Extension Validation Report

- Extension: tachiyomi-all.toomics-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 7004582542854505662
- Source name: Toomics (Only free chapters)
- Source language: en
- Selected manga input: popular offset 0: Vendor's Rise Amid the Apocalypse (`.../Y`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 299 | Vendor's Rise Amid the Apocalypse (`.../Y`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 0 |  |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Vendor's Rise Amid the Apocalypse (`.../Y`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Vendor's Rise Amid the Apocalypse (`.../Y`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | 1 - Vendor's Rise Amid the Apocalypse (`.../8789`) |  | <1s |
| pages | `getPageList(chapter)` | success | 111 |  |  | 1-10s |

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
| popular listing | PASS | 299 entries |  |  |  |
| latest listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Vendor's Rise Amid the Apocalypse, URL=`.../Y` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 has no manga to check |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 300/300 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 300/300 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thumb-g1.toomics.com/.../2025_10_20_17609302001913.jpg` (image/jpeg, 24131 bytes, 250x250) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../Y` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://thumb-g1.toomics.com/.../2025_10_20_17609301975476.jpg <redacted query values: v>` was not downloaded |  |  |  |
| details author | PASS | Eon comics |  |  |  |
| details artist | PASS | Eon comics |  |  |  |
| details genres | PASS | Fantasy, Action, Survival |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | After a traffic accident, college student Gao Xiaoliang was mysteriously bound to a food system and transported to an apocalyptic world. To survive, he must set up a street food stall in a zombie-infested wasteland. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 111 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://toon-g1.toomics.com/.../pEANdUKGWPXuzwZ7HivJDt0D785nmFsWyJcayoYOMUlJZKEcu2bNTznGdSf1l7Dbyhpl6wyHR9Y_TKoyYpcYjgm1QqTlpUumpXOi_RvTQas <redacted query values: time, code, and tri>` (image/jpeg, 40187 bytes, 720x500) |  |  |  |
