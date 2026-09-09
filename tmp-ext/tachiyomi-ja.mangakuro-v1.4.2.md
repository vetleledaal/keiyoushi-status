# Extension Validation Report

- Extension: tachiyomi-ja.mangakuro-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4278045440527026000
- Source name: MangaKuro
- Source language: ja
- Selected manga input: popular offset 0: 入学傭兵 (`.../ru-xue-yong-bing`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | 入学傭兵 (`.../ru-xue-yong-bing`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | ラグナール～回帰の剣士～ (`.../ragunaru-hui-guino-jian-shi`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | チュートリアルが死ぬほど難しい (`.../chutoriaruga-sinuhodo-nanshii`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | 誰かが私に憑依した (`.../shuikaga-sini-ping-yishita`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 入学傭兵 (`.../ru-xue-yong-bing`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 入学傭兵 (`.../ru-xue-yong-bing`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 280 | 第1話 (`.../di1hua`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 131 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=入学傭兵, URL=`.../ru-xue-yong-bing` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangakuro.net/.../ru-xue-yong-bing.jpg` (image/jpeg, 41634 bytes, 360x518) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ru-xue-yong-bing` |  |  |  |
| details thumbnail URL | PASS | `https://mangakuro.net/.../ru-xue-yong-bing.jpg` |  |  |  |
| details author | PASS | 不明 - 不明 - 不明 - 不明 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 10年間の傭兵生活を終え少年は学校に入学する |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 280 chapters |  |  |  |
| chapter dates | LINT | All 280 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=280 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 131 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | pages: `https://i2.wp.com/.../1.jpg` to `https://blogger.googleusercontent.com/.../1.jpg` (1 redirects) |  |  |  |
| page load | PASS | `https://i2.wp.com/.../1.jpg` (image/webp (container: extended), 288326 bytes, 690x1280) |  |  |  |
