# Extension Validation Report

- Extension: tachiyomi-en.tapastic-v1.4.24
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5554748812413853237
- Source name: Tapas
- Source language: en
- Selected manga input: latest offset 0: I Got MySelf A Boyfriend?! (`.../187918`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 25 | Let's Make Saving a Habit (`.../333768`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 25 | Surviving as the Villainous Younger Sister (`.../333357`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 25 | I Got MySelf A Boyfriend?! (`.../187918`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 25 | Bear with Me (`.../285594`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 10 | I Got MySelf A Boyfriend?! (`.../187918`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | I Got MySelf A Boyfriend?! (`.../187918`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 322 | Cover (`.../1910548`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 2 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Got MySelf A Boyfriend?!, URL=`.../187918` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 110/110 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 110/110 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://story-a.tapas.io/.../7f5ce27a-57ce-4f90-b11e-85173a750246.png` (image/png, 386687 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../187918` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://us-a.tapas.io/.../7f5ce27a-57ce-4f90-b11e-85173a750246_z.jpg` (image/jpeg, 310140 bytes, 400x600) |  |  |  |
| details author | PASS | toseiki |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | BL, Romance, Slice of life, Comedy |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | BL / Romance / Slice of Life / Comedy One day Jung-hoon received a confession from a handsome guy named Byeong Ho... but wait... He's extremely tsun tsun?!! --- Update Schedule : Thursday<br><br>I Got Myself A Boyfriend?! Owned and created by: Toseiki Released October 2020, all rights reserved.<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description, chapter 2 name, chapter 6 name, chapter 9 name, chapter 10 name, chapter 17 name, chapter 18 name, chapter 24 name, chapter 26 name, chapter 28 name, chapter 32 name, chapter 34 name, chapter 35 name, chapter 38 name, chapter 42 name, chapter 44 name, chapter 47 name, chapter 49 name, chapter 51 name, chapter 52 name, chapter 56 name, chapter 57 name, chapter 58 name, chapter 70 name, chapter 72 name, chapter 76 name, chapter 78 name, chapter 81 name, chapter 91 name, chapter 92 name, chapter 94 name, chapter 100 name, chapter 108 name, chapter 109 name, chapter 110 name, chapter 113 name, chapter 115 name, chapter 121 name, chapter 166 name, chapter 202 name, chapter 211 name, chapter 222 name, chapter 223 name |  |  |  |
| chapters | PASS | 322 chapters |  |  |  |
| chapter dates | PASS | 322 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 2 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://us-a.tapas.io/.../5a80c974-4f96-4a91-b848-81bb0bd6c3ea.jpg <redacted query values: __token__ and version>` (image/jpeg, 308253 bytes, 800x1210) |  |  |  |
