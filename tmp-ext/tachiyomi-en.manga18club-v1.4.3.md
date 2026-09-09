# Extension Validation Report

- Extension: tachiyomi-en.manga18club-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: manga18
- Source ID: 3436561761894030433
- Source name: Manga18.Club
- Source language: en
- Selected manga input: latest offset 0: Mother and Daughter's House Raw (`.../mother-and-daughters-house-raw`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Secret Class (`.../secret-class`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Boarding Diary Uncensored (`.../boarding-diary-uncensored`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Mother and Daughter's House Raw (`.../mother-and-daughters-house-raw`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Cleaning Service (`.../cleaning-service`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Mother and Daughter's House Raw (`.../mother-and-daughters-house-raw`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Mother and Daughter's House Raw (`.../mother-and-daughters-house-raw`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 46 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mother and Daughter's House Raw, URL=`.../mother-and-daughters-house-raw` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.manga18.club/.../cover_thumb_2.webp` (image/jpeg, 7832 bytes, 150x200; server Content-Type: image/webp) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mother-and-daughters-house-raw` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.manga18.club/.../cover_250x350.jpg` (image/jpeg, 17688 bytes, 250x350) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Raw |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Jung Do-yoon, a successful lawyer, takes on the defense of the family who abandoned him as a child. He becomes the "gap" and returns to the "mother-daughter home"... We had a good dinner, so shall we sleep together now?<br><br>Alternative Names:<br>모녀의 집 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 46 chapters |  |  |  |
| chapter dates | PASS | 46 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.manga18.club/.../000.jpg` (image/jpeg, 1378701 bytes, 720x14535) |  |  |  |
