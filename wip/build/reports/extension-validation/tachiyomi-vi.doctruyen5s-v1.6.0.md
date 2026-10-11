# Extension Validation Report

- Extension: tachiyomi-vi.doctruyen5s-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: liliana
- Source ID: 7595811359698226104
- Source name: DocTruyen5s
- Source language: vi
- Selected manga input: popular offset 0: Mận xanh (`.../man-xanh`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 42 | Mận xanh (`.../man-xanh`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 42 | Toàn Tông Môn Đều Là Kẻ Si Tình, Chỉ Có Ta Là Tỉnh Táo (`.../toan-tong-mon-deu-la-ke-si-tinh-chi-co-ta-la-tinh-tao`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 42 | Đồ Đệ Của Ta Đều Là Đại Phản Phái (`.../do-de-cua-ta-deu-la-dai-phan-phai`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 42 | Vận May Không Ngờ (`.../van-may-khong-ngo`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Mận xanh (`.../man-xanh`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mận xanh (`.../man-xanh`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 117 | Chap review (`.../chap-review`) |  | <1s |
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
| popular listing | PASS | 42 entries |  |  |  |
| latest listing | PASS | 42 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mận xanh, URL=`.../man-xanh` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 169/169 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 169/169 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga.io.vn/.../man-xanh.jpg` (image/jpeg, 21466 bytes, 256x348) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../man-xanh` |  |  |  |
| details thumbnail URL | PASS | `https://manga.io.vn/.../man-xanh.jpg` |  |  |  |
| details author | PASS | Đang cập nhật |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Truyện tranh Mận xanh được cập nhật nhanh và đầy đủ nhất tại MANGA.IO.VN. Bạn đọc đừng quên để lại bình luận và chia sẻ, ủng hộ MANGA.IO.VN ra các chương mới nhất của truyện Mận xanh |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 117 chapters |  |  |  |
| chapter dates | PASS | 117 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://post-phinf.pstatic.net/.../65e3c8ac8ba60.jpg` could not be downloaded: java.net.UnknownHostException: post-phinf.pstatic.net: Name or service not known | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
