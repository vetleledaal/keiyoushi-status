# Extension Validation Report

- Extension: tachiyomi-all.coomer-v1.4.24
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 33
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8715899195746116471
- Source name: Coomer
- Source language: all
- Selected manga input: popular offset 0: belledelphine (`.../belledelphine`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | belledelphine (`.../belledelphine`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 50 | hidorirose (`.../hidorirose`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 50 | zara_sky (`.../zara_sky`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 50 | jazmynedayvips (`.../jazmynedayvips`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | belledelphine (`.../belledelphine`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | belledelphine (`.../belledelphine`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 45 | What this little kitten gets upto after dark… 🌙  If you’re i.. (`.../1050820125`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 39 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=belledelphine, URL=`.../belledelphine` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.coomer.st/.../belledelphine` (image/jpeg, 3572 bytes, 160x160) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../belledelphine` |  |  |  |
| details thumbnail URL | PASS | `https://img.coomer.st/.../belledelphine` |  |  |  |
| details author | PASS | OnlyFans |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | You can change how many posts to load in the extension preferences. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 17 name, chapter 25 name, chapter 26 name, chapter 28 name, chapter 31 name, chapter 33 name, chapter 36 name, chapter 45 name |  |  |  |
| chapters | PASS | 45 chapters |  |  |  |
| chapter dates | PASS | 45 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 39 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://coomer.st/.../af53de7b9b3d669821b9616f2a857fc0dd095702d7f73652334eaa7119068080.jpg <redacted query values: f>` could not be downloaded: java.io.EOFException: SSL peer shut down incorrectly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
