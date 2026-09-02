# Extension Validation Report

- Extension: tachiyomi-vi.minotruyen-v1.6.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 2
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.c
- Source ID: 1911829101129863006
- Source name: MinoTruyen Manga
- Source language: vi
- Selected manga input: popular offset 0: Good/Bad Fortune (`.../13180`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Good/Bad Fortune (`.../13180`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Dekin no Mogura (`.../12535`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Good/Bad Fortune (`.../13180`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Good/Bad Fortune (`.../13180`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 132 | Chapter 0 (`.../367481`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Good/Bad Fortune, URL=`.../13180` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://p21-lp-sg.ibyteimg.com/.../34abdc3838394f0d85142de33b4af031~tplv-375lmtcpo0-resize:200:200.webp` (image/webp (encoding: lossy), 7534 bytes, 150x200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../13180` |  |  |  |
| details thumbnail URL | PASS | `https://p21-lp-sg.ibyteimg.com/.../34abdc3838394f0d85142de33b4af031~tplv-375lmtcpo0-resize:200:200.webp` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | action, comedy, drama, psychological, romance, shounen, slice of life, supernatural, webtoon |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Hãy cẩn thận khi đối mặt với họ, vì họ có thể thay đổi cả số phận của bạn!<br>Khi vận may và xui xẻo lại là một loại năng lực thì bạn sẽ làm gì để sống cùng với nó? Areka Putra, 1 thiếu niên vừa lên lớp 10 đã phải sống với năng lực "XUI XẺO" ngay từ khi sinh ra. Cậu sẽ gặp phải xui xẻo khi các "Dấu hiệu" xuất hiện và cậu hoặc phải gánh lấy nó, hoặc tìm một nạn nhân và đối mắt với người đó trong 10 giây, rồi người đó sẽ phải gánh sự xui xẻo đó thay cậu. Cũng vì vậy mà cậu bị dính phải những lời đồn tiêu cực và bị xa lánh. Mọi chuyện vẫn sẽ cứ trôi đi một cách cô độc như vậy nếu như Areka không gặp Aya( hay Laila Putriani), một cô gái năng động và đang là một ngôi sao quảng cáo mới nổi. Nhưng nhan sắc hay tài năng không chỉ là điểm đặc biệt duy nhất của Aya, mà mọi người xung quanh đồn rằng Aya có khả năng "ban phát" sự may mắn cho bất kì ai ở gần cô ấy.Xui xẻo/May mắn, liệu câu chuyện về hai con người đối lập này sẽ thay đổi ra sao? Liệu Areka có thoát khỏi cuộc sống đầy xui xẻo của bản thân mình? Hãy đọc truyện và theo dõi nhé!!!<br>                      <br>                      <br>                        Xem thêm |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 132 chapters |  |  |  |
| chapter dates | PASS | 132 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://phinf.pstatic.net/.../test.jpeg` (image/jpeg, 7888 bytes, 700x1000) |  |  |  |
