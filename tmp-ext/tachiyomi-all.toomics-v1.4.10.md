# Extension Validation Report

- Extension: tachiyomi-all.toomics-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 1
- Warnings: 2
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 7004582542854505662
- Source name: Toomics (Only free chapters)
- Source language: en
- Selected manga input: popular offset 0: Survival Marriage (`.../Y`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 298 | Survival Marriage (`.../Y`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 11 | Tamer Knight : Frontier Defense (`.../Y`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Survival Marriage (`.../Y`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Survival Marriage (`.../Y`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 4 | 1 - Survival Marriage (`.../6585`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 156 |  |  | 1-10s |

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
| popular listing | PASS | 298 entries |  |  |  |
| latest listing | PASS | 11 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Survival Marriage, URL=`.../Y` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 311/311 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 310/311 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thumb-g1.toomics.com/.../2022_05_04_16516541888893.jpg` (image/jpeg, 45357 bytes, 270x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../Y` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://thumb-g1.toomics.com/.../2022_05_04_16516541873017.jpg <redacted query values: v>` (image/jpeg, 22967 bytes, 250x250) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | "By any chance, have we... met before?" Next to impossible coincidences seem to be connected to a shared dream… Is this destiny? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 156 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://toon-g1.toomics.com/.../F91mrGTU-9MP4WlW3MCyrHCYiXS15A_k2xIh6_nG_kT42huaDVvoIS95ExuisgsK381EeqL3ivpUpdgzgcAs5I6FuE3wk5_Kzal9AcxvonU <redacted query values: time, code, and tri>` (image/jpeg, 7200 bytes, 720x500) |  |  |  |
