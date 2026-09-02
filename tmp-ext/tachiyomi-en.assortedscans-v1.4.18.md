# Extension Validation Report

- Extension: tachiyomi-en.assortedscans-v1.4.18
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

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8088090686762347480
- Source name: Assorted Scans
- Source language: en
- Selected manga input: popular offset 0: Even a Cat's Paw Can Be Useful (`.../nekotete`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 25 | Even a Cat's Paw Can Be Useful (`.../nekotete`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 25 | NOBEL Twitter one-shots (`.../nobel-twitter-one-shots`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 25 | Kings' Viking (`.../kings-viking`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 25 | Pen Pal at the End of the World (`.../penpal`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Even a Cat's Paw Can Be Useful (`.../nekotete`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Even a Cat's Paw Can Be Useful (`.../nekotete`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 147 | Vol. 1, Ch. 1: After School Pleasure (`.../549`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Even a Cat's Paw Can Be Useful, URL=`nekotete` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i3.wp.com/.../cover.jpg <redacted query values: ssl, quality, and fit>` (image/jpeg, 18666 bytes, 300x159) |  |  |  |
| details identity | PASS | Details preserved selected URL `nekotete` |  |  |  |
| details thumbnail URL | PASS | `https://i3.wp.com/.../cover.jpg <redacted query values: ssl, quality, and fit>` |  |  |  |
| details author | PASS | NOBEL |  |  |  |
| details artist | PASS | NOBEL |  |  |  |
| details genres | PASS | 4-Koma, Comedy, Drama, Romance, School Life, Slice of Life, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | https://twitter.com/.../NOBEL827
<br>https://skeb.jp/.../@NOBEL827<br><br>Alternative titles:<br>NekoTete<br>猫の手だって役に立つ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 147 chapters |  |  |  |
| chapter dates | PASS | 147 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i3.wp.com/.../2ab422e7dcc406add6d25e0fee80ca21.png <redacted query values: ssl>` (image/png, 212918 bytes, 801x1200) |  |  |  |
