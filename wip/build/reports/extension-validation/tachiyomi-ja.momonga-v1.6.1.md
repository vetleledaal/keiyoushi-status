# Extension Validation Report

- Extension: tachiyomi-ja.momonga-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5332628982027198645
- Source name: momon:GA
- Source language: ja
- Selected manga input: popular offset 0: となりの席の友達と一緒にオナニーする話 (`.../mo3576768`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 200 | となりの席の友達と一緒にオナニーする話 (`.../mo3576768`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | となりの席の友達と一緒にオナニーする話 (`.../mo3576768`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | となりの席の友達と一緒にオナニーする話 (`.../mo3576768`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 単一章 (`.../mo3576768`) |  | <1s |
| pages | `getPageList(chapter)` | success | 80 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=となりの席の友達と一緒にオナニーする話, URL=`.../mo3576768` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 100 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://z3.momon-ga.me/.../1.webp` (image/webp (encoding: lossy), 113812 bytes, 1280x1807) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mo3576768` |  |  |  |
| details thumbnail URL | PASS | `https://z3.momon-ga.me/.../1.webp` |  |  |  |
| details author | PASS | フグタ家 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | beauty mark, big breasts, masturbation, onahole, sex toys, sole female, sole male |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 80 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://z3.momon-ga.me/.../1.webp` (image/webp (encoding: lossy), 113812 bytes, 1280x1807) |  |  |  |
