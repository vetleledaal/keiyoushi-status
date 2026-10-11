# Extension Validation Report

- Extension: tachiyomi-en.mangaeclipse-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 5229341270935044914
- Source name: Manga Eclipse
- Source language: en
- Selected manga input: popular offset 0: Great Heaven Sovereign (`.../2185`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 17 | Great Heaven Sovereign (`.../2185`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 17 | I Desire To Be Carefree (`.../2264`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Great Heaven Sovereign (`.../2185`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Great Heaven Sovereign (`.../2185`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 57 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | <1s |

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
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | PASS | 17 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Great Heaven Sovereign, URL=`2185` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 35/35 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 35/35 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangaeclipse.com/.../Musings-of-a-foreigner-in-Japan-by-Taylor-Alonso-1.png` (image/png, 2508197 bytes, 1410x2250) |  |  |  |
| details identity | PASS | Details preserved selected URL `2185` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangaeclipse.com/.../Musings-of-a-foreigner-in-Japan-by-Taylor-Alonso-1-193x278.png` (image/png, 94675 bytes, 193x278) |  |  |  |
| details author | PASS | Evergreen |  |  |  |
| details artist | PASS | EVERGREEN |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Fantasy, Manhua, Martial Arts |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Great Heaven Sovereign Read Online Now<br><br>Former days are but an old dream a time traveller who keeps on being reborn, Tan Yun a great demon of the world that acts as his heart pleases, he has no need to hold back as he pursues his ultimate goals. In a world of cruelty. tanyun must rise up above all with his own power<br><br>Great Heaven Sovereign Manga Read Online Now<br><br>Great Heaven Sovereign Manhua Read Online Now<br><br>Alternative Names: Great Heaven Daoist |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 57 chapters |  |  |  |
| chapter dates | PASS | 57 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mangaeclipse.com/.../0-(1).png` (image/png, 2508197 bytes, 1410x2250) |  |  |  |
