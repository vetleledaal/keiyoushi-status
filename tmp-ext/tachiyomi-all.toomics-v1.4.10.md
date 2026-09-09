# Extension Validation Report

- Extension: tachiyomi-all.toomics-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 7004582542854505662
- Source name: Toomics (Only free chapters)
- Source language: en
- Selected manga input: popular offset 0: The Chill Couple (`.../Y`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 298 | The Chill Couple (`.../Y`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 11 | Tamer Knight : Frontier Defense (`.../Y`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Chill Couple (`.../Y`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Chill Couple (`.../Y`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 3 | 1 - The Chill Couple (`.../5059`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 52 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 298 entries |  |  |  |
| latest listing | PASS | 11 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Chill Couple, URL=`.../Y` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 310/310 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 310/310 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thumb-g1.toomics.com/.../2019_07_03_15621342982250.jpg` (image/jpeg, 45316 bytes, 270x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../Y` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://thumb-g1.toomics.com/.../2019_07_03_15621342945501.png <redacted query values: v>` (image/png, 28000 bytes, 250x250) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | A couple can't be more chill than this! Come take a look into their lives inside and outside of school. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://toon-g1.toomics.com/.../8fIMm0-tfuq1R6AV8cjh_2egENgWeCgH1pXU3zTQFtIxC04k2D1yYI3ph52aQkgAWfHCupTBISxOP3HzGEb9tN5VS_3f3aggVwbjkxQL4Qk <redacted query values: time, code, and tri>` (image/jpeg, 30756 bytes, 720x500) |  |  |  |
