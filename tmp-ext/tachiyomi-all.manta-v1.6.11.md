# Extension Validation Report

- Extension: tachiyomi-all.manta-v1.6.11
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 8753096034341798862
- Source name: Manta
- Source language: en
- Selected manga input: popular offset 0: Saving the Dying Duchess (`.../4324`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 436 | Saving the Dying Duchess (`.../4324`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Saving the Dying Duchess (`.../4324`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Saving the Dying Duchess (`.../4324`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 12 | Episode 1 (`.../204053`) |  | <1s |
| pages | `getPageList(chapter)` | success | 135 |  |  | <1s |

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
| popular listing | PASS | 436 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Saving the Dying Duchess, URL=`4324` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 437/437 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 437/437 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.mantacdn.net/.../Hmxtu5Qtoe0u6CSx.jpg` (image/jpeg, 83186 bytes, 480x690) |  |  |  |
| details identity | PASS | Details preserved selected URL `4324` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Chem, dalbome, Manta Comics |  |  |  |
| details artist | PASS | Goraeya |  |  |  |
| details genres | PASS | Romantasy, Historical, Non-Asian setting, Royalty/Nobility, Regression, Contract relationship, Devoted ML, Remorseful ML, Capable FL, Troubled-past FL, Dark, Bittersweet, New, Exclusive, Event |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | When Grand Duke Heveruth realizes he's in love, their contract marriage is already over, and Litricia has died from her terminal illness. He then finds himself traveling back in time to the day they first met, and this time, he swears to save his wife so they can live happily ever after together. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | PASS | 12 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 135 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://si.mantacdn.net/.../DS9oKErMqX9ctYbg.jpg <redacted query values: sign>` (image/jpeg, 56428 bytes, 720x1199; server Content-Type: application/epub+zip) |  |  |  |
