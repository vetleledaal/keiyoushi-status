# Extension Validation Report

- Extension: tachiyomi-en.kewnscans-v1.6.22
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2816768640766208312
- Source name: Kewn Scans
- Source language: en
- Selected manga input: popular offset 0: Snow Mountain Monster Princess - Season 1 (`.../snow-mountain-monster-princess-season-1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 7 | Snow Mountain Monster Princess - Season 1 (`.../snow-mountain-monster-princess-season-1`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 32 | Bitter Side Cranberries (`.../bitter-side-cranberries`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Snow Mountain Monster Princess - Season 1 (`.../snow-mountain-monster-princess-season-1`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Snow Mountain Monster Princess - Season 1 (`.../snow-mountain-monster-princess-season-1`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 35 | Chapter 1 (`.../74caf5685eb-6f7ef986943`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | <1s |

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
| popular listing | PASS | 7 entries |  |  |  |
| latest listing | PASS | 32 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Snow Mountain Monster Princess - Season 1, URL=`.../snow-mountain-monster-princess-season-1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 1 manga entry: title=Snow Mountain Monster Princess - Season 1, URL=`.../snow-mountain-monster-princess-season-1` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 40/40 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 40/40 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wsrv.nl <redacted query values: url and w>` (image/png, 588527 bytes, 480x641) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../snow-mountain-monster-princess-season-1` |  |  |  |
| details thumbnail URL | PASS | `https://wsrv.nl <redacted query values: url and w>` |  |  |  |
| details author | PASS | Mool Bora, Lee Nakeum |  |  |  |
| details artist | PASS | Suho |  |  |  |
| details genres | PASS | Manhwa, Romance, Drama |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Valerie Bellov is exiled to the frozen mountains as punishment for her mother's sin. There, she gains the freezing ability of a monster that terrified the Empire in the past. On her 19th birthday, she takes her life by her own hands, only to wake up and find herself back in her childhood at the age of 9. In order to change the past, Valerie seeks to meet her stepbrother, Emperor Millard, who exiled her. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 35 chapters |  |  |  |
| chapter dates | PASS | 35 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.meowing.org/.../2bfc5b59570` (image/webp (encoding: lossy), 166070 bytes, 800x5555; server Content-Type: text/plain) |  |  |  |
