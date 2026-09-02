# Extension Validation Report

- Extension: tachiyomi-en.grrlpower-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 26
- Lint: 0
- Warnings: 0
- Skipped: 10
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1991252499508931836
- Source name: Grrl Power Comic
- Source language: en
- Selected manga input: popular offset 0: Grrl Power (`.../archive`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 1 | Grrl Power (`.../archive`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.UnsupportedOperationException | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Grrl Power (`.../archive`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1506 | Grrl Power #1 – The Begininging (`.../gp0001`) |  | 1-10s |
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
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | SKIP | search operation did not complete successfully |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 1/1 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1/1 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.tvtropes.org/.../rsz_grrl_power.png` (image/jpeg, 46820 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../archive` |  |  |  |
| details thumbnail URL | PASS | `https://static.tvtropes.org/.../rsz_grrl_power.png` |  |  |  |
| details author | PASS | David Barrack |  |  |  |
| details artist | PASS | David Barrack |  |  |  |
| details genres | PASS | superhero, humor, action |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Grrl Power is a comic about a crazy nerdette that becomes a superheroine. Humor, action, cheesecake, beefcake, 'explosions, and maybe some drama. Possibly ninjas. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1506 chapters |  |  |  |
| chapter dates | PASS | 1506 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.grrlpowercomic.com/.../2010-08-23-GP0001.jpg` (image/jpeg, 265851 bytes, 643x1000) |  |  |  |
