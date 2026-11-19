# Extension Validation Report

- Extension: tachiyomi-en.erofus-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 2
- Warnings: 1
- Skipped: 3
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: eromuse
- Source ID: 3054988613439396424
- Source name: Erofus
- Source language: en
- Selected manga input: latest offset 0: Totempole (`.../totempole`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 46 | Lost Heir 2 - Taverne Scene (`.../lost-heir-2-taverne-scene`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 82 | Totempole (`.../totempole`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | error | 0 |  | java.util.NoSuchElementException: ArrayDeque is empty. | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 14 | The Cummoner (`.../the-cummoner`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Totempole (`.../totempole`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | Ad Asstra (`.../ad-asstra`) |  | <1s |
| pages | `getPageList(chapter)` | success | 174 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | ERROR | java.util.NoSuchElementException: ArrayDeque is empty. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 46 entries |  |  |  |
| latest listing | PASS | 82 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 14 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | ArrayDeque is empty. |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 142/142 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 142/142 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.erofus.com/.../5ce3f8fbe78730106259848.jpeg` (image/jpeg, 27112 bytes, 350x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../totempole` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.erofus.com/.../64cbcb3672d1e0137057092.jpeg` (image/jpeg, 27868 bytes, 350x300) |  |  |  |
| details author | PASS | Totempole |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | fantasy, adventure, slut, big boobs, Teen, western, seduced, cheating, magic, jungle |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | LINT | All 2 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=2 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 174 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.erofus.com/.../64cbcb36733023195267010.jpeg` (image/jpeg, 207446 bytes, 1000x1414) |  |  |  |
