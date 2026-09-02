# Extension Validation Report

- Extension: tachiyomi-id.mangacan-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 15
- Lint: 1
- Warnings: 1
- Skipped: 15
- Failed: 4
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4396938423130345004
- Source name: Manga Can
- Source language: id
- Selected manga input: popular offset 0: One Piece Mangacan (`.../baca-komik-one_piece-bahasa-indonesia-online-terbaru.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 51 | One Piece Mangacan (`.../baca-komik-one_piece-bahasa-indonesia-online-terbaru.html`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 51 | One Piece Mangacan (`.../baca-komik-one_piece-bahasa-indonesia-online-terbaru.html`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | error | 0 |  | java.lang.NullPointerException | <1s |
| chapters | `fetchChapterList(manga)` | success | 1213 | Chapter 1 (`.../baca-komik-one_piece-1-2-bahasa-indonesia-one_piece-1-terbaru.html`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
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
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../manga_thumbnail-Komik-One-Piece.jpg` (image/jpeg, 176799 bytes, 500x785) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1213 chapters |  |  |  |
| chapter dates | LINT | All 1213 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1213 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
