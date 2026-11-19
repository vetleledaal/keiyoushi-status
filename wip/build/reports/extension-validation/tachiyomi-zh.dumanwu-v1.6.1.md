# Extension Validation Report

- Extension: tachiyomi-zh.dumanwu-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mmlook
- Source ID: 7167507050606280098
- Source name: 读漫屋
- Source language: zh
- Selected manga input: popular offset 0: 勇士的意志 第二季 (`.../TRNBrxH`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 99 | 勇士的意志 第二季 (`.../TRNBrxH`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 51 | 成何体统 (`.../OOMJNJS`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 42 | 恋爱禁区（第二季） (`.../OjuRQjo`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 勇士的意志 第二季 (`.../TRNBrxH`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 77 | 12月27日，燃情开更 (`.../OWOORQo`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 2: title=勇士的意志 第二季, URL=`TRNBrxH` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 192/192 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 192/192 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://p6.ecombdimg.com/.../c9324196720c45499b911e76260489b0~tplv-scl3phc04j-image.jpeg` (image/jpeg, 50291 bytes, 420x560) |  |  |  |
| details identity | PASS | Details preserved selected URL `TRNBrxH` |  |  |  |
| details thumbnail URL | PASS | `https://p6.ecombdimg.com/.../c9324196720c45499b911e76260489b0~tplv-scl3phc04j-image.jpeg` |  |  |  |
| details author | PASS | 薯条 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 怪物, 逆袭 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 更新时间：04月10日<br><br>故事基于DNF世界观剧情及编年史展开。这里是阿拉德，一颗饱受战乱、异变折磨的星球。无数的旅途自此启程，在过去、现在、未来留下一段段刻骨铭心的故事。彼此独立又互相牵绊的命运，摩擦出无数火花。让我们一起见证，勇士的意志。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 77 chapters |  |  |  |
| chapter dates | LINT | All 77 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=77 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://p6-zhuxiaobang-sign.shimolife.com/.../o4IU7BzBxn3tstQGBAEqyQiC5AABTQfziPHAzd~tplv-hra1ikqiyn-29.jpeg <redacted query values: lk3s, x-expires, and x-signature>` (image/jpeg, 394858 bytes, 1200x2504) |  |  |  |
