# Extension Validation Report

- Extension: tachiyomi-zh.zaimanhua-v1.4.19
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 524579092615598717
- Source name: 再漫画
- Source language: zh
- Selected manga input: popular offset 0: 异种族相亲档 (`.../80758`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | 异种族相亲档 (`.../80758`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | 灵墟游记 (`.../60067`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | 黑猫和魔女的教室 (`.../64175`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | 尾巴食堂的砂锅饭 (`.../87491`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 异种族相亲档 (`.../80758`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 异种族相亲档 (`.../80758`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 11 | 第1话 (`.../164761`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 6 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=异种族相亲档, URL=`80758` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.zaimanhua.com/.../1744873497.jpg` (image/jpeg, 57558 bytes, 270x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `80758` |  |  |  |
| details thumbnail URL | PASS | `https://images.zaimanhua.com/.../1744873497.jpg` |  |  |  |
| details author | PASS | 乐活 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 奇幻, 搞笑 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 就算是异世界，找对象也很难啦~ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | PASS | 11 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.zaimanhua.com/.../chapterpic%2F42948%2F158905%2F17448737302171.jpg <redacted query values: sign and t>` (image/jpeg, 487585 bytes, 1000x1391) |  |  |  |
