# Extension Validation Report

- Extension: tachiyomi-ja.comicpash-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 6626616605316433619
- Source name: Comic Pash
- Source language: ja
- Selected manga input: popular offset 0: 虐げられ王女に転生しましたが、竜神の加護を持つ最強騎士様に愛されて幸せです (`.../142d48e83829a`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | 虐げられ王女に転生しましたが、竜神の加護を持つ最強騎士様に愛されて幸せです (`.../142d48e83829a`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 「剣士は時代遅れ」と左遷された人類最強のおっさん、魔術学院で教師になって無双する (`.../3cb428a20e057`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 首桃果の秘密 (`.../cfca472f20757`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 虐げられ王女に転生しましたが、竜神の加護を持つ最強騎士様に愛されて幸せです (`.../142d48e83829a`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 虐げられ王女に転生しましたが、竜神の加護を持つ最強騎士様に愛されて幸せです (`.../142d48e83829a`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 34 | 第1話 (`.../79b69c2bda18e`) |  | <1s |
| pages | `getPageList(chapter)` | success | 30 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=虐げられ王女に転生しましたが、竜神の加護を持つ最強騎士様に愛されて幸せです, URL=`142d48e83829a` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20241216193102405B2FBAF7F4D06F1DB4E0FBD00961A24CC-lg.webp` (image/webp (encoding: lossy), 28922 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `142d48e83829a` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20241216193102405B2FBAF7F4D06F1DB4E0FBD00961A24CC.png` (image/png, 3626834 bytes, 2560x1344) |  |  |  |
| details author | PASS | 羽是, 三沢ケイ |  |  |  |
| details artist | PASS | 羽是, 三沢ケイ |  |  |  |
| details genres | PASS | 令嬢・宮廷, 女性向け, 恋愛 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 前世のつらい結婚生活の記憶を持ったまま転生した王女・アネット。今世でも環境は悪く、王族からひどい扱いを受けていた。<br>そんな中、戦争で功績を上げた将軍・フォルカーとの結婚が決まるが、それは褒賞とは名ばかりの、疎ましい者たちを遠ざけるための王による策略だった。<br>アネットとフォルカーは、望まない結婚だったのではと、互いを気の毒に思いながら結婚生活を始めるが…？<br>悲運の転生王女×生真面目軍人の、政略結婚から運命が回り出す、じれ甘溺愛ファンタジー。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 34 chapters |  |  |  |
| chapter dates | PASS | 34 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.comicpash.jp/.../master-1734089946482-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 8, 6, 12, 9, 1, 2, 11, 0, 4, 13, 14, 15, 5, 10, 3\]` (image/jpeg, 182111 bytes, 720x1024) |  |  |  |
