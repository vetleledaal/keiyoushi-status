# Extension Validation Report

- Extension: tachiyomi-zh.guazimanhua-v1.6.6
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9103931521355991619
- Source name: 瓜子漫画
- Source language: zh
- Selected manga input: popular offset 0: 从姑获鸟开始 (`.../comic.php <redacted query values: id>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | 从姑获鸟开始 (`.../comic.php <redacted query values: id>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 36 | 诱敌深入 (`.../comic.php <redacted query values: id>`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | 永琳保健室的留言涂鸦本 (`.../comic.php <redacted query values: id>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 36 | 禁区内的谎言 (`.../comic.php <redacted query values: id>`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 从姑获鸟开始 (`.../comic.php <redacted query values: id>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 从姑获鸟开始 (`.../comic.php <redacted query values: id>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 341 | 封面、人物档案 (`.../chapter.php <redacted query values: id>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=从姑获鸟开始, URL=`.../comic.php <redacted query values: id>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.guazicdn.com/.../cover.webp` (image/jpeg, 118810 bytes, 600x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../comic.php <redacted query values: id>` |  |  |  |
| details thumbnail URL | PASS | `https://img.guazicdn.com/.../cover.webp` |  |  |  |
| details author | PASS | 之画文化 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 冒险 / 穿越 / 灵异 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 身患绝症的李阎，机缘巧合之下进入光怪陆离的阎浮世界，凭借着一身硬功夫一步步成为强者。而在行走于一个个阎浮世界的过程中，他也开始发现这个世界真正的秘密。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 341 chapters |  |  |  |
| chapter dates | LINT | All 341 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=341 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.guazicdn.com/.../1_1.webp` (image/jpeg, 215429 bytes, 900x1200) |  |  |  |
