# Extension Validation Report

- Extension: tachiyomi-vi.leesincomic-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6354355596871688542
- Source name: LeesinComic
- Source language: vi
- Selected manga input: popular offset 0: Tuyển Tập Truyện Ngắn BL Manhwa (`.../tuyen-tap-truyen-ngan-bl-manhwa`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 698 | Tuyển Tập Truyện Ngắn BL Manhwa (`.../tuyen-tap-truyen-ngan-bl-manhwa`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 698 | Triền Chi - Pheromone (`.../trien-chi-pheromone`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tuyển Tập Truyện Ngắn BL Manhwa (`.../tuyen-tap-truyen-ngan-bl-manhwa`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tuyển Tập Truyện Ngắn BL Manhwa (`.../tuyen-tap-truyen-ngan-bl-manhwa`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 201 | Diễm Hỏa 1 (`.../chap-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 698 entries |  |  |  |
| latest listing | PASS | 698 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tuyển Tập Truyện Ngắn BL Manhwa, URL=`.../tuyen-tap-truyen-ngan-bl-manhwa` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 1397/1397 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1397/1397 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://leesincomic.com/.../(R18) Lớp Học Về Chuyện Người Lớn-1755919037.jpeg` -> 2 manga URLs (examples: `.../r18-lop-hoc-ve-chuyen-nguoi-lon-2`, `.../r18-lop-hoc-ve-chuyen-nguoi-lon`) |  |  |  |
| thumbnail | PASS | `https://tachserver.site/.../tuyen-tap-truyen-ngan-bl-manhwa-1764089559.jpg` (image/jpeg, 82310 bytes, 318x323) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tuyen-tap-truyen-ngan-bl-manhwa` |  |  |  |
| details thumbnail URL | PASS | `https://tachserver.site/.../tuyen-tap-truyen-ngan-bl-manhwa-1764089559.jpg` |  |  |  |
| details author | PASS | Leesin Team |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Tình Yêu, Đã Full, Manhwa, Supernatural, Boy Love, Drama, Horror, Psychological, 18+ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Tên khác: Deep Down; 탐애락;<br><br>Tuyển tập truyện manhwa BL ngắn mà nhóm tổng hợp lại. Mong mọi người đón đọc~~ |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 8 name, chapter 12 name, chapter 15 name, chapter 17 name |  |  |  |
| chapters | PASS | 201 chapters |  |  |  |
| chapter dates | PASS | 201 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://tachserver.site/.../01-1763138630.jpg` (image/jpeg, 313473 bytes, 640x4000) |  |  |  |
