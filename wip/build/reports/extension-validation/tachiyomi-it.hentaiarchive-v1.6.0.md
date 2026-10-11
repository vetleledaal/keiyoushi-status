# Extension Validation Report

- Extension: tachiyomi-it.hentaiarchive-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 28
- Lint: 2
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6052929656772429531
- Source name: HentaiArchive
- Source language: it
- Selected manga input: popular offset 0: Riuscire a scoparsi sia la madre che la figlia tettona (`.../riuscire-a-scoparsi-sia-la-madre-che-la-figlia-tettona`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 9 | Riuscire a scoparsi sia la madre che la figlia tettona (`.../riuscire-a-scoparsi-sia-la-madre-che-la-figlia-tettona`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 9 | Cacciatrici di Uomini (`.../cacciatrici-di-uomini`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Riuscire a scoparsi sia la madre che la figlia tettona (`.../riuscire-a-scoparsi-sia-la-madre-che-la-figlia-tettona`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Riuscire a scoparsi sia la madre che la figlia tettona (`.../riuscire-a-scoparsi-sia-la-madre-che-la-figlia-tettona`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../riuscire-a-scoparsi-sia-la-madre-che-la-figlia-tettona`) |  | <1s |
| pages | `getPageList(chapter)` | success | 41 |  |  | <1s |

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
| popular listing | PASS | 9 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Riuscire a scoparsi sia la madre che la figlia tettona, URL=`.../riuscire-a-scoparsi-sia-la-madre-che-la-figlia-tettona` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 20/20 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 19/20 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.hentai-archive.com/.../Riuscire_a_scoparsi_sia_la_madre_che_la_figlia_tetton_1_1-725x1024.webp` (image/webp (encoding: lossy), 127876 bytes, 725x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../riuscire-a-scoparsi-sia-la-madre-che-la-figlia-tettona` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ahegao  recenti,  ita bikini,  culi grossi, doujinshi,  formose,  ita harem,  recenti,  milf,  tette grosse |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | LINT | Untrimmed fields: genre |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.hentai-archive.com/.../1` to `https://www.hentai-archive.com/.../hentai-recenti` (1 redirects); popular: `https://www.hentai-archive.com/.../2` to `https://www.hentai-archive.com/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://picsarchive1.b-cdn.net/.../Riuscire_a_scoparsi_sia_la_madre_che_la_figlia_tetton_1_1.webp` (image/webp (encoding: lossy), 348926 bytes, 1280x1808) |  |  |  |
