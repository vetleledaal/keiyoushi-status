# Extension Validation Report

- Extension: tachiyomi-en.erofus-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 27
- Lint: 2
- Warnings: 1
- Skipped: 5
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: eromuse
- Source ID: 3054988613439396424
- Source name: Erofus
- Source language: en
- Selected manga input: popular offset 0: Afterschool Class (`.../afterschool-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 46 | Afterschool Class (`.../afterschool-class`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | error | 0 |  | java.util.NoSuchElementException: ArrayDeque is empty. | <1s |
| latest | `fetchLatestUpdates(1)` | error | 0 |  | kotlin.UninitializedPropertyAccessException: lateinit property  has not been initialized | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 81 | Art Class (`.../art-class`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Afterschool Class (`.../afterschool-class`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../afterschool-class`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 15 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | ERROR | java.util.NoSuchElementException: ArrayDeque is empty. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| latest operation | ERROR | kotlin.UninitializedPropertyAccessException: lateinit property  has not been initialized | REVIEW | INSUFFICIENT_EVIDENCE |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 46 entries |  |  |  |
| latest listing | SKIP | lateinit property  has not been initialized |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Afterschool Class, URL=`.../afterschool-class` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | ArrayDeque is empty. |  |  |  |
| latest pagination | SKIP | lateinit property  has not been initialized |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 127/127 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 127/127 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.erofus.com/.../58e52ada0554b9180850817.jpeg` (image/jpeg, 13450 bytes, 350x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../afterschool-class` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.erofus.com/.../58e52ada05b875113693600.jpeg` (image/jpeg, 13505 bytes, 350x300) |  |  |  |
| details author | PASS | BadOnion |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | fantasy, attracted, slut, Teen, seduced, cheating, schoolgirl, school, uniform, young |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.erofus.com/.../58e52ada05b875113693600.jpeg` (image/jpeg, 78321 bytes, 1200x900) |  |  |  |
