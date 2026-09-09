# Extension Validation Report

- Extension: tachiyomi-zh.baozimanhua-v1.6.29
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f+dirty
- Passed: 32
- Lint: 1
- Warnings: 2
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5724751873601868259
- Source name: 包子漫画
- Source language: zh
- Selected manga input: latest offset 0: duet (`.../duet-wnbguanchuanmako`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | 武炼巅峰 (`.../wuliandianfeng-pikapi`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 36 | 都是黑丝惹的祸 (`.../dushiheisiredehuo-daoshangproject`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 48 | duet (`.../duet-wnbguanchuanmako`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 108 | 死灵法师！我即是天灾 (`.../silingfashiwojishitianzai-mantudezhuyuanzhuheiniaoshe_rjogsq`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | duet (`.../duet-wnbguanchuanmako`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | 第1话 (`.../page_direct <redacted query values: comic_id, section_slot, and chapter_slot>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 49 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 60: title=duet, URL=`.../duet-wnbguanchuanmako` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 228/228 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 228/228 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://static-tw.baozimh.com/.../wuliandianfeng-pikapi.jpg <redacted query values: w, h, and q>` -> 2 manga URLs (examples: `.../wuliandianfeng-pikapi`, `.../wuliandianfeng-pikapi_lav8od`), `https://static-tw.baozimh.com/.../hanghaiwang-weitianrongyilang.jpg <redacted query values: w, h, and q>` -> 2 manga URLs (examples: `.../hanghaiwang-weitianrongyilang`, `.../hanghaiwang-weitianrongyilang_i6wg8y`), `https://static-tw.baozimh.com/.../woshidaxianzun-chuanqimanye.jpg <redacted query values: w, h, and q>` -> 2 manga URLs (examples: `.../woshidaxianzun-chuanqimanye`, `.../woshidaxianzun-chuanqimanye_tchz0d`), `https://static-tw.baozimh.com/.../mohuangdaguanjia-yexiaoyuanzhu.jpg <redacted query values: w, h, and q>` -> 2 manga URLs (examples: `.../mohuangdaguanjia-yexiaoyuanzhu`, `.../mohuangdaguanjia-yexiaoyuanzhu_6qprd4`) |  |  |  |
| thumbnail | PASS | `https://static-tw.baozimh.com/.../duet-wnbguanchuanmako.jpg <redacted query values: w, h, and q>` (image/jpeg, 30625 bytes, 285x375) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../duet-wnbguanchuanmako` |  |  |  |
| details thumbnail URL | PASS | `https://static-tw.baozimh.com/.../duet-wnbguanchuanmako.jpg <redacted query values: w, h, and q>` |  |  |  |
| details author | PASS | WNB (馆川まこ) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 破纪录的超长篇！接近100页的樱狼同人，量大管饱，剧情超甜！感言里还附带了自己吃谷的见闻和电玩的攻略，可以说是忠实的粉丝了！ 也深刻的体会到了作者的不容易。没有笔刷，因为不是CG，而是纯手绘和贴网点纸。现在再也不会有这样的同人本了，就像现在基本不会有赛璐珞作画的动画了\[+展开\]了，除了最近那个再见菈菈的OP?——你说是吧，透明牌篇\[-折叠\] |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | LINT | All 2 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=2 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 49 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://cn.baozimh.com/.../page_direct <redacted query values: comic_id, section_slot, and chapter_slot>` to `https://cn.twbzmg.com/.../0_0.html` (1 redirects) |  |  |  |
| page load | PASS | `https://s1.bzcdn.net/.../1.jpg` (image/jpeg, 229152 bytes, 1051x1500) |  |  |  |
