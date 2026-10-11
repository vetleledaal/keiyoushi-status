# Extension Validation Report

- Extension: tachiyomi-en.evascans-v1.6.4
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1911019612901009263
- Source name: Eva Scans
- Source language: en
- Selected manga input: latest offset 0: A Portrait of Pride (`.../a-portrait-of-pride`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | I’ve Fallen for the Empire’s Greatest Villainess (`.../ive-fallen-for-the-empires-greatest-villainess`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 40 | Conditions For A Political Marriage (`.../conditions-for-a-political-marriage`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 40 | A Portrait of Pride (`.../a-portrait-of-pride`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | My Pirate Prince (`.../my-pirate-prince`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Portrait of Pride (`.../a-portrait-of-pride`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Portrait of Pride (`.../a-portrait-of-pride`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 17 | Chapter 0 (`.../a-portrait-of-pride-chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Portrait of Pride, URL=`.../a-portrait-of-pride` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../2026-10-06-12-29-59-1791289799835.webp <redacted query values: resize>` (image/jpeg, 16960 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-portrait-of-pride` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.wp.com/.../2026-10-06-12-29-59-1791289799835.webp` (image/jpeg, 241215 bytes, 848x1230) |  |  |  |
| details author | PASS | 18.9studio |  |  |  |
| details artist | PASS | 18.9studio |  |  |  |
| details genres | PASS | Drama, Fantasy, Historical, Romance, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Diana, a blind maid with a carefully guarded past, is forced by Prince Eisen to spy on the Crown Prince. She expects to find a sickly recluse who spends his days painting in solitude, but the man she encounters is nothing like the rumors. Will she survive the dangers awaiting her in his palace?<br><br>Alternative Names: <br>- 교만의 초상 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | PASS | 17 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://evascans.net/.../2026-10-04-03-41-18-1791128478458.jpg` (image/jpeg, 674923 bytes, 720x6000) |  |  |  |
