# Extension Validation Report

- Extension: tachiyomi-vi.medamtruyen-v1.6.8
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
- Source ID: 1359904074588349344
- Source name: MeDamTruyen
- Source language: vi
- Selected manga input: popular offset 0: Trêu Nhầm (`.../treu-nham`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Trêu Nhầm (`.../treu-nham`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Vợ Yêu Khó Chọc: Lục Tổng Sủng Vợ Tận Trời ! (`.../vo-yeu-kho-choc-luc-tong-sung-vo-tan-troi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Trùng Sinh Được Thần Tượng Yêu Cuồng Nhiệt (`.../trung-sinh-duoc-than-tuong-yeu-cuong-nhiet`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Trêu Nhầm (`.../treu-nham`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Trêu Nhầm (`.../treu-nham`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 124 | Chap 0: Giới Thiệu (`.../treu-nham-chap-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Trêu Nhầm, URL=`.../treu-nham` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 59/59 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 59/59 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://saytongtaii.site/.../IMG-5884-e1777895719826-150x150.webp` (image/webp (container: extended), 8772 bytes, 150x150) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../treu-nham` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://saytongtaii.site/.../IMG-5884-e1777895719826-345x460.webp` (image/webp (container: extended), 20672 bytes, 345x460) |  |  |  |
| details author | PASS | Đang cập nhật |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Truyện tranh Trêu Nhầm! được cập nhật sớm nhất tại website medamtruyenhay.top. Bạn đọc đừng quên để lại bình luận và chia sẻ, ủng hộ Mê Đắm Truyện ra các chương mới nhất của truyện Trêu Nhầm nhé. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 124 chapters |  |  |  |
| chapter dates | PASS | 124 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://saytongtaii.site/.../e7772f3deb91e99e3ac264160c4d623d.jpg` (image/jpeg, 368427 bytes, 1280x4416) |  |  |  |
