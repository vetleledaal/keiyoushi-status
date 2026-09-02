# Extension Validation Report

- Extension: tachiyomi-vi.hentaivnplus-v1.6.72
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7015430763374257867
- Source name: HentaiVN.plus
- Source language: vi
- Selected manga input: popular offset 0: Đồng Hồ Ngưng Đọng Thời Gian (`.../10351`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Đồng Hồ Ngưng Đọng Thời Gian (`.../10351`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Những Cô Con Gái (`.../7753`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Gái Đã Có Chồng Là Bạn Cùng Lớp!? (`.../16191`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Ân Huệ Trời Ban! (`.../20859`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 9 | Đồng Hồ Ngưng Đọng Thời Gian (`.../10351`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Đồng Hồ Ngưng Đọng Thời Gian (`.../10351`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 155 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 66 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Đồng Hồ Ngưng Đọng Thời Gian, URL=`10351` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 109/109 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 98/109 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaivn.show/.../truyen-dong-ho-ngung-dong-thoi-gian-1.jpg` (image/jpeg, 219534 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `10351` |  |  |  |
| details thumbnail URL | PASS | `https://hentaivn.show/.../truyen-dong-ho-ngung-dong-thoi-gian-1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Comedy, Fantasy, Harem, Manhwa, Truyện Màu, Truyện tranh 18+, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Đồng Hồ Ngưng Đọng Thời Gian Manhwa là một trong những bộ truyện tranh nổi tiếng thuộc thể loại Truyện Màu, Webtoon, Comedy, Fantasy, Manhwa, Truyện tranh 18+, Harem, Adult được đăng tại TruyenVN. Đây là một trang web hàng đầu đọc truyện tranh với đầy đủ thể loại Manhwa, Manga, Manhua, Đam mỹ và Truyện tranh 18+. Truyện tranh Đồng Hồ Ngưng Đọng Thời Gian được dịch sang tiếng việt sớm nhất và hoàn chỉnh nhất trên TruyenVN.<br><br>Alternative Names: Đồng Hồ Ngưng Đọng Thời Gian |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 155 chapters |  |  |  |
| chapter dates | PASS | 155 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 66 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://hentaivn.show/.../truyen-dong-ho-ngung-dong-thoi-gian-chapter-1-(1).jpg` (image/jpeg, 9438 bytes, 720x318) |  |  |  |
