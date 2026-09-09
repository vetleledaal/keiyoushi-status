# Extension Validation Report

- Extension: tachiyomi-zh.hanime1-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 32
- Lint: 2
- Warnings: 0
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2853734405579058222
- Source name: Hanime1.me
- Source language: zh
- Selected manga input: popular offset 0: 変熊 (`.../157812`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 6 | 変熊 (`.../157812`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | [Oimomelon (Sinkai Kiiro)] Yoru no YukaYuka [AI漢化] (`.../165951`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Futanari Miko no Midara kou [苹果香槟汉化组] (`.../165922`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 12 | [Henkuma] Sono Kajitsu wa Fuhoni ni Jukusu [Chinese] [葱鱼个人汉化] [Digital] (`.../93168`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 変熊 (`.../157812`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 12 | 關聯：MIRIRIKA [Decensored] (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 28 |  |  | 1-10s |

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
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 12 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 78/78 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 78/78 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://t2.nhentai.net/.../cover.webp` (image/webp (encoding: lossy), 39560 bytes, 700x993) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../157812` |  |  |  |
| details thumbnail URL | PASS | `https://t2.nhentai.net/.../cover.webp` |  |  |  |
| details author | PASS | henkuma |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 同人誌 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | LINT | All 12 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=12 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i2.nhentai.net/.../1.jpg` (image/jpeg, 464280 bytes, 1280x1823) |  |  |  |
