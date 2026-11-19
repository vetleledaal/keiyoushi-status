# Extension Validation Report

- Extension: tachiyomi-all.mangamillion-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 5427621842719614942
- Source name: Manga Million
- Source language: en
- Selected manga input: popular offset 0: One Piece (`.../1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 401 | One Piece (`.../1`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 401 | He loves me too much! (`.../1176`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | ONE PIECE: Kobiyama, Coby’s Look-Alike — The Great Treasure of Identical Doubles (`.../829`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../1`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 108 | Chapter 1:Romance Dawn (`.../6736`) |  | 1-10s |
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
| popular listing | PASS | 401 entries |  |  |  |
| latest listing | PASS | 401 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 3: title=One Piece, URL=`1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 806/806 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 806/806 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://img.mangamillion.shueisha.co.jp/.../1.avif <redacted query values: h and e>` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `1` |  |  |  |
| details thumbnail URL | PASS | `https://img.mangamillion.shueisha.co.jp/.../1.avif <redacted query values: h and e>` |  |  |  |
| details author | PASS | Eiichiro Oda |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Animated, Serialized, Adventure, Fantasy, Ensemble Cast, Coming Of Age, Rivalry |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | As a child, Monkey D. Luffy was inspired to become a pirate by listening to the tales of the buccaneer "Red-Haired" Shanks. But his life changed when Luffy accidentally ate the Gum-Gum Devil Fruit and gained the power to stretch like rubber...at the cost of never being able to swim again! Years later, still vowing to become the king of the pirates, Luffy sets out on his adventure...one guy alone in a rowboat, in search of the legendary "One Piece," said to be the greatest treasure in the world... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 108 chapters |  |  |  |
| chapter dates | LINT | All 108 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=108 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.mangamillion.shueisha.co.jp/.../1.avif.enc <redacted query values: h and e>` (image/avif (format: avif), 93834 bytes, 1080x1620; server Content-Type: application/octet-stream) |  |  |  |
