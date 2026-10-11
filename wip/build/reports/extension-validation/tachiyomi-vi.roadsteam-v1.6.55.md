# Extension Validation Report

- Extension: tachiyomi-vi.roadsteam-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 7171061492842070313
- Source name: Roads Team
- Source language: vi
- Selected manga input: popular offset 0: KHÚC NGUYỆN CẦU – BINARI (`.../891`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | KHÚC NGUYỆN CẦU – BINARI (`.../891`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 18 | FOLKLORE BUSINESS (`.../412`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 18 | OFFICE HERO – KHÔNG CHE (`.../414`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | PAST KISS (`.../393`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | KHÚC NGUYỆN CẦU – BINARI (`.../891`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | CHAP 1 (`.../chap-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.nhaduong.com/.../CV-4.jpg` (image/jpeg, 311315 bytes, 480x700) |  |  |  |
| details identity | PASS | Details preserved selected URL `891` |  |  |  |
| details thumbnail URL | PASS | `https://img.nhaduong.com/.../CV-4.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ABO, Có thai, Cổ trang, Comedy, Healing, Roads đề cử, Truyện tranh |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | #Top dịu dàng #Top giảo hoạt #Top cuồng người yêu #Top đẹp trai<br><br>#Bot mỹ nhân #Bot mang thai #Bot tổn thương<br><br>#Cổ trang #Bạn thanh mai trúc mã #Tình đầu #ABO #Hài hước #Ngọt ngào<br><br>김환 (Kim Hwan): Thiếu gia dòng dõi danh môn đời đời đỗ đạt Thừa tướng Phán thư, là một tay chơi lêu lổng, không quan tâm đến chuyện đèn sách, lớn lên như bạn thanh mai trúc mã, chí chóe suốt ngày với Kwon Young – người hoàn toàn đối lập với cậu – hệt như học sinh gương mẫu. Một ngày nọ, không đành lòng đứng nhìn Young lâm vào cảnh khốn đốn khi phân hóa thành âm nhân, Hwan đã gửi gắm tấm chân tình ấp ủ bấy lâu mà cầu hôn cậu… \[Top đẹp trai \| Top giảo hoạt \| Top cuồng người yêu\]<br><br>권영 (Kwon Young): Bậc kỳ tài đỗ Trạng nguyên ở tuổi hai mươi, từng mơ về tương lai xán lạn, công thành danh toại nhưng mọi thứ sụp đổ khi phân hóa thành âm nhân (omega). Đang lúc đứng trước nỗi nhục nhã bị đem bán đi làm thiếp cho lão già khọm hay làm vợ đồ tể, vào một ngày nọ, bức thư cầu hôn từ Hwan – người vừa là tri kỷ thâm giao vừa là bạn oan gia – đã gửi đến chỗ Young… \[Bot giả gái \| Bot mỹ nhân \| Bot tổn thương\]<br><br>“Ta sẽ gọi ngươi là phu quân luôn cũng được! Ta làm vợ là được chứ gì!”<br><br>LINK RAW |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | LINT | 9 of 10 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=9 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.nhaduong.com/.../01.jpg` (image/jpeg, 988445 bytes, 1280x5800) |  |  |  |
