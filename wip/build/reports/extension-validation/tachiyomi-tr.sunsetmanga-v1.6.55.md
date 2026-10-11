# Extension Validation Report

- Extension: tachiyomi-tr.sunsetmanga-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 15
- Lint: 0
- Warnings: 2
- Skipped: 18
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 6406690174131145499
- Source name: Sunset Manga
- Source language: tr
- Selected manga input: popular offset 0: Selfish Romance (`.../3665`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Selfish Romance (`.../3665`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | I’ll Take That Marriage This Time (`.../3934`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | My Wish Is Not A Sin (`.../12743`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | İlişki Prensibi (`.../4499`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Selfish Romance (`.../3665`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | java.lang.NullPointerException | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | java.lang.NullPointerException | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Selfish Romance, URL=`3665` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://www.sunsetmanga.com/.../giris-yapiniz.jpg` -> 12 manga URLs (examples: `2785`, `4499`, `4635`) |  |  |  |
| thumbnail | PASS | `https://sunsetmanga.com/.../the-selfish-romance-v0-s060l3uyj19e1-e1737907443942-350x476.jpg` (image/jpeg, 36001 bytes, 350x476) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | SKIP | No details metadata to check |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://sunsetmanga.com/.../selfish-romance` to `https://sunsetscans.com.tr/.../selfish-romance` (1 redirects); popular: `https://sunsetmanga.com/.../selfish-romance` to `https://sunsetscans.com.tr/.../selfish-romance` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
