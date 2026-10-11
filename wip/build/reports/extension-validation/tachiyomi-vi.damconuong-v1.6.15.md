# Extension Validation Report

- Extension: tachiyomi-vi.damconuong-v1.6.15
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2680345917627448572
- Source name: DamCoNuong
- Source language: vi
- Selected manga input: popular offset 0: Sextoy kết nối không dây (`.../sextoy-ket-noi-khong-day`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Sextoy kết nối không dây (`.../sextoy-ket-noi-khong-day`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Phòng Chat Tệ Nạn- Nơi Tôi Trừng Trị Con Đĩ Bắt Nạt Mình (`.../phong-chat-te-nan-noi-toi-trung-tri-con-di-bat-nat-minh`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | ĐÊM TỒI TỆ CỦA SORAI SAKI (`.../dem-toi-te-cua-sorai-saki`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Thầy Giáo Sa Lưới (`.../thay-giao-sa-luoi`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | AI Dịch - Sextoy kết nối không dây (`.../sextoy-ket-noi-khong-day-ai`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sextoy kết nối không dây (`.../sextoy-ket-noi-khong-day`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 126 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Sextoy kết nối không dây, URL=`.../sextoy-ket-noi-khong-day` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 123/123 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 123/123 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://zs.wtcdn.xyz/.../08480820-bb4b-412c-a696-9fb43f517fef6a73161a67b6a.jpg` (image/jpeg, 61776 bytes, 500x662) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sextoy-ket-noi-khong-day` |  |  |  |
| details thumbnail URL | PASS | `https://zs.wtcdn.xyz/.../08480820-bb4b-412c-a696-9fb43f517fef6a73161a67b6a.jpg` |  |  |  |
| details author | PASS | Swehwangjorongie |  |  |  |
| details artist | PASS | Ottogi |  |  |  |
| details genres | PASS | Drama, Manhwa, Comedy, Ecchi, Fantasy, Milf, Adult, Ahegao, Comic, Harem, Romance, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Park Woojin, sinh viên kỹ thuật, mua nhầm một cái onahole “xịn” có chức năng kết nối không dây với cơ thể phụ nữ gần đó. Khi cậu dùng nó, mọi cảm giác sẽ truyền thẳng 100% đến cô gái mà cậu chọn (cô ấy sẽ “cảm nhận” như đang bị làm thật). Ngược lại, phản ứng của cô ấy cũng làm onahole tự cử động theo. Câu đầu tiên cậu shock: “Ủa, cái onahole… tự động rồi?!” Mục tiêu đầu tiên: Ahyoung – nữ thần xinh đẹp nhất trường. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 126 chapters |  |  |  |
| chapter dates | PASS | 126 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://dcnvn2.mbpro.vip/.../1.jpg` (image/jpeg, 1471208 bytes, 900x18590) |  |  |  |
