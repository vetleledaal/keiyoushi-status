# Extension Validation Report

- Extension: tachiyomi-en.hachirumi-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 593241987912872030
- Source name: Hachirumi
- Source language: en
- Selected manga input: latest offset 0: Earth Recording 0001 (`.../earth-recording-0001`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 110 | A Boy And His Crossdressing Older Brother (`.../a-boy-and-his-crossdressing-older-brother`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 109 | Earth Recording 0001 (`.../earth-recording-0001`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Earth Recording 0001 (`.../earth-recording-0001`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Earth Recording 0001 (`.../earth-recording-0001`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 4 | 1 - Oneshot (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 62 |  |  | 1-10s |

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
| popular listing | PASS | 110 entries |  |  |  |
| latest listing | PASS | 109 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Earth Recording 0001, URL=`earth-recording-0001` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 220/220 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 220/220 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hachirumi.com/.../31766.jpg` (image/jpeg, 354487 bytes, 1041x1653) |  |  |  |
| details identity | PASS | Details preserved selected URL `earth-recording-0001` |  |  |  |
| details thumbnail URL | PASS | `https://hachirumi.com/.../31766.jpg` |  |  |  |
| details author | PASS | Toru Kuramori |  |  |  |
| details artist | PASS | Toru Kuramori |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Astronaut Mawatari encounters a humanoid creature during a moon surface investigation. Because they are both lonely, they promise to teach each other about the universe and the earth...!? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 62 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://hachirumi.com/.../01.png <redacted query values: v2>` (image/png, 1110409 bytes, 1644x2400) |  |  |  |
