# Extension Validation Report

- Extension: tachiyomi-th.mikudoujin-v1.6.8
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3142948916822290453
- Source name: MikuDoujin
- Source language: th
- Selected manga input: popular offset 0: สาวข้างบ้านเคยแสดงเอวีด้วยล่ะ (Poccora) (`.../84jdi0`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | สาวข้างบ้านเคยแสดงเอวีด้วยล่ะ (Poccora) (`.../84jdi0`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | นี่โอตาคุ ใครรู้สึกดีกว่ากัน (Moedotei) (`.../iqk1gy`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | สาวข้างบ้านเคยแสดงเอวีด้วยล่ะ (Poccora) (`.../84jdi0`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | สาวข้างบ้านเคยแสดงเอวีด้วยล่ะ (Poccora) (`.../84jdi0`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../84jdi0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 68 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=สาวข้างบ้านเคยแสดงเอวีด้วยล่ะ (Poccora), URL=`.../84jdi0` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://miku-doujin.com/.../9c2aa0ec229288ffed00e0ef4a218c84_thumb.webp` (image/webp (encoding: lossy), 22520 bytes, 240x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../84jdi0` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://miku-doujin.com/.../9c2aa0ec229288ffed00e0ef4a218c84.webp` (image/webp (encoding: lossy), 101996 bytes, 593x790) |  |  |  |
| details author | PASS | Poccora |  |  |  |
| details artist | PASS | Poccora |  |  |  |
| details genres | PASS | Unknown, Unknown, Ahegao, นมใหญ่, สาวหูสัตว์, สาวเกล |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | No Story |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 68 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://miku-doujin.com/.../5b7b68f41501f19ad1e10866134815d9.webp` (image/webp (encoding: lossy), 106590 bytes, 790x593) |  |  |  |
