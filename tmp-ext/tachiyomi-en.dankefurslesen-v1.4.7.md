# Extension Validation Report

- Extension: tachiyomi-en.dankefurslesen-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 3
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 370316150648855996
- Source name: Danke fürs Lesen
- Source language: en
- Selected manga input: latest offset 0: The 100 Girlfriends Who Really, Really, Really, Really, Really Love You (`.../100-girlfriends`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 656 | "When you're crossdressing, what do you do about your underwear?" (`.../xdress-underwear`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 651 | The 100 Girlfriends Who Really, Really, Really, Really, Really Love You (`.../100-girlfriends`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The 100 Girlfriends Who Really, Really, Really, Really, Really Love You (`.../100-girlfriends`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | The 100 Girlfriends Who Really, Really, Really, Really, Really Love You (`.../100-girlfriends`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 296 | 1 - Hanazono-san and Inda-san (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 60 |  |  | <1s |

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
| popular listing | PASS | 656 entries |  |  |  |
| latest listing | PASS | 651 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The 100 Girlfriends Who Really, Really, Really, Really, Really Love You, URL=`100-girlfriends` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 1308/1308 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1308/1308 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://danke.moe/.../92386.jpg` (image/jpeg, 773958 bytes, 1350x1920) |  |  |  |
| details identity | PASS | Details preserved selected URL `100-girlfriends` |  |  |  |
| details thumbnail URL | PASS | `https://danke.moe/.../92386.jpg` |  |  |  |
| details author | PASS | Nakamura Rikito |  |  |  |
| details artist | PASS | Nozawa Yukiko |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Aijo Rentaro has asked a hundred girls out and struck out every time. In desperation, he prays for guidance, only to be told by a god that his rejections were due to a cosmic mishap! Now this god will set things right by making sure Aijo gets one hundred dates. Except, as things often go with gods, there’s a catch: each of his one hundred dates is Aijo’s destined soulmate! Worse, if he doesn’t return their feelings, they’ll all die in horrible - and hilarious - accidents! Spinoff: |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 188 name |  |  |  |
| chapters | PASS | 296 chapters |  |  |  |
| chapter dates | PASS | 296 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 60 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://danke.moe/.../01.jpg` (image/jpeg, 865310 bytes, 850x1200) |  |  |  |
