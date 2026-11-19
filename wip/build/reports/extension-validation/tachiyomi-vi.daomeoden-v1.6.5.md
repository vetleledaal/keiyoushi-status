# Extension Validation Report

- Extension: tachiyomi-vi.daomeoden-v1.6.5
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
- Source ID: 3635786412332322062
- Source name: DaoMeoDen
- Source language: vi
- Selected manga input: popular offset 0: BỘ TRUYỆN CỦA TÁC GIẢ ROROROGI MOGERA (`.../kotoriba-11619`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | BỘ TRUYỆN CỦA TÁC GIẢ ROROROGI MOGERA (`.../kotoriba-11619`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Người Chồng Hợp Đồng Muốn Chiếm Lấy Tôi (`.../nguoi-chong-hop-dong-muon-chiem-lay-toi-57917`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Cạm Bẫy Cherry (`.../cam-bay-cherry-63573`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Vua Thăng Cấp (`.../vua-thang-cap-m-20191`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | BỘ TRUYỆN CỦA TÁC GIẢ ROROROGI MOGERA (`.../kotoriba-11619`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | BỘ TRUYỆN CỦA TÁC GIẢ ROROROGI MOGERA (`.../kotoriba-11619`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 51 | Chương 1.1 (`.../chuong-1.1-467733-0`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=BỘ TRUYỆN CỦA TÁC GIẢ ROROROGI MOGERA, URL=`.../kotoriba-11619` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dmd-image-content-sng-static-0.imggo.net/.../cover_1719216071.jpg` (image/jpeg, 89893 bytes, 845x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kotoriba-11619` |  |  |  |
| details thumbnail URL | PASS | `https://dmd-image-content-sng-static-0.imggo.net/.../cover_1719216071.jpg` |  |  |  |
| details author | PASS | Rororogi Mogera |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, Hentai, Adult, Yandere, Bdsm, DL Site, tuyển tập, big breast |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Đọc truyện "BỘ TRUYỆN CỦA TÁC GIẢ ROROROGI MOGERA" tại daomeoden.net |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 51 chapters |  |  |  |
| chapter dates | PASS | 51 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://dmd-image-content-sng-1.imggo.net/.../1665806378ovabxfrfoo.jpg` (image/jpeg, 866129 bytes, 1670x2156) |  |  |  |
