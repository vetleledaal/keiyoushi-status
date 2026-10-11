# Extension Validation Report

- Extension: tachiyomi-vi.teletruyen-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7833855011739264901
- Source name: TeleTruyen
- Source language: vi
- Selected manga input: popular offset 0: Kế Hoạch Trao Đổi Mẹ (`.../ke-hoach-trao-doi-me`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Kế Hoạch Trao Đổi Mẹ (`.../ke-hoach-trao-doi-me`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Tôi Có Thể Chạm Vào Không? (`.../toi-co-the-cham-vao-khong`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Bóng Dáng Gợi Cảm (`.../bong-dang-goi-cam`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Nàng Tiên Ốc Đáng Yêu Của Tôi (`.../nang-tien-oc-dang-yeu-cua-toi`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kế Hoạch Trao Đổi Mẹ (`.../ke-hoach-trao-doi-me`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kế Hoạch Trao Đổi Mẹ (`.../ke-hoach-trao-doi-me`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 85 | Chap 1 (`.../chuong-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kế Hoạch Trao Đổi Mẹ, URL=`.../ke-hoach-trao-doi-me` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://teletruyen.com/.../truyen-moi-cap-nhat <redacted query values: page>` -> 5 manga URLs (examples: `.../cam-bay-ngot-ngao`, `.../tra-gia-cho-lua-chon-o-lai`, `.../doa-hoa-dai-cua-mua-he-nam-ay`) |  |  |  |
| thumbnail | PASS | `https://teletruyen.com/.../ke-hoach-trao-doi-me.jpg` (image/jpeg, 35833 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ke-hoach-trao-doi-me` |  |  |  |
| details thumbnail URL | PASS | `https://teletruyen.com/.../ke-hoach-trao-doi-me.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Manhwa, Smut, 18+ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kế Hoạch Trao Đổi Mẹ là truyện có nội dung hấp dẫn và hình ảnh chất lượng được thuộc thể loại Adult, Manhwa, Smut, 18+, hot hiện nay. Bạn đang đọc truyện Kế Hoạch Trao Đổi Mẹ hiện đang là bộ truyện tranh hấp dẫn được rất nhiều bạn đọc yêu thích tại TeLeTruyen. Tè Le Truyện được xây dựng để giúp mọi người đọc truyện vui vẻ và những phút giây giải trí tốt nhất, nếu có lỗi về hình ảnh hoặc những vấn đề khác hay comment cho chúng mình biết nhé |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 85 chapters |  |  |  |
| chapter dates | PASS | 85 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://anhtruyen.site/.../page_0.jpg` (image/jpeg, 861427 bytes, 800x14072) |  |  |  |
