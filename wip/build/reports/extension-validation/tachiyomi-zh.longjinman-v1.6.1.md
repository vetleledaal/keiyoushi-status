# Extension Validation Report

- Extension: tachiyomi-zh.longjinman-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1967300925218548785
- Source name: 龙禁漫
- Source language: zh
- Selected manga input: popular offset 0: 秘密教学 (`.../9168.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | 秘密教学 (`.../9168.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 32 | 伪纯爱变态 (`.../11629.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 32 | 课后咨询时间的秘密 (`.../11682.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 32 | 太妹攻略指南 (`.../11446.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 秘密教学 (`.../9168.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 秘密教学 (`.../9168.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 337 | 第1话-门缝传出呻吟声 (`.../MMESjGkLBxHZvBkVsQaA.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 55 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 32 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=秘密教学, URL=`.../9168.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 129/129 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 129/129 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thumb.niaopic.com/.../20220930012101936.webp` (image/webp (encoding: lossy), 10784 bytes, 302x403) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../9168.html` |  |  |  |
| details thumbnail URL | PASS | `https://thumb.niaopic.com/.../20220930012101936.webp` |  |  |  |
| details author | PASS | 美娜讚&钢铁王 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 韩漫, 正妹, 有夫之妇, 后宫, 不伦 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 13岁那年成为孤儿的子豪，被爸爸的朋友收养。然而成年后的子豪却对男女交往一无所知，阿姨与姊姊们决定给纯洁的子豪，来场教学... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 337 chapters |  |  |  |
| chapter dates | LINT | All 337 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=337 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.nnpic.xyz/.../20220709203925404.webp` (image/webp (encoding: lossy), 129544 bytes, 720x4200) |  |  |  |
