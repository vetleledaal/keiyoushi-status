# Extension Validation Report

- Extension: tachiyomi-vi.cotruyenday-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6522965402984639110
- Source name: CoTruyenDay
- Source language: vi
- Selected manga input: popular offset 0: Đã Là Thời Đại Nào Rồi (`.../10378`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 9 | Đã Là Thời Đại Nào Rồi (`.../10378`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 9 | Đại Quản Gia Là Ma Hoàng (`.../6986`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 9 | Trọng Sinh Đô Thị Tu Tiên (`.../7237`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 9 | Thiếu Niên Bất Lương Vô Địch Solo Lại Muốn Làm Vú Em Trong Game (`.../11059`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Đã Là Thời Đại Nào Rồi (`.../10378`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Đã Là Thời Đại Nào Rồi (`.../10378`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 42 | Chapter 1.1 (`.../419420`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| popular listing | PASS | 9 entries |  |  |  |
| latest listing | PASS | 9 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Đã Là Thời Đại Nào Rồi, URL=`10378` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s3.ap-southeast-1.wasabisys.com/.../da-la-thoi-dai-nao-roi-1758210566.jpg` (image/jpeg, 75506 bytes, 640x861) |  |  |  |
| details identity | PASS | Details preserved selected URL `10378` |  |  |  |
| details thumbnail URL | PASS | `https://s3.ap-southeast-1.wasabisys.com/.../da-la-thoi-dai-nao-roi-1758210566.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Tình cảm, Girls Love, Tình cảm,Girls Love, Truyện có màu |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 42 chapters |  |  |  |
| chapter dates | PASS | 42 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.jino277.work/.../zc1twqDw42DNwSa1x7h5q0EaTGzkqMuWkIhW3mWcsKYtzMQQurVzMVd61ZU3S3jlBnkXOMd8wfjGpY8tcewsF3JNMfYuKWH7hvD200000.jpg` (image/jpeg, 504452 bytes, 640x6216) |  |  |  |
