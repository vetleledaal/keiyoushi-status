# Extension Validation Report

- Extension: tachiyomi-ja.hayacomic-v1.4.5
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
- Source ID: 5820719158683766054
- Source name: HAYA Comic
- Source language: ja
- Selected manga input: popular offset 0: 転生令嬢と数奇な人生を (`.../cbe869b59eb8d`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 26 | 転生令嬢と数奇な人生を (`.../cbe869b59eb8d`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 26 | ＡＢＣ殺人事件 (`.../18e64f63b0c14`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | 転生令嬢と数奇な人生を (`.../cbe869b59eb8d`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 転生令嬢と数奇な人生を (`.../cbe869b59eb8d`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 19 | 転生令嬢と数奇な人生を　第1話（1） (`.../181c4985b7b70`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 27 |  |  | 1-10s |

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
| popular listing | PASS | 26 entries |  |  |  |
| latest listing | PASS | 26 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=転生令嬢と数奇な人生を, URL=`.../cbe869b59eb8d` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 54/54 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 54/54 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20240712161810909DC25AA3188A1CEE9FD732D86BB5D5BF6-lg.webp` (image/webp (encoding: lossy), 46948 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cbe869b59eb8d` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20240712161810909DC25AA3188A1CEE9FD732D86BB5D5BF6.png` (image/png, 1415163 bytes, 1280x672) |  |  |  |
| details author | PASS | かみはら, しろ４６ |  |  |  |
| details artist | PASS | かみはら, しろ４６ |  |  |  |
| details genres | PASS | ファンタジー, 異世界転生, このライトノベルがすごい！2023女性部門 第5位 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 前世日本人女性で30代で死亡したという記憶がある以外、とくにチート能力も使命もない、いわゆるモブ転生……ファルクラム王国の中流貴族キルステン家の令嬢に転生したカレンの運命は？　『このライトノベルがすごい！2023』女性部門5位ランクイン！「小説家になろう」サイトで2800万ＰＶ突破をした話題作が遂にコミカライズ！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 19 chapters |  |  |  |
| chapter dates | PASS | 19 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.hayacomic.jp/.../master-1737081073387-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 13, 11, 3, 14, 9, 1, 2, 6, 10, 0, 15, 12, 5, 4, 8\]` (image/jpeg, 406347 bytes, 850x1200) |  |  |  |
