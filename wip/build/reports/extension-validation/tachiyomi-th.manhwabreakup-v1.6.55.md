# Extension Validation Report

- Extension: tachiyomi-th.manhwabreakup-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 4798104006981431448
- Source name: ManhwaBreakup
- Source language: th
- Selected manga input: popular offset 0: Player Who Returned 10,000 Years Later (`.../3155`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Player Who Returned 10,000 Years Later (`.../3155`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | I Obtained a Mythic Item (`.../2257`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Fake Celebrity – เกมรักซ่อนเร้นของเซเลบจอมปลอม (`.../47583`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 10 | My Wife Wants a Divorce Today — วันนี้ฮูหยินของข้าจะขอหย่า (`.../48295`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Player Who Returned 10,000 Years Later (`.../3155`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Player Who Returned 10,000 Years Later (`.../3155`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 69 | ตอนที่ 1 (`.../%e0%b8%95%e0%b8%ad%e0%b8%99%e0%b8%97%e0%b8%b5%e0%b9%88-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Player Who Returned 10,000 Years Later, URL=`3155` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.manhwabreakup.com/.../a70c705385ba76e94e2b8c3ba739d745-1-350x476.jpg` (image/jpeg, 49861 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `3155` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.manhwabreakup.com/.../a70c705385ba76e94e2b8c3ba739d745-1-193x278.jpg` (image/jpeg, 21108 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Fantasy, Manhwa, Shounen, Popular |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 69 chapters |  |  |  |
| chapter dates | LINT | 27 of 69 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=27 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.manhwabreakup.com/.../Upload-Player-Who-Returned-10-000-Years-Later-1-PZ5X7-manhuathai.jpg` (image/jpeg, 186487 bytes, 1000x1433) |  |  |  |
