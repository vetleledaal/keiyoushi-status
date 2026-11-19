# Extension Validation Report

- Extension: tachiyomi-zh.jinmantiantang-v1.6.64
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6286738698187452081
- Source name: 禁漫天堂
- Source language: zh
- Selected manga input: popular offset 0: 秘密教学 / 秘密の授业 (`.../1114751`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 80 | 秘密教学 / 秘密の授业 (`.../1114751`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 80 | 合意之下.../%E5%8D%8F%E8%AE%AE%E6%8D%A2%E7%88%B1 (`.../181371`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 80 | 梦中情男 (`.../1453499`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 80 | [hz个人翻译][Nanorumi]Cursed Maid Outfit  [AI Generated] (`.../1491668`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 80 | 建造技能在异世界大改造无人岛! ｢……不对，为啥原住民盯上了我的下半身｣ [日之影ソラ.../%E5%A0%80%E5%8D%9A%E6%98%AD] クラフトスキルで异世界の无人岛を大改造! 『‥‥‥とか思ったら先住民がいて、俺の子种を狙っているようです』 (`.../1478337`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 秘密教学 / 秘密の授业 (`.../1114751`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 357 | 第1话 秘密教学 (`.../1114751`) |  | <1s |
| pages | `getPageList(chapter)` | success | 125 |  |  | 1-10s |

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
| popular listing | PASS | 80 entries |  |  |  |
| latest listing | PASS | 80 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 80 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 400/400 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 400/400 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-msp.18comic.vip/.../1114751_3x4.jpg` (image/jpeg, 33395 bytes, 400x533) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1114751` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-msp.18comic.vip/.../1114751_3x4.jpg` |  |  |  |
| details author | PASS | 美娜赞, 钢铁王, NTR |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 韩漫, 名作之璧, 剧情, 恋爱, 韩漫第一当之无愧, 没有ntr，放心食用, 韩漫的豪哥都好厉害, 人形泰迪, 骗炮王, 引狼入室, 郑恩爱与养子的打炮日记, 叔叔我啊，真的生气了, 阿姨我鸡鸡养, 阿姨我鸡鸡痒, 骗砲教学, 达丰拜託你别来搞事, 上了姨婆直接封神, 韩漫啥时候能整本下载啊, 标籤很好笑, 连朋友的女人也想肏的畜生 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 13岁那年成为孤儿的子豪，被爸爸的朋友收养。然而成年后的子豪却对男女交往一无所知，阿姨与姊姊们决定给纯洁的子豪，来场教学…<br><br>**作品:**<br>- 人形自走炮<br>- 神作<br>- 人肉打桩机<br>- 韩漫入坑神作<br>- 阿姨被秘密教学<br>- 都是豪哥肉便器<br>- 韩漫天花板<br><br>**登场人物:**<br>- 没有感情的打桩机器<br>- 人面兽心<br>- 绿帽戴好戴满的叔叔<br>- 装智障骗炮的20岁男大生<br>- 子豪他妈的是个强奸犯 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 46 name, chapter 202 name, chapter 203 name, chapter 210 name, chapter 219 name, chapter 226 name, chapter 255 name, chapter 277 name, chapter 278 name, chapter 279 name, chapter 303 name, chapter 315 name |  |  |  |
| chapters | PASS | 357 chapters |  |  |  |
| chapter dates | LINT | 356 of 357 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=356 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 125 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-msp.jmapiproxy1.cc/.../00001.webp <redacted query values: t>` (image/jpeg, 38061 bytes, 300x420; server Content-Type: image/webp) |  |  |  |
