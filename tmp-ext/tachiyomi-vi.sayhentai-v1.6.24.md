# Extension Validation Report

- Extension: tachiyomi-vi.sayhentai-v1.6.24
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: manhwaz
- Source ID: 4370817879994829481
- Source name: SayHentai
- Source language: vi
- Selected manga input: popular offset 0: Tôi đã thịt sạch gái trong lớp sau tốt nghiệp (`.../truyen-toi-da-thit-sach-gai-trong-lop-sau-tot-nghiep.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Tôi đã thịt sạch gái trong lớp sau tốt nghiệp (`.../truyen-toi-da-thit-sach-gai-trong-lop-sau-tot-nghiep.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Mối tình xuất phát từ sân trượt (`.../truyen-moi-tinh-xuat-phat-tu-san-truot.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | chà đạp nàng Elf dâm đãng (`.../truyen-cha-dap-nang-elf-dam-dang.html`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 40 | Tôi đã thịt sạch gái trong lớp sau tốt nghiệp (`.../truyen-toi-da-thit-sach-gai-trong-lop-sau-tot-nghiep.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tôi đã thịt sạch gái trong lớp sau tốt nghiệp (`.../truyen-toi-da-thit-sach-gai-trong-lop-sau-tot-nghiep.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | Chapter 1 (`.../chuong-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tôi đã thịt sạch gái trong lớp sau tốt nghiệp, URL=`.../truyen-toi-da-thit-sach-gai-trong-lop-sau-tot-nghiep.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 132/132 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 132/132 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://sayhentai.cx/.../6a54ada3adb37123123 (1).png` (image/png, 660591 bytes, 584x817) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../truyen-toi-da-thit-sach-gai-trong-lop-sau-tot-nghiep.html` |  |  |  |
| details thumbnail URL | PASS | `https://sayhentai.cx/.../6a54ada3adb37123123 (1).png` |  |  |  |
| details author | PASS | ... |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Harem, Manhwa, 18+, Rape, Milf |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Bạn đang theo dõi chương mới nhất của truyện Tôi đã thịt sạch gái trong lớp sau tốt nghiệp trên SayHentai. Chúng tôi liên tục cập nhật kho truyện hentai mỗi ngày, đảm bảo bạn sẽ không bỏ lỡ bất kỳ diễn biến kịch tính nào của bộ Tôi đã thịt sạch gái trong lớp sau tốt nghiệp. So với các nền tảng khác như Hentaicube hay Nettruyen, SayHentai tập trung tối ưu hóa trải nghiệm người dùng trên mobile, giúp việc đọc truyện 18+ trở nên mượt mà hơn bao giờ hết. Hãy nhấn theo dõi bộ truyện để nhận thông báo sớm nhất về các chap tiếp theo của Tôi đã thịt sạch gái trong lớp sau tốt nghiệp nhé. ... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.pubtranxzyzz.store/.../6a54adc037b02.jpg <redacted query values: token and expires>` (image/jpeg, 1457305 bytes, 729x11923) |  |  |  |
