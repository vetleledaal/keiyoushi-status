# Extension Validation Report

- Extension: tachiyomi-vi.meosss-v1.6.10
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source theme: initmanga
- Source ID: 6733296438137670174
- Source name: MeoSSS
- Source language: vi
- Selected manga input: popular offset 0: [KHÔNG CHE] Không Tỉnh Táo (`.../khong-che-khong-tinh-tao`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 28 | [KHÔNG CHE] Không Tỉnh Táo (`.../khong-che-khong-tinh-tao`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 28 | [KHÔNG CHE] Đối Tác Trong Công Việc (`.../doi-tac-trong-cong-viec`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 28 | Trong Nhà Vệ Sinh Nữ Cùng Thần Tượng (`.../trong-nha-ve-sinh-nu-cung-than-tuong`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 28 | Hoàn Cảnh Của Rác Rưởi (`.../hoan-canh-cua-rac-ruoi`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | [KHÔNG CHE] Không Tỉnh Táo (`.../khong-che-khong-tinh-tao`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [KHÔNG CHE] Không Tỉnh Táo (`.../khong-che-khong-tinh-tao`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 26 | Chương 1 (`.../chap-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | <1s |

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
| popular listing | PASS | 28 entries |  |  |  |
| latest listing | PASS | 28 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[KHÔNG CHE\] Không Tỉnh Táo, URL=`.../khong-che-khong-tinh-tao` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 122/122 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 122/122 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://meosss.com/.../HOUFSIFaYAAObbT-300x400.webp` (image/webp (container: extended), 321784 bytes, 1707x2560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../khong-che-khong-tinh-tao` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://meosss.com/.../HOUFSIFaYAAObbT-scaled.webp` was not downloaded |  |  |  |
| details author | PASS | Kwak Du Pal |  |  |  |
| details artist | PASS | Chunpok |  |  |  |
| details genres | PASS | 18+, Cao H, Chàng Trai Nổi Tiếng, Chàng Trai Quyến Rũ, Chàng Trai Tsundere, Chuyển Thể Từ Novel, Cô Nàng Bạo Dạn, Cô Nàng Còn Zin, Cô Nàng Thẳng Thắn, Hiện Đại, Hiểu Lầm, Mối Quan Hệ Mập Mờ, Tài Phiệt / Chaebol, Tình Yêu Trong Khuôn Viên Trường |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Baek Seong Chan chính là một "trai hư" chính hiệu — tóc tẩy bạch kim, thay siêu xe như thay áo và sở hữu ngoại hình đẹp đến nghẹt thở. Anh luôn là tâm điểm của mọi lời đồn đại ăn chơi trác táng trên khắp học đường.<br><br>Nhưng Ye Na thì chẳng quan tâm đến mớ thị phi đó. Cô chỉ muốn thực hiện một mục tiêu duy nhất trong danh sách việc cần làm: "Nếm trái cấm".<br><br>Nghĩ là làm, Ye Na thẳng thắn đề nghị Seong Chan ngủ với mình chỉ vì anh là người ngon nghẻ nhất ở trường. Sự dửng dưng và trực diện của cô lập tức đảo lộn thế giới của Seong Chan — kẻ vốn chỉ quen được các cô gái theo đuổi vì tình yêu lãng mạn.<br><br>Trò chơi săn mồi chính thức bắt đầu, và cuộc vui này chắc chắn sẽ không dành cho những kẻ tỉnh táo.<br><br>Tên khác: 낫 소버 (Not Sober) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 26 chapters |  |  |  |
| chapter dates | PASS | 26 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://meosss.com/.../0001.jpg` (image/jpeg, 1782664 bytes, 900x16875) |  |  |  |
