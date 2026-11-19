# Extension Validation Report

- Extension: tachiyomi-en.manhwa18dash-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 964627071039073400
- Source name: Manhwa18Dash
- Source language: en
- Selected manga input: popular offset 0: The Professor's Secret Account (`.../the-professors-secret-account`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 249 | The Professor's Secret Account (`.../the-professors-secret-account`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 249 | Currently Filming (`.../currently-filming`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Professor's Secret Account (`.../the-professors-secret-account`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Professor's Secret Account (`.../the-professors-secret-account`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 55 | Chapter 1 (`.../chapter-Bolum_01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 45 |  |  | <1s |

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
| popular listing | PASS | 249 entries |  |  |  |
| latest listing | PASS | 249 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Professor's Secret Account, URL=`.../the-professors-secret-account` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 499/499 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 499/499 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.manhwa18dash.com/.../cover.webp` (image/webp (encoding: lossy), 33352 bytes, 700x934) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-professors-secret-account` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.manhwa18dash.com/.../cover.webp` |  |  |  |
| details author | PASS | Lezhin |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Adventure, Mature, School Life, Milf |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★✬ 4.4 (7)<br>2025<br><br>After finishing his military service, he returns to college wanting nothing more than an ordinary student life. Instead, he is forced to sit through a lecture by Professor Hayoung, the same woman who once treated him unfairly. While enduring her class, he accidentally discovers her secret account, and the balance between them shifts. What begins as simple resentment turns into an uneasy kind of leverage and attractions neither of them expected. A mature campus drama for adult readers, built around power dynamics, secrets and the tension of one discovery changing the whole classroom.<br><br>**Alternative Names:**<br>- The Secret Account of the Female Professor<br>- Yeogyosuui Bimilgyejeong<br>- 여교수의 비밀계정 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 55 chapters |  |  |  |
| chapter dates | PASS | 55 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://manhwa18dash.com/.../chapter-Bolum_01` to `https://manhwa18dash.com/.../chapter-01` (1 redirects) |  |  |  |
| page load | PASS | `https://cdn.manhwa18dash.com/.../001.webp` (image/webp (container: extended), 261970 bytes, 800x5000) |  |  |  |
