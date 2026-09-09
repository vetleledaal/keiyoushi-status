# Extension Validation Report

- Extension: tachiyomi-ja.momonga-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 29
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5332628982027198645
- Source name: momon:GA
- Source language: ja
- Selected manga input: popular offset 0: デリヘル呼んだら別れた彼女のママが来た (`.../mo4115358`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 200 | デリヘル呼んだら別れた彼女のママが来た (`.../mo4115358`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | デリヘル呼んだら別れた彼女のママが来た (`.../mo4115358`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | デリヘル呼んだら別れた彼女のママが来た (`.../mo4115358`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | 単一章 (`.../mo4115358`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 63 |  |  | <1s |

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
| popular listing | PASS | 200 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=デリヘル呼んだら別れた彼女のママが来た, URL=`.../mo4115358` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 100 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://z2.momon-ga.com/.../1.webp` (image/webp (encoding: lossy), 182954 bytes, 1280x1808) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mo4115358` |  |  |  |
| details thumbnail URL | PASS | `https://z2.momon-ga.com/.../1.webp` |  |  |  |
| details author | PASS | ほたてちゃん |  |  |  |
| details artist | PASS | ほたてちゃんぽん |  |  |  |
| details genres | PASS | ahegao, big areolae, big ass, big breasts, blowjob, blowjob face, burping, cheating, deepthroat, handjob, huge breasts, kissing, leg lock, milf, nakadashi, paizuri, prostitution, sole female, sole male, x-ray |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 63 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://z2.momon-ga.com/.../1.webp` (image/webp (encoding: lossy), 182954 bytes, 1280x1808) |  |  |  |
