# Extension Validation Report

- Extension: tachiyomi-zh.manwa-v1.4.14
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1795888684783606321
- Source name: 漫蛙
- Source language: zh
- Selected manga input: popular offset 0: 魔咒 (完整版) (`.../47471`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | 魔咒 (完整版) (`.../47471`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 15 | 实衣与山田 (`.../466177`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | 菈菈和彻比～死也愿意!～ (`.../530071`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 23 | 魔咒 (完整版) (`.../47471`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 魔咒 (完整版) (`.../47471`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 130 | 第01话 (`.../1085332`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 82 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=魔咒 (完整版), URL=`.../47471` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 103/103 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 103/103 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mwappimgs.cc/.../cover_1.jpg <redacted query values: v>` (image/jpeg, 52576 bytes, 500x666) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../47471` |  |  |  |
| details thumbnail URL | PASS | `https://mwappimgs.cc/.../cover_1.jpg <redacted query values: v>` |  |  |  |
| details author | PASS | 밍과 |  |  |  |
| details artist | PASS | 밍과 |  |  |  |
| details genres | PASS | 韩漫, 19r, 完整版, 无码, 高颜值, 契约关系, 美人受, 强攻, 执著攻, 年下攻, 胆小鬼受, 幼稚攻, 穷苦受, 暴力攻, 垃圾攻, 后悔攻, 小学生攻, 甲乙关系, 偏执攻, 创伤受, 羞涩受, 年上受, 苦命受, 追妻火葬场, 多cp, 体型差, 创伤攻, 苦命攻, 不洁攻, 傻子攻, 痴汉攻, 嘴硬攻, 可爱受, 温柔受, 潮吹攻 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | BJ ALEX老师新作! 金亶是个负债累累的物理治疗师， 为了奶奶的医疗费，他什么都愿意做。 某天，金亶居然收到了综合格斗选手冠军—周在景的提议， 说要出钜款请金亶帮忙化解自己的「迷信」…? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 130 chapters |  |  |  |
| chapter dates | LINT | All 130 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=130 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 82 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mwappimgs.cc/.../65989cbbba77065a61f99b4e2dffaf19_n1_wa.webp <redacted query values: v>` (image/webp (encoding: lossy), 107968 bytes, 800x3313; server Content-Type: binary/octet-stream) |  |  |  |
