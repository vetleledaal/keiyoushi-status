# Extension Validation Report

- Extension: tachiyomi-tr.nemesisscans-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4325951682189741537
- Source name: Nemesisscans
- Source language: tr
- Selected manga input: popular offset 0: The Secret Life of Empress Isana (`.../987`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | The Secret Life of Empress Isana (`.../987`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Tomb Raider King (`.../959`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | The Player Who Can't Level Up (`.../511`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Secret Life of Empress Isana (`.../987`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Secret Life of Empress Isana (`.../987`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 99 | Bölüm 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Secret Life of Empress Isana, URL=`987` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image.nemesisscans.com/.../poster.jpg` (image/jpeg, 131306 bytes, 460x675) |  |  |  |
| details identity | PASS | Details preserved selected URL `987` |  |  |  |
| details thumbnail URL | PASS | `https://image.nemesisscans.com/.../poster.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Fantasy, Romance |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | College student "Sa-Na" wakes up in the Body of "Isana Castilla" of the Titan Empire, sentenced to burn at the stake for practicing witchcraft! A chance encounter with Ludwig, the Crown Prince leads her on a path to become Empress, as she embarks on a journey to help the now Emperor combat evil rivals! What lies in store for the new Empress and her little secret? Will she manage to find her way back home?<br><br>(Source: POCKET COMICS, edited) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 99 chapters |  |  |  |
| chapter dates | PASS | 99 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://image.nemesisscans.com/.../000.webp` (image/webp (encoding: lossy), 108314 bytes, 1280x720) |  |  |  |
