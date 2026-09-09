# Extension Validation Report

- Extension: tachiyomi-en.comicland-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 33
- Lint: 2
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6347123306532384776
- Source name: ComicLand
- Source language: en
- Selected manga input: latest offset 0: Soeun (`.../soeun`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | Switch ON (Uncensored) (`.../switch-on-uncensored`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Soeun (`.../soeun`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Guaranteed Pass! Grades Training Camp (`.../guaranteed-pass-grades-training-camp`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Soeun (`.../soeun`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Soeun (`.../soeun`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 110 | Chapter 1 (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 15 |  |  | <1s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Soeun, URL=`soeun` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 91/91 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 91/91 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.comicland.org/.../cover.jpg` (image/jpeg, 17498 bytes, 214x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `soeun` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.comicland.org/.../cover.jpg` |  |  |  |
| details author | PASS | Muldeok |  |  |  |
| details artist | PASS | Muldeok |  |  |  |
| details genres | PASS | Drama, Romance, Mature |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | “Miss Soeun… if those guys force themselves on you, will you accept them?” My first love, with her pleasant scent and gentle touch, used to console me… But she’s not wearing anything under her shirt right now…? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 110 chapters |  |  |  |
| chapter dates | LINT | All 110 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=110 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.comicland.org/.../001.jpg` (image/jpeg, 1120673 bytes, 720x14956) |  |  |  |
