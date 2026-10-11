# Extension Validation Report

- Extension: tachiyomi-id.mangacan-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 20
- Lint: 4
- Warnings: 2
- Skipped: 8
- Failed: 3
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 4396938423130345004
- Source name: Manga Can
- Source language: id
- Selected manga input: popular offset 0: One Piece Mangacan (`.../baca-komik-one_piece-bahasa-indonesia-online-terbaru.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 51 | One Piece Mangacan (`.../baca-komik-one_piece-bahasa-indonesia-online-terbaru.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 51 | One Piece Mangacan (`.../baca-komik-one_piece-bahasa-indonesia-online-terbaru.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../baca-komik-one_piece-bahasa-indonesia-online-terbaru.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1217 | Chapter 1 (`.../baca-komik-one_piece-1-2-bahasa-indonesia-one_piece-1-terbaru.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 51 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://blogger.googleusercontent.com/.../manga_thumbnail-Komik-One-Piece.jpg` -> all 51 manga URLs (examples: `.../baca-komik-one_piece-bahasa-indonesia-online-terbaru.html`, `.../gyakkou-shita-akuyaku-reijou-wa-naze-ka-maryoku-wo-ushinattanode-shinsou-no-reijou-ni-narimasu.html`, `.../usuzumi-no-hate.html`) |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../manga_thumbnail-Komik-One-Piece.jpg` (image/jpeg, 176733 bytes, 500x785) |  |  |  |
| details identity | UNUSUAL | Details changed selected title One Piece Mangacan to One Piece |  |  |  |
| details thumbnail URL | LINT | Thumbnail URL is empty; use null when unknown |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1217 chapters |  |  |  |
| chapter dates | LINT | All 1217 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1217 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
