# Extension Validation Report

- Extension: tachiyomi-vi.truyenhentai18-v1.6.12
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
- Source ID: 6484094278517548634
- Source name: Truyện Hentai 18+
- Source language: vi
- Selected manga input: popular offset 0: Sex Tu Tiên Tổng Hợp (`.../sex-tu-tien-tong-hop.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Sex Tu Tiên Tổng Hợp (`.../sex-tu-tien-tong-hop.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 18 | Chinh Phạt Milf Ở Thế Giới Khác (`.../chinh-phat-milf-o-the-gioi-khac.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 18 | Khóa Học Tự Vệ (`.../khoa-hoc-tu-ve.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Bê Bối Ở Bệnh Viện (`.../be-boi-o-benh-vien.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sex Tu Tiên Tổng Hợp (`.../sex-tu-tien-tong-hop.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sex Tu Tiên Tổng Hợp (`.../sex-tu-tien-tong-hop.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 7 | Chương 1 (`.../chuong-1.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 49 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sex Tu Tiên Tổng Hợp, URL=`.../sex-tu-tien-tong-hop.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://truyenhentai18.net/.../sex-tu-tien-tong-hop.webp` (image/webp (encoding: lossy), 14118 bytes, 250x250) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sex-tu-tien-tong-hop.html` |  |  |  |
| details thumbnail URL | PASS | `https://truyenhentai18.net/.../sex-tu-tien-tong-hop.webp` |  |  |  |
| details author | PASS | Không Rõ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Ahegao, Anal, Art Book, Artist, Bbm, Bdsm, Big Breasts, Big Dick, Bukkake, Cg, Condom, Creampie, Dirty Old Man, Drama, Fantasy, Fingering, First Time, Footjob, Foursome, Full Color, Gangbang, Glasses, Group, Harem, Hentai 3D, Lếu Lều, Lingerie, Lxhentai, Masturbation, Milf, Mind Break, Mind Control, Ntr, Pregnant, Rape, Series, Slave, Squirting, Story Arc, Supernatural, Three Some, Toys, Trap, Tự Sướng, Uncensored, Vanilla, Virginity |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Tóm Tắt Nội Dung<br>            Đọc truyện hentai Sex Tu Tiên Tổng Hợp với nhiều nội dung đặc sắc trên Truyenhentai18. Kênh truyện tranh sex 18+ Sayhentai, HentaiVN, Manhwa3x luôn cập nhật các siêu phẩm như Sex Tu Tiên Tổng Hợp mới nhất hàng ngày. Chia sẻ đến mọi người để tham gia đọc cùng bạn nhé! Đừng quên yêu thích truyện để đề cử truyện này lọt vào Bảng Xếp Hạng.. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | PASS | 7 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 49 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn2.tymanga.com/.../0-695354825750d.jpg` (image/jpeg, 73665 bytes, 788x788) |  |  |  |
