# Extension Validation Report

- Extension: tachiyomi-en.mangafreak-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1201694572804778862
- Source name: Mangafreak
- Source language: en
- Selected manga input: popular offset 0: One Piece (`.../One_Piece`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | One Piece (`.../One_Piece`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | Shingeki no Kyojin (`.../Shingeki_No_Kyojin`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Isshou Hatarakitakunai Ore Ga Classmate No Daininki Idol Ni Natsukaretara (`.../Isshou_Hatarakitakunai_Ore_Ga_Classmate_No_Daininki_Idol_Ni_Natsukaretara`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Taihen Yoku Dekimashita (`.../Taihen_Yoku_Dekimashita`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 7 | One Piece (`.../One_Piece`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../One_Piece`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1201 | Chapter 1 - Romance Dawn (`.../Read1_One_Piece_1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 54 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece, URL=`.../One_Piece` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | FAIL | Invalid manga: popular entry 15: title=<blank>, URL=`.../Manga` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.mangafreak.me/.../one_piece.jpg` (image/jpeg, 26599 bytes, 222x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../One_Piece` |  |  |  |
| details thumbnail URL | PASS | `https://images.mangafreak.me/.../one_piece.jpg` |  |  |  |
| details author | PASS | This is ON-GOING series |  |  |  |
| details artist | PASS | Type: Right(→) to Left(←) |  |  |  |
| details genres | PASS | Action, Adventure, Animated, Comedy, Drama, Fantasy, Shounen |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Seeking to be the greatest pirate in the world, young Monkey D. Luffy, endowed with stretching powers from the legendary &quot;Gomu Gomu&quot; Devil's fruit, travels towards the Grand Line in search of One Piece, the greatest treasure in the world. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1201 chapters |  |  |  |
| chapter dates | PASS | 1201 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.mangafreak.me/.../one_piece_1_1.jpg` (image/jpeg, 169378 bytes, 1200x884) |  |  |  |
