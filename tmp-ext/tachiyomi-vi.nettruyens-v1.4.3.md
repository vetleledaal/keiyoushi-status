# Extension Validation Report

- Extension: tachiyomi-vi.nettruyens-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6085559443545258070
- Source name: NetTruyenS (unoriginal)
- Source language: vi
- Selected manga input: popular offset 0: Võ Luyện Đỉnh Phong (`.../vo-luyen-dinh-phong`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 36 | Võ Luyện Đỉnh Phong (`.../vo-luyen-dinh-phong`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 36 | Gacha Vô Hạn (`.../gacha-vo-han`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Võ Luyện Đỉnh Phong (`.../vo-luyen-dinh-phong`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Võ Luyện Đỉnh Phong (`.../vo-luyen-dinh-phong`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 3866 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i2.netcdn.one/.../0000.webp` (image/webp (encoding: lossy), 146724 bytes, 800x1131) |  |  |  |
