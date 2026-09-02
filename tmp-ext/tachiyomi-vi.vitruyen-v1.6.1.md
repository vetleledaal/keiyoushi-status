# Extension Validation Report

- Extension: tachiyomi-vi.vitruyen-v1.6.1
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
- Source ID: 2855631357866421200
- Source name: ViTruyen
- Source language: vi
- Selected manga input: popular offset 0: Học Cách Chiến Đấu (`.../hoc-cach-chien-dau`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Học Cách Chiến Đấu (`.../hoc-cach-chien-dau`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Những Ranker Cấp S Mà Tôi Nuôi Dưỡng (`.../nhung-ranker-cap-s-ma-toi-nuoi-duong`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Tuyệt Thế Quân Lâm (`.../tuyet-the-quan-lam`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Người Xấu (`.../nguoi-xau`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Học Cách Chiến Đấu (`.../hoc-cach-chien-dau`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Học Cách Chiến Đấu (`.../hoc-cach-chien-dau`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 223 | Chapter 1 (`.../chapter-1-608cacabc45922129c24793b`) |  | <1s |
| pages | `getPageList(chapter)` | success | 90 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Học Cách Chiến Đấu, URL=`hoc-cach-chien-dau` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn2.vitruyen1.com/.../6477968062.jpg` (image/jpeg, 51872 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `hoc-cach-chien-dau` |  |  |  |
| details thumbnail URL | PASS | `https://cdn2.vitruyen1.com/.../6477968062.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Hành Động, Manhwa, Hài Hước, Học Đường, Shounen, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Yoo Hobin luôn bị bắt nạt bởi vì nó là một thằng loser chính hiệu. Tuy nhiên một sự kiện bất ngờ đã đảo lộn cuộc sống của cậu ta. Một cái video tình cờ tải lên mạng làm cậu ta trở nên nổi tiếng, quá tuyệt vời! Càng ngày càng có nhiều người theo dõi và cậu ta còn kiếm ra tiền từ cái vid tình cờ đó nữa! Tuy nhiên, vì chỉ là tình cờ nên cậu ta không thể nào kiếm ra một cái video nào khác như thế nữa. Phát cuồng vì vòng xoáy tiền tài và danh vọng có thể đem lại cho mình, cậu ta lên kế hoạch tạo ra những video thật độc đáo để kiếm thêm người theo dõi. Nhưng để làm ra chúng, thì đầu tiên cậu ta phải biết chiến đấu |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 223 chapters |  |  |  |
| chapter dates | PASS | 223 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 90 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.vitruyen1.com/.../chapter-1_9132142688_0.jpg` (image/jpeg, 203815 bytes, 690x2560) |  |  |  |
