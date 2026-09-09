# Extension Validation Report

- Extension: tachiyomi-ja.comico-v1.4.2
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

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4991718230921189832
- Source name: コミコ
- Source language: ja
- Selected manga input: popular offset 0: 生贄悪女は政敵王子の番となる (`.../9546`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 25 | 生贄悪女は政敵王子の番となる (`.../9546`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 25 | 悪女は今日も楽しい【タテヨミ】 (`.../12063`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 25 | クズには薬より復讐を (`.../11647`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 25 | 今度こそ、この結婚を回避します～愛のないあなたと離れる方法～ (`.../11853`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 生贄悪女は政敵王子の番となる (`.../9546`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 生贄悪女は政敵王子の番となる (`.../9546`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 58 | 第1話　死に戻った悪女 (`.../product`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 112 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=生贄悪女は政敵王子の番となる, URL=`.../9546` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.comico.io/.../optimize` (image/jpeg, 71560 bytes, 512x728) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../9546` |  |  |  |
| details thumbnail URL | PASS | `https://images.comico.io/.../optimize` |  |  |  |
| details author | PASS | 唯緒シズサ |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | ファンタジー, 恋愛, TL, Original, Exclusive |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 悪女が死に戻ったら<br>嫌われていたはずの王子から溺愛されて…!?<br><br><br>高い魔力を持つ支配者である"捕食者"と<br>捕食者に魔力を供給し、捕食者の子を産む道具として蔑まれる"贄の印"が存在する世界。<br><br>悪女と嫌われていた"捕食者"の令嬢・レティシアは<br>高潔で有能な第二王子・グレッグから婚約を拒否されていた。<br><br>その理由を問いただすため向かった王宮で<br>レティシアはグレッグの暗殺に巻き込まれ一緒に命を落とす。<br><br>命を失ったその瞬間、彼女の時間は巻き戻り<br>グレッグに会いに行った日に戻っていた！<br><br>だがそれと引き換えに<br>レティシアの身体には"贄の印"となった刻印が浮かんでいた……。<br><br>一族に捕らえられ、子を産む道具として娼婦同然の扱いを受け始めたレティシアは<br>虐待から抜け出すため、自分を嫌っていたグレッグに<br>魔力を供給する代わりに保護してほしいと取引を持ちかける。<br><br>愛のない契約結婚を結んだレティシアとグレッグだったが、<br>今まで嫌われていたはずのグレッグから溺愛されることになり……？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 58 chapters |  |  |  |
| chapter dates | PASS | 58 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 112 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.comico.io/.../optimize <redacted query values: Policy, Signature, and Key-Pair-Id>` (image/jpeg, 300115 bytes, 800x2000) |  |  |  |
