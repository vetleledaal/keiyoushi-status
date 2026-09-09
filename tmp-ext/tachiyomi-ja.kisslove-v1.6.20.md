# Extension Validation Report

- Extension: tachiyomi-ja.kisslove-v1.6.20
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6304246026723672697
- Source name: KissLove
- Source language: ja
- Selected manga input: popular offset 0: KINGDOM - RAW (`.../kingdom-raw`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | KINGDOM - RAW (`.../kingdom-raw`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | CHIKUBI × BUDDY (`.../chikubi-buddy`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 36 | YOWAMUSHI PEDAL - RAW (`.../yowamushi-pedal-raw`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 36 | KINGDOM - RAW (`.../kingdom-raw`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | KINGDOM - RAW (`.../kingdom-raw`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 317 | Chapter 571.0 (`.../kingdom-raw-chapter-571.0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | <1s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=KINGDOM - RAW, URL=`kingdom-raw` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 118/118 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 118/118 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://j4.jfimv2.xyz/.../5f2b7d21a3b41_5f2b7d229f4c2.jpg` (image/jpeg, 32058 bytes, 224x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `kingdom-raw` |  |  |  |
| details thumbnail URL | PASS | `https://j4.jfimv2.xyz/.../5f2b7d21a3b41_5f2b7d229f4c2.jpg` |  |  |  |
| details author | PASS | HARA Yasuhisa |  |  |  |
| details artist | PASS | HARA Yasuhisa |  |  |  |
| details genres | PASS | Action, Drama, Historical, Mature, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Millions of years have passed since the times of legends, when the worlds of man and gods were still the same. In these times it was the desires of man that moved the world. It is the era of the 500 year war: The warring states period. Kingdom is the story of a young boy named Shin who grew into a great general and all the trials and bloodshed that lead him there.<br><br>キングダム, 王者天下 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 317 chapters |  |  |  |
| chapter dates | PASS | 317 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://j1.jfimv2.xyz/.../5b9084920cff5_00047.jpg` (image/jpeg, 325767 bytes, 850x1200) |  |  |  |
