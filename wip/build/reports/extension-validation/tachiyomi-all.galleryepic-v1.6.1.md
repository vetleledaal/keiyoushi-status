# Extension Validation Report

- Extension: tachiyomi-all.galleryepic-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 5621791889139364299
- Source name: Gallery Epic
- Source language: en
- Selected manga input: popular offset 0: Natsuko – Rapi Cosplay (Goddess of Victory: Nikke) (`.../10965`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Natsuko cosplay Rapi (Goddess of Victory: Nikke) (`.../10965`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Miinmeow cosplay Rapi (Goddess of Victory: Nikke) (`.../10940`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Natsuko cosplay Rapi (Goddess of Victory: Nikke) (`.../10965`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Miinmeow cosplay Rapi (Goddess of Victory: Nikke) (`.../10940`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Natsuko – Rapi Cosplay (Goddess of Victory: Nikke) (`.../10965`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../10965`) |  | <1s |
| pages | `getPageList(chapter)` | success | 79 |  |  | <1s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.galleryepic.xyz/.../aff971c0-276a-4acb-b6ac-bcaf7aa3ff5f` (image/webp (encoding: lossy), 113008 bytes, 1200x800; server Content-Type: image/avif) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../10965` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://static.galleryepic.xyz/.../4f7acf2d-3fcf-4770-982d-a30a532def5f` was not downloaded |  |  |  |
| details author | PASS | Natsuko |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Goddess of Victory: Nikke, Rapi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Cosplayer:** Natsuko · **Character:** Rapi · **Published:** 2026-11-19 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 79 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://static.galleryepic.xyz/.../2df19782-f59b-4a54-832d-cf368b1592fe` (image/webp (encoding: lossy), 117200 bytes, 800x1200; server Content-Type: image/avif) |  |  |  |
