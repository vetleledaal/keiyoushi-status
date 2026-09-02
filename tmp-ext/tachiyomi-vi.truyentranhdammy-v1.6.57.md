# Extension Validation Report

- Extension: tachiyomi-vi.truyentranhdammy-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3809566188515992024
- Source name: Truyện tranh đam mỹ
- Source language: vi
- Selected manga input: popular offset 0: NGHỊCH TẬP CHI HẢO DỰNG NHÂN SINH (`.../200`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | NGHỊCH TẬP CHI HẢO DỰNG NHÂN SINH (`.../200`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Nương Nương Khang (`.../6397`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Ái Chi Dục Kỳ Sinh [Hệ thống sát thê] (`.../13220`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | QUAN CHỈ HUY LẠNH LÙNG VỪA HÔN LÀ KHÓC (`.../12692`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | NGHỊCH TẬP CHI HẢO DỰNG NHÂN SINH (`.../200`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | NGHỊCH TẬP CHI HẢO DỰNG NHÂN SINH (`.../200`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 431 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 102 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=NGHỊCH TẬP CHI HẢO DỰNG NHÂN SINH, URL=`200` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://truyentranhdammyy.site/.../anh-bia-NGHICH-TAP-CHI-HAO-DUNG-NHAN-SINH-175x238.png` (image/png, 89125 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `200` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://truyentranhdammyy.site/.../anh-bia-NGHICH-TAP-CHI-HAO-DUNG-NHAN-SINH-193x278.png` (image/png, 111306 bytes, 193x278) |  |  |  |
| details author | PASS | Meomeoteam |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ĐAM MỸ - DANH MỤC, ĐAM MỸ HOÀN, ĐAM MỸ SỦNG, Gương vỡ lại lành, HUYỀN HUYỄN, MANHUA, SINH TỬ VĂN, TRỌNG SINH, TRUY THÊ, TRUYỆN HOÀN, cauthang4, manhuadammy, meomeoteam, meomeoteamtruyentranhdammy, nghichtapchihaodungnhansinh, nienhacong, truyentranhdammy, Truyentranhdammyhay, truyentranhdammyy |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Tên truyện: Nghịch Tập Chi Hảo Dựng Nhân Sinh<br><br>Việt hóa bởi MEOMEOTEAM<br><br>Thể loại : Đô Thị – Phản Trọng Sinh – Hào Môn – Hắc Bang – Đam Mỹ – Manhua – Truyện Màu – Sinh Tử Văn<br><br>Nội dung: Phản trọng sinh hiểu nôm na là nhân vật phụ trọng sinh lại cướp hết hào quang của nhân vật chính , cụ thể ở đây là cướp đi tất cả của bé thụ nhà ta . Nhân vật : Từ Từ Niên x Cù Thành , Từ Từ Niên trong một ngày mất đi bạn trai quen nhau 4 năm , ông nội yêu thương cậu nhất , ….bị tống vào tù … đã thế còn bị lưu manh sàm sỡ dẫn đến mang thai …. truyện tiếp theo như thế nào các bạn đón xem các chap tiếp theo nhé ~ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 431 chapters |  |  |  |
| chapter dates | PASS | 431 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `chapter-335` at offsets 73, 74, `chapter-334` at offsets 75, 76, `chapter-333` at offsets 77, 78, `chapter-332` at offsets 79, 80, `chapter-331` at offsets 81, 82, `chapter-330` at offsets 83, 84, `chapter-329` at offsets 85, 86, `chapter-328` at offsets 87, 88, `chapter-327` at offsets 89, 90, `chapter-326` at offsets 91, 92, `chapter-325` at offsets 93, 94, `chapter-324` at offsets 95, 96, `chapter-323` at offsets 97, 98, `chapter-322` at offsets 99, 100, `chapter-321` at offsets 101, 102, `chapter-320` at offsets 103, 104, `chapter-319` at offsets 105, 106, `chapter-318` at offsets 107, 108, `chapter-317` at offsets 109, 110, `chapter-316` at offsets 111, 112, `chapter-315` at offsets 113, 114, `chapter-314` at offsets 115, 116, `chapter-313` at offsets 117, 118 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 102 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://truyentranhdammyy.site/.../001.jpg` (image/webp (encoding: lossy), 102374 bytes, 1099x1328; server Content-Type: image/jpeg) |  |  |  |
