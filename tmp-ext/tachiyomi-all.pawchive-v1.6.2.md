# Extension Validation Report

- Extension: tachiyomi-all.pawchive-v1.6.2
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
- Source ID: 4284527942812494681
- Source name: Pawchive
- Source language: all
- Selected manga input: popular offset 0: Anna Anon (`.../37736420`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Anna Anon (`.../37736420`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | Custom_Udon (`.../115051`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | canisfidelis1 (`.../16083199`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Steven Casique (`.../13685185`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Anna Anon (`.../37736420`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Anna Anon (`.../37736420`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 48 | Animated Scenes (`.../9936965`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Anna Anon, URL=`.../37736420` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 202/202 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 202/202 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pawchive.pw/.../37736420` (image/jpeg, 12704 bytes, 160x160; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../37736420` |  |  |  |
| details thumbnail URL | PASS | `https://pawchive.pw/.../37736420` |  |  |  |
| details author | PASS | Pixiv Fanbox |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | You can change how many posts to load in the extension preferences. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 48 chapters |  |  |  |
| chapter dates | PASS | 48 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://file.pawchive.pw/.../e3548d280c79ba54a0644edaf33ac6029bd3bd3ea021be936ee37d8452fdfc90.jpeg` (image/jpeg, 186451 bytes, 1200x630) |  |  |  |
