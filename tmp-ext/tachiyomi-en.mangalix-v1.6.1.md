# Extension Validation Report

- Extension: tachiyomi-en.mangalix-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2280035516075993115
- Source name: MangaLix
- Source language: en
- Selected manga input: popular offset 0: Teenage Mercenary (`.../teenage-mercenary`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 117 | Teenage Mercenary (`.../teenage-mercenary`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 117 | Sawaranaide Kotesashi-kun (`.../sawaranaide-kotesashi-kun`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Teenage Mercenary (`.../teenage-mercenary`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Teenage Mercenary (`.../teenage-mercenary`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 282 | Teenage Mercenary Chapter 0 (`.../teenage-mercenary-0`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 50 |  |  | <1s |

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
| popular listing | PASS | 117 entries |  |  |  |
| latest listing | PASS | 117 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Teenage Mercenary, URL=`teenage-mercenary` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 235/235 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 235/235 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangalix.com/.../teenage-mercenary-cover.webp` (image/webp (encoding: lossy), 32410 bytes, 345x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `teenage-mercenary` |  |  |  |
| details thumbnail URL | PASS | `https://mangalix.com/.../teenage-mercenary-cover.webp` |  |  |  |
| details author | PASS | YC, Rakhyun |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Drama, School Life, Shonen, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | At the tender age of eight, Ijin Yu was tragically the sole survivor of a horrific airplane crash in a foreign, war-torn land. To survive in this brutal environment, he was forced to become a child mercenary, undergoing years of grueling, life-threatening combat training and participating in countless deadly missions. After ten years of living as a highly lethal ghost in the underworld, he finally manages to escape and returns to his home country of South Korea to reunite with his remaining family - his grandfather and younger sister, Dayun. Eager to live a peaceful, normal life, Ijin enrolls in high school. However, he quickly discovers that the school is a different kind of battlefield, plagued by ruthless bullies and corrupt, wealthy students who prey on the weak. When his beloved sister becomes a target, Ijin's deeply ingrained mercenary instincts resurface. Utilizing his overwhelmingly superior combat skills, tactical genius, and lethal precision, he systematically dismantles anyone who threatens his family's peace. 'Teenage Mercenary' (also known as Mercenary Enrollment) is a phenomenal action webtoon that brilliantly contrasts the mundanity of school life with breathtakingly intense, professional-grade combat. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 282 chapters |  |  |  |
| chapter dates | PASS | 282 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://images.mangafreak.me/.../mercenary_enrollment_0_1.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
