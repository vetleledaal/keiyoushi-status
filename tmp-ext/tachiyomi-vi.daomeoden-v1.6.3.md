# Extension Validation Report

- Extension: tachiyomi-vi.daomeoden-v1.6.3
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
- Source ID: 3635786412332322062
- Source name: DaoMeoDen
- Source language: vi
- Selected manga input: popular offset 0: bộ truyện của tác giả rororogi mogera (`.../kotoriba-11619-0.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | bộ truyện của tác giả rororogi mogera (`.../kotoriba-11619-0.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | thỏa thuận đầy tội lỗi vì bóng hồng sát vách (`.../thoa-thuan-day-toi-loi-vi-bong-hong-sat-vach-61979-0.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | hội chứng beethoven (`.../hoi-chung-beethoven-47676-0.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | hoa sơn tái khởi (`.../hoa-son-tai-khoi-46204-0.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | bộ truyện của tác giả rororogi mogera (`.../kotoriba-11619-0.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | bộ truyện của tác giả rororogi mogera (`.../kotoriba-11619-0.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 51 | Chương 1.1 (`.../chuong-1.1-467733-0.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=bộ truyện của tác giả rororogi mogera, URL=`.../kotoriba-11619-0.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dmd-image-content-sng-static-0.imggo.net/.../cover_1719216071.jpg` (image/jpeg, 89893 bytes, 845x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kotoriba-11619-0.html` |  |  |  |
| details thumbnail URL | PASS | `https://dmd-image-content-sng-static-0.imggo.net/.../cover_1719216071.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | manga, Adult, Yandere, Bdsm, tuyển tập, big breast |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Đang cập nhật! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 51 chapters |  |  |  |
| chapter dates | PASS | 51 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://dmd-image-content-sng-1.imggo.net/.../1665806378ovabxfrfoo.jpg` (image/jpeg, 866129 bytes, 1670x2156) |  |  |  |
