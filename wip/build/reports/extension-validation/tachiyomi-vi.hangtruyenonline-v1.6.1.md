# Extension Validation Report

- Extension: tachiyomi-vi.hangtruyenonline-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2658264403201402304
- Source name: HangTruyenOnline
- Source language: vi
- Selected manga input: popular offset 0: Võ Luyện Đỉnh Phong (`.../vo-luyen-dinh-phong`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Võ Luyện Đỉnh Phong (`.../vo-luyen-dinh-phong`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | Mỗi Tuần Ta Có Một Nghề Nghiệp Mới (`.../moi-tuan-ta-co-mot-nghe-nghiep-moi`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | Người Giữ Cửa Vạn Giới (`.../nguoi-giu-cua-van-gioi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Vương Giả Thiên Hạ (`.../vuong-gia-thien-ha`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Võ Luyện Đỉnh Phong (`.../vo-luyen-dinh-phong`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Võ Luyện Đỉnh Phong (`.../vo-luyen-dinh-phong`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3898 | Chapter 1 (`.../chapter-1`) |  | <1s |
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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Võ Luyện Đỉnh Phong, URL=`.../vo-luyen-dinh-phong` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Vương Giả Thiên Hạ, URL=`.../vuong-gia-thien-ha` at page 1 offset 5 and page 2 offset 0, title=Vạn Cổ Kiếm Thần, URL=`.../van-co-kiem-than` at page 1 offset 6 and page 2 offset 1, title=Ngục Tối Black Haze, URL=`.../nguc-toi-black-haze` at page 1 offset 7 and page 2 offset 2, title=Free! Doujinshi- Rin X Gou, URL=`.../free-doujinshi-rin-x-gou` at page 1 offset 8 and page 2 offset 3, title=Gậy Gỗ Cấp 99+, URL=`.../gay-go-cap-99` at page 1 offset 9 and page 2 offset 4 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.hangtruyen.online/.../vo-luyen-dinh-phong.jpg` (image/jpeg, 20637 bytes, 190x247) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../vo-luyen-dinh-phong` |  |  |  |
| details thumbnail URL | PASS | `https://api.hangtruyen.online/.../vo-luyen-dinh-phong.jpg` |  |  |  |
| details author | PASS | NetTruyen Web Team |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Tu Tiên |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3898 chapters |  |  |  |
| chapter dates | PASS | 3898 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://api.hangtruyen.online/.../0.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
