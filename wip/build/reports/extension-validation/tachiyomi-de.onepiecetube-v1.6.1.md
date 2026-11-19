# Extension Validation Report

- Extension: tachiyomi-de.onepiecetube-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 2
- Warnings: 0
- Skipped: 8
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6778522848114647271
- Source name: OnePiece-Tube
- Source language: de
- Selected manga input: popular offset 0: One Piece Anime Comics (`.../anime-comic-mangaliste`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 11 | One Piece Anime Comics (`.../anime-comic-mangaliste`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | One Piece Anime Comics (`.../anime-comic-mangaliste`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece Anime Comics (`.../anime-comic-mangaliste`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | 3 - Der Fluch des heiligen Schwerts (Band 1) (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 36 |  |  | <1s |

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
| popular listing | PASS | 11 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece Anime Comics, URL=`.../anime-comic-mangaliste` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 12/12 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | LINT | 0/12 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `.../anime-comic-mangaliste` |  |  |  |
| details thumbnail URL | PASS | `https://onepiece.tube/.../01.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Für einen Anime Comic werden ausschließlich Bilder verwendet, welche direkt aus den Anime Filmen stammen. Nachträglich werden in die Bilder Sprechblasen und Geräusche lautmalerisch eingefügt, so dass die Geschichte als Comic wiedergegeben wird und nutzt als Text die Synchronisation aus dem Anime. Im Gegensatz zu den meisten Mangas sind Anime Comics farbig.<br><br>**Erstausgabe:** 03.10.2003 (Deutschland 20.03.2012) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | LINT | All 2 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=2 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://onepiece.tube/.../01.jpg` (image/jpeg, 462653 bytes, 1050x1600) |  |  |  |
