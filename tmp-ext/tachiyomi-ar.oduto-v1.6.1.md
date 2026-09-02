# Extension Validation Report

- Extension: tachiyomi-ar.oduto-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 27
- Lint: 1
- Warnings: 0
- Skipped: 8
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1862668423724227387
- Source name: Oduto
- Source language: ar
- Selected manga input: popular offset 0: BORUTO: Two Blue Vortex (`.../%D9%85%D8%A7%D9%86%D8%AC%D8%A7%20%D8%A8%D9%88%D8%B1%D9%88%D8%AA%D9%88`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 1 | BORUTO: Two Blue Vortex (`.../%D9%85%D8%A7%D9%86%D8%AC%D8%A7%20%D8%A8%D9%88%D8%B1%D9%88%D8%AA%D9%88`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | BORUTO: Two Blue Vortex (`.../%D9%85%D8%A7%D9%86%D8%AC%D8%A7%20%D8%A8%D9%88%D8%B1%D9%88%D8%AA%D9%88`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | BORUTO: Two Blue Vortex (`.../%D9%85%D8%A7%D9%86%D8%AC%D8%A7%20%D8%A8%D9%88%D8%B1%D9%88%D8%AA%D9%88`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 24 | الفصل 1: بوروتو‏ (`.../1.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 58 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=BORUTO: Two Blue Vortex, URL=`مانجا بوروتو` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 2/2 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 2/2 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../4D55C3C5-9168-4103-B45C-99B52B58B6A5.jpeg` (image/jpeg, 864053 bytes, 2199x3464) |  |  |  |
| details identity | PASS | Details preserved selected URL `مانجا بوروتو` |  |  |  |
| details thumbnail URL | PASS | `https://blogger.googleusercontent.com/.../4D55C3C5-9168-4103-B45C-99B52B58B6A5.jpeg` |  |  |  |
| details author | PASS | Masashi Kishimoto |  |  |  |
| details artist | PASS | Mikio Ikemoto |  |  |  |
| details genres | PASS | شونين, دراما, خيال, أكشن, نينجا |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 21 name |  |  |  |
| chapters | PASS | 24 chapters |  |  |  |
| chapter dates | PASS | 24 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 58 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../IMG_5798.JPG` (image/jpeg, 131906 bytes, 1280x960) |  |  |  |
