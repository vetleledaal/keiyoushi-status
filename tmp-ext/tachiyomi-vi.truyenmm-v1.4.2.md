# Extension Validation Report

- Extension: tachiyomi-vi.truyenmm-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4711592264872296686
- Source name: TruyenMM
- Source language: vi
- Selected manga input: latest offset 0: Nàng tiên cá tôi yêu (`.../nang-tien-ca-toi-yeu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Lớp Học Gia Đình (`.../lop-hoc-gia-dinh`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Thống Trị (`.../thong-tri`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Nàng tiên cá tôi yêu (`.../nang-tien-ca-toi-yeu`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Sự Thác Loạn (`.../su-thac-loan`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 30 | Nàng Yankee Ngồi Cạnh Tôi Có Vô Vàn Điểm Yếu! (`.../nang-yankee-ngoi-canh-toi-co-vo-van-diem-yeu`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Nàng tiên cá tôi yêu (`.../nang-tien-ca-toi-yeu`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 5 | 1 (`.../chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| latest pagination | UNUSUAL | Overlapping manga: title=Sự Thác Loạn, URL=`.../su-thac-loan` at page 1 offset 29 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 150/150 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 150/150 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://truyenmmhayr.com/.../loading.webp` -> 9 manga URLs (examples: `.../dung-si-roi-vao-cam-bay`, `.../me-cua-ban-toi-tung-dong-phim-nguoi-lon`, `.../saimin-switch`) |  |  |  |
| thumbnail | PASS | `https://truyenmmhayr.com/.../cover.jpeg` (image/jpeg, 29026 bytes, 300x478) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../nang-tien-ca-toi-yeu` |  |  |  |
| details thumbnail URL | PASS | `https://truyenmmhayr.com/.../cover.jpeg` |  |  |  |
| details author | PASS | Đang Cập Nhật |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://truyenmmhayr.com/.../0.webp` (image/jpeg, 975181 bytes, 729x13911; server Content-Type: image/webp) |  |  |  |
