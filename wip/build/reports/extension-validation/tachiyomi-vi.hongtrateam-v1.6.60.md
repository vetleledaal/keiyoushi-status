# Extension Validation Report

- Extension: tachiyomi-vi.hongtrateam-v1.6.60
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 3484418618819034374
- Source name: HongTraTeam
- Source language: vi
- Selected manga input: popular offset 0: Cây Không Rễ (`.../88`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Cây Không Rễ (`.../88`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Nói Tôi Nghe Điều Ước Của Cậu! (`.../2643`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Cây Không Rễ (`.../88`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Đêm Kinh Hoàng (`.../1833`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Cây Không Rễ (`.../88`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Cây Không Rễ (`.../88`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 116 | Chương 1 (`.../chuong-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cây Không Rễ, URL=`88` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hongtrateam.com/.../ckr-350x476.webp` (image/webp (encoding: lossy), 35608 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `88` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hongtrateam.com/.../ckr.webp` (image/webp (encoding: lossy), 261726 bytes, 1200x1600) |  |  |  |
| details author | PASS | Đang cập nhật |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ám Ảnh, Chênh lệch tuổi tác, Giam Cầm, Hiện Đại, Niên Hạ, Tâm Lý, Top Chiếm Hữu, Yêu Đơn Phương, 18+, Manhwa, Truyện Dài |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Mất mẹ – người thân duy nhất – trong một tai nạn từ khi còn nhỏ, Hee Seo lớn lên dưới sự nuôi dưỡng của cha mẹ nuôi, mang theo trong lòng nỗi tò mò về danh tính người đã âm thầm giúp đỡ cậu suốt bao năm qua. Vào cái đêm định mệnh khi cậu phải nhập viện vì một vụ phóng hỏa, Hee Seo cuối cùng cũng đối mặt với người mà cậu đã luôn khắc khoải muốn gặp… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 116 chapters |  |  |  |
| chapter dates | LINT | 1 of 116 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hongtrateam.com/.../0.jpg` (image/jpeg, 190314 bytes, 840x1120) |  |  |  |
