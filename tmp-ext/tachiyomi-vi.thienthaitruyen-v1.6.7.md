# Extension Validation Report

- Extension: tachiyomi-vi.thienthaitruyen-v1.6.7
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
- Source ID: 4424472966200672277
- Source name: ThienThaiTruyen
- Source language: vi
- Selected manga input: popular offset 0: Anh Người Yêu Có Sở Thích Sex Đặc Biệt (`.../anh-nguoi-yeu-co-so-thich-sex-dac-biet`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Anh Người Yêu Có Sở Thích Sex Đặc Biệt (`.../anh-nguoi-yeu-co-so-thich-sex-dac-biet`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Zetsubou No Inaka Shojo ~hyougo Hen (`.../zetsubou-no-inaka-shojo-hyougo-hen`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Quyến Rũ (`.../quyen-ru`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Tổng Hợp Một Số Art Mà Tôi Lụm Được (`.../tong-hop-mot-so-art-ma-toi-lum-duoc`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Anh Người Yêu Có Sở Thích Sex Đặc Biệt (`.../anh-nguoi-yeu-co-so-thich-sex-dac-biet`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Anh Người Yêu Có Sở Thích Sex Đặc Biệt (`.../anh-nguoi-yeu-co-so-thich-sex-dac-biet`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 15 | Chương 1 (`.../chuong-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Anh Người Yêu Có Sở Thích Sex Đặc Biệt, URL=`.../anh-nguoi-yeu-co-so-thich-sex-dac-biet` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wasawow.com/.../anh-nguoi-yeu-co-so-thich-sex-dac-biet.webp` (image/webp (encoding: lossy), 21288 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../anh-nguoi-yeu-co-so-thich-sex-dac-biet` |  |  |  |
| details thumbnail URL | PASS | `https://wasawow.com/.../anh-nguoi-yeu-co-so-thich-sex-dac-biet.webp` |  |  |  |
| details author | PASS | Đang cập nhật |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Boylove, Đam Mỹ, Hành Động, Manga, Manhwa, Truyện Màu, Truyện Tranh 18+ |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Truyện tranh Anh Người Yêu Có Sở Thích Sex Đặc Biệt của dịch giả succubus được cập nhật gần nhất vào ngày 2025-10-29 thuộc thể loại Truyện Tranh 18+,BoyLove,Đam Mỹ,Hành Động,MANGA,Manhwa,Truyện Màu đang có tổng số 140880 lượt đọc là một trong những bộ truyện tranh được rất nhiều độc giả yêu thích trên website thienthaitruyen.com Đến ngày 2026-09-02, bộ truyện tranh Anh Người Yêu Có Sở Thích Sex Đặc Biệt đã có tổng 15 chương mới và trạng thái là Hoàn thành. Với cốt truyện lôi cuốn, nhẹ nhàng, sâu sắc, nét vẽ đẹp mắt, sống động, đậm chất Manga, Anh Người Yêu Có Sở Thích Sex Đặc Biệt chắc chắn sẽ là lựa chọn tuyệt vời cho những ai yêu thích thể loại truyện tranh Online. Đừng bỏ lỡ cơ hội đọc Anh Người Yêu Có Sở Thích Sex Đặc Biệt online miễn phí tại Thiên Thai Truyện và cùng cộng đồng yêu truyện tranh khám phá câu chuyện đầy thú vị này nhé! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 15 chapters |  |  |  |
| chapter dates | PASS | 15 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://wasawow.com/.../0.png` (image/png, 596960 bytes, 619x4096) |  |  |  |
