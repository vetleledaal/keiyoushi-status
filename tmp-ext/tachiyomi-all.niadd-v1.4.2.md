# Extension Validation Report

- Extension: tachiyomi-all.niadd-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 6237269852978906906
- Source name: Niadd
- Source language: en
- Selected manga input: latest offset 0: ONE PIECE (`.../ONE_PIECE.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 60 | MARTIAL PEAK (`.../MARTIAL_PEAK.html`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 60 | ONE PIECE (`.../ONE_PIECE.html`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 24 | One Piece (continuation) (`.../10038725.html`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ONE PIECE (`.../ONE_PIECE.html`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1281 | ONE PIECE: TAL 0 25899 Oct 19, 2016 (`.../14686`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 4: title=ONE PIECE, URL=`.../ONE_PIECE.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 144/144 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 144/144 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img3.yx247.com/.../201610192130215086.jpg` (image/jpeg, 38085 bytes, 200x314) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ONE_PIECE.html` |  |  |  |
| details thumbnail URL | PASS | `https://img3.yx247.com/.../201610192130215086.jpg` |  |  |  |
| details author | PASS | Author(s): Oda Eiichiro Artist: Oda Eiichiro |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Drama, Fantasy, Martial Arts, Shounen, Supernatural, Action, , Adventure, , Comedy, , Drama, , Fantasy, , Martial Arts, , Shounen, , Supernatural, Action, Adventure, Comedy, Drama, Fantasy, Martial Arts, Shounen, Supernatural, Action, Adventure, Comedy, Drama, Fantasy, Martial Arts, Shounen, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Gol D. Roger was known as the Pirate King, the strongest and most infamous being to have sailed the Grand Line. The capture and death of Roger by the World Government brought a change throughout the world. His last words before his death revealed the location of the greatest treasure in the world, One Piece. It was this revelation that brought about the Grand Age of Pirates, men who dreamed of finding One Piece (which promises an unlimited amount of riches and fame), and quite possibly the most coveted of titles for the person who found it, the title of the Pirate King. Enter Monkey D. Luffy, a 17-year-old boy who defies the standard definition of a pirate. Rather than the popular persona of a wicked, hardened, toothless pirate who ransacks villages for fun, Luffy’s reason for being a pirate is one of pure wonder; the thought of an exciting adventure and meeting new and intriguing people, along with finding One Piece. Following in the footsteps of his childhood hero, Luffy and his crew travel across the Grand Line, experiencing crazy adventures, unveiling dark mysteries and battling strong enemies, all in order to reach One Piece. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1281 chapters |  |  |  |
| chapter dates | LINT | All 1281 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1281 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://en4.movietop.cc/.../TAL00987.webp <redacted query values: acc and exp>` (image/webp (encoding: lossy), 35834 bytes, 680x1157) |  |  |  |
