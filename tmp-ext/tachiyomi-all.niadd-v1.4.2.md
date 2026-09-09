# Extension Validation Report

- Extension: tachiyomi-all.niadd-v1.4.2
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
- Source implementation: keiyoushi.source.b
- Source ID: 6237269852978906906
- Source name: Niadd
- Source language: en
- Selected manga input: popular offset 0: MARTIAL PEAK (`.../MARTIAL_PEAK.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 60 | MARTIAL PEAK (`.../MARTIAL_PEAK.html`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 60 | Reality Quest (`.../Reality_Quest.html`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Martial Peak (Novel) (`.../10020298.html`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | MARTIAL PEAK (`.../MARTIAL_PEAK.html`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 3947 | Martial Peak Celebration 42391 Sep 02, 2020 (`.../2129076`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=MARTIAL PEAK, URL=`.../MARTIAL_PEAK.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 122/122 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 122/122 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img3.yx247.com/.../201805272240108361.jpg` (image/jpeg, 13917 bytes, 200x283) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../MARTIAL_PEAK.html` |  |  |  |
| details thumbnail URL | PASS | `https://img3.yx247.com/.../201805272240108361.jpg` |  |  |  |
| details author | PASS | Author(s): Momo (ii) Artist: Unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Fantasy, Historical, Martial Arts, Supernatural, Action, , Adventure, , Comedy, , Fantasy, , Historical, , Martial Arts, , Supernatural, Action, Adventure, Comedy, Fantasy, Historical, Martial Arts, Supernatural, Action, Adventure, Comedy, Fantasy, Historical, Martial Arts, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The journey to the martial peak is a lonely, solitary and long one.In the face of adversity,you must survive and remain unyielding.Only then can you break through and and continue on your journey to become the strongest. Sky Tower tests its disciples in the harshest ways to prepare them for this journey.One day the lowly sweeper Yang Kai managed to obtain a black book, setting him on the road to the peak of the martials world. -MangaUpdates |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3947 chapters |  |  |  |
| chapter dates | LINT | All 3947 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3947 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://en7.movietop.cc/.../ec68481a87592b1242c5f15e7904eec4.webp <redacted query values: acc and exp>` (image/webp (encoding: lossy), 134164 bytes, 1600x2132) |  |  |  |
