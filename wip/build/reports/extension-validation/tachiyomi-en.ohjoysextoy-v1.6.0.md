# Extension Validation Report

- Extension: tachiyomi-en.ohjoysextoy-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 0
- Warnings: 3
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4502591927177845825
- Source name: Oh Joy Sex Toy
- Source language: en
- Selected manga input: popular offset 0: WestPride Archives (`.../westpride-archives-hien-pham`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 84 | WestPride Archives (`.../westpride-archives-hien-pham`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 84 | Becoming A Queer Parent (`.../becoming-a-queer-parent-christine-suggs`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 19 | WestPride Archives (`.../westpride-archives-hien-pham`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | WestPride Archives (`.../westpride-archives-hien-pham`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Oh Joy Sex Toy - WestPride Archives by Hien Pham (`.../westpride-archives-hien-pham`) |  | <1s |
| pages | `getPageList(chapter)` | success | 5 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 84 entries |  |  |  |
| latest listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=WestPride Archives, URL=`.../westpride-archives-hien-pham` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 has no manga to check |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 187/187 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 168/187 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.ohjoysextoy.com/.../WestPrideArchives__OJST_preview-SM.png` (image/png, 47840 bytes, 396x396) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../westpride-archives-hien-pham` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.ohjoysextoy.com/.../WestPrideArchives__twitter.jpg` (image/jpeg, 183780 bytes, 1200x630) |  |  |  |
| details author | PASS | Hien Pham |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adventures, Comic, Hien Pham, Interviews, Non-Fiction Comics, Shareable Comics, Transcribed |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Text: OhJoySexToy.com presents WestPride Archives by Hien Pham<br>Image: Illustration of a chibi guy is agog with delight in between stacked library shelves that are full of various books, documents, and archival boxes....<br><br>Portfolio: https://hiencomics.com.au<br>Bluesky: https://bsky.app/.../hiencomics.com.au<br>Instagram: https://www.instagram.com/.../hiencomics<br>Patreon: https://www.patreon.com/.../hiencomics<br>Here on OJST!: https://www.ohjoysextoy.com/.../hienpham<br><br>(Full description and credits in WebView) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.ohjoysextoy.com/.../1` to `https://www.ohjoysextoy.com/.../comic` (1 redirects) |  |  |  |
| page load | PASS | `https://www.ohjoysextoy.com/.../2026-10-06-WestPride-Archives-Hien-Pham-1.jpg` (image/jpeg, 823437 bytes, 1536x2676) |  |  |  |
