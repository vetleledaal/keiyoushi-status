# Extension Validation Report

- Extension: tachiyomi-ja.zerosumonline-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8525996702535864887
- Source name: Zerosum Online
- Source language: ja
- Selected manga input: popular offset 0: 神竜の後継者 出来損ないと二人の守護竜 (`.../shinryu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 101 | 神竜の後継者 出来損ないと二人の守護竜 (`.../shinryu`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 神竜の後継者 出来損ないと二人の守護竜 (`.../shinryu`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 神竜の後継者 出来損ないと二人の守護竜 (`.../shinryu`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 3 | 第一章 始まりと目覚め➀ (`.../2832`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 30 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 101 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=神竜の後継者 出来損ないと二人の守護竜, URL=`.../shinryu` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://contents.zerosumonline.com/.../197.webp` (image/webp (encoding: lossy), 33342 bytes, 350x490) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../shinryu` |  |  |  |
| details thumbnail URL | PASS | `https://contents.zerosumonline.com/.../197.webp` |  |  |  |
| details author | PASS | 漫画：刹那魁.../%E3%82%AD%E3%83%A3%E3%83%A9%E3%82%AF%E3%82%BF%E3%83%BC%E5%8E%9F%E6%A1%88%EF%BC%9A%E5%86%86%E9%99%A3%E9%97%87%E4%B8%B8 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 気が付くとプレイしていたゲームのキャラ、ハイネ・クローデルになっていた俺。<br>ハイネといえば次代竜王の証である竜紋を持ちながら竜化できない出来損ないで、最終的には悪役としての死が待っている。<br>せっかく大好きなゲーム世界に生きる竜人族になったのだから、破滅を回避して平和に過ごしたい。<br>そう思っていたのに、右腕の竜紋が突然血みたいな赤色に変化して!?<br>どうやら＜竜神紋＞とかいう大層なものに進化してしまったらしい。<br>面倒事を避けるため何とか誤魔化そうとするも、南方守護騎士団長セン・カレナには全てお見通しで——…<br><br>「一迅社ノベルス」の大人気作を公式コミカライズ!!<br><br><br><br>シンリュウノコウケイシャ デキソコナイトフタリノシュゴリュウ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://contents.zerosumonline.com/.../1.webp` (image/webp (encoding: lossy), 80954 bytes, 960x1365) |  |  |  |
