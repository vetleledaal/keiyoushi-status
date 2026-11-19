# Extension Validation Report

- Extension: tachiyomi-all.junmeitu-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4721197766605490540
- Source name: Junmeitu
- Source language: all
- Selected manga input: popular offset 0: 《JK白絲姐妹花》 [森蘿财團] X-025 寫真集 (`.../jkbaisijiemeihua_x_025.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | 《JK白絲姐妹花》 [森蘿财團] X-025 寫真集 (`.../jkbaisijiemeihua_x_025.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 32 | 易陽Silvia《巨乳制服誘惑》 [秀人XIUREN] No.1583 寫真集 (`.../yiyangsilvia_juruzhifuyouhuo_xiurenxiuren_no_1583.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 32 | 048.[Paranhosu] Inah (이나) Vol.1 Event Bonus Photos [20P] (`.../048_inah_vol_1_event_bonus_photos_20p.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 32 | 093.[Patreon] Rina - Red is sexy [99P] (`.../093_rina_red_is_sexy_99p.html`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 《JK白絲姐妹花》 [森蘿财團] X-025 寫真集 (`.../jkbaisijiemeihua_x_025.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../jkbaisijiemeihua_x_025.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 131 |  |  | <1s |

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
| thumbnail | PASS | `https://i.wujituku.com/.../thumb_0_425_1olrn24cqor.webp` (image/webp (encoding: lossy), 13418 bytes, 638x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../jkbaisijiemeihua_x_025.html` |  |  |  |
| details thumbnail URL | PASS | `https://i.wujituku.com/.../thumb_0_425_1olrn24cqor.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 蘿莉控, 白絲, 姐妹花 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 模特: 姐妹花 機構: 森蘿财團 作品編號: X-025 日期: 2024-06-08<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 131 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.wujituku.com/.../1olrn24cqor.webp` (image/webp (encoding: lossy), 28854 bytes, 1200x800) |  |  |  |
