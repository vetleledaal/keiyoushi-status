# Extension Validation Report

- Extension: tachiyomi-en.kuramanga-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 29
- Lint: 1
- Warnings: 2
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7076475127850729187
- Source name: KuraManga
- Source language: en
- Selected manga input: latest offset 0: A Tree Without Roots (`.../atreewithoutroots`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 0 |  |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 18 | 'Til Debt Do Us Part (`.../tildebtdouspart`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 33 | A Tree Without Roots (`.../atreewithoutroots`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | A Tree Without Roots (`.../atreewithoutroots`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | A Tree Without Roots (`.../atreewithoutroots`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 65 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 72 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest listing | PASS | 33 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Tree Without Roots, URL=`.../atreewithoutroots` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 has no manga to check |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 52/52 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 33/52 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://shadowabyss.com/.../cover.webp <redacted query values: class>` (image/webp (encoding: lossy), 15518 bytes, 200x267) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../atreewithoutroots` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://shadowabyss.com/.../cover.webp` (image/webp (encoding: lossy), 119218 bytes, 840x1120) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Drama, Slice of Life, Romance, Mystery, Thriller, Smut, Mature, Psychological, Violence, Boys Love |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 65 chapters |  |  |  |
| chapter dates | PASS | 65 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 72 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://shadowabyss.com/.../0001.webp` (image/webp (encoding: lossy), 220514 bytes, 1280x3280) |  |  |  |
