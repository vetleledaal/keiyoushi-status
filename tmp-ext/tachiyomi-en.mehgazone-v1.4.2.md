# Extension Validation Report

- Extension: tachiyomi-en.mehgazone-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 27
- Lint: 1
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2698265163169248715
- Source name: Mehgazone
- Source language: en
- Selected manga input: popular offset 0: Bodysuit 23 (`https://bodysuit23.mehgazone.com`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 2 | Bodysuit 23 (`https://bodysuit23.mehgazone.com`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Bodysuit 23 (`https://bodysuit23.mehgazone.com`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Bodysuit 23 (`https://bodysuit23.mehgazone.com`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1041 | Bodysuit 23 #1 (`https://bodysuit23.mehgazone.com <redacted query values: p>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 2 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Bodysuit 23, URL=`https://bodysuit23.mehgazone.com` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 3/3 listing manga have titles and URLs; popular: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://bodysuit23.mehgazone.com`, popular entry 2: `https://a-kats-god-awful-blessing.mehgazone.com`, search entry 1: `https://bodysuit23.mehgazone.com` |  |  |  |
| thumbnail URLs | PASS | 3/3 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mehgazone.com/.../918.png` (image/png, 99214 bytes, 300x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `https://bodysuit23.mehgazone.com` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Patricia Barton |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1041 chapters |  |  |  |
| chapter dates | PASS | 1041 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 1041 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://bodysuit23.mehgazone.com/.../bodysuit-scaled.jpg` (image/jpeg, 218211 bytes, 890x2560) |  |  |  |
