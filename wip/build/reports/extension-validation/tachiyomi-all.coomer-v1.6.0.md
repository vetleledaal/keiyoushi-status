# Extension Validation Report

- Extension: tachiyomi-all.coomer-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: kemono
- Source ID: 8715899195746116471
- Source name: Coomer
- Source language: all
- Selected manga input: latest offset 0: zara_sky (`.../zara_sky`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | belledelphine (`.../belledelphine`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | hidorirose (`.../hidorirose`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | zara_sky (`.../zara_sky`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | jazmynedayvips (`.../jazmynedayvips`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | zara_sky (`.../zara_sky`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | zara_sky (`.../zara_sky`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 50 | \FREE @sandraukitty FREE She turned 18 🆘Disobedient Freshman.. (`.../1823388586`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | 10s+ |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=zara_sky, URL=`.../zara_sky` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.coomer.st/.../zara_sky` (image/jpeg, 4149 bytes, 160x160) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../zara_sky` |  |  |  |
| details thumbnail URL | PASS | `https://img.coomer.st/.../zara_sky` |  |  |  |
| details author | PASS | OnlyFans |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | You can change how many posts to load in the extension preferences. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 6 name, chapter 9 name, chapter 12 name, chapter 13 name, chapter 16 name, chapter 17 name, chapter 22 name, chapter 25 name, chapter 27 name, chapter 31 name, chapter 33 name, chapter 39 name, chapter 40 name, chapter 41 name, chapter 42 name, chapter 46 name, chapter 48 name, chapter 49 name |  |  |  |
| chapters | PASS | 50 chapters |  |  |  |
| chapter dates | PASS | 50 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://coomer.st/.../b18ce96f74082cd2c2dade2b17dcb6da50bd0920d3fe91c20af1f158368520c1.jpg <redacted query values: f>` could not be downloaded: kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
