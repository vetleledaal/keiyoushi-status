# Extension Validation Report

- Extension: tachiyomi-vi.truyenmm-v1.4.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 20
- Lint: 1
- Warnings: 1
- Skipped: 12
- Failed: 3
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4711592264872296686
- Source name: TruyenMM
- Source language: vi
- Selected manga input: latest offset 0: Sách Tranh Sa Ngã Dành Cho Người Lớn (`.../sach-tranh-sa-nga-danh-cho-nguoi-lon`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Lớp Học Gia Đình (`.../lop-hoc-gia-dinh`) |  | 10s+ |
| popular_next | `fetchPopularManga(2)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 30 | Sách Tranh Sa Ngã Dành Cho Người Lớn (`.../sach-tranh-sa-nga-danh-cho-nguoi-lon`) |  | 10s+ |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Tất cả nhân tình của tôi (`.../tat-ca-nhan-tinh-cua-toi`) |  | 10s+ |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 523 | 10s+ |
| details | `fetchMangaDetails(manga)` | success | 1 | Sách Tranh Sa Ngã Dành Cho Người Lớn (`.../sach-tranh-sa-nga-danh-cho-nguoi-lon`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 523 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| details operation | PASS |  |  |  |  |
| chapters operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | SKIP | HTTP error 523 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Timed out waiting for 30000 ms |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 90/90 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 90/90 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://truyenmmhayr.com/.../loading.webp` -> 3 manga URLs (examples: `.../haha-no-jouai-mother-s-affection`, `.../truyen-hentai-lieu-co-the-ket-hon-voi-con-trai-minh-khong-musuko-to-kekkon-shite-mo-ii-desu-ka-online-18`, `.../48-ky-nang-cua-succubus`) |  |  |  |
| thumbnail | PASS | `https://truyenmmhayr.com/.../cover.jpg` (image/jpeg, 13951 bytes, 225x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sach-tranh-sa-nga-danh-cho-nguoi-lon` |  |  |  |
| details thumbnail URL | PASS | `https://truyenmmhayr.com/.../cover.jpg` |  |  |  |
| details author | PASS | Đang Cập Nhật |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasy, Romance |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
