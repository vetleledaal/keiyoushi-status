# Extension Validation Report

- Extension: tachiyomi-en.hentara-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7009504251263254629
- Source name: Hentara
- Source language: en
- Selected manga input: popular offset 0: Teach Me First! (`.../teach-me-first`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 1402 | Teach Me First! (`.../teach-me-first`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 1402 | Please Please (`.../please-please`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Teach Me First! (`.../teach-me-first`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Teach Me First! (`.../teach-me-first`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 21 | Chapter 0 (`.../chapter-0`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 39 |  |  | 1-10s |

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
| popular listing | PASS | 1402 entries |  |  |  |
| latest listing | PASS | 1402 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Teach Me First!, URL=`.../teach-me-first` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 2805/2805 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 2805/2805 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.manhwaepisodes.com/.../thumbnail.webp` (image/webp (encoding: lossy), 223496 bytes, 1280x1826) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../teach-me-first` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.manhwaepisodes.com/.../thumbnail.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Cheating, Married |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | In "Teach me first" Andy and his wife Amber arrive at his parents’ ranch, and Andy is stunned by how much his stepsister Mia has changed. She’s grown into a woman, full of confidence and experiences A |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 21 chapters |  |  |  |
| chapter dates | PASS | 21 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 39 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.manhwaepisodes.com/.../001.jpg` (image/jpeg, 528476 bytes, 1500x5000) |  |  |  |
