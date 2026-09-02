# Extension Validation Report

- Extension: tachiyomi-vi.truyentuoitho-v1.6.59
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 401563321854321005
- Source name: TruyenTuoiTho
- Source language: vi
- Selected manga input: popular offset 0: Nhóc Miko (`.../2644`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Nhóc Miko (`.../2644`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Ô long viện (`.../3476`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Tiểu Hòa Thượng Full – Nhất Viên & 12 Linh Thú (`.../9964`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Nữ hoàng rắc rối (`.../8773`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | Nhóc Miko (`.../2644`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Nhóc Miko (`.../2644`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 41 | Miko selection (`.../miko-selection`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 186 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Nhóc Miko, URL=`2644` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 104/104 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 104/104 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://truyentuoitho.com/.../nxbtre-full-24022023-040253-350x476.webp` (image/webp (container: extended), 35560 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `2644` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://truyentuoitho.com/.../nxbtre-full-24022023-040253-193x278.webp` (image/webp (container: extended), 17278 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Đón đọc truyện tranh Nhóc Miko – Cô bé nhí nhảnh bản đẹp, cập nhật mới nhất và nhanh nhất. Miko là series truyện tranh đời thường (Slice of Life) ăn khách bậc nhất Nhật Bản, kể về cô bé Miko vui tươi, hậu đậu và cậu bạn Tappei “trong nóng ngoài lạnh”. Bạn thích Miko vì sự dễ thương và hài hước? Vậy thì bạn chắc chắn sẽ không thể nhịn cười với những bộ truyện “chị em song sinh” với Miko dưới đây. Đừng quên click vào tên truyện để đọc ngay nhé: Thích sự ngây ngô, vụng về? Đọc ngay \[Nhóc Maruko\]. Thích những màn đối đầu gia đình “nảy lửa”? Xem ngay \[Asari – Cô bé tinh nghịch\]. Thích phong cách “bà cụ non”, mạnh mẽ, cá tính? Thử ngay \[Chie – Cô bé hạt tiêu\]. Tất cả đều đã Full bộ và miễn phí. Chúc các bạn đọc truyện vui vẻ! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 41 chapters |  |  |  |
| chapter dates | PASS | 41 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 186 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.resourcehub.shop/.../0001-kcc_result.webp` (image/webp (encoding: lossy), 202880 bytes, 900x1200) |  |  |  |
