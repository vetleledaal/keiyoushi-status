# Extension Validation Report

- Extension: tachiyomi-zh.manhuagui-v1.4.28
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7057750772596492765
- Source name: 漫画柜
- Source language: zh
- Selected manga input: latest offset 0: 事到如今，喜欢上了青梅竹马 (`.../50801`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 42 | 鬼灭之刃 (`.../19430`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 42 | 家有女友 (`.../12912`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 42 | 事到如今，喜欢上了青梅竹马 (`.../50801`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 42 | 佐德王国 (`.../60896`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 事到如今，喜欢上了青梅竹马 (`.../50801`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 事到如今，喜欢上了青梅竹马 (`.../50801`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 111 | C104会场限定 (`.../771786.html`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 7 |  |  | 1-10s |

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
| latest listing | PASS | 42 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=事到如今，喜欢上了青梅竹马, URL=`.../50801` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=【我推的孩子】, URL=`.../35634` at page 1 offset 20 and page 2 offset 6, title=月光下的异世界之旅, URL=`.../18823` at page 1 offset 21 and page 2 offset 8, title=东京卍复仇者, URL=`.../31208` at page 1 offset 22 and page 2 offset 9, title=我家大师兄脑子有坑, URL=`.../18151` at page 1 offset 23 and page 2 offset 16, title=魔都精兵的奴隶, URL=`.../30609` at page 1 offset 24 and page 2 offset 20, title=被追放的转生重骑士用游戏知识开无双, URL=`.../49036` at page 1 offset 25 and page 2 offset 22, title=更衣人偶坠入爱河, URL=`.../26829` at page 1 offset 26 and page 2 offset 23, title=火凤燎原, URL=`.../1147` at page 1 offset 27 and page 2 offset 24, title=回复术士的重来人生, URL=`.../26332` at page 1 offset 28 and page 2 offset 29, title=坂本 DAYS, URL=`.../38431` at page 1 offset 29 and page 2 offset 30, title=我们无法一起学习, URL=`.../22942` at page 1 offset 30 and page 2 offset 32, title=终末的女武神, URL=`.../31103` at page 1 offset 31 and page 2 offset 33, title=BLUE LOCK, URL=`.../32303` at page 1 offset 32 and page 2 offset 35, title=天空侵犯, URL=`.../11230` at page 1 offset 33 and page 2 offset 38 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 169/169 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 169/169 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cf.mhgui.com/.../50801_74.jpg` (image/jpeg, 10723 bytes, 132x176) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../50801` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cf.mhgui.com/.../50801_74.jpg` (image/jpeg, 17127 bytes, 180x240) |  |  |  |
| details author | PASS | よむ, 丸户史明 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 搞笑, 爱情 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 丸户×よむ的漫画&小说企划 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 111 chapters |  |  |  |
| chapter dates | LINT | 110 of 111 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=110 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.hamreus.com/.../1.jpg.webp <redacted query values: e and m>` (image/webp (encoding: lossy), 298574 bytes, 1200x1683) |  |  |  |
