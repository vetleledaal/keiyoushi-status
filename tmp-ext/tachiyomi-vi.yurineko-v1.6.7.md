# Extension Validation Report

- Extension: tachiyomi-vi.yurineko-v1.6.7
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 34
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
| latest | `getLatestUpdates(1)` | success | 16 | 怜-Toki- (`.../3546d717-78c3-44f3-9159-bfe4ef2ad822`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 16 | Khi Bị Đứa Mình Ghét Tỏ Tình (`.../9f5258f3-0f51-4d38-8883-730ba4dce647`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | Đồ Ăn Của Ta Trông Thật Đáng Yêu (`.../c0df8ec4-6e65-449f-9462-9f89f3e3ee05`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Đồ Ăn Của Ta Trông Thật Đáng Yêu (`.../c0df8ec4-6e65-449f-9462-9f89f3e3ee05`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 196 | Chương 0 (`.../3287abd8-1738-4816-95d1-63a5612bc475`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

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
| page load | PASS | `https://yurinekoz.com/.../img <redacted query values: d, e, and s>` (image/webp (encoding: lossy), 220352 bytes, 1000x1448; server Content-Type: application/octet-stream) |  |  |  |
