# Extension Validation Report

- Extension: tachiyomi-all.mangaplus-v1.6.65
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 1998944621602463790
- Source name: MANGA Plus by SHUEISHA
- Source language: en
- Selected manga input: popular offset 0: One Piece (`<redacted URL #1: manga resource; relative; no scheme>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | One Piece (`<redacted URL #1: selected resource; relative; no scheme>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 67 | MARRIAGETOXIN (`<redacted URL #2: selected resource; relative; no scheme>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | One Piece (`<redacted URL #1: selected resource; relative; no scheme>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`<redacted URL #1: selected resource; relative; no scheme>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | #001 - Chapter 1: Romance Dawn (`<redacted URL #3: selected resource; relative; no scheme>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 53 |  |  | 1-10s |

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
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 67 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece, URL=`#.../100020` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 168/168 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 168/168 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://jumpg-assets.tokyo-cdn.com/.../326439.jpg <redacted query values: hash and expires>` (image/jpeg, 57369 bytes, 352x528) |  |  |  |
| details identity | PASS | Details preserved selected URL `#.../100020` |  |  |  |
| details thumbnail URL | PASS | `https://jumpg-assets.tokyo-cdn.com/.../326439.jpg <redacted query values: hash and expires>` |  |  |  |
| details author | PASS | Eiichiro Oda |  |  |  |
| details artist | PASS | Eiichiro Oda |  |  |  |
| details genres | PASS | Battle / Action, Sci-Fi / Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | As a child, Monkey D. Luffy was inspired to become a pirate by listening to the tales of the buccaneer "Red-Haired" Shanks. But Luffy's life changed when he accidentally ate the Gum-Gum Devil Fruit and gained the power to stretch like rubber...at the cost of never being able to swim again! Years later, still vowing to become the king of the pirates, Luffy sets out on his adventure...one guy alone in a rowboat, in search of the legendary "One Piece," said to be the greatest treasure in the world...<br><br>The latest 3 chapters are viewable in this title.<br>Please be aware that the 3rd latest chapter will be hidden when a new chapter is added. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://jumpg-assets3.tokyo-cdn.com/.../1.jpg <redacted query values: hash and expires>` (image/jpeg, 787681 bytes, 1400x2100) |  |  |  |
