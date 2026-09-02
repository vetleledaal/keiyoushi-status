# Extension Validation Report

- Extension: tachiyomi-en.tcbscans-v1.4.12
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 27
- Lint: 2
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1435116756378369709
- Source name: TCB Scans
- Source language: en
- Selected manga input: popular offset 0: Ace Novel - Manga Adaptation (`.../ace-novel-manga-adaptation`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 19 | Ace Novel - Manga Adaptation (`.../ace-novel-manga-adaptation`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Ace Novel - Manga Adaptation (`.../ace-novel-manga-adaptation`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Ace Novel - Manga Adaptation (`.../ace-novel-manga-adaptation`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 4 | Ace Novel - Manga Adaptation Chapter 1: The Formation of The Spade Pirates (`.../ace-novel-manga-adaptation-chapter-1-review-1687770263`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 47 |  |  | <1s |

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
| popular listing | PASS | 19 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ace Novel - Manga Adaptation, URL=`.../ace-novel-manga-adaptation` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 20/20 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 20/20 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.onepiecechapters.com/.../02-03_adaptedv2.png` (image/png, 396899 bytes, 450x321) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ace-novel-manga-adaptation` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.onepiecechapters.com/.../02-03_adaptedv2.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Washed up on the shores of a deserted island at the edge of the East Blue Sea, two men from different backgrounds unite in their shared thirst for adventure. One of them, Portgaz D. Ace, will follow in his infamous father’s footsteps as the fearless captain of a pirate crew. The other, Masked Deuce, becomes the reluctant first member of Ace’s Spade Pirates. Survival is not enough for these seafaring buccaneers, as together they seek treasure, excitement, and a route to the New World. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | LINT | All 4 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=4 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 47 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.onepiecechapters.com/.../ace_1_ace_1v3_001.png` (image/png, 3412325 bytes, 1111x1600) |  |  |  |
