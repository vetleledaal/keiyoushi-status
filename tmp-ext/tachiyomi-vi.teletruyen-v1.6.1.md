# Extension Validation Report

- Extension: tachiyomi-vi.teletruyen-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 35
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
| popular_next | `getPopularManga(2)` | success | 20 | Manh Động Thú Thế (`.../manh-dong-thu-the`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Khóa Học Làm Cô Dâu (`.../khoa-hoc-lam-co-dau`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | [Novel] Dù Rơi Vào Truyện Kinh Dị, Tôi Vẫn Phải Đi Làm (`.../novel-du-roi-vao-truyen-kinh-di-toi-van-phai-di-lam`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kế Hoạch Trao Đổi Mẹ (`.../ke-hoach-trao-doi-me`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kế Hoạch Trao Đổi Mẹ (`.../ke-hoach-trao-doi-me`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 83 | Chap 1 (`.../chuong-1`) |  | <1s |
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
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://teletruyen.com/.../truyen-moi-cap-nhat <redacted query values: page>` -> 5 manga URLs (examples: `.../khoa-hoc-lam-co-dau`, `.../ky-su-giuong-chieu-o-sexpedia`, `.../hoi-chung-beethoven`) |  |  |  |
| thumbnail | PASS | `https://teletruyen.com/.../ke-hoach-trao-doi-me.jpg` (image/jpeg, 35833 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ke-hoach-trao-doi-me` |  |  |  |
| details thumbnail URL | PASS | `https://teletruyen.com/.../ke-hoach-trao-doi-me.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Manhwa, Smut, 18+ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kế Hoạch Trao Đổi Mẹ là truyện có nội dung hấp dẫn và hình ảnh chất lượng được thuộc thể loại Adult, Manhwa, Smut, 18+, hot hiện nay. Bạn đang đọc truyện Kế Hoạch Trao Đổi Mẹ hiện đang là bộ truyện tranh hấp dẫn được rất nhiều bạn đọc yêu thích tại TeLeTruyen. Tè Le Truyện được xây dựng để giúp mọi người đọc truyện vui vẻ và những phút giây giải trí tốt nhất, nếu có lỗi về hình ảnh hoặc những vấn đề khác hay comment cho chúng mình biết nhé |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 83 chapters |  |  |  |
| chapter dates | PASS | 83 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://anhtruyen.site/.../page_0.jpg` (image/jpeg, 861427 bytes, 800x14072) |  |  |  |
