# Extension Validation Report

- Extension: tachiyomi-all.hentaipaw-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 1884039837211773334
- Source name: HentaiPaw
- Source language: all
- Selected manga input: popular offset 0: panakiman (`.../2718963`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | panakiman (`.../2718963`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | 年越し 親戚の叔母ちゃん達との一夜 (`.../2626217`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Cat to Mujintou (`.../4341197`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | 時雨…横もステキだね (`.../4341066`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 5 | panakiman (`.../2718963`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | panakiman (`.../2718963`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../viewer <redacted query values: articleId and page>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 66 |  |  | <1s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=panakiman, URL=`.../2718963` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 125/125 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 125/125 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.imagedeliveries.com/.../cover.webp` (image/webp (encoding: lossy), 40940 bytes, 350x495) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2718963` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.imagedeliveries.com/.../cover.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Parodies:** original · **Language:** 日本語 · **Category:** Doujinshi |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 66 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.imagedeliveries.com/.../1.webp` (image/webp (encoding: lossy), 342314 bytes, 2037x2880) |  |  |  |
