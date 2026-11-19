# Extension Validation Report

- Extension: tachiyomi-en.mangastash-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 1
- Warnings: 3
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5621160175015051314
- Source name: Mangastash
- Source language: en
- Selected manga input: popular offset 0: Martial Peak (`.../martial-peak`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Martial Peak (`.../martial-peak`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Goodnight Punpun (`.../oyasumi-punpun`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Tomb Raider King: End Line (`.../tomb-raider-king-end-line`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Absolute Regression (`.../absolute-regression`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Martial Peak (`.../martial-peak`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Peak (`.../martial-peak`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3858 | Ch. 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Martial Peak, URL=`martial-peak` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Absolute Regression, URL=`absolute-regression` at page 1 offset 23 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangastash.org/.../martial-peak.jpg` (image/jpeg, 94139 bytes, 460x690) |  |  |  |
| details identity | PASS | Details preserved selected URL `martial-peak` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://mangastash.org/.../martial-peak.jpg` was not downloaded |  |  |  |
| details author | PASS | Momo |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhua, Webtoon, Action, Adventure, Comedy, Fantasy, Romance, Superpowers, Survival, Dramatic, Intense, Tense |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★✬ 4.4 (106)<br>Safe · Ranked #1 in Popularity (30 days) · #3 All-Time<br><br>The journey to the martial peak is a lonely, solitary, and long one. In the face of adversity, one must survive and remain unyielding to break through and become the strongest. Yang Kai, a lowly sweeper, obtains a black book that sets him on the road to the peak of the martial world. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3858 chapters |  |  |  |
| chapter dates | LINT | All 3858 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3858 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | UNUSUAL | `https://mangastash.org/.../001.jpg` (image/gif (format: 89a), 43 bytes, 1x1); image dimensions are implausibly small |  |  |  |
