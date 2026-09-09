# Extension Validation Report

- Extension: tachiyomi-ja.takecomic-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 5158991361251014104
- Source name: TakeComic
- Source language: ja
- Selected manga input: popular offset 0: 転生少女は救世を望まれる 平穏を目指した私は世界の重要人物だったようです (`.../babb5ed0396c7`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 転生少女は救世を望まれる 平穏を目指した私は世界の重要人物だったようです (`.../babb5ed0396c7`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | リオンクール戦記 (`.../5f24e7c5dbf8e`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | 世間だと大怪獣は防衛組織が倒した事になっているけど、実際は陰キャにくすぶっている高校生が葬っている ～平穏を望みたい怪獣殺し～ (`.../04f5a25561074`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 転生少女は救世を望まれる 平穏を目指した私は世界の重要人物だったようです (`.../babb5ed0396c7`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 転生少女は救世を望まれる 平穏を目指した私は世界の重要人物だったようです (`.../babb5ed0396c7`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 27 | 1 話 (`.../62ad95f7e5070`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=転生少女は救世を望まれる 平穏を目指した私は世界の重要人物だったようです, URL=`.../babb5ed0396c7` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20250917123237165E52FC7AC1E3710522661DC9D1BC17B2B-lg.webp` (image/webp (encoding: lossy), 37718 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../babb5ed0396c7` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20250917123237165E52FC7AC1E3710522661DC9D1BC17B2B.png` (image/png, 3751535 bytes, 2560x1344) |  |  |  |
| details author | PASS | 蒼井美紗（ツギクル）, あぬ, 蓮深ふみ |  |  |  |
| details artist | PASS | 蒼井美紗（ツギクル）, あぬ, 蓮深ふみ |  |  |  |
| details genres | PASS | 異世界, 転生・転移, チート・無双, お仕事, スローライフ, コミカライズ, ヒューマンドラマ, 料理・グルメ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | スラム街で家族と暮らしていたレーナは、不意に日本で生きた記憶を思い出す。清潔な住まいに美味しいご飯、沢山の娯楽...そんな快適だった日々と今を比べ、現状に耐えられなくなってしまう。豊かな生活を目指し、街で働くことを計画したレーナは...街の人々が運営する市場で特技の暗算を披露し、雇ってもらえるように交渉をしはじめる――。<br><br>計算力を武器にして!! 幸せをつかみ取る異世界シンデレラ・ストーリー、開幕!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 27 chapters |  |  |  |
| chapter dates | PASS | 27 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.takecomic.jp/.../master-1755580677996-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 11, 8, 6, 3, 14, 7, 0, 1, 5, 9, 10, 15, 12, 4, 2\]` (image/jpeg, 724049 bytes, 1008x1433) |  |  |  |
