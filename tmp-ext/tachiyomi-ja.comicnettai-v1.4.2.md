# Extension Validation Report

- Extension: tachiyomi-ja.comicnettai-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 29
- Lint: 2
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1398057210066455013
- Source name: Comic Nettai
- Source language: ja
- Selected manga input: popular offset 0: トラベリング ウィズ ユー (`.../795`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | トラベリング ウィズ ユー (`.../795`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | シューリンガンの息子 (`.../776`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | トラベリング ウィズ ユー (`.../795`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | トラベリング ウィズ ユー (`.../795`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | トラベリング ウィズ ユー (`.../viewer.html <redacted query values: cid>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 48 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=トラベリング ウィズ ユー, URL=`.../795` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.comicnettai.com/.../%E3%82%B5%E3%82%A4%E3%82%B9%E3%82%99%E8%AA%BF%E6%95%B4%E6%B8%88%E3%81%BF.jpg` (image/jpeg, 342137 bytes, 432x604) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../795` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.comicnettai.com/.../%E3%82%B5%E3%82%A4%E3%83%88%E3%83%8F%E3%82%99%E3%83%8A%E3%83%BC_%E3%83%88%E3%83%A9%E3%83%98%E3%82%99%E3%83%AA%E3%83%B3%E3%82%AF%E3%82%99_re2.jpg` (image/jpeg, 615444 bytes, 1880x752) |  |  |  |
| details author | PASS | つゆきゆるこ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 【『ストレンジ』著者、読切47P！】初めてひとり旅をすることになった大学生・春樹。旅先で心細さを感じていたが、喫茶店の店員・冬馬と出会い、ひとりの旅も思いのほか楽しくなっていく。けれど、楽しい時間を過ごすほど、春樹の胸に本当はいっしょに来るはずだった友人の顔が浮かんでくる…。誰かとの出会いが、気づかせてくれるものがあるーー。つゆきゆるこが描く優しさの物語。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.comicnettai.com/.../10a44e18791e8fbc0c.jpeg` (image/jpeg, 599745 bytes, 1350x1920) |  |  |  |
