# Extension Validation Report

- Extension: tachiyomi-all.mangapluscreators-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 4994699950662723787
- Source name: MANGA Plus Creators by SHUEISHA
- Source language: en
- Selected manga input: popular offset 0: Sense Life (`.../w72209030242155470024268456`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Sense Life (`.../w72209030242155470024268456`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | MILKRACLE MILKLACTIS (`.../p42606170903150027418418`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Thunder of god (`.../tx2607150134470027402668`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 30 | Forbidden Jewel: Sorcerer's Stone (`.../8q2307191526277070024779496`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sense Life (`.../w72209030242155470024268456`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 17 | #001 (`.../qd2209030242155500024268456`) |  | <1s |
| pages | `getPageList(chapter)` | success | 72 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 5: title=Sense Life, URL=`.../w72209030242155470024268456` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://assets.mangaplus-creators.jp/.../thumb_70744501.jpg <redacted query values: h>` (image/jpeg, 138813 bytes, 640x1005) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../w72209030242155470024268456` |  |  |  |
| details thumbnail URL | PASS | `https://assets.mangaplus-creators.jp/.../thumb_70744501.jpg <redacted query values: h>` |  |  |  |
| details author | PASS | Glitch Tellend |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Noah is a quiet boy looking for a meaning in his life, his everyday days will disappear after he meets Kaleb, a drug user who has a big bounty on his head. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | PASS | 17 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 72 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://assets.mangaplus-creators.jp/.../s_70744181.jpg <redacted query values: h>` (image/jpeg, 102774 bytes, 815x509) |  |  |  |
