# Extension Validation Report

- Extension: tachiyomi-en.lolobun-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5291930108967632324
- Source name: LoLoBun
- Source language: en
- Selected manga input: popular offset 0: The Limitless Apostle and the Twelve Battle Maidens (`.../20106`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 4 | The Limitless Apostle and the Twelve Battle Maidens (`.../20106`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Limitless Apostle and the Twelve Battle Maidens (`.../20106`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Limitless Apostle and the Twelve Battle Maidens (`.../20106`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 172 | chapter 1 (`.../71`) |  | <1s |
| pages | `getPageList(chapter)` | success | 63 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 4 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Limitless Apostle and the Twelve Battle Maidens, URL=`20106` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 5/5 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 5/5 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://osrs.sfacg.com/.../16085e73-0643-4263-9c34-f2ca6f6dea70.jpg` (image/jpeg, 90605 bytes, 368x460) |  |  |  |
| details identity | PASS | Details preserved selected URL `20106` |  |  |  |
| details thumbnail URL | PASS | `https://osrs.sfacg.com/.../16085e73-0643-4263-9c34-f2ca6f6dea70.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Magic |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The Greatest Apostle, indifferent to wealth, fame, and power, escapes to the human world. Chaos ensues—until he declares: “I’m here to find my wife!” Thus begins the mightiest bachelor’s quest. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 172 chapters |  |  |  |
| chapter dates | LINT | 171 of 172 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=171 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 63 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://osrs.sfacg.com/.../001_7B9F9085650B46C5.jpg` (image/jpeg, 68413 bytes, 900x901) |  |  |  |
