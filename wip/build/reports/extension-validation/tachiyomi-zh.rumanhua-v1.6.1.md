# Extension Validation Report

- Extension: tachiyomi-zh.rumanhua-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mmlook
- Source ID: 392262758488714109
- Source name: 如漫画
- Source language: zh
- Selected manga input: popular offset 0: 请与我同眠 (`.../GZNwaGS`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 99 | 请与我同眠 (`.../GZNwaGS`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 51 | 成何体统 (`.../OOMJNJe`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 请与我同眠 (`.../GZNwaGS`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 请与我同眠 (`.../GZNwaGS`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 251 | 预告 (`.../szOxxGe`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 99 entries |  |  |  |
| latest listing | PASS | 51 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=请与我同眠, URL=`.../GZNwaGS` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 151/151 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 150/151 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://p6.ecombdimg.com/.../8ce726b6e3ce4519aaf58320eb9397dc~tplv-scl3phc04j-image.jpeg` (image/jpeg, 32515 bytes, 420x560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../GZNwaGS` |  |  |  |
| details thumbnail URL | PASS | `https://p6.ecombdimg.com/.../8ce726b6e3ce4519aaf58320eb9397dc~tplv-scl3phc04j-image.jpeg` |  |  |  |
| details author | PASS | 鱼刺 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 惊悚, 悬疑 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 更新时间：11月14日<br><br>加兰·诺伊斯，黑雨的副队长，小时候被恶魔寄生到了心脏，即将被恶魔附身，命不久矣，然而这个秘密，被出了名的变态黑泽尔公爵发现了...抖s公爵攻x高岭之花受-------------每周五更新-------------- |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 74 name, chapter 171 name |  |  |  |
| chapters | PASS | 251 chapters |  |  |  |
| chapter dates | LINT | All 251 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=251 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://p3-zhuxiaobang-sign.shimolife.com/.../osPBsVxEA5pCAIwEgCFmCnCDghCwAAqGfZgOMf~tplv-hra1ikqiyn-29.jpeg <redacted query values: lk3s, x-expires, and x-signature>` (image/jpeg, 113943 bytes, 1080x2217) |  |  |  |
