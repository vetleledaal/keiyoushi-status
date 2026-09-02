# Extension Validation Report

- Extension: tachiyomi-vi.meosua-v1.6.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2280384130624669648
- Source name: MeoSua
- Source language: vi
- Selected manga input: popular offset 0: Em Gái Bệnh Kiều Chỉ Muốn Tôi Bắt Nạt Em Ấy (`.../em-gai-benh-kieu-chi-muon-toi-bat-nat-em-ay`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Em Gái Bệnh Kiều Chỉ Muốn Tôi Bắt Nạt Em Ấy (`.../em-gai-benh-kieu-chi-muon-toi-bat-nat-em-ay`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Nuôi Dưỡng Một Nữ Nhân Điên Loạn (`.../nuoi-duong-mot-nu-nhan-dien-loan`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Đã Là Thời Đại Nào Rồi (`.../da-la-thoi-dai-nao-roi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Đại Lão Đầu Của Cô Lại Rơi Rồi (`.../dai-lao-dau-cua-co-lai-roi-roi`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | em gái bệnh kiều chỉ muốn tôi bắt nạt em ấy (`.../em-gai-benh-kieu-chi-muon-toi-bat-nat-em-ay`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Em Gái Bệnh Kiều Chỉ Muốn Tôi Bắt Nạt Em Ấy (`.../em-gai-benh-kieu-chi-muon-toi-bat-nat-em-ay`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 139 | Chap 0 (`.../em-gai-benh-kieu-chi-muon-toi-bat-nat-em-ay-chap-0`) |  | 10s+ |
| pages | `getPageList(chapter)` | success | 2 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=em gái bệnh kiều chỉ muốn tôi bắt nạt em ấy, URL=`.../em-gai-benh-kieu-chi-muon-toi-bat-nat-em-ay` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://meosua.org/.../477600159_602475712547175_1400798422146809511_n-160x217.webp` (image/webp (container: extended), 8594 bytes, 160x217) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../em-gai-benh-kieu-chi-muon-toi-bat-nat-em-ay` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Truyện Tranh, Manhua, Vườn Trường, Hiện Đại, Xuyên Không, Girl Love, LGBTQIA+, Truyện Tranh, Truyện Tranh, Truyện Tranh, Truyện Tranh, Truyện Tranh, Truyện Tranh, Truyện Tranh, Truyện Tranh, Truyện Tranh, Truyện Tranh |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Là một tiểu thuyết gia, nữ chính rất ghét con đi*m trà xanh Bạch Liên Hoa, cố ý viết trong sách một nữ chính như thế này, luôn an bài người ngược đãi cô! Nhưng không ngờ có một ngày mình sẽ du hành ngược thời gian về cuốn sách nên đành phải gánh lấy sự tức giận của mình! Nhưng vì sắc đẹp của mình, cô không những không thể tấn công nữ chính tiểu bạch hoa xinh đẹp mà còn dần dần trở thành người bảo vệ bông hoa của cô… Ngay khi cô lo lắng về ý định lệch lạc của mình, cô luôn yếu đuối. Nhân vật chính đẩy nam chính ra ba mét, cố chấp tỏ tình với Cố HÌnh! Cái gì! Hóa ra tôi mới là người được bảo vệ!… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 139 chapters |  |  |  |
| chapter dates | LINT | 4 of 139 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=4 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 2 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://meosua.org/.../0.1.jpg` (image/jpeg, 113045 bytes, 640x289) |  |  |  |
