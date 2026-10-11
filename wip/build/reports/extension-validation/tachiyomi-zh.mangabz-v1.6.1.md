# Extension Validation Report

- Extension: tachiyomi-zh.mangabz-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 5234610795363016972
- Source name: Mangabz
- Source language: zh
- Selected manga input: popular offset 0: 鬼灭之刃 (`.../73bz`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | 鬼灭之刃 (`.../73bz`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | 致不灭的你 (`.../87bz`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Junket bank (`.../46465bz`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | 【安科】死神的钢弹模型・连线对战 (`.../49554bz`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 12 | 鬼灭之刃 (`.../73bz`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 鬼灭之刃 (`.../73bz`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 235 | 第1话 残酷（54P） (`.../m10344`) |  | <1s |
| pages | `getPageList(chapter)` | success | 54 |  |  | <1s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=鬼灭之刃, URL=`.../73bz` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=【安科】死神的钢弹模型・连线对战, URL=`.../49554bz` at page 1 offset 11 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 60/60 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 60/60 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.mangabz.com/.../20191206092901_180x240_25.jpg` (image/jpeg, 84420 bytes, 360x480) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../73bz` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://cover.mangabz.com/.../20191206092901_360x480_82.jpg` was not downloaded |  |  |  |
| details author | PASS | 吾峠呼世晴 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 热血, 冒险 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 时值日本大正时期。 传说太阳下山后，恶鬼出没吃人。亦有猎鬼人斩杀恶鬼、保护人们。 卖炭少年·炭治郎，他那平凡而幸福的日常生活，在家人遭到恶鬼袭击的那一天发生剧变。母亲与四个弟妹惨遭杀害，而与他一起生还的妹妹：祢豆子亦异变成凶暴的鬼。 在猎鬼人的指引下，立志成为猎鬼人的炭治郎与变成鬼却尚存理智的的祢豆子二人踏上了旅程。通过艰苦的剑术修行与赌命试炼，炭治郎成为了鬼猎人组织“鬼杀队”的一员。 为了让妹妹祢豆子变回人类，为了讨伐杀害家人的恶鬼，为了斩断悲伤的连锁，少年与鬼的战斗不曾停歇 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 235 chapters |  |  |  |
| chapter dates | LINT | 234 of 235 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=234 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://image.mangabz.com/.../1_8453.jpg` (image/jpeg, 171613 bytes, 850x1241) |  |  |  |
