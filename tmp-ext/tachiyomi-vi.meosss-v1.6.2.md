# Extension Validation Report

- Extension: tachiyomi-vi.meosss-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6733296438137670174
- Source name: MeoSSS
- Source language: vi
- Selected manga input: popular offset 0: Tuyển Tập XX Công Cộng (`.../tuyen-tap-xx-cong-cong`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Tuyển Tập XX Công Cộng (`.../tuyen-tap-xx-cong-cong`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 28 | Cảnh Báo Sóng Thần (`.../canh-bao-song-than`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 28 | Cẩm Nang Dành Cho Merry Bad Ending (`.../cam-nang-danh-cho-merry-bad-ending`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tuyển Tập XX Công Cộng (`.../tuyen-tap-xx-cong-cong`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tuyển Tập XX Công Cộng (`.../tuyen-tap-xx-cong-cong`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 7 | Chap 1 (`.../chap-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 28 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tuyển Tập XX Công Cộng, URL=`.../tuyen-tap-xx-cong-cong` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 77/77 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 77/77 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://meosss.com/.../tuyen-tap-xx-300x400.webp` (image/webp (container: extended), 21926 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tuyen-tap-xx-cong-cong` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://meosss.com/.../tuyen-tap-xx-450x600.webp` (image/webp (container: extended), 34820 bytes, 450x600) |  |  |  |
| details author | PASS | 기쟈 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 18+, 3P, BDSM, Cao H, Dirty Talk, Hiện Đại, Manhwa, Nặng Đô, NSFW, Sỉ Nhục, SM, Tam Quan Lệch Lệch / Vô Đạo Đức |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | \[Xin chào. Đây là CLB Gym Lực Lưỡng tại khu XX. Chúng tôi cần tuyển gấp nhân viên vệ sinh phòng xông hơi~ Làm việc ngay hôm nay.\] Thú thật thì, cô ấy đã từng vừa tưởng tượng đến những gã đàn ông trong phòng gym vừa tự sướng. Có lẽ vì vậy mà theo thói quen, vùng dưới của cô lại dâng lên một cảm giác rạo rực, tê dại. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | PASS | 7 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.meosss.com/.../347955b33f9e-0-00000000.webp` (image/webp (container: extended), 90426 bytes, 900x506) |  |  |  |
