# Extension Validation Report

- Extension: tachiyomi-ja.raw1001-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source theme: liliana
- Source ID: 3349575794425308347
- Source name: Raw1001
- Source language: ja
- Selected manga input: popular offset 0: テムパル〜アイテムの力〜 (`.../temuparu-aitemuno-li`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 42 | テムパル〜アイテムの力〜 (`.../temuparu-aitemuno-li`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 42 | 無職転生 異世界行ったら本気だす (`.../wu-zhi-zhuan-sheng-yi-shi-jie-xingttara-ben-qidasu001`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 訳あり公爵令嬢の逃亡計画～腹黒竜騎士殿下の執着愛が重すぎて逃げられる気がしません～ (`.../yiari-gong-jue-ling-niangno-tao-wang-ji-hua-fu-hei-long-qi-shi-dian-xiano-zhi-zhe-aiga-zhongsugite-taogerareru-qigashimasen`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 病弱な悪役令嬢ですが、婚約者が過保護すぎて逃げ出したい(私たち犬猿の仲でしたよね!?) (`.../bing-ruona-e-yi-ling-niangdesuga-hun-yue-zhega-guo-bao-husugite-taoge-chushitai-sitachi-quan-yuanno-zhongdeshitayone`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | テムパル〜アイテムの力〜 (`.../temuparu-aitemuno-li`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | テムパル〜アイテムの力〜 (`.../temuparu-aitemuno-li`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 234 | 第1話 (`.../di1hua`) |  | <1s |
| pages | `getPageList(chapter)` | success | 78 |  |  | 1-10s |

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
| popular listing | PASS | 42 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=テムパル〜アイテムの力〜, URL=`.../temuparu-aitemuno-li` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 133/133 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 133/133 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://raw1001.net/.../temuparu-aitemuno-li.jpg` (image/jpeg, 68304 bytes, 360x504) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../temuparu-aitemuno-li` |  |  |  |
| details thumbnail URL | PASS | `https://raw1001.net/.../temuparu-aitemuno-li.jpg` |  |  |  |
| details author | PASS | 未詳 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 説明Temuparu 〜Aitemu no Chikara〜 Raw free 世界最高のバーチャルリアリティゲーム。 全世界ユーザー数２０億人、もう一つの地球と呼ばれるほどの壮大なファンタジーゲーム。 しがない無職のゲーム中毒者である「長嶺巧」はゲーム課金の借金を返すために日雇い労働をする以外のほとんどの時間はゲームに費やしていた。 ある日、クエスト中にレジェンダリー転職書＜ファグマの奇書＞を手に入れた「巧」。 ＜ファグマの奇書＞売って大儲けできると思ったその瞬間…！新たなクエストが発動され殺される寸前になるが… このままだと殺され、レジェンダリー転職書＜ファグマの奇書＞もなくしてしまうと思った「巧」は＜ファグマの奇書＞を開き、伝説の職人＜ファグマの末裔＞へとジョブチェンジするが… 借金まみれの底辺人生から２０億プレイヤーの頂点に立つレジェンダリープレイヤーになれるのか！？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 234 chapters |  |  |  |
| chapter dates | PASS | 234 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 78 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://sg.cdnkk.top/.../10-31-00-17376673944149834.webp` (image/webp (encoding: lossy), 10852 bytes, 760x1216) |  |  |  |
