# Extension Validation Report

- Extension: tachiyomi-all.pawchive-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4284527942812494681
- Source name: Pawchive
- Source language: all
- Selected manga input: latest offset 0: Rendal22 (`.../26189364`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Anna Anon (`.../37736420`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 50 | HellToYou (`.../92653921`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | Rendal22 (`.../26189364`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 50 | PurevTone (`.../142203857`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Rendal22 (`.../26189364`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Rendal22 (`.../26189364`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 40 | Zani inflation animation early access (`.../131100962`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | <1s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Rendal22, URL=`.../26189364` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://pawchive.pw/.../26189364` did not contain a decodable image (336324 bytes) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../26189364` |  |  |  |
| details thumbnail URL | PASS | `https://pawchive.pw/.../26189364` |  |  |  |
| details author | PASS | Patreon |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | You can change how many posts to load in the extension preferences. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 3 name, chapter 15 name, chapter 28 name, chapter 36 name |  |  |  |
| chapters | PASS | 40 chapters |  |  |  |
| chapter dates | PASS | 40 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://n1.pawchive.pw/.../3ba6eac6fec2ce97c45de424c72728a3700b28833f08889190d2bda5a8e2138f.png` (image/png, 1683684 bytes, 1283x721) |  |  |  |
