# Extension Validation Report

- Extension: tachiyomi-zh.manhuawu-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3279300917142951720
- Source name: 漫画屋
- Source language: zh
- Selected manga input: popular offset 0: 斗破苍穹 (`.../doupocangkong`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | 斗破苍穹 (`.../doupocangkong`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | 年下邻居 甜蜜攻陷 (`.../nianxialinjutianmigongxian`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | 星武神诀 (`.../xingwushenjue`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | 初霽倚光晴 (`.../chujiyiguangqing`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 6 | 斗破苍穹 (`.../doupocangkong`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 斗破苍穹 (`.../doupocangkong`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 670 | 01 (`.../196437`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=斗破苍穹, URL=`.../doupocangkong` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 126/126 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 126/126 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static-tw.baozimh.com/.../doupocangqiong-zhiyinmankerenxiang.jpg <redacted query values: w, h, and q>` (image/jpeg, 32004 bytes, 285x375) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../doupocangkong` |  |  |  |
| details thumbnail URL | PASS | `https://static-tw.baozimh.com/.../doupocangqiong-zhiyinmankerenxiang.jpg <redacted query values: w, h, and q>` |  |  |  |
| details author | PASS | 知音漫客 任翔 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 玄幻 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 正所谓三十年河东三十年河西，天才少年因忽然失去了天生的灵力，被所有人嘲笑排挤，为了一雪前耻他亲手毁掉婚约，一心进修、打怪、升级！重登人生巅峰的他让人们知道莫欺少年穷真的很重要！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 670 chapters |  |  |  |
| chapter dates | LINT | All 670 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=670 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://s1.baozimh.com/.../1.jpg` (image/jpeg, 89286 bytes, 800x1333) |  |  |  |
