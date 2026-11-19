# Extension Validation Report

- Extension: tachiyomi-zh.dm5-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: dm5
- Source ID: 293789630396851172
- Source name: 动漫屋
- Source language: zh
- Selected manga input: popular offset 0: 再婚皇后 (`.../manhua-zaihunhuanghou`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 70 | 再婚皇后 (`.../manhua-zaihunhuanghou`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 70 | 叫了上门服务而来的她，竟是曾经认识的同学 (`.../manhua-jiaoleshangmenfuwuerlaideta-jingshicengjingrenshidetongxue`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 70 | 转生到黄油里，成为将伯爵千金逼成侍奉女仆的反派大少爷，我要避开惨遭报应的结局 (`.../manhua-zhuanshengdaohuangyouli-chengweijiangbojueqianjinbichengshifengnvpudefanpaidashaoye-woyaobikaicanzao`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 70 | 现实任务 (`.../manhua-xianshirenwu`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 22 | 再婚皇后 (`.../manhua-zaihunhuanghou`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 再婚皇后 (`.../manhua-zaihunhuanghou`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 227 | 回顾特别篇 （42P） (`.../m1513360`) |  | <1s |
| pages | `getPageList(chapter)` | success | 42 |  |  | 1-10s |

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
| popular listing | PASS | 70 entries |  |  |  |
| latest listing | PASS | 70 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=再婚皇后, URL=`.../manhua-zaihunhuanghou` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 302/302 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 302/302 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mhfm6us.cdndm5.com/.../20240313194401_180x240_20.jpg` (image/jpeg, 91652 bytes, 450x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manhua-zaihunhuanghou` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://mhfm9us.cdndm5.com/.../20240313194401_450x600_89.jpg` was not downloaded |  |  |  |
| details author | PASS | Alphatart SUMPUL |  |  |  |
| details artist | PASS | Alphatart SUMPUL |  |  |  |
| details genres | PASS | 恋爱 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★✬☆ 7.1<br><br>「我同意離婚，但是請同意我再婚。」——曾為東大帝國皇后的娜菲爾，因國王為了讓自己的情婦坐上皇后的位置，她決定答應和丈夫離婚，並且下定決心…要成為其他國家的皇后！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 227 chapters |  |  |  |
| chapter dates | LINT | All 227 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=227 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://manhua1038zjcdn26.cdndm5.com/.../1_4612.jpg <redacted query values: cid, key, and type>` (image/jpeg, 347691 bytes, 690x3169) |  |  |  |
