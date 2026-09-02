# Extension Validation Report

- Extension: tachiyomi-vi.goctruyentranh-v1.6.12
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8162695314495646445
- Source name: GocTruyenTranh
- Source language: vi
- Selected manga input: popular offset 0: Công Tử Biệt Tú! (`.../cong-tu-biet-tu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Công Tử Biệt Tú! (`.../cong-tu-biet-tu`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Solo Leveling Ragnarok (`.../solo-leveling-ragnarok`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Chiến Lược Giúp Nữ Phản Diện Hoàn Lương (`.../chien-luoc-giup-nu-phan-dien-hoan-luong`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Yuusha Ni Zenbu Ubawareta Ore Wa Yuusha No Hahaoya To Party Wo Kumimashita! (`.../yuusha-ni-zenbu-ubawareta-ore-wa-yuusha-no-hahaoya-to-party-wo-kumimashita`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Công Tử Biệt Tú! (`.../cong-tu-biet-tu`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Công Tử Biệt Tú! (`.../cong-tu-biet-tu`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 216 | Chapter 1 (`.../chuong-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 112 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Công Tử Biệt Tú!, URL=`.../cong-tu-biet-tu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://goctruyentranh.com/.../image <redacted query values: url, w, and q>` (image/jpeg, 21836 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cong-tu-biet-tu` |  |  |  |
| details thumbnail URL | PASS | `https://goctruyentranh.com/.../image <redacted query values: url, w, and q>` |  |  |  |
| details author | PASS | Đang cập nhật |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Fantasy, Harem, Manhua, Xuyên Không |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Tên truyện: Công Tử Biệt Tú!<br>Thể loại: Comedy, Fantasy, Harem, Manhua, Xuyên Không<br><br>Trong một lần vô tình, Hoàng Tử Thái Tử, một anh chàng công tử đẹp trai và lịch lãm, bị thuật phép xuyên không đưa đến một thế giới hoàn toàn khác biệt. Anh tỉnh dậy và nhận ra mình đã trở thành một phù thủy ở vương quốc Phong Thần, nơi ma thuật và phép thuật tồn tại. Với sự hỗ trợ của Nathalie - cô gái tinh nghịch và mạnh mẽ, Hoàng Tử Thái Tử bắt đầu cuộc hành trình tìm cách trở về thế giới thực.<br><br>Tuy nhiên, không phải ai cũng muốn anh trở về. Trong hành trình của mình, Hoàng Tử Thái Tử gặp phải hàng loạt tình huống dở khóc dở cười với sự tham gia của các cô gái xinh đẹp và mê hoặc như: Myra - nữ chiến binh mạnh mẽ, Eliza - phù thủy tài năng, và Lillian - tiểu thư quý tộc lạnh lùng.<br><br>Từ những tình huống trớ trêu, những tình tiết dở khóc dở cười, đến những trận chiến ma thuật kịch tính, Công Tử Biệt Tú! hứa hẹn mang lại cho độc giả những phút giây giải trí sảng khoái và hấp dẫn. Liệu Hoàng Tử Thái Tử có thể vượt qua thử thách, giành được trái tim của các cô gái và tìm ra lối thoát khỏi thế giới xa lạ này? Cùng theo dõi để khám phá. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 216 chapters |  |  |  |
| chapter dates | PASS | 216 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 112 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://db.goctruyentranh.org/.../images <redacted query values: src>` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
