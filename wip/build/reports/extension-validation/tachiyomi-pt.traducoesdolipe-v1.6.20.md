# Extension Validation Report

- Extension: tachiyomi-pt.traducoesdolipe-v1.6.20
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 3650511144741653873
- Source name: Traduções do Lipe
- Source language: pt-BR
- Selected manga input: popular offset 0: Yamisu (`.../yamisu.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Yamisu (`.../yamisu.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Melodramatic (`.../melodramatic.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Yamisu (`.../yamisu.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Yamisu (`.../yamisu.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | one shot (`.../one-shot.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Yamisu, URL=`.../yamisu.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../1.jpg` (image/jpeg, 47963 bytes, 600x878) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../yamisu.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../1.jpg` (image/jpeg, 111717 bytes, 1094x1600) |  |  |  |
| details author | PASS | Tagame Gengoroh |  |  |  |
| details artist | PASS | Tagame Gengoroh |  |  |  |
| details genres | PASS | Gore |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Uma coleção de contos de terror que retratam os medos cotidianos |  |  |  |
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
| page load | PASS | `https://blogger.googleusercontent.com/.../1.jpg` (image/jpeg, 111717 bytes, 1094x1600) |  |  |  |
