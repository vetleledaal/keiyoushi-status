# Extension Validation Report

- Extension: tachiyomi-en.erofus-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 26
- Lint: 4
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3054988613439396424
- Source name: Erofus
- Source language: en
- Selected manga input: latest offset 0: American Dad (`.../american-dad`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | error | 0 |  | kotlin.UninitializedPropertyAccessException: lateinit property  has not been initialized | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 10 | American Dad (`.../american-dad`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 37 | Jennifer and the Short King (`.../jennifer-and-the-short-king`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 160 | Moms Help (`.../moms-help`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | American Dad (`.../american-dad`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../american-dad`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 33 |  |  | <1s |

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
| latest listing | PASS | 10 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 98: title=American Dad, URL=`.../American-Dad` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | lateinit property  has not been initialized |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 207/207 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 207/207 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.erofus.com/.../68e45445039d43139106172.jpeg` (image/jpeg, 28343 bytes, 350x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../american-dad` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.erofus.com/.../68e4544503fe79158729046.jpeg` (image/jpeg, 28343 bytes, 350x300) |  |  |  |
| details author | PASS | Spageta |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.erofus.com/.../68e4544503fe79158729046.jpeg` (image/jpeg, 254082 bytes, 1200x1575) |  |  |  |
