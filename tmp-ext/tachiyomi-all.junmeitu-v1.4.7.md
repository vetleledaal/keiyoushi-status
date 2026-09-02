# Extension Validation Report

- Extension: tachiyomi-all.junmeitu-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 3
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4721197766605490540
- Source name: Junmeitu
- Source language: all
- Selected manga input: latest offset 0: [SSA絲社]超清寫真 No.806 模特晶晶的浪莎絲襪（上）[118P] (`.../chaoqingxiezhen_no_806_motejingji.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 《JK白絲姐妹花》 [森蘿财團] X-025 寫真集 (`.../jkbaisijiemeihua_x_025.html`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 32 | 桜桃喵《小背心換水手服》 [蘿莉COS] 寫真集 (`.../yingtaomiao_xiaobeixinhuanshuishoufu_luolicos.html`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 32 | [SSA絲社]超清寫真 No.806 模特晶晶的浪莎絲襪（上）[118P] (`.../chaoqingxiezhen_no_806_motejingji.html`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 32 | [SSA絲社]超清寫真 NO.660 模特思甜的黑絲襪美足（上）[136P] (`.../chaoqingxiezhen_no_660_motesitian.html`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | [SSA絲社]超清寫真 No.806 模特晶晶的浪莎絲襪（上）[118P] (`.../chaoqingxiezhen_no_806_motejingji.html`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Gallery (`.../chaoqingxiezhen_no_806_motejingji.html`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 118 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 32 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 128/128 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 128/128 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s.wujituku.com/.../106166_thumb_0_425_0001.webp` (image/webp (encoding: lossy), 9854 bytes, 283x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../chaoqingxiezhen_no_806_motejingji.html` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 機構: SSA絲社 作品編號: No.806 日期: 2026-08-18<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 118 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://s.wujituku.com/.../0001.webp` (image/webp (encoding: lossy), 72926 bytes, 1200x1800) |  |  |  |
