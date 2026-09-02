# Extension Validation Report

- Extension: tachiyomi-ar.yokai-v1.6.16
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4337506350787725909
- Source name: Yokai
- Source language: ar
- Selected manga input: popular offset 0: Hunter X Hunter - Digital Colored (`.../hunter-x-hunter-colored.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 4 | Hunter X Hunter - Digital Colored (`.../hunter-x-hunter-colored.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 3 | Hunter x Hunter (`.../hunter-x-hunter.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Hunter X Hunter - Digital Colored (`.../hunter-x-hunter-colored.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Hunter X Hunter - Digital Colored (`.../hunter-x-hunter-colored.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 124 | الفصل 1 (`.../volume-1-chapter-1.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 39 |  |  | 1-10s |

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
| popular listing | PASS | 4 entries |  |  |  |
| latest listing | PASS | 3 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hunter X Hunter - Digital Colored, URL=`.../hunter-x-hunter-colored.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 8/8 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 8/8 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../05pj4a-s.jpg` (image/jpeg, 49641 bytes, 234x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hunter-x-hunter-colored.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../05pj4a-s.jpg` (image/jpeg, 68423 bytes, 500x682) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | TOGASHI Yoshihiro |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Drama, Fantasy, Martial Arts, Psychological, Shounen, Supernatural |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | وحوش غريبة و مخيفة…خزائن من الكنوز السرية, ثروات لم يعثر عليها بعد…أماكن غامضة, حدود لم يسبق استكشافها…”الغموض المجهول”…هنالك سحر في كذا الكلمات…لأولئك المأسورين بالتعويذة. أولئك الذين يطلق عليهم اسم الصيادين<br><br>أسماء أخرى: ハンター×ハンター Hunter Hunter, HUNTER×HUNTER, هنتر x هنتر,القناص |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 9 name, chapter 63 name, chapter 64 name, chapter 65 name, chapter 66 name, chapter 67 name, chapter 68 name, chapter 69 name, chapter 70 name, chapter 71 name, chapter 72 name, chapter 73 name, chapter 74 name, chapter 75 name, chapter 76 name, chapter 77 name, chapter 80 name, chapter 83 name, chapter 84 name, chapter 85 name, chapter 86 name, chapter 87 name, chapter 94 name, chapter 106 name |  |  |  |
| chapters | PASS | 124 chapters |  |  |  |
| chapter dates | PASS | 124 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 39 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../000.jpg` (image/jpeg, 352615 bytes, 1066x1600) |  |  |  |
