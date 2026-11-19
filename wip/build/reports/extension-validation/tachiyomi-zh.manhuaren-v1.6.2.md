# Extension Validation Report

- Extension: tachiyomi-zh.manhuaren-v1.6.2
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
- Source ID: 3616827811449702173
- Source name: 漫画人
- Source language: zh
- Selected manga input: popular offset 0: 再婚皇后 (`.../getDetail <redacted query values: mangaId>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | 再婚皇后 (`.../getDetail <redacted query values: mangaId>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | 拳愿奥米伽 (`.../getDetail <redacted query values: mangaId>`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | 转生到黄油里，成为将伯爵千金逼成侍奉女仆的反派大少爷，我要避开惨遭报应的结局 (`.../getDetail <redacted query values: mangaId>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | 可爱史莱姆噗尼露 (`.../getDetail <redacted query values: mangaId>`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | 再婚皇后 (`.../getDetail <redacted query values: mangaId>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 再婚皇后 (`.../getDetail <redacted query values: mangaId>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 227 | 第1话 (`.../getRead <redacted query values: mangaSectionId>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 97 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=再婚皇后, URL=`.../getDetail <redacted query values: mangaId>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mhfm9us.cdndm5.com/.../20240313194401_450x600_89.jpg` (image/jpeg, 155122 bytes, 960x737) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../getDetail <redacted query values: mangaId>` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://mhfm9us.cdndm5.com/.../20240313194523_960x738_151.jpg` was not downloaded |  |  |  |
| details author | PASS |  Alphatart SUMPUL |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少女爱情 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 「我同意離婚，但是請同意我再婚。」——曾為東大帝國皇后的娜菲爾，因國王為了讓自己的情婦坐上皇后的位置，她決定答應和丈夫離婚，並且下定決心…要成為其他國家的皇后！ |  |  |  |
| metadata trimming | LINT | Untrimmed fields: author |  |  |  |
| chapters | PASS | 227 chapters |  |  |  |
| chapter dates | PASS | 227 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 97 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://manhua1038zjcdn26.cdndm5.com/.../1_3557_1.jpg <redacted query values: cid, key, and type>` (image/jpeg, 236426 bytes, 690x871) |  |  |  |
