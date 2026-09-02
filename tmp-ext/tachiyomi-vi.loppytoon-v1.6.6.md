# Extension Validation Report

- Extension: tachiyomi-vi.loppytoon-v1.6.6
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6580420139533147522
- Source name: LoppyToon
- Source language: vi
- Selected manga input: popular offset 0: Mộ Thiên Nga (`.../mo-thien-nga`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 7 | Mộ Thiên Nga (`.../mo-thien-nga`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 19 | Bạn Cùng Lớp (`.../ban-cung-lop`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Soái Ca Kiểu Mẫu (`.../soai-ca-kieu-mau`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | [KHÔNG CHE] Mộ Thiên Nga (`.../khong-che-mo-thien-nga`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mộ Thiên Nga (`.../mo-thien-nga`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 57 | Chap 1 (`.../chap-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 26 |  |  | 1-10s |

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
| popular listing | PASS | 7 entries |  |  |  |
| latest listing | PASS | 19 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Mộ Thiên Nga, URL=`.../mo-thien-nga` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 53/53 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 53/53 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://loppytoon.com/.../jrhdvAyP31BfIGgKKo1QnMgflFNGmuWkrpstWAwC.jpg` (image/jpeg, 210555 bytes, 960x1392) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mo-thien-nga` |  |  |  |
| details thumbnail URL | PASS | `https://loppytoon.com/.../jrhdvAyP31BfIGgKKo1QnMgflFNGmuWkrpstWAwC.jpg` |  |  |  |
| details author | PASS | 켄 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 18+, Manhwa, 1x1, Bi Kịch, Drama, Horror, Kinh Dị, Lãng Mạn, Ngôn Tình, Romance, Tình Cảm, Yandere |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Tên khác: 백조 무덤<br>Truyện “Mộ Thiên Nga” được việt hóa bởi LoppyToon. Theo dõi fanpage của Loppy để được cập nhật chap mới nhanh nhất nhé!<br>※ Nội dung:<br>Anna vô tình xuyên không tới phủ Hầu tước Lohengrin, nơi còn có biệt danh rùng rợn là 'Mộ Thiên Nga', để tìm cách trở về thế giới ban đầu của mình.<br>Ở đó, cô tình cờ gặp Hầu tước Rothbart. Anh ta nhận ra Anna là người vợ đã mất của mình và cưỡng ép cô, sau đó đưa ra một đề nghị bất ngờ:<br>'Hãy thay thế vị trí của vợ ta.'<br>Anh ta cũng tiết lộ sự thật rằng để Anna có thể trở về thế giới ban đầu, cô 'cần phải sinh con với một người thuộc thế giới này'. Trong lúc cô còn đang suy nghĩ, con trai của Rothbart là Svanhild cũng quanh quẩn bên cô và van nài:<br>'Con muốn có mẹ, Anna.'<br>Một mối quan hệ đã được định trước kết cục. Một điều kiện không thể từ chối. Anna, người quyết tâm trở về thế giới ban đầu bằng mọi giá, cuối cùng đã chấp nhận lời đề nghị của Rothbart..." |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 57 chapters |  |  |  |
| chapter dates | PASS | 57 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://sv1.loppytoonn.com/.../101.webp` (image/webp (encoding: lossy), 749152 bytes, 720x5500) |  |  |  |
