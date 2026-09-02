# Extension Validation Report

- Extension: tachiyomi-vi.soaicacomic-v1.6.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 1
- Warnings: 2
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1014180023829533732
- Source name: SoaiCaComic
- Source language: vi
- Selected manga input: popular offset 0: Được Các Anh Trai Chiều Chuộng Tôi Trở Nên Ngang Tàng (`.../duoc-cac-anh-trai-chieu-chuong-toi-tro-nen-ngang-tang`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | Được Các Anh Trai Chiều Chuộng Tôi Trở Nên Ngang Tàng (`.../duoc-cac-anh-trai-chieu-chuong-toi-tro-nen-ngang-tang`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 32 | Cẩm Nang Giữ Mạng Của Mẹ Kế (`.../cam-nang-giu-mang-cua-me-ke`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 32 | Giả Mù Trở Về, Tôi Xé Nát Hoắc Gia (`.../gia-mu-tro-ve-toi-xe-nat-hoac-gia`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Được Các Anh Trai Chiều Chuộng Tôi Trở Nên Ngang Tàng (`.../duoc-cac-anh-trai-chieu-chuong-toi-tro-nen-ngang-tang`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Được Các Anh Trai Chiều Chuộng Tôi Trở Nên Ngang Tàng (`.../duoc-cac-anh-trai-chieu-chuong-toi-tro-nen-ngang-tang`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 336 | CHAP 1 (`.../duoc-cac-anh-trai-chieu-chuong-toi-tro-nen-ngang-tang-chap-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 4 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 32 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Được Các Anh Trai Chiều Chuộng Tôi Trở Nên Ngang Tàng, URL=`.../duoc-cac-anh-trai-chieu-chuong-toi-tro-nen-ngang-tang` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://soaicacomic2.top/.../BIA-cung-chieu-300x404.webp` -> 2 manga URLs (examples: `.../truyen-chu-cung-chieu-em-den-tan-cung`, `.../cung-chieu-em-den-tan-cung`) |  |  |  |
| thumbnail | PASS | `https://soaicacomic2.top/.../duoccacanhtraichieuchuong.jpg.jpg` (image/jpeg, 116154 bytes, 720x970) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../duoc-cac-anh-trai-chieu-chuong-toi-tro-nen-ngang-tang` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://soaicacomic2.top/.../duoccacanhtraichieuchuong.jpg-720x970.jpg` (image/jpeg, 121247 bytes, 720x970) |  |  |  |
| details author | PASS | Đang cập nhật |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ngôn Tình, Nữ Cường, Áo giáp, Xuyên Không |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Giới thiệu truyện tranh Được Các Anh Trai Chiều Chuộng Tôi Trở Nên Ngang Tàng, đây là truyện thể loại trọng sinh. Sau khi Trọng Sinh , cô trở thành đáng thương và được các anh em ruột đưa vào viện tâm thần. Mang theo ký ức đau đớn của nguyên chủ kiếp trước, Bùi Doãn Ca bắt đầu phản sát vị thiên kim giả, và trí đấu với những kẻ ác nhân! Một đường ngược tra một đường sảng!! Nhưng mà cô đột nhiên phát hiện ra ba người anh trai tra nam ngày xưa nay bỗng nhiên lại trở nên chiều chuộng em gái đến vô cực! Không riêng như thế, cô càng lúc càng thu hoạch thêm sự sủng ái của một vị “anh trai” nặng ký, khiến mọi người càng thêm hoài nghi…. Được Các Anh Trai Chiều Chuộng Tôi Trở Nên Ngang Tàng sớm nhất tại website Soái Ca Comic. Truyện thường được cập nhật vào Thứ Hai hàng tuần. Ngoài ra, còn rất nhiều thể loại hấp dẫn, nhiều đầu truyện hay và hoàn toàn miễn phí. Chúc các bạn đọc truyện vui vẻ. Đừng quên thả tim và bình luận thật nhiều để ủng hộ mình nha các bạn.  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 336 chapters |  |  |  |
| chapter dates | PASS | 336 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://soaicacomic2.top/.../b7dd3c1877406404c71e80454f48485a.jpg` (image/jpeg, 894114 bytes, 900x11799) |  |  |  |
