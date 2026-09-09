# Extension Validation Report

- Extension: tachiyomi-en.manhwabuddy-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 32
- Lint: 1
- Warnings: 2
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 397029358682805931
- Source name: ManhwaBuddy
- Source language: en
- Selected manga input: latest offset 0: Mother and Daughter’s Home Raw (`.../mother-and-daughters-home-raw`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Inside My Sister-in-Law (`.../inside-my-sister-in-law`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Mother and Daughter’s Home Raw (`.../mother-and-daughters-home-raw`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Return of the Mount Hua Sect (`.../return-of-the-mount-hua-sect`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Mother and Daughter’s Home Raw (`.../mother-and-daughters-home-raw`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Mother and Daughter’s Home Raw (`.../mother-and-daughters-home-raw`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 46 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mother and Daughter’s Home Raw, URL=`.../mother-and-daughters-home-raw` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Return of the Mount Hua Sect, URL=`.../return-of-the-mount-hua-sect` at page 1 offset 21 and page 2 offset 0, title=Blue Lock, URL=`.../blue-lock` at page 1 offset 22 and page 2 offset 1, title=The Bride of Barbaroi, URL=`.../the-bride-of-barbaroi` at page 1 offset 23 and page 2 offset 2 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 69/69 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 69/69 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhwabuddy.com/.../mother-and-daughters-home-raw-cover.jpg` (image/jpeg, 24740 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mother-and-daughters-home-raw` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Ryu Seungbae |  |  |  |
| details artist | PASS | Ryu Seungbae |  |  |  |
| details genres | PASS | Drama, Mature, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “Ahjumma, if I defend you, what will you do for me?”<br>Successful attorney Jung Doyoon ends up taking on a case involving the family who abandoned him during his childhood. Now in the position of power, he moves back into the house of the mother and daughter…<br>“We’ve already had dinner, shall we all sleep together now?” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 46 chapters |  |  |  |
| chapter dates | LINT | 1 of 46 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | latest: `https://manhwabuddy.com/.../1` to `https://manhwabuddy.com/.../1` (1 redirects); latest_next: `https://manhwabuddy.com/.../2` to `https://manhwabuddy.com/.../2` (1 redirects); search: `https://manhwabuddy.com/.../search <redacted query values: s and page>` to `https://manhwabuddy.com/.../search <redacted query values: s and page>` (1 redirects) |  |  |  |
| page load | PASS | `https://img03.manhwabuddy.com/.../1-219.jpg` (image/jpeg, 1378701 bytes, 720x14535) |  |  |  |
