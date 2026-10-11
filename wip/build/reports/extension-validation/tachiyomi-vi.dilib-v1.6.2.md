# Extension Validation Report

- Extension: tachiyomi-vi.dilib-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 23
- Lint: 1
- Warnings: 2
- Skipped: 9
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4436086462808946847
- Source name: Dilib
- Source language: vi
- Selected manga input: popular offset 0: Đảo Hải Tặc - One Piece (Oda Eiichiro) (`.../dao-hai-tac-one-piece-14728.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Đảo Hải Tặc - One Piece (Oda Eiichiro) (`.../dao-hai-tac-one-piece-14728.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Shin - Cậu Bé Bút Chì (Usui Yoshito) (`.../shin-cau-be-but-chi-14787.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Đảo Hải Tặc - One Piece (Oda Eiichiro) (`.../dao-hai-tac-one-piece-14728.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Shin - Cậu Bé Bút Chì (Usui Yoshito) (`.../shin-cau-be-but-chi-14787.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ĐẢO HẢI TẶC - ONE PIECE (`.../dao-hai-tac-one-piece-14728.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 96/96 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 96/96 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dilib.vn/.../14728-dao-hai-tac-one-piece-1.webp <redacted query values: v>` (image/webp (encoding: lossy), 23842 bytes, 240x336) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Đảo Hải Tặc - One Piece (Oda Eiichiro) to ĐẢO HẢI TẶC - ONE PIECE |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://dilib.vn/.../14728-dao-hai-tac-one-piece-1.webp <redacted query values: v>` (image/webp (encoding: lossy), 81024 bytes, 540x756) |  |  |  |
| details author | PASS | Tác giả : Oda Eiichiro |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, Tác Phẩm Kinh Điển, Action, Adventure, Comedy, Fantasy, Shounen, Supernatural, Drama |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Cập nhật lúc: 09:50am 28/09/2026 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
