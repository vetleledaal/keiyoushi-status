# Extension Validation Report

- Extension: tachiyomi-vi.truyentini-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7837268511554362907
- Source name: TruyenTini
- Source language: vi
- Selected manga input: popular offset 0: Vụng trộm không thể giấu (`.../263`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Vụng trộm không thể giấu (`.../263`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Mong ước của ác ma (`.../278`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Duyên Nợ Oái Oăm (`.../2375`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Sếp Ơi Sao Thế? (`.../2345`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Vụng trộm không thể giấu (`.../263`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Vụng trộm không thể giấu (`.../263`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 220 | Chương 1 (`.../chuong-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 99 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Vụng trộm không thể giấu, URL=`263` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://truyentini.net/.../492009590_1076312457865120_6651338255004184116_n.jpg` (image/jpeg, 194240 bytes, 900x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `263` |  |  |  |
| details thumbnail URL | PASS | `https://truyentini.net/.../492009590_1076312457865120_6651338255004184116_n.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Boss Tini |  |  |  |
| details genres | PASS | Chưa phân loại, Drama, harem, Hoàn Thành, Lãng mạn, Manhua, Manhua BG, Tình Cảm |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Bộ truyện tranh Vụng trộm không thể giấu (Hidden love) của tác giả Trúc Dĩ với nội dung chính của truyện xoay quanh mối tình kéo dài từ thanh xuân vườn trường đến khi trưởng thành của cặp đôi Tang Trĩ và Đoàn Gia Hứa. Tang Trĩ là cô bé nghịch ngợm, có người anh trai hơn 7 tuổi là Tang Diên.<br><br>Năm 14 tuổi, Tang Trĩ trong một lần gây rắc rối ở trường nên bị mời phụ huynh. Cô bé không dám nói bố mẹ nên nhờ anh trai đến trường gặp thầy giáo. Anh trai rất thích trêu chọc em gái nên phũ phàng từ chối. Khi lên phòng anh để năn nỉ, Tang Trĩ tình cờ chạm mặt trai đẹp Đoàn Gia Hứa. Gia Hứa là bạn học với Tang Diên, sở hữu ngoại hình bảnh trai hoàn hảo. Tang Trĩ vừa gặp đã bị vẻ đẹp trai của Gia Hứa làm cho mê muội. Từ đó, Tang Trĩ đem lòng thầm thương trộm nhớ bạn của anh trai mình.<br><br>Về phần Gia Hứa, anh cũng rất dịu dàng và ân cần với cô gái nhỏ. Tuy nhiên, anh luôn nghĩ mình yêu thương cô với tình cảm anh trai em gái. Khi Đoàn Gia Hứa tốt nghiệp đại học, cả hai ít có cơ hội gặp gỡ. Một số hiểu lầm nho nhỏ xảy ra khiến Gia Hứa và Tang Trĩ ngày càng xa cách. Cho đến khi Tang Trĩ học đại học tại cùng thành phố với Gia Hứa, họ mới gặp lại nhau.<br><br>Trải qua nhiều biến cố, cả hai dần trưởng thành. Cặp đôi cũng dần nhận ra tình cảm thật sự của mình dành cho đối phương. Tình cảm ngây ngô của cô em gái nhỏ năm nào được đền đáp xứng đáng. Họ cùng viết nên cái kết kẹo ngọt cho mối tình lâu năm này.<br><br>Alternative Names: Đang cập nhật |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 220 chapters |  |  |  |
| chapter dates | PASS | 220 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 99 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://truyentini.net/.../000_result.webp` (image/webp (encoding: lossy), 261678 bytes, 2048x1148) |  |  |  |
