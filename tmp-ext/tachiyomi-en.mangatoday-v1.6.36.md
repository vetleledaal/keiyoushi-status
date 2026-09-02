# Extension Validation Report

- Extension: tachiyomi-en.mangatoday-v1.6.36
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 868511056418443637
- Source name: MangaToday
- Source language: en
- Selected manga input: popular offset 0: Secret Class (`.../secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Secret Class (`.../secret-class`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Bleach (`.../bleach_106`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Lost Man (`.../lost-man`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Shippo to Gekirin (`.../shippo-to-gekirin`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Secret Class (`.../secret-class`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class (`.../secret-class`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 322 | Chapter 1 (`.../chapter-1.0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 22 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`.../secret-class` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Shippo to Gekirin, URL=`.../shippo-to-gekirin` at page 1 offset 29 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 115/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thumb.mghcdn.com/.../secret-class.jpg` (image/jpeg, 47833 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-class` |  |  |  |
| details thumbnail URL | PASS | `https://thumb.mghcdn.com/.../secret-class.jpg` |  |  |  |
| details author | PASS | Wang Kang Cheol |  |  |  |
| details artist | PASS | Mina-chan |  |  |  |
| details genres | PASS | Action, Psychological, Romance, Adventure, Drama, Mystery, Incest, Harem, Shota, Long Strip, Web Comic, Full Color, Pornographic |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dae Ho, who became an orphan at the age of 13, was adopted by his father's friend. However, Dae Ho in adulthood knew nothing about the relationship between men and women. Aunt and sisters decided to give pure Dae Ho a secret class...<br><br>Alternative Names:<br>- 비밀수업<br>- 秘密教學<br>- Lezioni Segrete<br>- Секретне навчання<br>- 秘密の授業<br>- Clases Secretas |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 322 chapters |  |  |  |
| chapter dates | PASS | 322 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://imgx.mghcdn.com/.../1.jpg` (image/jpeg, 98815 bytes, 720x880) |  |  |  |
