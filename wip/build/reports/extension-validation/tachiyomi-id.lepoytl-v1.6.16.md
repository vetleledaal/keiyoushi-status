# Extension Validation Report

- Extension: tachiyomi-id.lepoytl-v1.6.16
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 1601772753251290758
- Source name: LepoyTL
- Source language: id
- Selected manga input: popular offset 0: Wolf Falls in Love with Moon (`.../wolf-falls-in-love-with-moon.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Wolf Falls in Love with Moon (`.../wolf-falls-in-love-with-moon.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Ore Wa Bishoujo V-Tuber (`.../ore-wa-bishoujo-v-tuber.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Girls Heart @ High School Boy (`.../girls-heart-high-school-boy.html`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Wolf Falls in Love with Moon (`.../wolf-falls-in-love-with-moon.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Wolf Falls in Love with Moon (`.../wolf-falls-in-love-with-moon.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 46 | Wolf Falls in Love with Moon Chapter 1 (`.../wolf-falls-in-love-with-moon-chapter-1.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 55 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Wolf Falls in Love with Moon, URL=`.../wolf-falls-in-love-with-moon.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 44/44 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 44/44 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../Cover.jpg` (image/jpeg, 33531 bytes, 240x340) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../wolf-falls-in-love-with-moon.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../Cover.jpg` (image/jpeg, 59618 bytes, 340x481) |  |  |  |
| details author | PASS | Komaki Maria |  |  |  |
| details artist | PASS | Komaki Maria |  |  |  |
| details genres | PASS | Manga, Romance, School Life, Slice of Life |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Versi serial dari one-shot karya Komaki Maria. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 46 chapters |  |  |  |
| chapter dates | PASS | 46 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://galeri-lepoy.my.id/.../chapter_1_0014c6bb3e70ea31bb2.jpg` (image/jpeg, 912665 bytes, 1129x1600) |  |  |  |
