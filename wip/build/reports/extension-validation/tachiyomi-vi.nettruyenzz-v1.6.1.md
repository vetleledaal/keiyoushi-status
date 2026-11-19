# Extension Validation Report

- Extension: tachiyomi-vi.nettruyenzz-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5943473010697489064
- Source name: NetTruyenZZ (unoriginal)
- Source language: vi
- Selected manga input: popular offset 0: Gia đình mới của tôi (`.../gia-dinh-moi-cua-toi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Gia đình mới của tôi (`.../gia-dinh-moi-cua-toi`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 1001 Cách Chinh Phục Chồng Yêu (`.../1001-cach-chinh-phuc-chong-yeu`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Kanan-sama wa Akumade Choroi (`.../kanan-sama-wa-akumade-choroi`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Gia đình mới của tôi (`.../gia-dinh-moi-cua-toi`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Gia đình mới của tôi (`.../gia-dinh-moi-cua-toi`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 114 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 1 |  |  | <1s |

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
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Gia đình mới của tôi, URL=`.../gia-dinh-moi-cua-toi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 59/59 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 59/59 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://nettruyen.com.co/.../poster-11-gia-dinh-moi-cua-toi.png` (image/png, 515527 bytes, 500x684) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../gia-dinh-moi-cua-toi` |  |  |  |
| details thumbnail URL | PASS | `https://nettruyen.com.co/.../poster-11-gia-dinh-moi-cua-toi.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | HangTruyen, Romance, 18+, Comic, Smut, Hiện Đại, NTR, Tình Cảm, Webtoon, Full Color |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Tôi được nhận nuôi vào một gia đình mới sau khi được giải cứu khỏi gia đình bạo hành của mình. Có một nữ diễn viên nổi tiếng làm mẹ, một người chị chơi golf chuyên nghiệp lớn tuổi hơn và một cô em gái thần tượng trẻ hơn thì quá tốt để có thể là sự thật. Nhưng họ lại quá tốt với tôi. "Seon-Hu, tối nay tôi sẽ giúp em thỏa mãn ham muốn của mình." |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 114 chapters |  |  |  |
| chapter dates | PASS | 114 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://example.com/.../test.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
