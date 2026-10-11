# Extension Validation Report

- Extension: tachiyomi-zh.nnhanman-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6412117657297236190
- Source name: 鸟鸟韩漫
- Source language: zh
- Selected manga input: popular offset 0: 獵艷琯理員 (`.../lie-yan-guan-li-yuan.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | 獵艷琯理員 (`.../lie-yan-guan-li-yuan.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | 為民服務App (`.../wei-min-fu-wu-A-p-p.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 獵艷琯理員 (`.../lie-yan-guan-li-yuan.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 獵艷琯理員 (`.../lie-yan-guan-li-yuan.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 60 | 第60話-我老公今晚不會過來 (`.../chapter-86220.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 177 |  |  | 1-10s |

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
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=獵艷琯理員, URL=`.../lie-yan-guan-li-yuan.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 151/151 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 151/151 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thumb.niaopic.com/.../20250927161204779.jpg` (image/jpeg, 121565 bytes, 302x403) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lie-yan-guan-li-yuan.html` |  |  |  |
| details thumbnail URL | PASS | `https://thumb.niaopic.com/.../20250927161204779.jpg` |  |  |  |
| details author | PASS | 771&Bibig&khs&Maemi&橘狐狸&白鯨&紅色斗篷 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 正妹, 巨乳, 女大生, 狗血劇, 同居 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 「我會給你豐厚的酬勞，條件是你必須跟這棟公寓的女性發生關係，看你是要威脅、和對方談戀愛還是硬來都可以」過著社會底層生活的李翰決定接受這項誘人又危險的提議。「301號房的人妻韓秀珍，必須快點找到她的把柄」 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 60 chapters |  |  |  |
| chapter dates | LINT | All 60 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=60 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 177 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.nnpic.xyz/.../20261010153041806.jpg` (image/jpeg, 53786 bytes, 720x800) |  |  |  |
