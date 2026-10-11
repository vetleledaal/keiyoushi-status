# Extension Validation Report

- Extension: tachiyomi-all.fourkhd-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 1
- Failed: 2
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6501663152246384585
- Source name: 4KHD
- Source language: all
- Selected manga input: latest offset 0: X-Level Ggyong-ee (굥이) – I Luv It[321MB-111photos] (`.../xlevel-ggyongee-i-luv-it.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Hyeony (현이) – Private Date[371MB-69photos] (`.../hyeonyi-private-date.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | リリ – Rio[68MB-22photos] (`.../lili-rio.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | X-Level Ggyong-ee (굥이) – I Luv It[321MB-111photos] (`.../xlevel-ggyongee-i-luv-it.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | リリ – Rio[68MB-22photos] (`.../lili-rio.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 502 | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | X-Level Ggyong-ee (굥이) – I Luv It[321MB-111photos] (`.../xlevel-ggyongee-i-luv-it.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../xlevel-ggyongee-i-luv-it.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 111 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 502 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | SKIP | HTTP error 502 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.4khd.com/.../4KHD-beautifulGirls.webp` (image/jpeg, 106111 bytes, 1090x1500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../xlevel-ggyongee-i-luv-it.html` |  |  |  |
| details thumbnail URL | PASS | `https://img.4khd.com/.../4KHD-beautifulGirls.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | photo |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 111 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://img.uuss.uk/.../e-i-luv-it-4khd.com-001.webp <redacted query values: w>` to `https://uun.ssuu.uk/.../4khd.php` (1 redirects) |  |  |  |
| page load | FAIL | First page URL `https://img.uuss.uk/.../e-i-luv-it-4khd.com-001.webp <redacted query values: w>` did not contain a decodable image (1243 bytes) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
