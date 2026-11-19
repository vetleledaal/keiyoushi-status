# Extension Validation Report

- Extension: tachiyomi-it.juinjutsuteamreader-v1.6.8
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 3
- Warnings: 0
- Skipped: 6
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: foolslide
- Source ID: 1779918793601923139
- Source name: Juin Jutsu Team Reader
- Source language: it
- Selected manga input: popular offset 0: Four Knights of Apocalypse - Mokushiroku no Yonkishi (`.../four-knights-of-apocalypse-mokushiroku-no-yonkishi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | Four Knights of Apocalypse - Mokushiroku no Yonkishi (`.../four-knights-of-apocalypse-mokushiroku-no-yonkishi`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 1 | Grand Blue (`.../grand-blue`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Four Knights of Apocalypse - Mokushiroku no Yonkishi (`.../four-knights-of-apocalypse-mokushiroku-no-yonkishi`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 261 | Capitolo 1: La partenza del ragazzo (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 70 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 9/9 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | LINT | 0/9 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `.../four-knights-of-apocalypse-mokushiroku-no-yonkishi` |  |  |  |
| details thumbnail URL | PASS | `https://www.juinjutsureader.ovh/.../00.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 261 chapters |  |  |  |
| chapter dates | LINT | 1 of 261 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 70 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.juinjutsureader.ovh/.../00.jpg` (image/jpeg, 778359 bytes, 800x800) |  |  |  |
