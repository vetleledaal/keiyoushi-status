# Extension Validation Report

- Extension: tachiyomi-ja.comicborder-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 25
- Lint: 1
- Warnings: 1
- Skipped: 9
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1077630719925082256
- Source name: Comic Border
- Source language: ja
- Selected manga input: popular offset 0: ボクとおば〜のフシギな話 (`.../12207421984090628870`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 48 | ボクとおば〜のフシギな話 (`.../12207421984090628870`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.UnsupportedOperationException | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | ボクとおば〜のフシギな話 (`.../12207421984090628870`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 73 | 第一怪　大事なお家 (`.../3270375685374335502`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | SKIP | search operation did not complete successfully |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 48/48 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 48/48 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.comicborder.com/.../3270375685374334717-4a1bb9b3f7f5d6d0ccadbbe8a59f31f2 <redacted query values: 1784090657>` (image/jpeg, 4031945 bytes, 2917x1625) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12207421984090628870` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.comicborder.com%2Fpublic%2Fseries-thumbnail%2F3270375685374334717-4a1bb9b3f7f5d6d0ccadbbe8a59f31f2%3F1784090657` (image/jpeg, 60931 bytes, 484x270) |  |  |  |
| details author | PASS | 杉作 / ヤースー |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | ユタの祖母を持つ、芸人であり新進気鋭の怪談師でもある「ヤースー」の多感な霊感少年時代を『クロ號』『猫なんかよんでもこない。』『漁港の肉子ちゃん』等で知られる「杉作」が優しく、恐く、アットホームに描く!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 73 chapters |  |  |  |
| chapter dates | PASS | 73 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn-img.comicborder.com/.../3270375685468975954-c42427aa819364a4ec14976c79924c8b` (image/jpeg, 272992 bytes, 914x1300) |  |  |  |
