# Extension Validation Report

- Extension: tachiyomi-vi.nettruyens-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6085559443545258070
- Source name: NetTruyenS (unoriginal)
- Source language: vi
- Selected manga input: popular offset 0: Võ Luyện Đỉnh Phong (`.../vo-luyen-dinh-phong`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | Võ Luyện Đỉnh Phong (`.../vo-luyen-dinh-phong`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | Nụ Hoa Trên Đỉnh Ngày Ấy Đã Nở Rồi! (`.../nu-hoa-tren-dinh-ngay-ay-da-no-roi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Võ Luyện Đỉnh Phong (`.../vo-luyen-dinh-phong`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Võ Luyện Đỉnh Phong (`.../vo-luyen-dinh-phong`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3866 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Võ Luyện Đỉnh Phong, URL=`.../vo-luyen-dinh-phong` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://st.netcdn.one/.../vo-luyen-dinh-phong.jpg <redacted query values: 1736694012>` (image/jpeg, 77825 bytes, 360x504) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../vo-luyen-dinh-phong` |  |  |  |
| details thumbnail URL | PASS | `https://st.netcdn.one/.../vo-luyen-dinh-phong.jpg <redacted query values: 1736694012>` |  |  |  |
| details author | PASS | Momo (莫默) - Pikapi (噼咔噼) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Fantasy, Manhua, Martial Arts, Shounen, Supernatural, Truyện Màu |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Võ đạo đỉnh phong, là cô độc, là tịch mịch, là dài đằng đẵng cầu tác, là cao xử bất thắng hàn Phát triển trong nghịch cảnh, cầu sinh nơi tuyệt địa, bất khuất không buông tha, mới có thể có thể phá võ chi cực đạo. Lăng Tiêu các thí luyện đệ tử kiêm quét rác gã sai vặt Dương Khai ngẫu lấy được một bản vô tự hắc thư, từ nay về sau đạp vào dài đằng đẵng võ đạo.<br><br>Tên khác: 武炼巅峰; Martial Peak |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3866 chapters |  |  |  |
| chapter dates | PASS | 3866 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://nettruyen13s.com/.../tim-kiem-nang-cao <redacted query values: sort>` to `https://nettruyen14s.com/.../tim-kiem-nang-cao <redacted query values: sort>` (2 redirects); popular: `https://nettruyen13s.com/.../danh-sach-truyen` to `https://nettruyen14s.com/.../danh-sach-truyen` (2 redirects); popular: `https://nettruyen13s.com/.../vo-luyen-dinh-phong` to `https://nettruyen14s.com/.../vo-luyen-dinh-phong` (2 redirects); popular: `https://nettruyen13s.com/.../search <redacted query values: keyword>` to `https://nettruyen14s.com/.../search <redacted query values: keyword>` (2 redirects); popular: `https://nettruyen13s.com/.../chapter-1` to `https://nettruyen14s.com/.../chapter-1` (2 redirects) |  |  |  |
| page load | PASS | `https://i2.netcdn.one/.../0000.webp` (image/webp (encoding: lossy), 146724 bytes, 800x1131) |  |  |  |
