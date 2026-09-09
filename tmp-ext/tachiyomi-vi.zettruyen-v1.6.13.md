# Extension Validation Report

- Extension: tachiyomi-vi.zettruyen-v1.6.13
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source ID: 893747327087652119
- Source name: ZetTruyen
- Source language: vi
- Selected manga input: popular offset 0: Trở Về Làm Đại Lão Thời Mạt Thế (`.../tro-ve-lam-dai-lao-thoi-mat-the`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Trở Về Làm Đại Lão Thời Mạt Thế (`.../tro-ve-lam-dai-lao-thoi-mat-the`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Người Dọn Dẹp Chiến Trường (`.../nguoi-don-dep-chien-truong`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Ngự Thú Tiến Hóa (`.../ngu-thu-tien-hoa`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Gacha Vô Hạn (`.../gacha-vo-han`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 30 | Trở Về Làm Đại Lão Thời Mạt Thế (`.../tro-ve-lam-dai-lao-thoi-mat-the`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Trở Về Làm Đại Lão Thời Mạt Thế (`.../tro-ve-lam-dai-lao-thoi-mat-the`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 321 | Chapter 0 (`.../chuong-0`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 26 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Trở Về Làm Đại Lão Thời Mạt Thế, URL=`.../tro-ve-lam-dai-lao-thoi-mat-the` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Gacha Vô Hạn, URL=`.../gacha-vo-han` at page 1 offset 29 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 150/150 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 150/150 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn3.zetimage.com/.../tro-ve-lam-dai-lao-thoi-mat-the.jpg` (image/jpeg, 18004 bytes, 190x247) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tro-ve-lam-dai-lao-thoi-mat-the` |  |  |  |
| details thumbnail URL | PASS | `https://cdn3.zetimage.com/.../tro-ve-lam-dai-lao-thoi-mat-the.jpg` |  |  |  |
| details author | PASS | TruyenQQ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Chuyển Sinh, Manhua, Truyện Màu |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Trở Về Làm Đại Lão Thời Mạt Thế là bộ truyện thuộc thể loại Action, Adventure, Chuyển Sinh, Manhua, Truyện Màu, được sáng tác bởi TruyenQQ và chuyển ngữ bởi Lưu Ly Studio.<br>        Tác phẩm nhanh chóng thu hút sự quan tâm của cộng đồng độc giả nhờ nội dung hấp dẫn, diễn biến lôi cuốn và hệ thống nhân vật xây dựng chỉn chu.<br>        Hiện tại, truyện đã đạt hơn 19444 lượt theo dõi và vẫn đang được cập nhật đều đặn.<br>        Chương mới nhất là Chương 322, được cập nhật vào ngày 04/06/2026, giúp người đọc dễ dàng nắm bắt kịp thời diễn biến mới nhất của câu chuyện.<br>        Điểm nổi bật của Trở Về Làm Đại Lão Thời Mạt Thế nằm ở cách triển khai tình huống hợp lý, kết hợp giữa yếu tố giải trí và cảm xúc, mang đến trải nghiệm đọc mượt mà.<br>        Bản dịch từ Lưu Ly Studio cũng góp phần giữ vững tinh thần nguyên tác, tạo cảm giác thân thuộc và dễ tiếp cận cho độc giả.<br>        Đọc ngay Trở Về Làm Đại Lão Thời Mạt Thế để không bỏ lỡ những diễn biến hấp dẫn! Nhấn Theo dõi ZetTruyen để cập nhật chương mới sớm nhất! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 321 chapters |  |  |  |
| chapter dates | PASS | 321 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn3.zetimage.com/.../0.jpg` (image/jpeg, 76334 bytes, 883x1000) |  |  |  |
