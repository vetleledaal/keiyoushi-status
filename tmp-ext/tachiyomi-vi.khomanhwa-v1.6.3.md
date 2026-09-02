# Extension Validation Report

- Extension: tachiyomi-vi.khomanhwa-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6490656436246726670
- Source name: KhoManhwa
- Source language: vi
- Selected manga input: popular offset 0: #1 Hành trình tình yêu (`.../hanh-trinh-tinh-yeu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | #1 Hành trình tình yêu (`.../hanh-trinh-tinh-yeu`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | #25 Ứng dụng hiện thực hóa mong muốn (`.../ung-dung-hien-thuc-hoa-mong-muon`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Sextoy kết nối không dây (`.../sextoy-ket-noi-khong-day`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Thị trấn Massage (`.../thi-tran-massage`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Hành trình tình yêu (`.../hanh-trinh-tinh-yeu`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 28 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 96/96 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 96/96 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.manhwa.vip/.../02-pt-busqueda-calidad-media-0b8977526d32.gif` (image/gif (format: 89a), 44480007 bytes, 1216x1704) |  |  |  |
| details identity | UNUSUAL | Details changed selected title #1 Hành trình tình yêu to Hành trình tình yêu |  |  |  |
| details thumbnail URL | PASS | `https://img.manhwa.vip/.../02-pt-busqueda-calidad-media-0b8977526d32.gif` |  |  |  |
| details author | PASS | QRQ |  |  |  |
| details artist | PASS | QRQ |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Những cảm xúc không thể kìm nén ngay cả trong một công ty game ngập đầu với những giờ tăng ca! Cuộc sống văn phòng bí mật của những người trẻ không chịu từ bỏ công việc hay tình yêu bắt đầu! “Thật kỳ lạ… Tại sao cậu cứ mãi lởn vởn trong tâm trí mình thế này?” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 28 chapters |  |  |  |
| chapter dates | PASS | 28 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.fullmanhwa.com/.../love_quest_1_vn_001_a.webp` (image/webp (encoding: lossy), 428512 bytes, 720x15000) |  |  |  |
