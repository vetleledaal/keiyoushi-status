# Extension Validation Report

- Extension: tachiyomi-en.darthsdroids-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 27
- Lint: 0
- Warnings: 0
- Skipped: 9
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1395072850055110585
- Source name: Darths & Droids
- Source language: en
- Selected manga input: popular offset 0: Darths & Droids I. The Phantasmal Malevolence (`.../archive1.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 13 | Darths & Droids I. The Phantasmal Malevolence (`.../archive1.html`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.UnsupportedOperationException | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Darths & Droids I. The Phantasmal Malevolence (`.../archive1.html`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 208 | Episode 1: The Saga Begins (`.../0001.html`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | SKIP | java.lang.UnsupportedOperationException |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 13 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | SKIP | search operation did not complete successfully |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 13/13 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 13/13 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.darthsanddroids.net/.../QuiGon.jpg` (image/jpeg, 38919 bytes, 160x160) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../archive1.html` |  |  |  |
| details thumbnail URL | PASS | `https://www.darthsanddroids.net/.../QuiGon.jpg` |  |  |  |
| details author | PASS | David Morgan-Mar & Co. |  |  |  |
| details artist | PASS | David Morgan-Mar & Co. |  |  |  |
| details genres | PASS | Campaign Comic, Comedy, Space Opera, Science Fiction |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | What if Star Wars as we know it didn't exist, but instead the<br>plot of the movies was being made up on the spot by players of<br>a Tabletop Game?<br><br>Well, for one, the results might actually make a lot more sense,<br>from an out-of-story point of view… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 208 chapters |  |  |  |
| chapter dates | PASS | 208 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.darthsanddroids.net/.../darths0001.jpg` (image/jpeg, 172277 bytes, 600x800) |  |  |  |
