# Extension Validation Report

- Extension: tachiyomi-vi.tuitruyen-v1.6.7
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4438807780413463687
- Source name: TuiTruyen
- Source language: vi
- Selected manga input: popular offset 0: Iruma Giá Đáo! (`.../4-iruma-gia-dao`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Iruma Giá Đáo! (`.../4-iruma-gia-dao`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Tên bắt nạt này cứ tử tế sao ấy (`.../40-ten-bat-nat-nay-cu-tu-te-sao-ay`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Iruma Giá Đáo! (`.../4-iruma-gia-dao`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | CHASCAPE!! (`.../45-chascape`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | Iruma Giá Đáo! (`.../4-iruma-gia-dao`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Iruma Giá Đáo! (`.../4-iruma-gia-dao`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 477 | Ch. 1 (`.../1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 46 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Iruma Giá Đáo!, URL=`.../4-iruma-gia-dao` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i3.tuitruyen.top/.../4-iruma-gia-dao-md.webp <redacted query values: t>` (image/webp (encoding: lossy), 53794 bytes, 262x349) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../4-iruma-gia-dao` |  |  |  |
| details thumbnail URL | PASS | `https://i3.tuitruyen.top/.../4-iruma-gia-dao-md.webp <redacted query values: t>` |  |  |  |
| details author | PASS | Nishi Osamu |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Demon, Drama, Fantasy, Isekai, Magic, Monster, School Life, Shounen, Slice Of Life, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Mairimashita! Iruma-kun là câu chuyện kể về cậu bé Suzuki Iruma, người đã bị bố mẹ mình kí khế ước bán cho ác ma để đổi lấy tiền tài và bình an. Cậu bé Iruma đáng thương từ lúc mới biết đi (1 tuổi) đã phải "ra xã hội" lăn lộn, buôn ba khắp nơi với hai vị phụ huynh "tưng tửng" cho đến ngày một Ác Ma đến rước cậu đến Ma giới theo khế ước. Tưởng chừng như sắp vào bụng quỷ thì vị Ác Ma già nua này đã khóc lóc yêu cầu cậu làm cháu trai ông ta, với bản tính lương thiện và tốt bụng đến cả bản thân mình cũng phải kinh ngạc, cậu bất đắc dĩ đã đồng ý lời đề nghị đó và nhập học trường Ác Ma theo ý ông ta. Chuyện gì sẽ xảy ra tiếp theo, mời các bạn theo dõi cuộc sống học đường đầy bất thường của Iruma-kun. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 477 chapters |  |  |  |
| chapter dates | PASS | 477 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i3.tuitruyen.top/.../001.js <redacted query values: t>` (image/webp (encoding: lossy), 132190 bytes, 1000x1000; server Content-Type: application/octet-stream) |  |  |  |
