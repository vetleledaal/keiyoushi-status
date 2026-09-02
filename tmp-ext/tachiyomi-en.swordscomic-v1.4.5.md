# Extension Validation Report

- Extension: tachiyomi-en.swordscomic-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 26
- Lint: 1
- Warnings: 0
- Skipped: 8
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4098334577101891258
- Source name: Swords Comic
- Source language: en
- Selected manga input: popular offset 0: Swords Comic (`.../pages`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 1 | Swords Comic (`.../pages`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Swords Comic (`.../pages`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1143 | Swords, the Webcomic (`.../cover`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 2 |  |  | <1s |

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
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 1/1 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1/1 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://swordscomic.com/.../ArgoksEdgeEmote.png` (image/png, 9940 bytes, 128x128) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../pages` |  |  |  |
| details thumbnail URL | PASS | `https://swordscomic.com/.../ArgoksEdgeEmote.png` |  |  |  |
| details author | PASS | Matthew Wills |  |  |  |
| details artist | PASS | Matthew Wills |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | A webcomic about swords and the heroes who wield them |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1143 chapters |  |  |  |
| chapter dates | PASS | 1143 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 2 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://swordscomic.com/.../cover_13o10so.png` (image/png, 589359 bytes, 700x871) |  |  |  |
