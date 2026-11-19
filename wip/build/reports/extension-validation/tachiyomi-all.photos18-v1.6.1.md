# Extension Validation Report

- Extension: tachiyomi-all.photos18-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 225835804698740720
- Source name: Photos18
- Source language: all
- Selected manga input: popular offset 0: 长发女模肉色紧身内衣深沟诱惑沈欢欣 (`.../rkbbv`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | 长发女模肉色紧身内衣深沟诱惑沈欢欣 (`.../rkbbv`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 100 | 布达佩斯夜色迷情 (`.../r4XDr`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 100 | 石川澪写真集命运女主角 (`.../7R9e5`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 100 | Coser年年Nnian身着圣诞装 (`.../YD7VL`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | 长发女模肉色紧身内衣深沟诱惑沈欢欣 (`.../rkbbv`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 长发女模肉色紧身内衣深沟诱惑沈欢欣 (`.../rkbbv`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../rkbbv`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=长发女模肉色紧身内衣深沟诱惑沈欢欣, URL=`.../rkbbv` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=抱走莫子：日式女仆cosplay风韵, URL=`.../KvNp3` at page 1 offset 99 and page 2 offset 99 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Coser年年Nnian身着圣诞装, URL=`.../YD7VL` at page 1 offset 72 and page 2 offset 0, title=Coser慕慕MomoCosplay鸣潮守岸人写真, URL=`.../5RJO5` at page 1 offset 73 and page 2 offset 10, title=Coser钛合金TiTi演绎旗袍名作胭脂扣, URL=`.../gK9Bd` at page 1 offset 75 and page 2 offset 8, title=铁手叫兽拍摄Coser避难所秘密写真, URL=`.../V7098` at page 1 offset 77 and page 2 offset 4, title=Coser Chuchu扮演博衣こより写真, URL=`.../Wyq9X` at page 1 offset 80 and page 2 offset 9, title=Coser鹿八岁：小鹿粉色私宴写真, URL=`.../4J5EL` at page 1 offset 81 and page 2 offset 3, title=Coser年年Nnian双女写真, URL=`.../XBY98` at page 1 offset 82 and page 2 offset 5, title=Coser上杉绘梨落：只记花香不记年, URL=`.../N4jlW` at page 1 offset 87 and page 2 offset 2, title=Coser Byoru 化身蕾米埃尔, URL=`.../JdO9R` at page 1 offset 90 and page 2 offset 6, title=Coser落落Raku黑丝逆兔女郎写真, URL=`.../8Raj9` at page 1 offset 92 and page 2 offset 1, title=Cosér Byoru原创生日主题写真, URL=`.../ZQy9l` at page 1 offset 99 and page 2 offset 11 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 424/424 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 424/424 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.photos18.com/.../45.avif <redacted query values: 1751290736>` (image/avif (format: avif), 5314 bytes, 600x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../rkbbv` |  |  |  |
| details thumbnail URL | PASS | `https://www.photos18.com/.../45.avif <redacted query values: 1751290736>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 清凉写真 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.photos18.com/.../1019261.avif <redacted query values: 1658403399>` (image/avif (format: avif), 12469 bytes, 1500x1000) |  |  |  |
