# Extension Validation Report

- Extension: tachiyomi-zh.hanime1-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 3
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
- Selected manga input: popular offset 0: [Ijiise] Kaigai shusshin no shinkon tsuma ga hoka no otoko to Yaritai to dogeza shite kimashita [丰川祥子个人汉化] (`.../140754`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | [Ijiise] Kaigai shusshin no shinkon tsuma ga hoka no otoko to Yaritai to dogeza shite kimashita [丰川祥子个人汉化] (`.../140754`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | [MadBull] 传说中的荡妇小分队1~5 [个人ai渣翻] (`.../167430`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | [Yuruchin Kyouso] Saimin Choukyou Rose Cedre Gakuen [Dai 3 Wa [Dai 3 Wa (Cyberia Plus Vol. 18) [Chinese] (`.../167407`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Ijiise] Kaigai shusshin no shinkon tsuma ga hoka no otoko to Yaritai to dogeza shite kimashita [丰川祥子个人汉化] (`.../140754`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | 當前：[Ijiise] Kaigai shusshin no shinkon tsuma ga hoka no otoko to Yaritai to dogeza shite kimashita [丰川祥子个人汉化] (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 268 |  |  | 1-10s |

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
| thumbnail | PASS | `https://t2.nhentai.net/.../cover.webp` (image/webp (encoding: lossy), 25934 bytes, 700x525) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../140754` |  |  |  |
| details thumbnail URL | PASS | `https://t2.nhentai.net/.../cover.webp` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 漫畫 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | LINT | All 3 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 268 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i2.nhentai.net/.../1.webp` (image/webp (encoding: lossy), 103500 bytes, 1280x960) |  |  |  |
