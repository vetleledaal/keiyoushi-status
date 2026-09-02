# Extension Validation Report

- Extension: tachiyomi-vi.otakusic-v1.6.3
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
- Source ID: 4694155353004433186
- Source name: Otakusic
- Source language: vi
- Selected manga input: popular offset 0: Bạn Cùng Lớp (`.../ban-cung-lop`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 48 | Bạn Cùng Lớp (`.../ban-cung-lop`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 48 | Chuyện Của Họ (`.../chuyen-cua-ho`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 48 | Lời tiên tri của Rita (`.../loi-tien-tri-cua-rita`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 48 | Đồng Tước Tỏa Kim Thoa (`.../dong-tuoc-toa-kim-thoa`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 7 | Bạn Cùng Lớp (`.../ban-cung-lop`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Bạn Cùng Lớp (`.../ban-cung-lop`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 60 | Chương 1 (`.../chuong-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 173 |  |  | <1s |

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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Bạn Cùng Lớp, URL=`.../ban-cung-lop` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 199/199 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 199/199 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.otakusic.com/.../7bc5ed9903.webp` (image/webp (encoding: lossy), 382402 bytes, 1156x1500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ban-cung-lop` |  |  |  |
| details thumbnail URL | PASS | `https://img.otakusic.com/.../7bc5ed9903.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Eunha Joo - nữ sinh bị cả trường ruồng bỏ. Bị bắt nạt, cô lập suốt thời gian dài làm cô cảm thấy tuyệt vọng. Số phận đã mang đến cho cô một “người bạn” - Heasu Lee “ Tôi sẽ làm bạn của cậu”... Nhưng liệu đây sẽ là ánh sáng hay lại tiếp tục là lồng giam của Eunha ? Liệu bàn tay được người bạn bí ẩn này đưa ra sẽ là sự cứu rỗi, hay là một lời nguyền? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 60 chapters |  |  |  |
| chapter dates | PASS | 60 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 173 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.otakusic.com/.../8fd8c86397.webp` (image/webp (encoding: lossy), 14992 bytes, 690x1017) |  |  |  |
