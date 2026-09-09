# Extension Validation Report

- Extension: tachiyomi-vi.dilib-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 32
- Lint: 2
- Warnings: 2
- Skipped: 0
- Failed: 1
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
| popular_next | `getPopularManga(2)` | success | 24 | Vua Bóng Chuyền Haikyuu (Haruichi Furudate) (`.../vua-bong-chuyen-haikyuu-16178.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Đảo Hải Tặc - One Piece (Oda Eiichiro) (`.../dao-hai-tac-one-piece-14728.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Vua Bóng Chuyền Haikyuu (Haruichi Furudate) (`.../vua-bong-chuyen-haikyuu-16178.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ĐẢO HẢI TẶC - ONE PIECE (`.../dao-hai-tac-one-piece-14728.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1196 | Chap 1 (`.../dao-hai-tac-one-piece-14728-chap-1.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 53 |  |  | 1-10s |

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
| details description | PASS | Cập nhật lúc: 12:16pm 07/09/2026 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1196 chapters |  |  |  |
| chapter dates | LINT | All 1196 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1196 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://dilib.vn/.../img_00002.webp <redacted query values: v>` (image/webp (encoding: lossy), 130412 bytes, 999x1332) |  |  |  |
