# Extension Validation Report

- Extension: tachiyomi-all.comicfury-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.g
- Source ID: 6251704791239468278
- Source name: Comic Fury
- Source language: en
- Selected manga input: popular offset 0: Golden Shrike (`.../comicprofile.php <redacted query values: url>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Golden Shrike (`.../comicprofile.php <redacted query values: url>`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | PMD: Wildfire (`.../comicprofile.php <redacted query values: url>`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | STIGS (`.../comicprofile.php <redacted query values: url>`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Hopefulness (`.../comicprofile.php <redacted query values: url>`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 30 | Golden Shrike (`.../comicprofile.php <redacted query values: url>`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Golden Shrike (`.../comicprofile.php <redacted query values: url>`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 385 | Prologue - 1 (`.../1079247`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Golden Shrike, URL=`.../comicprofile.php <redacted query values: url>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 150/150 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 150/150 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://comicfury.com/.../default-avatar-dark.svg` -> 2 manga URLs (examples: `.../comicprofile.php <redacted query values: url>`, `.../comicprofile.php <redacted query values: url>`) |  |  |  |
| thumbnail | PASS | `https://comicfury.com/.../44213_1753955991b70059c400d400f904722847.webp` (image/webp (encoding: lossy), 11990 bytes, 400x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../comicprofile.php <redacted query values: url>` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | doeprince |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy, Animal, Adventure, Deer |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Something has shifted in the world. Sheltered deer twins, Runi and Nero, will get to see it all unfold. Updates on Thursdays. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 385 chapters |  |  |  |
| chapter dates | PASS | 385 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.comicfury.com/.../44213a1575546554f1110480848.png` (image/png, 1333415 bytes, 982x1491) |  |  |  |
