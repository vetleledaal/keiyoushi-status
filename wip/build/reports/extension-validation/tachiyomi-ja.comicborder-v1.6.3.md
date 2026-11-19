# Extension Validation Report

- Extension: tachiyomi-ja.comicborder-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gigaviewer
- Source ID: 1077630719925082256
- Source name: Comic Border
- Source language: ja
- Selected manga input: popular offset 0: 幸せなのでお構いなく！恋愛指南書頼みの次期公爵さまは、逃げる婚約者をつかまえたい (`.../12207421983939420379`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 幸せなのでお構いなく！恋愛指南書頼みの次期公爵さまは、逃げる婚約者をつかまえたい (`.../12207421983939420379`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 幸せなのでお構いなく！恋愛指南書頼みの次期公爵さまは、逃げる婚約者をつかまえたい (`.../12207421983939420379`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 幸せなのでお構いなく！恋愛指南書頼みの次期公爵さまは、逃げる婚約者をつかまえたい (`.../12207421983939420379`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | 第1話 (`.../12207421983939423523`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 34 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=幸せなのでお構いなく！恋愛指南書頼みの次期公爵さまは、逃げる婚約者をつかまえたい, URL=`12207421983939420379` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.comicborder.com/.../12207421983939420379-840f1243c7eeb6b3848c7fec69478816 <redacted query values: 1786498218>` (image/png, 1043489 bytes, 2917x1625) |  |  |  |
| details identity | PASS | Details preserved selected URL `12207421983939420379` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.comicborder.com/.../12207421983939420379-840f1243c7eeb6b3848c7fec69478816 <redacted query values: 1786498218>` |  |  |  |
| details author | PASS | あまね周.../%E6%9C%9D%E6%AF%94%E5%A5%88%E5%B8%8C%E5%A4%9C |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 伯爵家令嬢ソフィアの婚約者・ジェイドが戦場から帰還。公爵家子息で容姿端麗なうえ、騎士団長を任されるエリートのジェイドに歓声を上げる令嬢たち。<br>ソフィアは彼から手紙の返事がなかったことを不審に思いながらも、最愛の婚約者との久しぶりの再会を喜ぶ。<br>しかし、何故かジェイドの態度はそっけなく、さらには恋人に送るはずの勲章を皇女に渡してしまう…!!<br>「手紙の返事すらよこさない冷酷男なんて、こちらから願い下げよ！」<br>これまで好きなことを我慢して花嫁修行に励んできたソフィアは、その衝撃の光景を目の当たりにし、婚約破棄を決意!!<br>我慢をやめて、自由に自分の人生を楽しむことを決める。<br>──しかし、実はジェイドには恋愛指南書頼みの”超・恋愛ポンコツ”という一面があり…!? <br>自由を楽しむおてんば令嬢×一途だけど、恋愛はポンコツな騎士団長のすれ違いラブコメディ♪ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 34 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.comicborder.com/.../12207421984081479615-a1f15225efba2a945c3f0e2d5fc0cd14` (image/jpeg, 310313 bytes, 914x1300) |  |  |  |
