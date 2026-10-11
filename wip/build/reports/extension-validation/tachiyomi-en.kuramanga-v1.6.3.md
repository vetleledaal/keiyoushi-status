# Extension Validation Report

- Extension: tachiyomi-en.kuramanga-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 0
- Warnings: 2
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7076475127850729187
- Source name: KuraManga
- Source language: en
- Selected manga input: popular offset 0: I’ll Be The Matriarch In This Life (`.../illbethematriarchinthislife`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | I’ll Be The Matriarch In This Life (`.../illbethematriarchinthislife`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 23 | The Hand That Once Fed (`.../thehandthatoncefed`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 23 | Love Comes on a Moonlit Night (`.../lovecomesonamoonlitnight`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | I Shall Master This Family (`.../ishallmasterthisfamily`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I’ll Be The Matriarch In This Life (`.../illbethematriarchinthislife`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 256 | Chapter 0 (`.../chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 23 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=I’ll Be The Matriarch In This Life, URL=`.../illbethematriarchinthislife` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Finding My Angel, URL=`.../findingmyangel` at page 1 offset 21 and page 2 offset 7, title=Monochrome Rumor, URL=`.../monochromerumor` at page 1 offset 22 and page 2 offset 19 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 58/58 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 58/58 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://shadowabyss.com/.../cover.jpg <redacted query values: class>` (image/jpeg, 136721 bytes, 500x715) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../illbethematriarchinthislife` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://shadowabyss.com/.../cover.jpg` (image/jpeg, 234332 bytes, 720x1030) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasy, Historical, Shoujo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Florentia was born illegitimate into the wealthiest family in the empire and spent years grateful for the scraps of it. Then her father died, the relatives left her on a doorstep, and the great house she had been so proud of collapsed completely. She drank about it. A carriage finished the job. Now she is seven, everything is standing again... and the Second Prince who ruined her family last time will not stop following her around! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 256 chapters |  |  |  |
| chapter dates | PASS | 256 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://shadowabyss.com/.../0001.jpg` (image/jpeg, 725552 bytes, 720x8100) |  |  |  |
