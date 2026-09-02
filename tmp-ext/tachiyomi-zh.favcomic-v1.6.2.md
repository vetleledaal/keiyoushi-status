# Extension Validation Report

- Extension: tachiyomi-zh.favcomic-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2276541741750874058
- Source name: 喜漫漫画
- Source language: zh
- Selected manga input: popular offset 0: 新常态 (`.../964242115192299520`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 新常态 (`.../964242115192299520`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | 灰色兼职：逃亡禁止 (`.../875771768416116736`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 36 | 神乐钵 (`.../928789614762795008`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | 新常态 (`.../964242115192299520`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 新常态 (`.../964242115192299520`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 57 | 短篇 (`.../966688283872600064`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=新常态, URL=`.../964242115192299520` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 124/124 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 124/124 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.favcomic.com/.../cabc61c00d3d4d1ebea16e7351865b33.webp` (image/webp (encoding: lossy), 17258 bytes, 328x484; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../964242115192299520` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.favcomic.com/.../95c3c3425d5e4bbf9d182ec13eaf492b.webp` (image/webp (container: extended), 67134 bytes, 820x1209; server Content-Type: application/octet-stream) |  |  |  |
| details author | PASS | 相原瑛人 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 爱情, 校园 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 你的口罩下,是住在我心里的那张脸<br><br>*汉化：FREEDOM自由汉化组* |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 57 chapters |  |  |  |
| chapter dates | LINT | All 57 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=57 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.favcomic.com/.../1-4dZjUY.webp` (image/webp (encoding: lossy), 206928 bytes, 960x1357) |  |  |  |
