# Extension Validation Report

- Extension: tachiyomi-en.toonilyme-v1.6.4
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangak
- Source ID: 1581110056159285576
- Source name: Toonily.me
- Source language: en
- Selected manga input: popular offset 0: Stop Smoking (`.../stop-smoking`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Stop Smoking (`.../stop-smoking`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Seniors of Class 5 (`.../seniors-of-class-5`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Mother and Daughter’s Home Raw (`.../mother-and-daughters-home-raw`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Mount Hua Sect’s Genius Phantom Swordsman (`.../mount-hua-sects-genius-phantom-swordsman`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | Stop Smoking (`.../stop-smoking`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Stop Smoking (`.../stop-smoking`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 111 | Chapter 0 (`.../chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 45 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Stop Smoking, URL=`.../stop-smoking` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rx.toontop.io/.../b6ecd062d58f.webp` (image/webp (encoding: lossy), 13386 bytes, 215x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../stop-smoking` |  |  |  |
| details thumbnail URL | PASS | `https://rx.toontop.io/.../b6ecd062d58f.webp` |  |  |  |
| details author | PASS | AA |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Drama, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Even though I get teased for being short and bullied at work, my house is paradise!!... I thought it was like that, but the neighbors are smoking like crazy!!I couldn't stand it anymore and went to look for them, but I met a fierce-looking, heavy-duty gangster, Na Se-young! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 111 chapters |  |  |  |
| chapter dates | PASS | 111 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://rx.toontop.io/.../cd647be60d1f.webp` (image/webp (encoding: lossy), 20254 bytes, 720x500) |  |  |  |
