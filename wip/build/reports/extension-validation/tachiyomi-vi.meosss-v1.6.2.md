# Extension Validation Report

- Extension: tachiyomi-vi.meosss-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6733296438137670174
- Source name: MeoSSS
- Source language: vi
- Selected manga input: popular offset 0: Bức Chân Dung Của Niềm Kiêu Hãnh (`.../buc-chan-dung-cua-niem-kieu-hanh`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Bức Chân Dung Của Niềm Kiêu Hãnh (`.../buc-chan-dung-cua-niem-kieu-hanh`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 28 | Vô Đề (`.../vo-de`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 28 | Nam Nữ Thụ Thụ Bất Tương Thân (`.../nam-nu-thu-thu-bat-tuong-than`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Bức Chân Dung Của Niềm Kiêu Hãnh (`.../buc-chan-dung-cua-niem-kieu-hanh`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Bức Chân Dung Của Niềm Kiêu Hãnh (`.../buc-chan-dung-cua-niem-kieu-hanh`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 17 | Chap 0: MỞ ĐẦU (`.../chap-0`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 7 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 28 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Bức Chân Dung Của Niềm Kiêu Hãnh, URL=`.../buc-chan-dung-cua-niem-kieu-hanh` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 77/77 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 77/77 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://meosss.com/.../BUC-CHAN-DUNG-300x400.webp` (image/webp (container: extended), 24776 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../buc-chan-dung-cua-niem-kieu-hanh` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://meosss.com/.../BUC-CHAN-DUNG-450x600.webp` (image/webp (container: extended), 43150 bytes, 450x600) |  |  |  |
| details author | PASS | 달슬 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 18+, 1x1, Bối Cảnh Phương Tây, Cao H, Chàng Trai Bị Ám Ảnh, Chàng Trai Có Thể Lực Vượt Trội, Chàng Trai Hối Hận, Chàng Trai Hư / Badboy, Chàng Trai Lạnh Lùng, Chàng Trai Mưu Mô, Chàng Trai Ngạo Mạn, Chàng Trai Tài Giỏi, Chênh Lệch Thân Phận / Giai Cấp / Địa Vị, Chiếm Hữu, Chuyển Thể Từ Novel, Cô Nàng Dịu Dàng, Cô Nàng Tài Giỏi, Cô Nàng Từng Bị Tổn Thương, Dark Romance, Dirty Talk, Hiểu Lầm, Hoàng Gia / Quý Tộc, Lãng Mạn, Manhwa, Mối Quan Hệ "Kẻ Trên Người Dưới", Ngược, Trinh Thám / Giật Gân, Yêu Hận Đan Xen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “Người ta đồn rằng ngài ấy muốn có một đứa trẻ không thể nhìn thấy. Để làm cung nữ phục vụ phòng ngủ cho Hoàng thái tử.” Diana, một nữ hầu được cử đến nhằm kéo vị Hoàng thái tử đang đứng trên đỉnh cao của quyền lực rơi xuống vực thẳm. “Đại hoàng huynh vốn có bản tính dịu dàng, đa cảm. Ngài ấy rất dễ mềm lòng trước những thứ mỏng manh và xinh đẹp. Thế nên, nhiệm vụ của ngươi là che mắt và bịt tai ngài ấy lại. Cho đến ngày ta đến để lấy cái đầu của hắn.” Không, chắc chắn là cả thế giới này đã hiểu lầm người đàn ông này một cách trầm trọng rồi. Diana oằn mình trong cơn khoái lạc ập đến tựa sấm sét, cô thầm gào thét trong vô vọng. Rằng kẻ đã đẩy cô đến chốn này đã sai hoàn toàn rồi. Diana chưa từng thấy một con quỷ nào tàn nhẫn và mê hoặc đến nhường ấy. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | PASS | 17 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.meosss.com/.../012b2fb73418-0-credit-meosss.webp` (image/webp (container: extended), 43490 bytes, 720x720) |  |  |  |
