# Extension Validation Report

- Extension: tachiyomi-ja.pixivcomic-v1.6.4
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2937751339618832603
- Source name: Pixivコミック
- Source language: ja
- Selected manga input: popular offset 0: 闇の悪役令嬢は愛されすぎる (`.../13690`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 闇の悪役令嬢は愛されすぎる (`.../13690`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | 楽園に黒を塗る (`.../13629`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | 楽園に黒を塗る (`.../13629`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | 断罪される公爵令嬢、生まれ変わってラスボスの王妃様の子どもになります (`.../12670`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 31 | 闇の悪役令嬢は愛されすぎる (`.../13690`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 闇の悪役令嬢は愛されすぎる (`.../13690`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | 第1話①: 前世の記憶① (`.../247207`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=闇の悪役令嬢は愛されすぎる, URL=`13690` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 151/151 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 151/151 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://public-img-comic.pximg.net/.../13690.jpg <redacted query values: 20260908170711>` (image/jpeg, 455876 bytes, 640x860) |  |  |  |
| details identity | PASS | Details preserved selected URL `13690` |  |  |  |
| details thumbnail URL | PASS | `https://public-img-comic.pximg.net/.../13690.jpg <redacted query values: 20260908170711>` |  |  |  |
| details author | PASS | 漫画：小河なな　原作：葵川真衣 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ファンタジー, 恋愛, コミカライズ悪役, 断罪, 乙女ゲーム, 極悪非道, 恋路, 回避, ヒロイン |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 高慢な態度で当たり散らし、気に入らない相手は容赦なく切り捨て、極悪非道と恐れられる公爵令嬢クリスティン・ファネル。彼女はある日、自分が乙女ゲームの悪役令嬢に転生しているという、恐ろしい事実に気づく。そして今の自分は、正ヒロインの恋路を邪魔した末に断罪される運命にあった。「そんな未来、絶対に嫌――!!」断罪の日まで、残された時間はあと四年。悪役令嬢クリスティンは断罪回避に向けて動き出す――。<br><br>Magazine: Palcy×pixiv異世界 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img-comic.pximg.net/.../1.jpg <redacted query values: 20260903102912>` (image/jpeg, 275864 bytes, 720x1024) |  |  |  |
