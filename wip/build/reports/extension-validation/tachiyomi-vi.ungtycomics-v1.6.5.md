# Extension Validation Report

- Extension: tachiyomi-vi.ungtycomics-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6630877766973917674
- Source name: Ưng Tỷ Comics
- Source language: vi
- Selected manga input: popular offset 0: Tuyệt Mỹ Bạch Liên Hoa Online Dạy Học (`.../tuyet-my-bach-lien-hoa-online-day-hoc`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | Tuyệt Mỹ Bạch Liên Hoa Online Dạy Học (`.../tuyet-my-bach-lien-hoa-online-day-hoc`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | Trò Chơi Săn Bắn (`.../tro-choi-san-ban`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | Trước Khi Nho Chín (`.../truoc-khi-nho-chin`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 36 | Hẹn Hò Lén Lút Với Hoàng Đế Mà Tôi Chẳng Hay Biết (`.../hen-ho-len-lut-voi-hoang-de-ma-toi-chang-hay-biet`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tuyệt Mỹ Bạch Liên Hoa Online Dạy Học (`.../tuyet-my-bach-lien-hoa-online-day-hoc`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tuyệt Mỹ Bạch Liên Hoa Online Dạy Học (`.../tuyet-my-bach-lien-hoa-online-day-hoc`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 543 | Giới Thiệu Nhân Vật (`.../gioi-thieu-nhan-vat`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | <1s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tuyệt Mỹ Bạch Liên Hoa Online Dạy Học, URL=`.../tuyet-my-bach-lien-hoa-online-day-hoc` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ungtycomics.net/.../tuyet-my-bach-lien-hoa-online-day-hoc.jpg` (image/jpeg, 106138 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tuyet-my-bach-lien-hoa-online-day-hoc` |  |  |  |
| details thumbnail URL | PASS | `https://ungtycomics.net/.../tuyet-my-bach-lien-hoa-online-day-hoc.jpg` |  |  |  |
| details author | PASS | Cảo Tiền |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Xuyên Không, Đam Mỹ, Hiện Đại, Xuyên Nhanh |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★★ 4.8 (491) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 543 chapters |  |  |  |
| chapter dates | PASS | 543 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://image.nettruyenaz.biz/.../0.jpg` (image/jpeg, 23617 bytes, 608x475) |  |  |  |
