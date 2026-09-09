# Extension Validation Report

- Extension: tachiyomi-all.manta-v1.6.11
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 8753096034341798862
- Source name: Manta
- Source language: en
- Selected manga input: popular offset 0: I Want to Prey on You (`.../4230`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 82 | I Want to Prey on You (`.../4230`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I Want to Prey on You (`.../4230`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Want to Prey on You (`.../4230`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 52 | Episode 1 (`.../184980`) |  | <1s |
| pages | `getPageList(chapter)` | success | 97 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 82 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Want to Prey on You, URL=`4230` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 83/83 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 83/83 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.mantacdn.net/.../9PhKWIaZyPFpnw2o.jpg` (image/jpeg, 83985 bytes, 480x690; server Content-Type: image/png) |  |  |  |
| details identity | PASS | Details preserved selected URL `4230` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Lee Seul Gi, HEO IRYEONG |  |  |  |
| details artist | PASS | Lee Seul Gi |  |  |  |
| details genres | PASS | Romance, Historical, Eastern/Asian-inspired setting, Royalty/Nobility, Non-human, Contract relationship, Possessive ML, Capable ML, Troubled-past FL, Capable FL, Steamy, Lighthearted, New |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | After receiving an imperial decree to marry a barbarian, Joseon princess Lee Eunwoo wanders alone in distress.<br><br>She meets a wounded tiger—Baek Hwi, king of the Tiger Clan.<br><br>After helping him, she makes a shocking request: “Eat me.”<br><br>Though stunned, Baek Hwi is drawn to her and vows to claim her as his mate. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 52 chapters |  |  |  |
| chapter dates | PASS | 52 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 97 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://si.mantacdn.net/.../NuKrAnld5REGwlWe.jpg <redacted query values: sign>` (image/jpeg, 52564 bytes, 720x1204) |  |  |  |
