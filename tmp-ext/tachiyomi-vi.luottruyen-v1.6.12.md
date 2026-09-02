# Extension Validation Report

- Extension: tachiyomi-vi.luottruyen-v1.6.12
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 1
- Warnings: 0
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
- Selected manga input: latest offset 0: Chúa tể hấp thụ kỹ năng (`.../chua-te-hap-thu-ky-nang-18943`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 54 | Đại Quản Gia Là Ma Hoàng (`.../dai-quan-gia-la-ma-hoang-2844`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 54 | Bậc Thầy Thiết Kế Điền Trang (`.../bac-thay-thiet-ke-dien-trang-3679`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 54 | Chúa tể hấp thụ kỹ năng (`.../chua-te-hap-thu-ky-nang-18943`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 54 | Kiếm Thánh Tái Sinh Vào Một Gia Tộc Pháp Sư Quý Tộc (`.../kiem-thanh-tai-sinh-vao-mot-gia-toc-phap-su-quy-toc-18915`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Chúa tể hấp thụ kỹ năng (`.../chua-te-hap-thu-ky-nang-18943`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Chúa tể hấp thụ kỹ năng (`.../chua-te-hap-thu-ky-nang-18943`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 9 | chapter 1 (`.../1613879`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Chúa tể hấp thụ kỹ năng, URL=`.../chua-te-hap-thu-ky-nang-18943` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 217/217 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 217/217 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img3.dichvucdn.com/.../20260901114011_001.png` (image/png, 538527 bytes, 478x680) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../chua-te-hap-thu-ky-nang-18943` |  |  |  |
| details thumbnail URL | PASS | `https://img3.dichvucdn.com/.../20260901114011_001.png` |  |  |  |
| details author | PASS | Đang cập nhật |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Manhwa, Hệ Thống, âu Cổ, HOT |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | <br>Lục địa đã rơi vào tay Hoàng đế, và Liên minh quân sự—niềm hy vọng cuối cùng của nhân loại—đã bị nghiền nát hoàn toàn. Trong khoảnh khắc tuyệt vọng cuối cùng này...<br><br>"Ad, đây là mệnh lệnh. Hãy hấp thụ trái tim tôi."<br><br>\[Hút cạn\]—một khả năng bẩm sinh để hoàn toàn hấp thụ tài năng và sức mạnh của người khác. Adrian hấp thụ trái tim của Ian, một anh hùng đang hấp hối và là người bạn thân nhất của anh, và quay ngược thời gian mười lăm năm về quá khứ, trở lại những ngày tháng làm một tên quý tộc lưu manh vô dụng.<br><br>"Ian... cậu muốn tôi cứu thế giới à? Xin lỗi, nhưng tôi chẳng quan tâm đến chuyện đó chút nào."<br><br>Kết hợp kinh nghiệm chiến đấu đẫm máu và tuyệt vọng từ kiếp trước, Hệ thống Người chơi mà anh ta dường như thừa hưởng từ Ian, và tiềm năng vô hạn của \[Devour\], Adrian bắt đầu phát triển với tốc độ đáng sợ và áp đảo.<br><br>"Nhưng ta hứa với các ngươi một điều. Ta sẽ truy lùng chúng đến tận cùng trái đất và xé nát tim chúng ra từng mảnh!!"<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
