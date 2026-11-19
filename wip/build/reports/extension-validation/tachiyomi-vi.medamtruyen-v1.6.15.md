# Extension Validation Report

- Extension: tachiyomi-vi.medamtruyen-v1.6.15
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: koi
- Source ID: 1359904074588349344
- Source name: MeDamTruyen
- Source language: vi
- Selected manga input: popular offset 0: Trêu Nhầm (`.../treu-nham`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Trêu Nhầm (`.../treu-nham`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Lão Đại Nghiện Sủng Cô Vợ Gả Thay Rồi! (`.../lao-dai-nghien-sung-co-vo-ga-thay-roi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Luyến Sắc Độc Chiếm (`.../luyen-sac-doc-chiem`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Trêu Nhầm (`.../treu-nham`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Trêu Nhầm (`.../treu-nham`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 133 | Chap 0: Giới Thiệu (`.../treu-nham-chap-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | <1s |

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
| thumbnail | PASS | `https://saytongtaii.site/.../IMG-5884-e1777895719826.webp` (image/webp (container: extended), 81014 bytes, 1102x1393) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../treu-nham` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://saytongtaii.site/.../IMG-5884-e1777895719826.webp` (image/webp (container: extended), 81014 bytes, 1102x1393) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Chiếm Hữu Mạnh Mẽ, Manhua, Hiện Đại, Tổng Tài, Sủng Ngọt, Ngược Tâm |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Truyện tranh Trêu Nhầm! được cập nhật sớm nhất tại website medamtruyenhay.top. Bạn đọc đừng quên để lại bình luận và chia sẻ, ủng hộ Mê Đắm Truyện ra các chương mới nhất của truyện Trêu Nhầm nhé.<br><br>Truyện được chuyển thể thành phim Dĩ Ái Vi Doanh. Nữ phóng viên tài chính xinh đẹp Trịnh Thư Ý bị một tên khốn lừa dối? Làm sao chúng ta có thể để cho tên khốn đó và cô chủ sống chung với nhau như thế này được! Ngay khi Trịnh Thư Ý nhìn thấy chiếc Rolls-Royce có số seri của chú của tình nhân, cô ta đã nảy ra một ý tưởng và bắt đầu con đường lố bịch là quyến rũ tổng thống. Tên khốn đó không muốn làm việc ít hơn hai mươi năm sao? Vậy thì tôi sẽ trở thành dì của anh và cô chủ của anh! … |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 133 chapters |  |  |  |
| chapter dates | PASS | 133 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://saytongtaii.site/.../e7772f3deb91e99e3ac264160c4d623d.jpg` (image/jpeg, 368427 bytes, 1280x4416) |  |  |  |
