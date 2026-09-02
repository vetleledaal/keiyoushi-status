# Extension Validation Report

- Extension: tachiyomi-all.manga18fx-v1.6.58
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 3157287889751723714
- Source name: Manga18fx
- Source language: en
- Selected manga input: popular offset 0: Secret Class (`.../secret-class-01`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 13 | Secret Class (`.../secret-class-01`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 17 | The Professor’s Secret Account (`.../the-professors-secret-account`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 21 | I Banged All My Classmates After Graduation (`.../i-banged-all-my-classmates-after-graduation`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 14 | Breakers (`.../breakers`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Secret Class (`.../secret-class-01`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class (`.../secret-class-01`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 327 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 22 |  |  | <1s |

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
| popular listing | PASS | 13 entries |  |  |  |
| latest listing | PASS | 21 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`.../secret-class-01` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 66/66 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 66/66 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga18fx.com/.../secret-classm.jpg` (image/jpeg, 16570 bytes, 214x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-class-01` |  |  |  |
| details thumbnail URL | PASS | `https://manga18fx.com/.../secret-classm.jpg` |  |  |  |
| details author | PASS | Wang Kang Cheol |  |  |  |
| details artist | PASS | Minachan |  |  |  |
| details genres | PASS | Manhwa, Adult, Comedy, Harem, Romance, Seinen, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Rating: ★★★★✬ 4.26 (2543)<br><br>Comments: 43<br><br>Bookmarks: 2677<br><br>Secret Class is about a wife of two cheating on her husband with whom she has two daughters and a boy they took in.<br><br>Alternative titles:<br>- 비밀 수업<br>- 秘密教學<br>- Clases secretas<br>- Secret Teaching<br>- Bimilsueop<br>- 비밀수업<br>- 秘密教学<br>- 秘密の授業<br>- Kelas Rahasia<br>- Bi mi jiao xue<br>- Enseñanza Secreta<br>- Cuck Class<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 327 chapters |  |  |  |
| chapter dates | PASS | 327 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img01.manga18fx.com/.../1-001.jpg` (image/webp (encoding: lossy), 41812 bytes, 720x880; server Content-Type: image/jpeg) |  |  |  |
