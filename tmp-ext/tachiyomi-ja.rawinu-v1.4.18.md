# Extension Validation Report

- Extension: tachiyomi-ja.rawinu-v1.4.18
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
- Source theme: fmreader
- Source ID: 7788489411010171607
- Source name: RawINU
- Source language: ja
- Selected manga input: latest offset 0: CHIKUBI × BUDDY (`.../manga-chikubi-buddy.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Pirate King (Manga) (`.../manga-one-piece-raw.html`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | OSHI NO KO - RAW (`.../manga-oshi-no-ko-raw.html`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | CHIKUBI × BUDDY (`.../manga-chikubi-buddy.html`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | ROKU NENSEI TO SHITAI KOTO (`.../manga-roku-nensei-to-shitai-koto.html`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | CHIKUBI × BUDDY (`.../manga-chikubi-buddy.html`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | CHIKUBI × BUDDY (`.../manga-chikubi-buddy.html`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 3 | Chapter 1 (`.../unir-chikubi-buddy-chapter-1.html`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=CHIKUBI × BUDDY, URL=`.../manga-chikubi-buddy.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s4.ihlv1.xyz/.../chikubi-buddy_6a8fcbc525e71.jpg <redacted query values: imgmax>` (image/jpeg, 252085 bytes, 320x457) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manga-chikubi-buddy.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://s4.ihlv1.xyz/.../chikubi-buddy_6a8fcbc525e71.jpg` (image/jpeg, 252085 bytes, 320x457) |  |  |  |
| details author | PASS | Kage Makanaiji |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Slice of Life, Weekly Young Jump |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Noir is a rookie spy! The first words from their senior are "We're going to touch nipples!?" Complete the mission by locking nipples! The long-awaited serialization of the spy gag manga that won the X-Compe (X Compe Grand Prix)!<br><br>Alternative Name: チクビ×バディ |  |  |  |
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
| page load | PASS | `https://ihlv1.xyz/.../d4a5467f07ae6b1ea63299f78328808801.jpg` (image/jpeg, 236940 bytes, 800x1143) |  |  |  |
