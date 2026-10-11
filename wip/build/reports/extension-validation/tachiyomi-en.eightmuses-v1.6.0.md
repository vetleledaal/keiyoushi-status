# Extension Validation Report

- Extension: tachiyomi-en.eightmuses-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 2
- Warnings: 1
- Skipped: 1
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: eu.kanade.tachiyomi.extension.en.eightmuses.EightMuses
- Source theme: eromuse
- Source ID: 1802675169972965535
- Source name: 8Muses
- Source language: en
- Selected manga input: latest offset 0: CartoonPink (`.../CartoonPink`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 72 | Ms. Parker (`.../Ms_-Parker`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | Like Daughter Like Mother (`.../Like-Daughter-Like-Mother`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 72 | CartoonPink (`.../CartoonPink`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | error | 0 |  | java.util.NoSuchElementException: ArrayDeque is empty. | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Artwork (`.../Artwork`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | CartoonPink (`.../CartoonPink`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Artwork (`.../Artwork`) |  | <1s |
| pages | `getPageList(chapter)` | success | 584 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | ERROR | java.util.NoSuchElementException: ArrayDeque is empty. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 72 entries |  |  |  |
| latest listing | PASS | 72 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 1 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | ArrayDeque is empty. |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 155/155 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 155/155 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://comics.8muses.com/.../-PbwgTw8hXErUwfo0Aa2mArCN0hb14Raaxkhf46HIWYvO63o5Pn-Rsu9lWRVekIJSWFyQyRvw9Tu6A22NdjnxBDWVTcKeLGC6jy7NusVhkIQGQtVW5Y5u-yPPK7HFUXlLRq2U3PL5wm+PlVcPM1oOwxNXa1poXTHMaCQyRP2UrbnO50zkuwRVNbT-ngiIlpQ.jpg` -> 2 manga URLs (examples: `.../My-Mom-and-Sister-are-Size-Queen-Sluts`, `.../KennyComix`), `https://comics.8muses.com/.../IkrTthyEft87J1d95uBbBwjolCFuP+zJ+NgCLZHfF7rbq9mRGa5m1Fe9lteQvG81dwYr8cy0iUFm0Sz7Wg8aPGa2eU7pNgpZoMplkxE-Z2WhgaurQr8tcmoVU7ZfFSqusAvUBJJ26-h5jTCnJTCaCXJJXtzc4xooMpXghP98+ClotdLTGt3k3i-1jc+wPM-7.jpg` -> 2 manga URLs (examples: `.../CartoonPink`, `.../Artwork`) |  |  |  |
| thumbnail | PASS | `https://comics.8muses.com/.../IkrTthyEft87J1d95uBbBwjolCFuP+zJ+NgCLZHfF7rbq9mRGa5m1Fe9lteQvG81dwYr8cy0iUFm0Sz7Wg8aPGa2eU7pNgpZoMplkxE-Z2WhgaurQr8tcmoVU7ZfFSqusAvUBJJ26-h5jTCnJTCaCXJJXtzc4xooMpXghP98+ClotdLTGt3k3i-1jc+wPM-7.jpg` (image/jpeg, 23257 bytes, 360x313) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../CartoonPink` |  |  |  |
| details thumbnail URL | PASS | `https://comics.8muses.com/.../IkrTthyEft87J1d95uBbBwjolCFuP+zJ+NgCLZHfF7rbq9mRGa5m1Fe9lteQvG81dwYr8cy0iUFm0Sz7Wg8aPGa2eU7pNgpZoMplkxE-Z2WhgaurQr8tcmoVU7ZfFSqusAvUBJJ26-h5jTCnJTCaCXJJXtzc4xooMpXghP98+ClotdLTGt3k3i-1jc+wPM-7.jpg` |  |  |  |
| details author | PASS | CartoonPink |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 584 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://comics.8muses.com/.../IkrTthyEft87J1d95uBbBwjolCFuP+zJ+NgCLZHfF7rbq9mRGa5m1Fe9lteQvG81dwYr8cy0iUFm0Sz7Wg8aPGa2eU7pNgpZoMplkxE-Z2WhgaurQr8tcmoVU7ZfFSqusAvUBJJ26-h5jTCnJTCaCXJJXtzc4xooMpXghP98+ClotdLTGt3k3i-1jc+wPM-7.jpg` (image/jpeg, 830406 bytes, 2560x1878) |  |  |  |
