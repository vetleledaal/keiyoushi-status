# Extension Validation Report

- Extension: tachiyomi-it.nifteam-v1.6.7
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 2
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7816508865953731299
- Source name: NIFTeam
- Source language: it
- Selected manga input: popular offset 0: #DRCL Midnight Children (`.../drcl-midnight-children`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | #DRCL Midnight Children (`.../drcl-midnight-children`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | My Hero Academia NIF (`.../my-hero-academia-nif`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 19 | One Piece NIF (`.../one-piece-nif`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 22 | NIF - BL (`.../nif-bl`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | #DRCL Midnight Children (`.../drcl-midnight-children`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | #DRCL Midnight Children (`.../drcl-midnight-children`) |  | 1-10s |
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
| latest listing | PASS | 19 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=#DRCL Midnight Children, URL=`.../drcl-midnight-children` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=One Piece NIF, URL=`.../one-piece-nif` at page 1 offsets 0, 2, 5, 10, 12, 14, 17 and page 2 offsets 2, 4, 8, 11, 13, 15, 17, 20, title=NIF - BL, URL=`.../nif-bl` at page 1 offsets 1, 4, 6, 16, 18 and page 2 offsets 0, 3, 7, 10, 14, title=Gokurakugai, URL=`.../gokurakugai` at page 1 offsets 3, 8 and page 2 offset 1, title=B2 - Manga, URL=`.../b2-manga` at page 1 offsets 7, 15 and page 2 offsets 5, 12, 21, title=F - Manga, URL=`.../f-manga` at page 1 offsets 9, 11, 13 and page 2 offsets 6, 9, 16, 19 |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 14 manga entries; Latest page 2 repeats 16 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 92/92 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 50/92 manga have thumbnail URLs |  |  |  |
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
| page load | PASS | `https://read-nifteam.info/.../00.png` (image/png, 804004 bytes, 850x1200) |  |  |  |
