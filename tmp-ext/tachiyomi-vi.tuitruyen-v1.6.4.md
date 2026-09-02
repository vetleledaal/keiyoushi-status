# Extension Validation Report

- Extension: tachiyomi-vi.tuitruyen-v1.6.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 2
- Skipped: 2
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
| popular | `getPopularManga(1)` | success | 30 | Iruma Giá Đáo! (`.../4-iruma-gia-dao`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Liệu có thể tìm được một công việc lâu dài không?~ (`.../82-lieu-co-the-tim-duoc-mot-cong-viec-lau-dai-khong`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Cậu Bạn Ren Đáng Sợ Bàn Bên (`.../79-cau-ban-ren-dang-so-ban-ben`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | Iruma Giá Đáo!: IF Episode of MAFIA (`.../2-iruma-gia-dao-if-episode-of-mafia`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Iruma Giá Đáo! (`.../4-iruma-gia-dao`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 466 | Ch. 1 (`.../1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 46 |  |  | <1s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Iruma Giá Đáo!, URL=`.../4-iruma-gia-dao` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 80/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i3.tuitruyen.top/.../4-iruma-gia-dao-sm.webp <redacted query values: t>` (image/webp (encoding: lossy), 16186 bytes, 132x176) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../4-iruma-gia-dao` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i3.tuitruyen.top/.../4-iruma-gia-dao-md.webp <redacted query values: t>` (image/webp (encoding: lossy), 53794 bytes, 262x349) |  |  |  |
| details author | PASS | Nishi Osamu |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Demon, Drama, Fantasy, Isekai, Magic, Monster, School Life, Shounen, Slice Of Life, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Mairimashita! Iruma-kun là câu chuyện kể về cậu bé Suzuki Iruma, người đã bị bố mẹ mình kí khế ước bán cho ác ma để đổi lấy tiền tài và bình an. Cậu bé Iruma đáng thương từ lúc mới biết đi (1 tuổi) đã phải "ra xã hội" lăn lộn, buôn ba khắp nơi với hai vị phụ huynh "tưng tửng" cho đến ngày một Ác Ma đến rước cậu đến Ma giới theo khế ước. Tưởng chừng như sắp vào bụng quỷ thì vị Ác Ma già nua này đã khóc lóc yêu cầu cậu làm cháu trai ông ta, với bản tính lương thiện và tốt bụng đến cả bản thân mình cũng phải kinh ngạc, cậu bất đắc dĩ đã đồng ý lời đề nghị đó và nhập học trường Ác Ma theo ý ông ta. Chuyện gì sẽ xảy ra tiếp theo, mời các bạn theo dõi cuộc sống học đường đầy bất thường của Iruma-kun. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 466 chapters |  |  |  |
| chapter dates | PASS | 466 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i3.tuitruyen.top/.../001.webp <redacted query values: t>` (image/webp (encoding: lossy), 132190 bytes, 1000x1000) |  |  |  |
