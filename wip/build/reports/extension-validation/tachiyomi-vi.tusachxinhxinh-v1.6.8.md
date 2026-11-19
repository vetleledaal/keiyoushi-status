# Extension Validation Report

- Extension: tachiyomi-vi.tusachxinhxinh-v1.6.8
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 0
- Warnings: 2
- Skipped: 6
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: koi
- Source ID: 8868105176150575136
- Source name: TuSachXinhXinh
- Source language: vi
- Selected manga input: popular offset 0: Kết Cục Của Nhân Vật Phản Diện Chỉ Có Thể Là Cái Chết (`.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Kết Cục Của Nhân Vật Phản Diện Chỉ Có Thể Là Cái Chết (`.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 32 | Roxana: Phương Pháp Bảo Vệ Anh Trai Của Nữ Chính (`.../roxana-phuong-phap-bao-ve-anh-trai-cua-nu-chinh`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Dù Rơi Vào Truyện Kinh Dị, Tôi Vẫn Phải Đi Làm (`.../du-roi-vao-truyen-kinh-di-toi-van-phai-di-lam`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kết Cục Của Nhân Vật Phản Diện Chỉ Có Thể Là Cái Chết (`.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kết Cục Của Nhân Vật Phản Diện Chỉ Có Thể Là Cái Chết (`.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 211 | Chap 0 (`.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet-chap-0`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Chương này cần đăng nhập vào tài khoản phù hợp bằng webview để xem | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Chương này cần đăng nhập vào tài khoản phù hợp bằng webview để xem | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 32 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kết Cục Của Nhân Vật Phản Diện Chỉ Có Thể Là Cái Chết, URL=`.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=\[Novel\] Roxana: Phương Pháp Bảo Vệ Anh Trai Của Nữ Chính, URL=`.../novel-roxana-phuong-phap-bao-ve-anh-trai-cua-nu-chinh` at page 1 offset 21 and page 2 offset 16 |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 1 manga entry: title=Baby Đến Rồi, URL=`.../baby-den-roi` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tusachxinhxinh12.online/.../655DF33A-A90E-49F4-9D7C-AB76D8CF778D.webp` (image/webp (encoding: lossy), 188596 bytes, 720x1030) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ket-cuc-cua-nhan-vat-phan-dien-chi-co-the-la-cai-chet` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://tusachxinhxinh12.online/.../655DF33A-A90E-49F4-9D7C-AB76D8CF778D.webp` (image/webp (encoding: lossy), 188596 bytes, 720x1030) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasy, Manhwa, Harem, Romance, Supernatural, Xuyên Không, Tình Cảm, Webtoon |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Giới thiệu Kết Cục Của Nhân Vật Phản Diện Chỉ Có Thể Là Cái Chết**<br><br>Thứ game quái đản gì đây?! Nó như đang giật dây điều khiển hết cả cuộc đời tôi vậy… Khoan đã, gì đây?<br>–CHẾ ĐỘ KHÓ ĐƯỢC KÍCH HOẠT–<br>Không, Không, Không, Khônggggg!!!<br>Nó thực sự đã bắt tôi nhập vai vào Penelope Eckart rồi nè! Khiến đối tượng chinh phục mê đắm nữ chính thì dễ, còn một nhân vật phản diện thì biết phải làm sao đây?! Tôi phải cố gắng giữ cái mạng này khỏi mấy tên anh trai.. và hoàng thái tử… và mấy món đồ sắc nhọn như là nĩa chẳng hạn… Áaa, thứ nào cũng có thể dẫn đến cái chết vậy nè. Thế giới này đang chống lại tôi, nhưng liệu trí thông minh và kiến thức đã chơi game từ trước có đủ để tôi thành công cứu vớt độ hảo cảm của mấy tên này không?? Ở đây có nút RESET chứ???<br>————————————————————————<br><br>Đón đọc truyện sớm nhất tại website Tủ sách xinh xinh. Truyện thuộc thể loại manhwa.<br><br>Truyện **Kết Cục Của Nhân Vật Phản Diện Chỉ Có Thể Là Cái Chết** dự sẽ là \[manhwa hot\](https://tusachxinhxinh.com/.../manhwa), thường được cập nhật nhanh nhất tại web Tủ Sách Xinh Xinh do 2 nhóm \[Bông-er\](https://www.facebook.com/.../truyendich.bonger) thực hiện. Ngoài ra, còn rất nhiều thể loại hấp dẫn, thú vị cùng với nhiều đầu truyện hay và hoàn toàn miễn phí được các bạn độc giả đón đọc. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 211 chapters |  |  |  |
| chapter dates | PASS | 211 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Chương này cần đăng nhập vào tài khoản phù hợp bằng webview để xem |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
