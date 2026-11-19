# Extension Validation Report

- Extension: tachiyomi-en.manhwa210-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3248855109192504827
- Source name: Manhwa210
- Source language: en
- Selected manga input: popular offset 0: Stop Smoking (`.../stop-smoking`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | Stop Smoking (`.../stop-smoking`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 60 | New Town (`.../new-town`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 60 | A Regressor’s Tale of Cultivation (`.../a-regressor-s-tale-of-cultivation`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 60 | The Ladies’ Associate (Uncensored) (`.../the-ladies-associate-uncensored`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Stop Smoking (`.../stop-smoking`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Stop Smoking (`.../stop-smoking`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 81 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 344 |  |  | <1s |

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
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Stop Smoking, URL=`.../stop-smoking` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 241/241 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 241/241 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhwa210.com/.../7318e5d6-dc45-47b6-ad12-69bb390286dc.jpg` (image/jpeg, 17224 bytes, 215x285) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../stop-smoking` |  |  |  |
| details thumbnail URL | PASS | `https://manhwa210.com/.../7318e5d6-dc45-47b6-ad12-69bb390286dc.jpg` |  |  |  |
| details author | PASS | Momobird |  |  |  |
| details artist | PASS | Momobird |  |  |  |
| details genres | PASS | Drama, Romance, Comedy |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Even though I get teased for being short and bullied at work, my house is paradise!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 81 chapters |  |  |  |
| chapter dates | PASS | 81 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 344 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.manhwa210.com/.../a85c4c86-edf0-4db6-b3f9-8b7942d6ed73.jpg` (image/jpeg, 52837 bytes, 720x500) |  |  |  |
