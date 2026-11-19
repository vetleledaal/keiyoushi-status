# Extension Validation Report

- Extension: tachiyomi-zh.vomic-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5428862423208834108
- Source name: vomic
- Source language: zh
- Selected manga input: latest offset 0: 迦梨 (`.../164933`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | 我在意的人不是异性 (`.../12607`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | 看起来很轻浮的料理店小哥 (`.../12408`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 15 | 迦梨 (`.../164933`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 15 | 我的男孩子气女友实在太可爱了 (`.../114436`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | 迦梨 (`.../164933`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 迦梨 (`.../164933`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 全一卷 (`.../661255`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.io.IOException: 请在设置中填写邮箱和密码以访问内容 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.io.IOException: 请在设置中填写邮箱和密码以访问内容 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=迦梨, URL=`164933` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdm.vomicer.com/.../d09b60e7aeefa5f7ef984fd1dfb00dcc-cover <redacted query values: sign, t, and imageMogr2/thumbnail/576x/format/webp/quality/75>` (image/webp (encoding: lossy), 22830 bytes, 576x768) |  |  |  |
| details identity | PASS | Details preserved selected URL `164933` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdm.vomicer.com/.../d09b60e7aeefa5f7ef984fd1dfb00dcc-cover <redacted query values: sign, t, and imageMogr2/thumbnail/576x/format/webp/quality/75>` (image/webp (encoding: lossy), 22830 bytes, 576x768) |  |  |  |
| details author | PASS | Daniel Freedman Robert Sammelin |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 冒险, 生存 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS |  👁️ 49 - ❤️ 0<br><br>被背后刺伤、下毒，然后被自己的摩托帮派遗弃致死;迦梨踏上了一条单程的复仇之路，穿越战火纷飞的沙漠战场。在死亡的阴影中奔涌，军队紧追不舍，迦梨誓不择手段地复仇，哪怕这是她最后一件事。 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | 请在设置中填写邮箱和密码以访问内容 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
