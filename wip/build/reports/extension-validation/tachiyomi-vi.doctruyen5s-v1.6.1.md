# Extension Validation Report

- Extension: tachiyomi-vi.doctruyen5s-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Selected manga input: popular offset 0: Bà Xã Nhà Tôi Đến Từ Ngàn Năm Trước! (`.../ba-xa-nha-toi-den-tu-ngan-nam-truoc`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 42 | Bà Xã Nhà Tôi Đến Từ Ngàn Năm Trước! (`.../ba-xa-nha-toi-den-tu-ngan-nam-truoc`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 42 | Danchigai (`.../danchigai`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 42 | Tóm Lại Là Em Dễ Thương Được Chưa ? (`.../tom-lai-la-em-de-thuong-duoc-chua`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 42 | Ngạo Thế Đan Thần (`.../ngao-the-dan-than`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Bà Xã Nhà Tôi Đến Từ Ngàn Năm Trước! (`.../ba-xa-nha-toi-den-tu-ngan-nam-truoc`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Bà Xã Nhà Tôi Đến Từ Ngàn Năm Trước! (`.../ba-xa-nha-toi-den-tu-ngan-nam-truoc`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 458 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 54 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Bà Xã Nhà Tôi Đến Từ Ngàn Năm Trước!, URL=`.../ba-xa-nha-toi-den-tu-ngan-nam-truoc` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 169/169 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 169/169 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga.io.vn/.../ba-xa-nha-toi-den-tu-ngan-nam-truoc.jpg <redacted query values: 1707497495>` (image/jpeg, 79152 bytes, 360x480) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ba-xa-nha-toi-den-tu-ngan-nam-truoc` |  |  |  |
| details thumbnail URL | PASS | `https://manga.io.vn/.../ba-xa-nha-toi-den-tu-ngan-nam-truoc.jpg <redacted query values: 1707497495>` |  |  |  |
| details author | PASS | Đang cập nhật |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Truyện tranh Bà Xã Nhà Tôi Đến Từ Ngàn Năm Trước! được cập nhật nhanh và đầy đủ nhất tại MANGA.IO.VN. Bạn đọc đừng quên để lại bình luận và chia sẻ, ủng hộ MANGA.IO.VN ra các chương mới nhất của truyện Bà Xã Nhà Tôi Đến Từ Ngàn Năm Trước! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 458 chapters |  |  |  |
| chapter dates | PASS | 458 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://post-phinf.pstatic.net/.../6623155867b1a.jpg` could not be downloaded: java.net.UnknownHostException: post-phinf.pstatic.net: Name or service not known | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
