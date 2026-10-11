# Extension Validation Report

- Extension: tachiyomi-vi.sayhentai-v1.6.24
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: manhwaz
- Source ID: 4370817879994829481
- Source name: SayHentai
- Source language: vi
- Selected manga input: popular offset 0: Tôi đã thịt sạch gái trong lớp sau tốt nghiệp (`.../truyen-toi-da-thit-sach-gai-trong-lop-sau-tot-nghiep.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Tôi đã thịt sạch gái trong lớp sau tốt nghiệp (`.../truyen-toi-da-thit-sach-gai-trong-lop-sau-tot-nghiep.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Thống Trị (`.../truyen-thong-tri.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Ero: Công chúa khuất phục (`.../truyen-ero-cong-chua-khuat-phuc.html`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 40 | Tôi đã thịt sạch gái trong lớp sau tốt nghiệp (`.../truyen-toi-da-thit-sach-gai-trong-lop-sau-tot-nghiep.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tôi đã thịt sạch gái trong lớp sau tốt nghiệp (`.../truyen-toi-da-thit-sach-gai-trong-lop-sau-tot-nghiep.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 15 | Chapter 1 (`.../chuong-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | <1s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tôi đã thịt sạch gái trong lớp sau tốt nghiệp, URL=`.../truyen-toi-da-thit-sach-gai-trong-lop-sau-tot-nghiep.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 132/132 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 132/132 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://sayhentai.cx/.../6a54ada3adb37123123 (1).png` (image/png, 660591 bytes, 584x817) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../truyen-toi-da-thit-sach-gai-trong-lop-sau-tot-nghiep.html` |  |  |  |
| details thumbnail URL | PASS | `https://sayhentai.cx/.../6a54ada3adb37123123 (1).png` |  |  |  |
| details author | PASS | ... |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Harem, Manhwa, 18+, Rape, Milf |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Tôi đã thịt sạch gái trong lớp sau tốt nghiệp (tên gốc: ...) là manhwa 18+ thuộc thể loại Harem, Rape, Milf, do nhóm Askoz dịch sang tiếng Việt. Truyện đang cập nhật, chương mới nhất: Chương 15. ... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 15 chapters |  |  |  |
| chapter dates | PASS | 15 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.pubtranxzyzz.store/.../6a54adc037b02.jpg <redacted query values: token and expires>` (image/jpeg, 1457305 bytes, 729x11923) |  |  |  |
