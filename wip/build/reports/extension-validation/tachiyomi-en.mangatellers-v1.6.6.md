# Extension Validation Report

- Extension: tachiyomi-en.mangatellers-v1.6.6
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 1
- Warnings: 2
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: foolslide
- Source ID: 3478835885302345699
- Source name: Mangatellers
- Source language: en
- Selected manga input: popular offset 0: Kingdoms of Dreams (`.../kingdoms-of-dreams`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | Kingdoms of Dreams (`.../kingdoms-of-dreams`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 8 | Kingdoms of Dreams (`.../kingdoms-of-dreams`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 4 | Sphere of Salvation. (S.o.S) (`.../sphere_of_salvation_sos`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kingdoms of Dreams (`.../kingdoms-of-dreams`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kingdoms of Dreams (`.../kingdoms-of-dreams`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1: Part #1 (PREVIEW) (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 8 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kingdoms of Dreams, URL=`.../kingdoms-of-dreams` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=WiFi Wars, URL=`.../wifi_wars` at page 1 offset 1 and page 2 offset 3, title=R.u.N., URL=`.../run` at page 1 offset 3 and page 2 offset 2, title=Sphere of Salvation. (S.o.S), URL=`.../sphere_of_salvation_sos` at page 1 offset 4 and page 2 offset 0, title=Thessaloniki Through Time, URL=`.../thessaloniki_through_time` at page 1 offset 6 and page 2 offset 1 |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 2 manga entries: title=Mythos, URL=`.../mythos` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 19/19 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 6/19 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://reader.mangatellers.gr/.../Cover01.jpg` (image/jpeg, 802476 bytes, 1438x2034) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kingdoms-of-dreams` |  |  |  |
| details thumbnail URL | PASS | `https://reader.mangatellers.gr/.../Cover01.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | After a devastating world war, the Kingdoms of Dreams, continue to exist, because of the peace treaties that they have signed. The victorious Kingdoms have become stronger, while the defeated Kingdoms try to survive. War refugees have been moving from one Kingdom to another, trying to survive through hardships, facing discrimination and becoming victims of exploitation. In such dangerous times, Mugen, a 14-year-old war refugee lives in the victorious Kingdom of Togars. Togars is a proud race, that treats foreigners with hostility, as they don't want them in their Kingdom. Mugen faces most of the time bullying and discrimination by his classmates, while he tries to pursue his own goals. In a world where dreams are used as weapons and allies can't be distinguished from foes, Mugen has to survive a final trial and become the next Dream Chaser. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://reader.mangatellers.gr/.../Cover01.jpg` (image/jpeg, 414326 bytes, 1438x2034) |  |  |  |
