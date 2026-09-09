# Extension Validation Report

- Extension: tachiyomi-vi.minotruyen-v1.6.5
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 30
- Lint: 1
- Warnings: 1
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
- Selected manga input: popular offset 0: Gửi đến em - Thanh xuân nghiệt ngã của đời tôi (`.../52987`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Gửi đến em - Thanh xuân nghiệt ngã của đời tôi (`.../52987`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Cuộc chơi trên núi tử thần (`.../7788`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Gửi đến em - Thanh xuân nghiệt ngã của đời tôi (`.../52987`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Gửi đến em - Thanh xuân nghiệt ngã của đời tôi (`.../52987`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 7 | Chapter 01 (`.../6584854`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 52 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Gửi đến em - Thanh xuân nghiệt ngã của đời tôi, URL=`.../52987` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://p21-lp-sg.ibyteimg.com/.../c8a9cd146db7443793fadc7de7f42bf4~tplv-375lmtcpo0-resize:200:200.webp` (image/webp (encoding: lossy), 8352 bytes, 133x200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../52987` |  |  |  |
| details thumbnail URL | PASS | `https://p21-lp-sg.ibyteimg.com/.../c8a9cd146db7443793fadc7de7f42bf4~tplv-375lmtcpo0-resize:200:200.webp` |  |  |  |
| details author | PASS | MAENO Onsen |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | comedy, manga, romance, romcom, school life, slice of life |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | <p>Với chiều cao 192 cm và một vết sẹo trên mặt, Ujioka Tasuku luôn bị mọi người xung quanh hiểu lầm là một "kẻ đáng sợ", và vì vậy mà cuộc sống học đường của cậu trước giờ luôn cô độc. Vào ngày đầu tiên ở trường cấp ba, Ujioka quyết tâm sẽ kết bạn và tận hưởng một cuộc sống học đường vui vẻ, thế nhưng, một cuộc gặp gỡ chấn động với Shimohoshizaki Kodzuru đã xảy đến sau khi cô nàng trượt phải vỏ chuối!<.../p%3E |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | PASS | 7 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://api.cloudkk-v1.xyz/.../books <redacted query values: take and category>` to `https://api.cloudkk-v2.xyz/.../books <redacted query values: take and category>` (1 redirects); popular: `https://api.cloudkk-v1.xyz/.../books <redacted query values: take, page, and category>` to `https://api.cloudkk-v2.xyz/.../books <redacted query values: take, page, and category>` (1 redirects); popular: `https://api.cloudkk-v1.xyz/.../books <redacted query values: take, page, category, and q>` to `https://api.cloudkk-v2.xyz/.../books <redacted query values: take, page, category, and q>` (1 redirects); popular: `https://api.cloudkk-v1.xyz/.../52987` to `https://api.cloudkk-v2.xyz/.../52987` (1 redirects); popular: `https://api.cloudkk-v1.xyz/.../books <redacted query values: take, page, and category>` to `https://api.cloudkk-v2.xyz/.../books <redacted query values: take, page, and category>` (1 redirects); popular: `https://api.cloudkk-v1.xyz/.../tags <redacted query values: take and category>` to `https://api.cloudkk-v2.xyz/.../tags <redacted query values: take and category>` (1 redirects); popular: `https://api.cloudkk-v1.xyz/.../chapters <redacted query values: order>` to `https://api.cloudkk-v2.xyz/.../chapters <redacted query values: order>` (1 redirects); popular: `https://minotruyenv5.xyz/.../6584854` to `https://minotruyenv5.xyz/.../6584854` (1 redirects) |  |  |  |
| page load | PASS | `https://phinf.pstatic.net/.../test.jpeg` (image/jpeg, 335825 bytes, 2048x1469) |  |  |  |
