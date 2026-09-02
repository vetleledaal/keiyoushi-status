# Extension Validation Report

- Extension: tachiyomi-vi.truyentvn-v1.6.3
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
- Source ID: 3322517246209230294
- Source name: TruyenTVN
- Source language: vi
- Selected manga input: popular offset 0: Hentai Ran Mori Hóa Nô Lệ Tình Dục Phục Vụ Các Ngài (`.../hentai-ran-mori-hoa-no-le-tinh-duc-phuc-vu-cac-ngai.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Hentai Ran Mori Hóa Nô Lệ Tình Dục Phục Vụ Các Ngài (`.../hentai-ran-mori-hoa-no-le-tinh-duc-phuc-vu-cac-ngai.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Ta Sẽ Trở Thành Vợ Của Vua Hải Tặc (luffy X Boa Hancook) (`.../ta-se-tro-thanh-vo-cua-vua-hai-tac-luffy-x-boa-hancook.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Căn Phòng Nồng Cháy (`.../can-phong-nong-chay.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Chín Chín Tám Mươi Một – 9981 (`.../chin-chin-tam-muoi-mot-9981.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Hentai Ran Mori Hóa Nô Lệ Tình Dục Phục Vụ Các Ngài (`.../hentai-ran-mori-hoa-no-le-tinh-duc-phuc-vu-cac-ngai.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Hentai Ran Mori Hóa Nô Lệ Tình Dục Phục Vụ Các Ngài (`.../hentai-ran-mori-hoa-no-le-tinh-duc-phuc-vu-cac-ngai.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | Chapter 1 (`.../chapter-1.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hentai Ran Mori Hóa Nô Lệ Tình Dục Phục Vụ Các Ngài, URL=`.../hentai-ran-mori-hoa-no-le-tinh-duc-phuc-vu-cac-ngai.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.truyentvn.net/.../hentai-ran-mori-hoa-no-le-tinh-duc-phuc-vu-cac-ngai.webp` (image/webp (encoding: lossy), 22796 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hentai-ran-mori-hoa-no-le-tinh-duc-phuc-vu-cac-ngai.html` |  |  |  |
| details thumbnail URL | PASS | `https://img.truyentvn.net/.../hentai-ran-mori-hoa-no-le-tinh-duc-phuc-vu-cac-ngai.webp` |  |  |  |
| details author | PASS | Light Rate Port Pink |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Có Che, Doujinshi, Truyện Con Trai, Truyện Tranh 18+, Adult, Đồ Bơi, Giáo Viên, Housewife, Mind Control, Ntr, Detective Conan, Hentai Vietsub, Truyen Hentai |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Nội dung thì xoay quanh truyện tranh Detective Conan với các nhân vật trong truyện được vẽ theo kiểu Doujin R18. Xem đi rồi biết Hí hí~ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn3.tymanga.com/.../0.jpg` (image/jpeg, 180590 bytes, 1056x739) |  |  |  |
