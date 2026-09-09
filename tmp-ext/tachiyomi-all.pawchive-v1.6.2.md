# Extension Validation Report

- Extension: tachiyomi-all.pawchive-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4284527942812494681
- Source name: Pawchive
- Source language: all
- Selected manga input: latest offset 0: くちといと (`.../101216369`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Anna Anon (`.../37736420`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | Horn/wood (`.../11045087`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | くちといと (`.../101216369`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | ずみお@skeb募集中 (`.../35971781`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | くちといと (`.../101216369`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | くちといと (`.../101216369`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 50 | おなにーのしすぎで怒られて全裸土下座 (`.../7876409`) |  | <1s |
| pages | `getPageList(chapter)` | success | 5 |  |  | <1s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=くちといと, URL=`.../101216369` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pawchive.pw/.../101216369` (image/jpeg, 11212 bytes, 160x160; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../101216369` |  |  |  |
| details thumbnail URL | PASS | `https://pawchive.pw/.../101216369` |  |  |  |
| details author | PASS | Pixiv Fanbox |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | You can change how many posts to load in the extension preferences. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 50 chapters |  |  |  |
| chapter dates | PASS | 50 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://file.pawchive.pw/.../336479ed2c8fd30d43f6f825ce685f2a3726f3d869806c174a8033105250bbf8.jpeg` (image/jpeg, 114786 bytes, 1200x630) |  |  |  |
