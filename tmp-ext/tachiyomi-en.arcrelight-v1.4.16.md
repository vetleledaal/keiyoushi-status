# Extension Validation Report

- Extension: tachiyomi-en.arcrelight-v1.4.16
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6809555026902049727
- Source name: Arc-Relight
- Source language: en
- Selected manga input: latest offset 0: Chaos;Child - Children's Collapse (`.../childrens-collapse`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 13 | Steins;Gate - Babel of the Grieved Maze (`.../babel`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 13 | Chaos;Child - Children's Collapse (`.../childrens-collapse`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Chaos;Child - Children's Collapse (`.../childrens-collapse`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Chaos;Child - Children's Collapse (`.../childrens-collapse`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 4 | Vol. 1, Ch. 1: Mio Kunosato (`.../21`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 53 |  |  | <1s |

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
| popular listing | PASS | 13 entries |  |  |  |
| latest listing | PASS | 13 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Chaos;Child - Children's Collapse, URL=`childrens-collapse` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 27/27 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 27/27 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://arc-relight.com/.../cover.jpg` (image/jpeg, 83831 bytes, 211x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `childrens-collapse` |  |  |  |
| details thumbnail URL | PASS | `https://arc-relight.com/.../cover.jpg` |  |  |  |
| details author | PASS | MAGES., Umehara Eiji |  |  |  |
| details artist | PASS | Onshin Futsuu |  |  |  |
| details genres | PASS | Chaos;Head, Mystery, Sci-Fi, Seinen, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A prequel to Chaos;Child that details the life of Kunosato Mio before she got caught up in the events of the Return of the New Generation Madness.
<br>
<br>WARNING: Contains some minor spoilers for Chaos;Child. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://arc-relight.com/.../8818e3e9d3bdc09f206eef93a09f55d6.jpg` (image/jpeg, 558736 bytes, 1083x1539) |  |  |  |
