# Extension Validation Report

- Extension: tachiyomi-en.toonilyme-v1.6.10
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangak
- Source ID: 1581110056159285576
- Source name: ToonTop
- Source language: en
- Selected manga input: popular offset 0: Secret Class (`.../secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Secret Class (`.../secret-class`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | College Grades Skyrocketing (`.../college-grades-skyrocketing`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Pick Me Up (`.../pick-me-up`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Pick Up a Grimoire, Become a Mage (`.../pick-up-a-grimoire-become-a-mage`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | Secret Class (`.../secret-class`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class (`.../secret-class`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 337 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`.../secret-class` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rx.toontop.io/.../c7acb681c06e.webp` (image/webp (encoding: lossy), 9594 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-class` |  |  |  |
| details thumbnail URL | PASS | `https://rx.toontop.io/.../c7acb681c06e.webp` |  |  |  |
| details author | PASS | Wang Kang Cheol, Gang-cheol Wang |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Drama, Mature, Milf, Romance, Seinen, Vanilla, Comedy, Harem, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★★ 5 (1)<br>2019<br><br>Dae Ho, who became an orphan at the age of 13, was adopted by his father’s friend. However, Dae Ho in adulthood knew nothing about the relationship between men and women. Aunt and sisters decided to give pure Dae Ho a secret class…<br><br>**Alternative Names:**<br>- Bimilsueop<br>- 비밀 수업<br>- 秘密教學<br>- Clases secretas<br>- Secret Teaching<br>- 비밀수업<br>- 秘密教学<br>- 秘密の授業<br>- Kelas Rahasia<br>- Bi mi jiao xue<br>- Enseñanza Secreta<br>- Cuck Class |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 337 chapters |  |  |  |
| chapter dates | PASS | 337 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://rx.toontop.io/.../fe7796eca78f.webp` (image/webp (encoding: lossy), 250134 bytes, 858x9600) |  |  |  |
