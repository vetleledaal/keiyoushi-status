# Extension Validation Report

- Extension: tachiyomi-vi.mangamori-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5806092734120749569
- Source name: MangaMori
- Source language: vi
- Selected manga input: popular offset 0: Mokushiroku no Yonkishi (`.../mokushiroku-no-yonkishi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Mokushiroku no Yonkishi (`.../mokushiroku-no-yonkishi`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Mokushiroku no Yonkishi (`.../mokushiroku-no-yonkishi`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mokushiroku no Yonkishi (`.../mokushiroku-no-yonkishi`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 526 | Ch. 1 (Raw) (`.../1 <redacted query values: mode>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 72 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mokushiroku no Yonkishi, URL=`mokushiroku-no-yonkishi` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 13/13 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 13/13 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pub-03cbbae7975640f98d7327f566a17fb6.r2.dev/.../thumbnail-1783178719197.png` (image/jpeg, 135823 bytes, 640x957; server Content-Type: image/png) |  |  |  |
| details identity | PASS | Details preserved selected URL `mokushiroku-no-yonkishi` |  |  |  |
| details thumbnail URL | PASS | `https://pub-03cbbae7975640f98d7327f566a17fb6.r2.dev/.../thumbnail-1783178719197.png` |  |  |  |
| details author | PASS | Nakaba Suzuki |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Percival luôn sống với ông nội trên Ngón Tay của Chúa (God's Finger), một nơi trú ẩn hẻo lánh nằm cao trên mây. Và dù yêu thích cuộc sống giản dị, cậu vẫn thầm khao khát phiêu lưu. Nhưng cuộc đời của Percival thay đổi mãi mãi khi một kẻ xâm nhập—người có mối liên hệ đáng kinh ngạc với cậu—đã cướp đi tất cả những gì cậu từng biết. Không còn cách nào khác ngoài việc truy đuổi kẻ đã lấy đi mọi thứ của mình, Percival tự mình lên đường. Trong hành trình, cậu bé được bao bọc này phát hiện ra rằng có rất nhiều điều cậu không biết về cuộc sống bình thường. May mắn thay, cậu gặp được những người bạn trên đường đi, những người có thể giúp cậu vượt qua khó khăn—nhưng họ sẽ phản ứng như thế nào khi biết về số phận của Percival... và mối liên hệ của nó với ngày tận thế? (Cre: Kodansha USA) |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 17 name, chapter 55 name |  |  |  |
| chapters | PASS | 526 chapters |  |  |  |
| chapter dates | PASS | 526 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 72 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://pub-03cbbae7975640f98d7327f566a17fb6.r2.dev/.../0001.jpeg` (image/jpeg, 296659 bytes, 1067x1600) |  |  |  |
