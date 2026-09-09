# Extension Validation Report

- Extension: tachiyomi-ja.klto9-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3136857802804349121
- Source name: Klto9
- Source language: ja
- Selected manga input: latest offset 0: Chikubi × Buddy (`.../teap-chikubi-buddy.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Kimetsu No Yaiba - Raw (`.../teap-kimetsu-no-yaiba-raw.html`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Yakusoku No Neverland - Raw (`.../teap-yakusoku-no-neverland-raw.html`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Chikubi × Buddy (`.../teap-chikubi-buddy.html`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Roku Nensei To Shitai Koto (`.../teap-roku-nensei-to-shitai-koto.html`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Chikubi × Buddy (`.../teap-chikubi-buddy.html`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | CHIKUBI × BUDDY (`.../teap-chikubi-buddy.html`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 3 | Chapter 1 (`.../422375`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Chikubi × Buddy, URL=`.../teap-chikubi-buddy.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://j4.jfimv2.xyz/.../chikubi-buddy_6a8fcbc525e71.jpg` (image/jpeg, 252085 bytes, 320x457) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Chikubi × Buddy to CHIKUBI × BUDDY |  |  |  |
| details thumbnail URL | PASS | `https://j4.jfimv2.xyz/.../chikubi-buddy_6a8fcbc525e71.jpg` |  |  |  |
| details author | PASS | Kage Makanaiji |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Action, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Other Names: チクビ×バディ<br><br>Noir is a rookie spy! The first words from their senior are "We're going to touch nipples!?" Complete the mission by locking nipples! The long-awaited serialization of the spy gag manga that won the X-Compe (X Compe Grand Prix)! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://j1.jfimv2.xyz/.../d4a5467f07ae6b1ea63299f78328808801.jpg` (image/jpeg, 236940 bytes, 800x1143) |  |  |  |
