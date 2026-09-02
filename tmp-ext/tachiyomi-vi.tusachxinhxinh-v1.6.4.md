# Extension Validation Report

- Extension: tachiyomi-vi.tusachxinhxinh-v1.6.4
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8868105176150575136
- Source name: TuSachXinhXinh
- Source language: vi
- Selected manga input: popular offset 0: Kết Cục Của Nhân Vật Phản Diện Chỉ Có Thể Là Cái Chết (`.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Kết Cục Của Nhân Vật Phản Diện Chỉ Có Thể Là Cái Chết (`.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 32 | Cặp Đôi Không Chính Thức (`.../cap-doi-khong-chinh-thuc`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Sự Điều Trị Đặc Biệt Của Tinh Linh (`.../su-dieu-tri-dac-biet-cua-tinh-linh`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kết Cục Của Nhân Vật Phản Diện Chỉ Có Thể Là Cái Chết (`.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kết Cục Của Nhân Vật Phản Diện Chỉ Có Thể Là Cái Chết (`.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 215 | Chap 0 (`.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet-chap-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| latest listing | PASS | 32 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kết Cục Của Nhân Vật Phản Diện Chỉ Có Thể Là Cái Chết, URL=`.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 2 manga entries: title=Tình Yêu Của Iseop, URL=`.../tinh-yeu-cua-iseop`, title=Quan Hệ Cộng Sinh Giữa Báo Đen Và Thỏ Trắng, URL=`.../quan-he-cong-sinh-giua-bao-den-va-tho-trang` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tusachxinhxinh12.online/.../655DF33A-A90E-49F4-9D7C-AB76D8CF778D.webp` (image/webp (encoding: lossy), 188596 bytes, 720x1030) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://tusachxinhxinh12.online/.../655DF33A-A90E-49F4-9D7C-AB76D8CF778D-720x970.webp` (image/webp (encoding: lossy), 181644 bytes, 720x970) |  |  |  |
| details author | PASS | Đang cập nhật |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasy, Manhwa, Harem, Romance, Supernatural, Xuyên Không, Tình Cảm, Webtoon, manhwa hot |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Giới thiệu Kết Cục Của Nhân Vật Phản Diện Chỉ Có Thể Là Cái Chết Thứ game quái đản gì đây?! Nó như đang giật dây điều khiển hết cả cuộc đời tôi vậy… Khoan đã, gì đây? –CHẾ ĐỘ KHÓ ĐƯỢC KÍCH HOẠT– Không, Không, Không, Khônggggg!!! Nó thực sự đã bắt tôi nhập vai vào Penelope Eckart rồi nè! Khiến đối tượng chinh phục mê đắm nữ chính thì dễ, còn một nhân vật phản diện thì biết phải làm sao đây?! Tôi phải cố gắng giữ cái mạng này khỏi mấy tên anh trai.. và hoàng thái tử… và mấy món đồ sắc nhọn như là nĩa chẳng hạn… Áaa, thứ nào cũng có thể dẫn đến cái chết vậy nè. Thế giới này đang chống lại tôi, nhưng liệu trí thông minh và kiến thức đã chơi game từ trước có đủ để tôi thành công cứu vớt độ hảo cảm của mấy tên này không?? Ở đây có nút RESET chứ??? ———————————————————————— Đón đọc truyện sớm nhất tại website Tủ sách xinh xinh. Truyện thuộc thể loại manhwa. Truyện Kết Cục Của Nhân Vật Phản Diện Chỉ Có Thể Là Cái Chết dự sẽ là manhwa hot, thường được cập nhật nhanh nhất tại web Tủ Sách Xinh Xinh do 2 nhóm Bông-er thực hiện. Ngoài ra, còn rất nhiều thể loại hấp dẫn, thú vị cùng với nhiều đầu truyện hay và hoàn toàn miễn phí được các bạn độc giả đón đọc. — Xem Thêm — |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 215 chapters |  |  |  |
| chapter dates | PASS | 215 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://tusachxinhxinh12.online/.../ChatGPT-Image-22_02_55-30-thg-4-2026.webp` (image/webp (container: extended), 130234 bytes, 1672x941) |  |  |  |
