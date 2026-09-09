# Extension Validation Report

- Extension: tachiyomi-vi.yurineko-v1.6.7
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4413681066613655890
- Source name: YuriNeko
- Source language: vi
- Selected manga input: popular offset 0: Đồ Ăn Của Ta Trông Thật Đáng Yêu (`.../c0df8ec4-6e65-449f-9462-9f89f3e3ee05`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Đồ Ăn Của Ta Trông Thật Đáng Yêu (`.../c0df8ec4-6e65-449f-9462-9f89f3e3ee05`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 16 | Người chị muốn ra dáng chị gái và Cô em kế muốn một mối quan hệ Yuri (`.../6113b9fa-3898-4720-8906-f94c4f7f9914`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 16 | Bắt nạt mình đi mà, nữ phản diện ơi! (`.../105240ea-7cbe-46ef-9dc6-f606eed14fad`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | Đồ Ăn Của Ta Trông Thật Đáng Yêu (`.../c0df8ec4-6e65-449f-9462-9f89f3e3ee05`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Đồ Ăn Của Ta Trông Thật Đáng Yêu (`.../c0df8ec4-6e65-449f-9462-9f89f3e3ee05`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 196 | Chương 0 (`.../3287abd8-1738-4816-95d1-63a5612bc475`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Đồ Ăn Của Ta Trông Thật Đáng Yêu, URL=`.../c0df8ec4-6e65-449f-9462-9f89f3e3ee05` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 62/62 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 62/62 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.yurinekoz.com/.../cover-1776534155377.webp` (image/webp (encoding: lossy), 111268 bytes, 600x900) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../c0df8ec4-6e65-449f-9462-9f89f3e3ee05` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.yurinekoz.com/.../cover-1776534155377.webp` |  |  |  |
| details author | PASS | Radish |  |  |  |
| details artist | PASS | Radish |  |  |  |
| details genres | PASS | Age Gap, Animal Ears, Fantasy, Full Color, Manhua, Monster Girl, Romance, Vampire, Witch, Yuri |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Suốt gần hai thế kỷ, nàng ma cà rồng Maria đã chìm sâu trong giấc ngủ bên trong cỗ quan tài của mình — cho đến khi Tinh Lan, một cô nàng người sói du mục, tình cờ tìm thấy nơi trú ngụ ấy và đánh thức cô dậy. Ngay khoảnh khắc Tinh Lan mở nắp quan tài, một lời nguyền đã âm thầm giáng xuống và gắn chặt lấy cô mà cô chẳng hề hay biết. Với bản tính ngây thơ nhưng đầy nhiệt huyết, cô nàng người sói vui vẻ đồng hành cùng người bạn mới quen của mình. Cả hai đã cùng nhau bắt đầu một hành trình tiến về thành phố... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 196 chapters |  |  |  |
| chapter dates | PASS | 196 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://yurinekoz.com/.../img <redacted query values: d, e, and s>` (image/webp (encoding: lossy), 220352 bytes, 1000x1448; server Content-Type: application/octet-stream) |  |  |  |
