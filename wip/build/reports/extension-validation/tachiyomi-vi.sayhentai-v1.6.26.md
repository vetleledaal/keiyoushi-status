# Extension Validation Report

- Extension: tachiyomi-vi.sayhentai-v1.6.26
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 3
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
- Selected manga input: popular offset 0: Mùa hè thỏa mãn (`.../truyen-mua-he-thoa-man.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Mùa hè thỏa mãn (`.../truyen-mua-he-thoa-man.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Phòng hai người (`.../truyen-phong-hai-nguoi.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Harem thời kim tiền (`.../truyen-harem-thoi-kim-tien.html`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 40 | Mùa hè thỏa mãn (`.../truyen-mua-he-thoa-man.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mùa hè thỏa mãn (`.../truyen-mua-he-thoa-man.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 8 | Chapter 1 (`.../chuong-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mùa hè thỏa mãn, URL=`.../truyen-mua-he-thoa-man.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 132/132 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 132/132 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://sayhentai.cx/.../6af9edee6e062h%C3%A8.jpeg` (image/jpeg, 178499 bytes, 1080x2166) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../truyen-mua-he-thoa-man.html` |  |  |  |
| details thumbnail URL | PASS | `https://sayhentai.cx/.../6af9edee6e062h%C3%A8.jpeg` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Mùa hè thỏa mãn là truyện tranh 18+, do nhóm STOL Manga dịch sang tiếng Việt. Truyện đang cập nhật, chương mới nhất: Chương 8. Nội dung truyện Mùa hè thỏa mãn đang được cập nhật, hãy quay lại sau ít phút để theo dõi bản đầy đủ nhất tại SayHentai. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.pubtranxzyzz.store/.../6af9ee1db9972.jpeg <redacted query values: token and expires>` (image/webp (encoding: lossy), 536272 bytes, 729x11040) |  |  |  |
