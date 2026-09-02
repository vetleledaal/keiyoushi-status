# Extension Validation Report

- Extension: tachiyomi-en.revivalscans-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6875037148225675112
- Source name: Revival Scans
- Source language: en
- Selected manga input: popular offset 0: Beautiful days (`.../beautiful-days`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 6 | Beautiful days (`.../beautiful-days`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Beautiful days (`.../beautiful-days`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Beautiful days (`.../beautiful-days`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 58 | Chapter 29 (`.../29`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 11 |  |  | <1s |

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
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Beautiful days, URL=`beautiful-days` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 7/7 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 7/7 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.revivalscans.com/.../1786056348450.webp` (image/webp (encoding: lossless), 206516 bytes, 400x560) |  |  |  |
| details identity | PASS | Details preserved selected URL `beautiful-days` |  |  |  |
| details thumbnail URL | PASS | `https://www.revivalscans.com/.../1786056348450.webp` |  |  |  |
| details author | PASS | Yuwol |  |  |  |
| details artist | PASS | Nunnya |  |  |  |
| details genres | PASS | Rude Male Lead, Big Breasts, Cowgirl, Cheating/Infidelity, Rape, Drama, Full Color, Adult |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | People live their lives hiding their personal desires and circumstances in silence, but deep down, they all long to bloom one day.<br>"Let me strip away your skin, your sweat... your scent, and every breathy moan." |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 58 chapters |  |  |  |
| chapter dates | PASS | 58 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.revivalscans.com/.../1.jpg` (image/jpeg, 3638668 bytes, 720x13955) |  |  |  |
