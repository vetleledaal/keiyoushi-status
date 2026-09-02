# Extension Validation Report

- Extension: tachiyomi-vi.sayhentai-v1.6.24
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4370817879994829481
- Source name: SayHentai
- Source language: vi
- Selected manga input: popular offset 0: Sextoy kết nối không dây (`.../truyen-sextoy-bluetooth.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Sextoy kết nối không dây (`.../truyen-sextoy-bluetooth.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Trò chơi cờ bản khoái lạc: Asmodek (`.../truyen-tro-choi-co-ban-khoai-lac-asmodek.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Nơi cô ấy tồn tại (`.../truyen-noi-co-ay-ton-tai.html`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 40 | Sextoy kết nối không dây (`.../truyen-sextoy-bluetooth.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sextoy kết nối không dây (`.../truyen-sextoy-bluetooth.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 20 | Chapter 97 (`.../chuong-97`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sextoy kết nối không dây, URL=`.../truyen-sextoy-bluetooth.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 132/132 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 132/132 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://sayhentai.cx/.../69cc4fe506082123asdc213.PNG` (image/png, 304163 bytes, 399x559) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../truyen-sextoy-bluetooth.html` |  |  |  |
| details thumbnail URL | PASS | `https://sayhentai.cx/.../69cc4fe506082123asdc213.PNG` |  |  |  |
| details author | PASS | Swehwangjorongie |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Drama, Ecchi, Fantasy, Manhwa, Ngực Lớn, Milf |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Bộ truyện Sextoy kết nối không dây mới nhất hiện đã có mặt tại website SayHentai. Đây là tác phẩm thuộc thể loại truyện tranh 18+ dành riêng cho đối tượng trưởng thành. Chúng tôi khuyến cáo các bạn trẻ dưới tuổi vị thành niên nên tập trung vào học tập và các hình thức giải trí phù hợp lứa tuổi thay vì đọc truyện Sextoy kết nối không dây. Đối với những độc giả đã đủ nhận thức và đam mê thể loại manga người lớn, hãy tận hưởng chất lượng dịch thuật tốt nhất và hình ảnh đẹp mắt được SayHentai dày công biên tập lại từ nhiều nguồn chất lượng. Park Woojin, cậu chàng sinh viên kỹ thuật tình cờ mua nhầm chiếc máy thủ dâm có khả năng kết nối với những người phụ nữ xung quanh. Hay là thử bắt đầu với A-young, nữ thần xinh đẹp nhất khoa mình trước nhỉ...? Truyện được đẳng tải tại Sayhentai |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 20 chapters |  |  |  |
| chapter dates | PASS | 20 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.pubtranxzyzz.store/.../6a1983bcae456.jpg <redacted query values: token and expires>` (image/jpeg, 510852 bytes, 729x6797) |  |  |  |
