# Extension Validation Report

- Extension: tachiyomi-pt.hentaicomics-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 3
- Warnings: 3
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5674532035279095345
- Source name: Hentai Comics
- Source language: pt
- Selected manga input: popular offset 0: Boruto comendo a Hanabi (`.../boruto-comendo-a-hanabi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | Boruto comendo a Hanabi (`.../boruto-comendo-a-hanabi`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Atelier Ryza (`.../atelier-ryza-hentai`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Ane Naru Mono (`.../ane-naru-mono-hentai-hq`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Boruto comendo a Hanabi (`.../boruto-comendo-a-hanabi-hentai`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Boruto comendo a Hanabi (`.../boruto-comendo-a-hanabi`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Oneshot (`.../boruto-comendo-a-hanabi`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | <1s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=Boruto comendo a Hanabi, URL=`boruto-hq/boruto-comendo-a-hanabi-hentai/` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://hentaicomics.biz/.../01-4-300x300.jpg` -> 2 manga URLs (examples: `boruto/boruto-comendo-a-hanabi/`, `boruto-hq/boruto-comendo-a-hanabi-hentai/`) |  |  |  |
| thumbnail | PASS | `https://hentaicomics.biz/.../01-4-300x300.jpg` (image/webp (encoding: lossy), 174118 bytes, 1470x2100) |  |  |  |
| details identity | PASS | Details preserved selected URL `boruto/boruto-comendo-a-hanabi/` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://hentaicomics.biz/.../01-4.jpg` was not downloaded |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Boruto |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://hentaicomics.biz/.../boruto-comendo-a-hanabi` to `https://hentaicomics.biz/.../boruto-comendo-a-hanabi-hentai` (2 redirects); popular: `https://hentaicomics.biz/.../boruto-comendo-a-hanabi` to `https://hentaicomics.biz/.../boruto-comendo-a-hanabi-hentai` (2 redirects) |  |  |  |
| page load | PASS | `https://hentaicomics.biz/.../01-4.jpg` (image/webp (encoding: lossy), 174118 bytes, 1470x2100) |  |  |  |
