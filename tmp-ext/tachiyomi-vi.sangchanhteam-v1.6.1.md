# Extension Validation Report

- Extension: tachiyomi-vi.sangchanhteam-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3763639620364244824
- Source name: SangChanhTeam
- Source language: vi
- Selected manga input: popular offset 0: Kết Cục Của Nhân Vật Phản Diện Chỉ Có Thể Là Cái Chết (`.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Kết Cục Của Nhân Vật Phản Diện Chỉ Có Thể Là Cái Chết (`.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 5 | Hướng Dẫn Sinh Tồn Dành Cho Người Xếp Hạng (`.../huong-dan-sinh-ton-danh-cho-nguoi-xep-hang`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Hệt Như Hàn Quang Gặp Nắng Gắt (`.../het-nhu-han-quang-gap-nang-gat`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 5 | Cha À, Con Không Muốn Kết Hôn Đâu! (`.../cha-a-con-khong-muon-ket-hon-dau`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | Kết Cục Của Nhân Vật Phản Diện Chỉ Có Thể Là Cái Chết (`.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kết Cục Của Nhân Vật Phản Diện Chỉ Có Thể Là Cái Chết (`.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 215 | Chương 0 (`.../chap-0`) |  | 1-10s |
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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kết Cục Của Nhân Vật Phản Diện Chỉ Có Thể Là Cái Chết, URL=`.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 68/68 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 68/68 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://sangchanhteam.com/.../Ket-Cuc-Cua-Nhan-Vat-Phan-Dien-Chi-Co-The-La-Cai-Chet.webp` (image/webp (container: extended), 153788 bytes, 720x1030) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://sangchanhteam.com/.../Ket-Cuc-Cua-Nhan-Vat-Phan-Dien-Chi-Co-The-La-Cai-Chet-450x600.webp` (image/webp (container: extended), 68354 bytes, 450x600) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Âu Cổ, Drama, Fantasy, Manhwa, Romance, Tình Cảm, Truyện Màu, Xuyên Không |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Penelope Eckart tái sinh thành con gái nuôi của Công tước Eckart và là nhân vật phản diện trong một trò chơi hẹn hò theo phong cách harem ngược. Vấn đề là, cô ấy lạc vào trò chơi ở cấp độ khó nhất, và dù cho cô ấy có làm gì, thì cái chết luôn đợi cô ấy ở điểm kết thúc! Trước khi “con gái ruột” của Công tước Eckart xuất hiện, cô ấy bắt buộc phải chọn một người trong giàn harem của công chúa nhằm hướng đến một cái kết có hậu để có thể sống sót. Nhưng hai người anh trai luôn gây gổ với cô từ những thứ rất nhỏ nhặt, cũng như là vị hoàng tử điên dại kia, và dĩ nhiên con đường của họ chỉ có thể dẩn đến cái chết. Thậm chí còn có một pháp sư hết lòng say mê nữ chính, cùng với một tên nô lệ hiệp sĩ trung thành. Nhưng bằng cách nào đó, đồng hồ đo độ hảo cảm của các nhân vật nam ngày càng tăng khi cô vượt qua ranh giới với họ! Đây là câu chuyện sinh tồn điên rồ của Penelope, người bị bỏ rơi trong trò chơi hẹn hò harem ngược này!*Chú thích: Nếu một bộ Anime Harem thông thường là nhân vật nam chính được vây quanh bởi sự yêu thích của những cô gái, thì Anime harem ngược là cốt truyện của một cô gái bình thường được bao quanh bởi các chàng trai đẹp và họ luôn tìm cách để có được trái tim của cô ấy |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 215 chapters |  |  |  |
| chapter dates | PASS | 215 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
