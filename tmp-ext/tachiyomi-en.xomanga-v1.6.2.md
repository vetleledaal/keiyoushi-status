# Extension Validation Report

- Extension: tachiyomi-en.xomanga-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4986437736966387160
- Source name: XoManga
- Source language: en
- Selected manga input: latest offset 0: Anata-tachi Soredemo Sensei Desu ka! (`.../anata-tachi-soredemo-sensei-desu-ka`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | Parallel Paradise (`.../parallel-paradise`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 47 | Anata-tachi Soredemo Sensei Desu ka! (`.../anata-tachi-soredemo-sensei-desu-ka`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Anata-tachi Soredemo Sensei Desu ka! (`.../anata-tachi-soredemo-sensei-desu-ka`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 36.1 (`.../anata-tachi-soredemo-sensei-desu-ka`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 47 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 62/62 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 62/62 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pub-687b4857923449468676585d29183982.r2.dev/.../anata-tachi-soredemo-sensei-desu-ka_cover_1788539408225.jpg` (image/jpeg, 60484 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `anata-tachi-soredemo-sensei-desu-ka` |  |  |  |
| details thumbnail URL | PASS | `https://pub-687b4857923449468676585d29183982.r2.dev/.../anata-tachi-soredemo-sensei-desu-ka_cover_1788539408225.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | One day, school teachers come as freeloaders to the inn run by his parents!? Kazami Hiro, a high school boy, decides to take care of the inn and his future!? |  |  |  |
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
| page load | PASS | `https://pub-687b4857923449468676585d29183982.r2.dev/.../page_0.jpg` (image/jpeg, 706492 bytes, 800x1137) |  |  |  |
