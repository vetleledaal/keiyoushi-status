# Extension Validation Report

- Extension: tachiyomi-en.manhwabuddy-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: yiimanga
- Source ID: 397029358682805931
- Source name: ManhwaBuddy
- Source language: en
- Selected manga input: popular offset 0: Inside My Sister-in-Law (`.../inside-my-sister-in-law`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Inside My Sister-in-Law (`.../inside-my-sister-in-law`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | The Kicked Out S-Rank Appraiser Creates the Strongest Guild (`.../the-kicked-out-s-rank-appraiser-creates-the-strongest-guild`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | I Became an Apartment Security Manager (`.../i-became-an-apartment-security-manager`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Inside My Sister-in-Law (`.../inside-my-sister-in-law`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 50 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 68 |  |  | <1s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 68/68 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 68/68 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhwabuddy.com/.../inside-my-sister-in-law-cover.jpg` (image/jpeg, 19856 bytes, 228x319) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../inside-my-sister-in-law` |  |  |  |
| details thumbnail URL | PASS | `https://manhwabuddy.com/.../inside-my-sister-in-law-cover.jpg` |  |  |  |
| details author | PASS | Tio |  |  |  |
| details artist | PASS | JG |  |  |  |
| details genres | PASS | Drama, Mature, Romance |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | YOON-AH returns to Korea after studying abroad and moves in with her sister-in-law YOON-JUNG and brother DO-IL. She seems innocent yet provocative and DO-IL gradually crosses the line.<br><br>Alternative names: 처제안에.../In My Sister-in-Law |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 50 chapters |  |  |  |
| chapter dates | PASS | 50 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 68 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img03.manhwabuddy.com/.../1-1f4.jpg` (image/jpeg, 193761 bytes, 720x2500) |  |  |  |
