# Extension Validation Report

- Extension: tachiyomi-it.nifteam-v1.6.7
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: foolslide
- Source ID: 7816508865953731299
- Source name: NIFTeam
- Source language: it
- Selected manga input: popular offset 0: #DRCL Midnight Children (`.../drcl-midnight-children`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | #DRCL Midnight Children (`.../drcl-midnight-children`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | My Hero Academia NIF (`.../my-hero-academia-nif`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | One Piece NIF (`.../one-piece-nif`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 19 | One Piece NIF (`.../one-piece-nif`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | #DRCL Midnight Children (`.../drcl-midnight-children`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | #DRCL Midnight Children (`.../drcl-midnight-children`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1: One Shot (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=#DRCL Midnight Children, URL=`.../drcl-midnight-children` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | FAIL | Page 2 repeats page 1: title=One Piece NIF, URL=`.../one-piece-nif` at page 1 offsets 0, 3, 6, 8, 10, 13 and page 2 offsets 0, 2, 4, 7, 10, 12, 16, title=NIF - BL, URL=`.../nif-bl` at page 1 offsets 1, 4, 9, 12, 14 and page 2 offsets 6, 8, 11, 15, 18, title=F - Manga, URL=`.../f-manga` at page 1 offsets 2, 17 and page 2 offsets 1, 3, 14, 17, title=B2 - Manga, URL=`.../b2-manga` at page 1 offsets 5, 15 and page 2 offsets 5, 13, title=Gokurakugai, URL=`.../gokurakugai` at page 1 offsets 7, 11, 16 and page 2 offset 9 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| listing duplicates | FAIL | Latest page 1 repeats 13 manga entries; Latest page 2 repeats 14 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 88/88 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 50/88 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://read-nifteam.info/.../DRCL_Midnight_Children.png` (image/png, 302796 bytes, 1000x200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../drcl-midnight-children` |  |  |  |
| details thumbnail URL | PASS | `https://read-nifteam.info/.../DRCL_Midnight_Children.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://read-nifteam.info/.../00.png` (image/png, 804004 bytes, 850x1200) |  |  |  |
