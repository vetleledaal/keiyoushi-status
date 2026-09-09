# Extension Validation Report

- Extension: tachiyomi-en.dankefurslesen-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 31
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: guya
- Source ID: 370316150648855996
- Source name: Danke fürs Lesen
- Source language: en
- Selected manga input: latest offset 0: Rentarou's Family's Families' Daily Lives (`.../rentarou-family-lives`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 656 | "When you're crossdressing, what do you do about your underwear?" (`.../xdress-underwear`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 651 | Rentarou's Family's Families' Daily Lives (`.../rentarou-family-lives`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Rentarou's Family's Families' Daily Lives (`.../rentarou-family-lives`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Rentarou's Family's Families' Daily Lives (`.../rentarou-family-lives`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 9 | 1 - Parallel Nano and Papari and Daft Sods and So On (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 22 |  |  | <1s |

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
| popular listing | PASS | 656 entries |  |  |  |
| latest listing | PASS | 651 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Rentarou's Family's Families' Daily Lives, URL=`rentarou-family-lives` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 1308/1308 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1308/1308 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://danke.moe/.../41585.jpg` (image/jpeg, 490843 bytes, 1243x1920) |  |  |  |
| details identity | PASS | Details preserved selected URL `rentarou-family-lives` |  |  |  |
| details thumbnail URL | PASS | `https://danke.moe/.../41585.jpg` |  |  |  |
| details author | PASS | Nakamura Rikito |  |  |  |
| details artist | PASS | Nakamura Rikito |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | A "The 100 Girlfriends Who Really, Really, Really, Really, Really Love You" spinoff that tells stories about the characters' families, drawn by the author himself. Main series: |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://danke.moe/.../01.png <redacted query values: v2>` (image/png, 388747 bytes, 1000x1000) |  |  |  |
