# Extension Validation Report

- Extension: tachiyomi-zh.zaimanhua-v1.4.19
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
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
- Selected manga input: popular offset 0: 搜神 (`.../87931`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | 搜神 (`.../87931`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | 我家大师兄脑子有坑 (`.../20844`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | 快住手！不然我就要喜欢上你了啊 (`.../84011`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | 矢野同学观察日记 (`.../61974`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | 稗记舞咏 (`.../2035`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 搜神 (`.../87931`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 4 | 第1话 (`.../192726`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 1: title=搜神, URL=`87931` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 63/63 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 63/63 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.zaimanhua.com/.../13680161787358827.jpg` (image/jpeg, 801222 bytes, 1200x1698) |  |  |  |
| details identity | PASS | Details preserved selected URL `87931` |  |  |  |
| details thumbnail URL | PASS | `https://images.zaimanhua.com/.../13680161787358827.jpg` |  |  |  |
| details author | PASS | 伍奇 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 冒险, 历史, 奇幻 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 东晋史官干宝一路游历取材撰写志怪书《搜神记》的故事 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://images.zaimanhua.com/.../chapterpic%2F43395%2F161538%2F01.jpg <redacted query values: sign and t>` (image/jpeg, 672782 bytes, 1200x1697) |  |  |  |
