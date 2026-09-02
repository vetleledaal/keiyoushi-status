# Extension Validation Report

- Extension: tachiyomi-en.erisscans-v1.6.21
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8358420357808595754
- Source name: Eris Scans
- Source language: en
- Selected manga input: popular offset 0: Obedient Pregnancy (`.../647401bd656`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Obedient Pregnancy (`.../647401bd656`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 467 | Love Drug (`.../65a6f5e874b`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Obedient Pregnancy (`.../647401bd656`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Obedient Pregnancy (`.../647401bd656`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 38 | Chapter 1 (`.../647401bd656-64740affe0d`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 467 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Obedient Pregnancy, URL=`.../647401bd656` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 480/480 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 480/480 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../a3Huc-ays5G <redacted query values: w>` (image/jpeg, 118207 bytes, 480x639) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../647401bd656` |  |  |  |
| details thumbnail URL | PASS | `https://i0.wp.com/.../a3Huc-ays5G <redacted query values: w>` |  |  |  |
| details author | PASS | Chapa / Geumdan |  |  |  |
| details artist | PASS | Demon Lord |  |  |  |
| details genres | PASS | Manhwa, Romance, Josei, Adult, Mature, Smut |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Alternative Titles:<br>- 순종적 임신 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 38 chapters |  |  |  |
| chapter dates | PASS | 38 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.meowing.org/.../MDmXJjjWXy0` (image/jpeg, 944528 bytes, 800x14759; server Content-Type: text/plain) |  |  |  |
