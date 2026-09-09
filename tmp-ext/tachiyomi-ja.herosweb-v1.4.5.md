# Extension Validation Report

- Extension: tachiyomi-ja.herosweb-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 6981500022236807277
- Source name: HERO'S Web
- Source language: ja
- Selected manga input: popular offset 0: 新連載を考える漫画家と編集 (`.../f17b8b220b53f`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 新連載を考える漫画家と編集 (`.../f17b8b220b53f`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 14 | どく・どく・もり・もり (`.../ba0ab288a8f27`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 新連載を考える漫画家と編集 (`.../f17b8b220b53f`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 新連載を考える漫画家と編集 (`.../f17b8b220b53f`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 12 | 第1話　別人格持ち主人公編 (`.../fa4cb1babe812`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 14 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=新連載を考える漫画家と編集, URL=`.../f17b8b220b53f` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 47/47 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 47/47 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../2026070814060650469AAE190921E806900E366186E25B0B1-lg.webp` (image/webp (encoding: lossy), 49304 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../f17b8b220b53f` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../2026070814060650469AAE190921E806900E366186E25B0B1.png` (image/png, 3817789 bytes, 2560x1344) |  |  |  |
| details author | PASS | じゅうあみ, えの |  |  |  |
| details artist | PASS | じゅうあみ, えの |  |  |  |
| details genres | PASS | ギャグ・コメディー, ヒーローズ, 日常・ほのぼの, 青年マンガ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 漫画家の諏訪《すわ》先生と編集者の辺見《へんみ》は、『月刊少年マクガフィン』での新連載立ち上げに向けて、日々企画会議を行なっていた。先生のナナメ上の読者分析、独特な癖（ヘキ）、作画コストをなるべく抑えたい思惑…その先に生み出される、意外な企画の数々──。"編集長"という高く険しい壁を、二人が乗り越えられる日は訪れるのか…⁉︎ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | PASS | 12 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://comicsviewer.heros-web.com/.../master-1778653278589-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 14, 6, 8, 3, 0, 2, 5, 9, 11, 12, 4, 10, 1, 15, 13\]` (image/jpeg, 657915 bytes, 1440x2048) |  |  |  |
