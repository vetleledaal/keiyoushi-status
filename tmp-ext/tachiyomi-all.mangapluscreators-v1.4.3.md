# Extension Validation Report

- Extension: tachiyomi-all.mangapluscreators-v1.4.3
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
- Source implementation: keiyoushi.source.a
- Source ID: 4994699950662723787
- Source name: MANGA Plus Creators by SHUEISHA
- Source language: en
- Selected manga input: latest offset 0: The surviver (`.../u12608280334230027456734`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Sense Life (`.../w72209030242155470024268456`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | The surviver (`.../u12608280334230027456734`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Runaway (`.../8n2607081540280026106285`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The surviver (`.../u12608280334230027456734`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | The surviver (`.../u12608280334230027456734`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 2 | #001 (`.../nc2608280334230027456734`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 6 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The surviver, URL=`.../u12608280334230027456734` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 91/91 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 91/91 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://assets.mangaplus-creators.jp/.../thumb_91405436.jpg <redacted query values: h>` (image/jpeg, 40054 bytes, 640x989) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../u12608280334230027456734` |  |  |  |
| details thumbnail URL | PASS | `https://assets.mangaplus-creators.jp/.../thumb_91405436.jpg <redacted query values: h>` |  |  |  |
| details author | PASS | Mattia Marinucci |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Two boysTwo young people strike up a friendship, but before long they become best friends due to a zombie epidemic |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://assets.mangaplus-creators.jp/.../s_91405418.jpg <redacted query values: h>` (image/jpeg, 113343 bytes, 1280x1977) |  |  |  |
