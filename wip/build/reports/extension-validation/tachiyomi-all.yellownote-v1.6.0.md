# Extension Validation Report

- Extension: tachiyomi-all.yellownote-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.e
- Source ID: 6844007153169388830
- Source name: 小黄书
- Source language: en
- Selected manga input: popular offset 0: Like smoke Vol. 1523(23P + 1V) (`.../id-6ab3048f0f8fd.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 11 | Like smoke Vol. 1523(23P + 1V) (`.../id-6ab3048f0f8fd.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 11 | Ring ring Vol. 1522(23P + 1V) (`.../id-6ab3048cdfc3e.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 11 | Red scarf exposed(30P) (`.../id-6acb65915765b.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 11 | Rabbit Vol. 1520(23P + 1V) (`.../id-6ab3048975cd9.html`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Like smoke Vol. 1523(23P + 1V) (`.../id-6ab3048f0f8fd.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | Page 1 (`.../1.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | <1s |

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
| popular listing | PASS | 11 entries |  |  |  |
| latest listing | PASS | 11 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 44/44 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 44/44 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.xchina.io/.../00022_600x0.webp` (image/webp (container: extended), 42704 bytes, 600x899) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../id-6ab3048f0f8fd.html` |  |  |  |
| details thumbnail URL | PASS | `https://img.xchina.io/.../00022_600x0.webp` |  |  |  |
| details author | PASS | 如烟 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Chinese Studios, PANS, New Version, EXIF, Stockings, Lingerie, Garter Belt, Black Stockings |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.xchina.io/.../00001.jpg` (image/jpeg, 531584 bytes, 1800x2696) |  |  |  |
