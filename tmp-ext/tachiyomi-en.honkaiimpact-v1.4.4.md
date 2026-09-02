# Extension Validation Report

- Extension: tachiyomi-en.honkaiimpact-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 27
- Lint: 2
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5652636928388608981
- Source name: Honkai Impact 3rd
- Source language: en
- Selected manga input: popular offset 0: Elan Palatinus (`.../1011`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 22 | Elan Palatinus (`.../1011`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Elan Palatinus (`.../1011`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Elan Palatinus (`.../1011`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 14 | 00 History (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 18 |  |  | <1s |

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
| popular listing | PASS | 22 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Elan Palatinus, URL=`.../1011` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 23/23 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 23/23 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://act-webstatic.hoyoverse.com/.../1011.jpg` (image/png, 319189 bytes, 430x330) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1011` |  |  |  |
| details thumbnail URL | PASS | `https://act-webstatic.hoyoverse.com/.../1011.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | In the Year of our Lord 1470, Schicksal rallied the princes of Europe and unleashed a Crusade to conquer the Far East, only to be defeated by an immortal warrior. Kallen Kaslana, a powerful Valkyrie warrior, must make a choice between love and her oath. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 14 chapters |  |  |  |
| chapter dates | LINT | 3 of 14 chapters lack a usable source upload timestamp: -62170160400000 (unexpected negative value)=3 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://act-webstatic.hoyoverse.com/.../0001.jpg` (image/jpeg, 194652 bytes, 800x1131) |  |  |  |
