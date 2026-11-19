# Extension Validation Report

- Extension: tachiyomi-en.kemonocafe-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8676020771282634711
- Source name: Kemono Café
- Source language: en
- Selected manga input: popular offset 0: The Eye of Ramalach (`.../theeye`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 19 | The Eye of Ramalach (`.../theeye`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Eye of Ramalach (`.../theeye`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Eye of Ramalach (`.../theeye`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 15 | The Old Journal (`.../theeye-page01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 19 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Eye of Ramalach, URL=`.../theeye` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 20/20 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 20/20 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kemono.cafe/.../comic_link_05.png` (image/png, 40894 bytes, 130x180) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../theeye` |  |  |  |
| details thumbnail URL | PASS | `https://kemono.cafe/.../comic_link_05.png` |  |  |  |
| details author | PASS | Avencri |  |  |  |
| details artist | PASS | Avencri |  |  |  |
| details genres | PASS | Adventure |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Historian Ronald Rudentof has spent his entire life trying to escape his father's shadow. But while attempting to solve the last mystery his father left behind, Ron's life was changed forever. Now permanently bonded to an ancient demigod named Ramalach that has taken residence inside his forehead, Ron finds himself trapped between forces determined to either destroy Ramalach, or use him for their own sinister purposes. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 15 chapters |  |  |  |
| chapter dates | PASS | 15 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://theeye.kemono.cafe/.../2014-01-01TheEye_page01.png` (image/png, 640959 bytes, 630x800) |  |  |  |
