# Extension Validation Report

- Extension: tachiyomi-vi.truyenmm-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 29
- Lint: 1
- Warnings: 2
- Skipped: 3
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4711592264872296686
- Source name: TruyenMM
- Source language: vi
- Selected manga input: popular offset 0: Lớp Học Gia Đình (`.../lop-hoc-gia-dinh`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Lớp Học Gia Đình (`.../lop-hoc-gia-dinh`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Thống Trị (`.../thong-tri`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Nhà Của Mẹ Và Con Gái (`.../nha-cua-me-va-con-gai`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Chương Trình Tạp Kỉ Đêm Khuya (`.../chuong-trinh-tap-ki-dem-khuya`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 30 | Gia đình Loạn luân (`.../gia-dinh-loan-luan`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Lớp Học Gia Đình (`.../lop-hoc-gia-dinh`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 316 | Oneshot (`.../chapter-oneshot`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 0 |  |  | <1s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 30 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Chương Trình Tạp Kỉ Đêm Khuya, URL=`.../chuong-trinh-tap-ki-dem-khuya` at page 1 offset 28 and page 2 offset 0, title=Tiểu thư bé bỏng của tôi, URL=`.../tieu-thu-be-bong-cua-toi` at page 1 offset 29 and page 2 offset 1 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 150/150 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 150/150 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://truyenmmhayr.com/.../loading.webp` -> 7 manga URLs (examples: `.../toi-da-tro-thanh-do-choi-cua-bo-2-yaoi`, `.../jane-doe`, `.../saimin-ojou-sama-hypnotized-young-lady`) |  |  |  |
| thumbnail | PASS | `https://truyenmmhayr.com/.../lop-hoc-gia-dinh.png` (image/jpeg, 23228 bytes, 300x420; server Content-Type: image/png) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lop-hoc-gia-dinh` |  |  |  |
| details thumbnail URL | PASS | `https://truyenmmhayr.com/.../lop-hoc-gia-dinh.png` |  |  |  |
| details author | PASS | Đang Cập Nhật |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, 18+, Manhwa, Adult, Romance, Ecchi |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 316 chapters |  |  |  |
| chapter dates | PASS | 316 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
