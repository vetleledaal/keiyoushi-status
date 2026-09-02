# Extension Validation Report

- Extension: tachiyomi-en.culturedworks-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1019943013243665332
- Source name: CulturedWorks
- Source language: en
- Selected manga input: latest offset 0: Mercenary Enrollment (`.../mercenary-enrollment`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 13 | Mercenary Enrollment (`.../mercenary-enrollment`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 13 | Mercenary Enrollment (`.../mercenary-enrollment`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Mercenary Enrollment (`.../mercenary-enrollment`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Mercenary Enrollment (`.../mercenary-enrollment`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 43 | Chapter 161 (`.../mercenary-enrollment-chapter-161`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| details description | PASS | At the age of eight, Ijin Yu lost his parents in a plane crash and became stranded in a foreign land, forced to become a child mercenary in order to stay alive. He returns home ten years later to be reunited with his family in Korea, where food and shelter are plenty and everything seems peaceful. But Ijin will soon learn that life as a teenager is a whole other feat of survival. With only one year of high school left, Ijin must master new tactics to maneuver his way around the schoolhouse battleground. Can he survive a year of high school? Or rather, will the school be able to survive him?Original Webtoon:<br><br>Alternative Names: Teenage Mercenary, High School Mercenary (French), High School Soldier (Indonesian), Mercenario adolescente, Mercenary Enrollment, Söldnereinschreibung, Tentara Menyamar Jadi Anak SMA, พี่ชายสายบอดี้การ์ด, 入学傭兵, 入學傭兵, 少年佣兵, 입학용병 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 43 chapters |  |  |  |
| chapter dates | PASS | 43 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://yuucdn.org/.../00.jpg` (image/jpeg, 2138480 bytes, 2551x3579) |  |  |  |
