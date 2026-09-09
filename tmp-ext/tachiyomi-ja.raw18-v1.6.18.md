# Extension Validation Report

- Extension: tachiyomi-ja.raw18-v1.6.18
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: wpcomics
- Source ID: 2238636513447052332
- Source name: Raw18
- Source language: ja
- Selected manga input: popular offset 0: リモートラブホール (`.../rimotorabuhoru`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | リモートラブホール (`.../rimotorabuhoru`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 36 | 社内エッチは常識です (`.../shanai-etchi-wa-joshikidesu`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 36 | あの採石場で花束を (`.../anocai-shi-chang-dehua-shu-wo`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 36 | 悪役令嬢に転生した私が、なぜか暴君侯爵に溺愛されてるんですけど (`.../e-yi-ling-niang-nizhuan-sheng-shitasi-ga-nazekabao-jun-hou-jue-nini-ai-sareterundesukedo`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | リモートラブホール (`.../rimotorabuhoru`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 112 | 第1話 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 70 |  |  | 1-10s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 144/144 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 144/144 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://admin.raw18.im/.../rimotorabuhoru.jpg` (image/jpeg, 22550 bytes, 197x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../rimotorabuhoru` |  |  |  |
| details thumbnail URL | PASS | `https://admin.raw18.im/.../rimotorabuhoru.jpg` |  |  |  |
| details author | PASS | だるま , Kestrel orc , HARU |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | フルカラー |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 説明 リモートラブホール raw free!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 112 chapters |  |  |  |
| chapter dates | PASS | 112 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 70 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://zr8photomg.online/.../1.webp` (image/webp (encoding: lossy), 71660 bytes, 929x2224) |  |  |  |
