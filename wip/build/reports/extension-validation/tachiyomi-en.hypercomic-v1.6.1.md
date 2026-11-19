# Extension Validation Report

- Extension: tachiyomi-en.hypercomic-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 2
- Warnings: 1
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 793310137619152855
- Source name: HYPERCOMIC
- Source language: en
- Selected manga input: popular offset 0: Moon Shark : From Underwater Princess to Celebrity (`.../1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Moon Shark : From Underwater Princess to Celebrity (`.../1`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | The Special Agent With Negative EQ Reincarnated As A Student And Became Popular With The Ladies?! (`.../1`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | The Crown Prince Lost His Mind (`.../1`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Moon Shark : From Underwater Princess to Celebrity (`.../1`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Moon Shark : From Underwater Princess to Celebrity (`.../1`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 66 | Ep. 01 (`.../asc`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Moon Shark : From Underwater Princess to Celebrity, URL=`.../1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 35/35 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 35/35 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://d2gfgyilxd7m0r.cloudfront.net/.../76a4060e339442578ea1e4fa7a339615.jpg` (image/jpeg, 94317 bytes, 640x960; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1` |  |  |  |
| details thumbnail URL | PASS | `https://d2gfgyilxd7m0r.cloudfront.net/.../76a4060e339442578ea1e4fa7a339615.jpg` |  |  |  |
| details author | PASS | SSOM, dattoi, sinsaebyeok |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Fantasy, Tear Jerker |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Sid may look like any ordinary high schooler with a typical obsession with a boy band, but she has a secret that no one can know—or even believe. She's the child of the Sea God, and Shark Princess of the underwater kingdom, who is next in line for the throne. However, burdened by her impending responsibilities and overbearing mother, she runs away to live inland and falls hopelessly in love with Raun, a member of the boy band BUB. Things were going great until the famous teen actor, Jihan Kang, steps into her life unexpectedly and they keep crossing paths. And when she accidentally goes viral, things really start to get complicated. Will this underwater princess be able to keep her secret and get what she came inland for?<br><br>**Publisher:** MSTORYHUB |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 66 chapters |  |  |  |
| chapter dates | LINT | All 66 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=66 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://play.hypercomic.io/.../1` to `https://play.hypercomic.io/.../1` (1 redirects); popular: `https://play.hypercomic.io/.../1` to `https://play.hypercomic.io/.../1` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
