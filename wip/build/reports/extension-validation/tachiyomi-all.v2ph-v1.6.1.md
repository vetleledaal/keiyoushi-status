# Extension Validation Report

- Extension: tachiyomi-all.v2ph-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4511819378822109646
- Source name: V2PH
- Source language: all
- Selected manga input: popular offset 0: Street Snap – A stunning figure (`.../am35898a.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | Street Snap – A stunning figure (`.../am35898a.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 16 | Yu Feng Street Photography – Silk Stocking Series – Office Lady Tingting's After-Work Photoshoot and Video (`.../zo75834z.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | PINK RIBBON NO.013 다연님 COSPLAY EVENT_RED black (`.../a89n977z.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Duke Kane's work: a stunning woman in tight white pants, her figure is impeccable (photo album). (`.../z7oe7nnz.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Street Snap – A stunning figure (`.../am35898a.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../am35898a.html`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: V2PH Session expired. Please log in via WebView to view more than 20 images. | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: V2PH Session expired. Please log in via WebView to view more than 20 images. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Street Snap – A stunning figure, URL=`.../am35898a.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 46/46 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 46/46 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.v2ph.com/.../KkDvKSl9_uUPfd4Y.jpg` (image/jpeg, 102781 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../am35898a.html` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.v2ph.com/.../KkDvKSl9_uUPfd4Y.jpg` |  |  |  |
| details author | PASS | Street Snap |  |  |  |
| details artist | PASS | Anonymous |  |  |  |
| details genres | PASS | Beautiful Bust, Quality, Street style, Beautiful Bust, Stunner, Tits, Japanese Mature Women, AV Actresses, H Cup, Swimsuit, Beautiful Bust, Beautiful Bust, sexy, Quality, Beautiful Bust, Boudoir, Temptation, Tits, Busty, Soft Girl |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Photos: 68 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | V2PH Session expired. Please log in via WebView to view more than 20 images. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
