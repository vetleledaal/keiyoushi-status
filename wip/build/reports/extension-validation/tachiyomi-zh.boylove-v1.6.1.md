# Extension Validation Report

- Extension: tachiyomi-zh.boylove-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1471112097704477289
- Source name: 香香腐宅
- Source language: zh
- Selected manga input: popular offset 0: 无根树.../%E6%97%A0%E6%A0%B9%E4%B9%8B%E6%A0%91 (`.../16904`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | 无根树.../%E6%97%A0%E6%A0%B9%E4%B9%8B%E6%A0%91 (`.../16904`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | 傲慢的圣托一世 (`.../14736`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | 好撩的前辈 (`.../31362`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | 像谁定好了一样 (`.../32786`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 无根树.../%E6%97%A0%E6%A0%B9%E4%B9%8B%E6%A0%91 (`.../16904`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 无根树.../%E6%97%A0%E6%A0%B9%E4%B9%8B%E6%A0%91 (`.../16904`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 118 | 第01话 (`.../435648`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 76 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=无根树.../%E6%97%A0%E6%A0%B9%E4%B9%8B%E6%A0%91, URL=`16904` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 77/77 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 77/77 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blcnimghost2.cc/.../318bd03ebdfe848db22b1397ca77104f.webp` (image/webp (encoding: lossy), 118352 bytes, 840x1120) |  |  |  |
| details identity | PASS | Details preserved selected URL `16904` |  |  |  |
| details thumbnail URL | PASS | `https://blcnimghost2.cc/.../318bd03ebdfe848db22b1397ca77104f.webp` |  |  |  |
| details author | PASS | 라포 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 韩漫, 偏执攻, 美人, 单恋, 年下系列, 病娇, 腹黑, 监禁, 强制, 傲娇, 虐恋, 强势系列, 巨屌, 强制爱天花板, 哭包, 年龄差｜叔系, 禁欲攻, 日久生情, 双洁, 救赎, 缺爱攻, 窒息爱, 疯批, 变态攻, 受宠攻, 不看后悔, 心机, coser攻, 诱受 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 更新时间：2026-11-19 17:16:06<br><br>《뿌리 없는 나무》<br>平台：lezhin<br>小时候在一次事故中失去唯一家人的熙瑞由养父母抚养长大，他很好奇自己的幕后金援者是谁。<br>熙瑞因为纵火入院的那天晚上，他遇到了自己一直在寻找的人…… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 118 chapters |  |  |  |
| chapter dates | PASS | 118 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 76 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.boylove.cc/.../435648-8b12a7604a565be59d35595ed4e40c86.webp` (image/webp (encoding: lossy), 82682 bytes, 1241x3200) |  |  |  |
