# Extension Validation Report

- Extension: tachiyomi-en.comicland-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 6347123306532384776
- Source name: ComicLand
- Source language: en
- Selected manga input: popular offset 0: Someone Stop Her! (Uncensored) (`.../someone-stop-her-uncensored`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Someone Stop Her! (Uncensored) (`.../someone-stop-her-uncensored`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Cleaning Service (`.../cleaning-service`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Vengeance Named Love (`.../vengeance-named-love`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Someone Stop Her! (Uncensored) (`.../someone-stop-her-uncensored`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Someone Stop Her! (Uncensored) (`.../someone-stop-her-uncensored`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 82 | Chapter 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 48 |  |  | <1s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Someone Stop Her! (Uncensored), URL=`someone-stop-her-uncensored` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 91/91 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 91/91 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.comicland.org/.../cover.jpg` (image/webp (encoding: lossless), 140414 bytes, 400x593) |  |  |  |
| details identity | PASS | Details preserved selected URL `someone-stop-her-uncensored` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.comicland.org/.../cover.jpg` |  |  |  |
| details author | PASS | RA |  |  |  |
| details artist | PASS | Momobird |  |  |  |
| details genres | PASS | Drama, Fetish, Uncensored, Harem, Borderline H, Explicit Sex, Full Color, Romance, Delinquents, Sexual Content, Gyaru, Slice of Life, Comedy |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | To regain his peace, Gangchan must welcome his blood-curdling smoking neighbor and her housemates into his home. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 82 chapters |  |  |  |
| chapter dates | LINT | All 82 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=82 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.comicland.org/.../001.jpg` (image/jpeg, 1126499 bytes, 1440x10000) |  |  |  |
