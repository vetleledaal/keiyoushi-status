# Extension Validation Report

- Extension: tachiyomi-en.eightmuses-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 29
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: eu.kanade.tachiyomi.extension.en.eightmuses.EightMuses
- Source ID: 1802675169972965535
- Source name: 8Muses
- Source language: en
- Selected manga input: latest offset 0: Artwork (`.../Artwork`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | error | 0 |  | kotlin.UninitializedPropertyAccessException: lateinit property  has not been initialized | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 1 | Artwork (`.../Artwork`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 4 | My Daughter-in-Law Won’t Stop Seducing Me (`.../My-Daughter-in-Law-Wont-Stop-Seducing-Me`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 70 | Dofantasy - BDSMArtwork Old Stuff (`.../Dofantasy-BDSMArtwork-Old-Stuff`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Artwork (`.../Artwork`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../Artwork`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 584 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | ERROR | kotlin.UninitializedPropertyAccessException: lateinit property  has not been initialized | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | SKIP | lateinit property  has not been initialized |  |  |  |
| latest listing | PASS | 1 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 19: title=Artwork, URL=`.../Artwork` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | lateinit property  has not been initialized |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 75/75 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 75/75 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://comics.8muses.com/.../IkrTthyEft87J1d95uBbBwjolCFuP+zJ+NgCLZHfF7rbq9mRGa5m1Fe9lteQvG81dwYr8cy0iUFm0Sz7Wg8aPGa2eU7pNgpZoMplkxE-Z2WhgaurQr8tcmoVU7ZfFSqusAvUBJJ26-h5jTCnJTCaCXJJXtzc4xooMpXghP98+ClotdLTGt3k3i-1jc+wPM-7.jpg` (image/jpeg, 23257 bytes, 360x313) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../Artwork` |  |  |  |
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
| page load | PASS | `https://comics.8muses.com/.../IkrTthyEft87J1d95uBbBwjolCFuP+zJ+NgCLZHfF7rbq9mRGa5m1Fe9lteQvG81dwYr8cy0iUFm0Sz7Wg8aPGa2eU7pNgpZoMplkxE-Z2WhgaurQr8tcmoVU7ZfFSqusAvUBJJ26-h5jTCnJTCaCXJJXtzc4xooMpXghP98+ClotdLTGt3k3i-1jc+wPM-7.jpg` (image/jpeg, 830406 bytes, 2560x1878) |  |  |  |
