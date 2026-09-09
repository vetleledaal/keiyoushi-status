# Extension Validation Report

- Extension: tachiyomi-zh.mangabz-v1.4.15
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5234610795363016972
- Source name: Mangabz
- Source language: zh
- Selected manga input: latest offset 0: 羽翼与彩虹的小跳步 ~索拉真白漫画再收录合集 (`.../49027bz`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | 鬼灭之刃 (`.../73bz`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 12 | 致不灭的你 (`.../87bz`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 12 | 羽翼与彩虹的小跳步 ~索拉真白漫画再收录合集 (`.../49027bz`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | 魔法学院的特工教授 (`.../28856bz`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 12 | 羽翼与彩虹的小跳步 ~索拉真白漫画再收录合集 (`.../49027bz`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 羽翼与彩虹的小跳步 ~索拉真白漫画再收录合集 (`.../49027bz`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 7 | 第1话（26P） (`.../m517625`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 26 |  |  | 10s+ |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=羽翼与彩虹的小跳步 ~索拉真白漫画再收录合集, URL=`.../49027bz` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 60/60 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 60/60 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.mangabz.com/.../20260909234308_180x240_23.jpg` (image/jpeg, 23593 bytes, 171x240) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../49027bz` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cover.mangabz.com/.../20260909234308_360x480_76.jpg` (image/jpeg, 78251 bytes, 341x480) |  |  |  |
| details author | PASS | 和泉キリフ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 和泉キリフ老师的索拉真白漫画再收录合集 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | LINT | 6 of 7 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://image.mangabz.com/.../1_1955.jpg` (image/jpeg, 266629 bytes, 1020x1500) |  |  |  |
