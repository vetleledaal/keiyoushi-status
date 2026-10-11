# Extension Validation Report

- Extension: tachiyomi-en.culturedworks-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1019943013243665332
- Source name: CulturedWorks
- Source language: en
- Selected manga input: popular offset 0: Mercenary Enrollment (`.../mercenary-enrollment`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 13 | Mercenary Enrollment (`.../mercenary-enrollment`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 13 | Mercenary Enrollment (`.../mercenary-enrollment`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Mercenary Enrollment (`.../mercenary-enrollment`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mercenary Enrollment (`.../mercenary-enrollment`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 43 | Chapter 161 (`.../mercenary-enrollment-chapter-161`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 10s+ |

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
| popular listing | PASS | 13 entries |  |  |  |
| latest listing | PASS | 13 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mercenary Enrollment, URL=`.../mercenary-enrollment` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 27/27 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 27/27 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://culturedworks.com/.../75e7fac6-c9f4-43ce-ae0e-cbf06f28f99b.jpg` (image/jpeg, 57398 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mercenary-enrollment` |  |  |  |
| details thumbnail URL | PASS | `https://culturedworks.com/.../75e7fac6-c9f4-43ce-ae0e-cbf06f28f99b.jpg` |  |  |  |
| details author | PASS | YC |  |  |  |
| details artist | PASS | Rakhyun |  |  |  |
| details genres | PASS | Action, Drama, School life, Shounen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | At the age of eight, Ijin Yu lost his parents in a plane crash and became stranded in a foreign land, forced to become a child mercenary in order to stay alive. He returns home ten years later to be reunited with his family in Korea, where food and shelter are plenty and everything seems peaceful. But Ijin will soon learn that life as a teenager is a whole other feat of survival. With only one year of high school left, Ijin must master new tactics to maneuver his way around the schoolhouse battleground. Can he survive a year of high school? Or rather, will the school be able to survive him?Original Webtoon:<br><br>Alternative Names: <br>- Teenage Mercenary<br>- High School Mercenary (French)<br>- High School Soldier (Indonesian)<br>- Mercenario adolescente<br>- Mercenary Enrollment<br>- Söldnereinschreibung<br>- Tentara Menyamar Jadi Anak SMA<br>- พี่ชายสายบอดี้การ์ด<br>- 入学傭兵<br>- 入學傭兵<br>- 少年佣兵<br>- 입학용병 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 43 chapters |  |  |  |
| chapter dates | PASS | 43 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://yuucdn.org/.../00.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 522 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
