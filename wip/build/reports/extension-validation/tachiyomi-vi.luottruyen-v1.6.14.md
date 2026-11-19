# Extension Validation Report

- Extension: tachiyomi-vi.luottruyen-v1.6.14
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6560112192335153780
- Source name: LuotTruyen
- Source language: vi
- Selected manga input: popular offset 0: Đại Quản Gia Là Ma Hoàng (`.../dai-quan-gia-la-ma-hoang-2844`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 54 | Đại Quản Gia Là Ma Hoàng (`.../dai-quan-gia-la-ma-hoang-2844`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 54 | Bậc Thầy Thiết Kế Điền Trang (`.../bac-thay-thiet-ke-dien-trang-3679`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 54 | Hoán Đổi Diệu Kỳ (`.../hoan-doi-dieu-ky-4508`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 54 | Đứa Con Hoang Cấp 10 Nhà Bá Tước (`.../dua-con-hoang-cap-10-nha-ba-tuoc-18649`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Đại Quản Gia Là Ma Hoàng (`.../dai-quan-gia-la-ma-hoang-2844`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Đại Quản Gia Là Ma Hoàng (`.../dai-quan-gia-la-ma-hoang-2844`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 954 | Chapter 0 (`.../1333088`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

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
| popular listing | PASS | 54 entries |  |  |  |
| latest listing | PASS | 54 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Đại Quản Gia Là Ma Hoàng, URL=`.../dai-quan-gia-la-ma-hoang-2844` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 217/217 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 217/217 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img3.dichvucdn.com/.../dai-quan-gia-la-ma-hoang.jpg` (image/jpeg, 36987 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../dai-quan-gia-la-ma-hoang-2844` |  |  |  |
| details thumbnail URL | PASS | `https://img3.dichvucdn.com/.../dai-quan-gia-la-ma-hoang.jpg` |  |  |  |
| details author | PASS | Đang cập nhật |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Manhua, Cổ Đại, Xuyên Không, Chuyển Sinh, Huyền Huyễn, Tu Tiên, HOT |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Cảnh giới truyện Truyện Đại Quản Gia Là Ma Hoàng thì như sau:<br>\+ THÂN THỂ:<br>– Tụ khí cảnh<br>– Đoạn cốt cảnh<br>– Thiên huyền cảnh «Lấy tên truy đuổi hư không chi ý, đạt tới loại cảnh giới này, có thể tự do bay lượn, tại thiên không phi hành»<br>– Thần chiếu cảnh «sinh ra thần thức, tinh thần ngoại phóng, coi như không cần mắt thường, đều có thể tiến hành phân rõ, quan sát»<br>\+ LINH HỒN<br>– Hóa hư cảnh<br>– Dung hồn cảnh<br>– Quy nguyên cảnh<br>(những cảnh giới này là tối đa ở hạ giới vì thiên đế đã phong ấn linh khí)<br>\+ THÁNH VỰC:<br>– Linh vương cảnh<br>– Hoàng giải cảnh (cảnh giới của main ở kiếp trước)<br>– Thánh cảnh «tuyệt đại đa số người ít có thể đạt tới cảnh giới này, mà mỗi một vị thánh giả đều là đứng tại thánh vực đỉnh phong cường giả (tuy nói thế thôi nhưng Thánh cảnh đông như kiến á ://)»<br>– Đế cảnh «Là cảnh giới cao nhất, thánh vực kẻ thống trị. Xưng là Thượng Cổ Thập Đế, số lượng là trời sinh lại cố định, dưới tình huống bình thường sẽ không biến hóa, người bình thường không cách nào thông qua tu luyện đạt tới này cảnh giới.<br>số lượng 10 người là trời sinh lại cố định. Tuy nhiên có thể thay đổi người chưởng khống»<br>– Vô thượng cảnh «Đột phá đế cảnh ràng buộc, thu hoạch được tiến về càng xa thế giới tư cách»<br>– Thiên địa cảnh (là cảnh giới chấp trưởng vũ trụ) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 954 chapters |  |  |  |
| chapter dates | PASS | 954 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://luottruyen999.com/.../1333088` to `https://luottruyen999.com/.../Login <redacted query values: ReturnUrl>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
