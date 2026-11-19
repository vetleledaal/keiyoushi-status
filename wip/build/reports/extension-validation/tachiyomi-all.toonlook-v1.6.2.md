# Extension Validation Report

- Extension: tachiyomi-all.toonlook-v1.6.2
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
- Source implementation: keiyoushi.source.c
- Source ID: 8320348786843379620
- Source name: ToonLook
- Source language: en
- Selected manga input: popular offset 0: H-Mate : Friends with Benefits (`.../h-mate-friends-with-benefits`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | H-Mate : Friends with Benefits (`.../h-mate-friends-with-benefits`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | My New Co-worker (`.../my-new-co-worker`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Boo-tiful Nightmare (`.../boo-tiful-nightmare`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | A Dangerous Deal and The Girl Next Door (`.../a-dangerous-deal-and-the-girl-next-door`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | H-Mate : Friends with Benefits (`.../h-mate-friends-with-benefits`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | H-Mate : Friends with Benefits (`.../h-mate-friends-with-benefits`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 101 | Chapter 001 (`.../29-chapter-1 <redacted query values: lang>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=H-Mate : Friends with Benefits, URL=`h-mate-friends-with-benefits` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://toonlook.com/.../h-mate-friends-with-benefits.webp` (image/webp (encoding: lossy), 301418 bytes, 1280x2066) |  |  |  |
| details identity | PASS | Details preserved selected URL `h-mate-friends-with-benefits` |  |  |  |
| details thumbnail URL | PASS | `https://toonlook.com/.../h-mate-friends-with-benefits.webp` |  |  |  |
| details author | PASS | Geobukbal |  |  |  |
| details artist | PASS | Geobukbal |  |  |  |
| details genres | PASS | Adult, Drama, Hentai, Romance, Seinen |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | A story about a man in the friend-zone. All brave men of culture know the feeling. But when the girl he loves suddenly breaks up with her boyfriend, he realizes the friend zone is more penetrable than he thought.<br><br>Alternative Titles:<br>- H-Mate<br>- H-메이트<br>- Hメイト<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 101 chapters |  |  |  |
| chapter dates | PASS | 101 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://toonlook.com/.../manhwa <redacted query values: sortby>` to `https://toonlook.com/.../manhwa <redacted query values: sortby>` (1 redirects); popular: `https://toonlook.com/.../manhwa <redacted query values: sortby>` to `https://toonlook.com/.../manhwa <redacted query values: sortby>` (1 redirects); popular: `https://toonlook.com/.../29-chapter-1 <redacted query values: lang>` to `https://toonlook.com/.../29-chapter-1 <redacted query values: lang>` (1 redirects) |  |  |  |
| page load | FAIL | First page URL `https://img.toonlook.com/.../001.webp` could not be downloaded: java.io.IOException: Incompatible image: BufferedImage@88f7231: type = 8 DirectColorModel: rmask=f800 gmask=7e0 bmask=1f amask=0 ShortInterleavedRaster: width = 720 height = 5000 #numDataElements 1 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
