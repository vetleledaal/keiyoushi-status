# Extension Validation Report

- Extension: tachiyomi-vi.gantzvn-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 934565583439501324
- Source name: GantzVN
- Source language: vi
- Selected manga input: popular offset 0: Gantz Full Color (`.../23`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Gantz Full Color (`.../23`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Kanreki Hime (`.../2071`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Gantz Full Color (`.../23`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Gantz Full Color (`.../23`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 283 | Chap 01 - Tai nạn - Remake (`.../chap-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 41 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Gantz Full Color, URL=`23` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 39/39 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 39/39 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://gantzvn.com/.../Poster-Gigant.jpg` -> 2 manga URLs (examples: `8`, `60`), `https://gantzvn.com/.../Gantz-E-Cover.jpg` -> 2 manga URLs (examples: `295`, `479`) |  |  |  |
| thumbnail | PASS | `https://gantzvn.com/.../Gantz-Full-Color.jpg` (image/jpeg, 89742 bytes, 800x1148) |  |  |  |
| details identity | PASS | Details preserved selected URL `23` |  |  |  |
| details thumbnail URL | PASS | `https://gantzvn.com/.../Gantz-Full-Color.jpg` |  |  |  |
| details author | PASS | Hiroya Oku |  |  |  |
| details artist | PASS | Hiroya Oku |  |  |  |
| details genres | PASS | Action, Ecchi, Manga, Sci-fi, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Gantz mở đầu bằng cảnh nhân vật chính, Kurono Kei, đang đọc một cuốn tạp chí 18+ thì một gã sau rượu bị ngã xuống đường ray tàu điện ngầm. Ko ai dám nhảy xuống cứu ông ta, trừ Katou, một người bạn thân của Kurono thời tiểu học. Sau khi đưa được người đàn ông lên (với sự giúp đỡ miễn cưỡng của Kurono), hai người bị tàu điện ngầm đâm phải. Họ đã chết, nhưng ngay sau đó lại xuất hiện trong một căn phòng kỳ lạ, đầy những người đã chết như họ. Và một quả cầu màu đen tên là Gantz. Gantz đưa cho họ vũ khí và bắt họ đi tiêu diệt một tên Alien (người ngoài hành tinh), nói rằng đó là cơ hội sống duy nhất của họ. Câu chuyện bắt đầu…<br><br>Alternative Names: ガンツ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 283 chapters |  |  |  |
| chapter dates | LINT | All 283 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=283 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i.imgur.com/.../yprNkMw.jpg` (image/jpeg, 228911 bytes, 1680x2400) |  |  |  |
