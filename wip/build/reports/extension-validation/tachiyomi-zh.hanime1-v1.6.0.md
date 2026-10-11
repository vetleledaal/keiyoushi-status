# Extension Validation Report

- Extension: tachiyomi-zh.hanime1-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 2
- Warnings: 0
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2853734405579058222
- Source name: Hanime1.me
- Source language: zh
- Selected manga input: popular offset 0: [Nagaikusa] Haramitagari na Mama| 想要怀孕的妈妈 [Digital] (`.../133944`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | [Nagaikusa] Haramitagari na Mama| 想要怀孕的妈妈 [Digital] (`.../133944`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | [Oimomelon (Sinkai Kiiro)] Yoru no YukaYuka [AI漢化] (`.../165951`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Futanari Miko no Midara kou [苹果香槟汉化组] (`.../165922`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Nagaikusa] Haramitagari na Mama| 想要怀孕的妈妈 [Digital] (`.../133944`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | 關聯：[Nagaikusa] Haramitagari na Hahaoya [Chinese] (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 199 |  |  | 1-10s |

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
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 66/66 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 66/66 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://t2.nhentai.net/.../cover.webp` (image/webp (encoding: lossy), 44154 bytes, 700x992) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../133944` |  |  |  |
| details thumbnail URL | PASS | `https://t2.nhentai.net/.../cover.webp` |  |  |  |
| details author | PASS | nagaikusa |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 漫畫 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | LINT | All 2 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=2 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 199 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i2.nhentai.net/.../1.jpg` (image/jpeg, 391689 bytes, 1280x1814) |  |  |  |
