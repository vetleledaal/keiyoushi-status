# Extension Validation Report

- Extension: tachiyomi-th.manhwabreakup-v1.4.52
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4798104006981431448
- Source name: ManhwaBreakup
- Source language: th
- Selected manga input: popular offset 0: Player Who Returned 10,000 Years Later (`.../player-who-returned-10000-years-later`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Player Who Returned 10,000 Years Later (`.../player-who-returned-10000-years-later`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | I Obtained a Mythic Item (`.../i-obtained-a-mythic-item`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Fake Celebrity – เกมรักซ่อนเร้นของเซเลบจอมปลอม (`.../fake-celebrity`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | The Siren’s Beloved — สุดที่รักของเทพบุตรแห่งท้องทะเล (`.../the-sirens-beloved`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Player Who Returned 10,000 Years Later (`.../player-who-returned-10000-years-later`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Player Who Returned 10,000 Years Later (`.../player-who-returned-10000-years-later`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 69 | ตอนที่ 1 (`https://www.manhwabreakup.com/.../%e0%b8%95%e0%b8%ad%e0%b8%99%e0%b8%97%e0%b8%b5%e0%b9%88-1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Player Who Returned 10,000 Years Later, URL=`.../player-who-returned-10000-years-later` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.manhwabreakup.com/.../a70c705385ba76e94e2b8c3ba739d745-1-350x476.jpg` (image/jpeg, 49861 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../player-who-returned-10000-years-later` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.manhwabreakup.com/.../a70c705385ba76e94e2b8c3ba739d745-1-193x278.jpg` (image/jpeg, 21108 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Fantasy, Manhwa, Shounen, Popular |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 69 chapters |  |  |  |
| chapter dates | PASS | 69 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 69 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.manhwabreakup.com/.../Upload-Player-Who-Returned-10-000-Years-Later-1-PZ5X7-manhuathai.jpg` (image/jpeg, 186487 bytes, 1000x1433) |  |  |  |
