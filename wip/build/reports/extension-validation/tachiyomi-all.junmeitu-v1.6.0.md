# Extension Validation Report

- Extension: tachiyomi-all.junmeitu-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 33
- Lint: 2
- Warnings: 1
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
| popular_next | `getPopularManga(2)` | success | 32 | 牧原あゆ ~ natsusyoujyo makihara02 [Imouto.tv] 寫真集 (`.../muyuan_natsusyoujyo_makihara02_imouto_tv.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 32 | [SIEE絲意] 新刊 NO.071 曦曦 卡布奇諾[46P] (`.../sieesiyi_xinkan_no_071_xixi_kabuqinuo_46p.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 32 | [SIEE絲意] 新刊 NO.009 魚魚 樓道肉絲[52P] (`.../sieesiyi_xinkan_no_009_yuyu_loudaorousi_52p.html`) |  | <1s |
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
| latest pagination | UNUSUAL | Overlapping manga: title=\[SIEE絲意\] 新刊 NO.009 魚魚 樓道肉絲\[52P\], URL=`.../sieesiyi_xinkan_no_009_yuyu_loudaorousi_52p.html` at page 1 offset 30 and page 2 offset 0 |  |  |  |
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
