# Extension Validation Report

- Extension: tachiyomi-en.mangalix-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2280035516075993115
- Source name: MangaLix
- Source language: en
- Selected manga input: latest offset 0: Sawaranaide Kotesashi-kun (`.../sawaranaide-kotesashi-kun`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 117 | Teenage Mercenary (`.../teenage-mercenary`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 117 | Sawaranaide Kotesashi-kun (`.../sawaranaide-kotesashi-kun`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sawaranaide Kotesashi-kun (`.../sawaranaide-kotesashi-kun`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sawaranaide Kotesashi-kun (`.../sawaranaide-kotesashi-kun`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 141 | Chapter 1 (`.../sawaranaide-kotesashi-kun-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 50 |  |  | <1s |

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
| popular listing | PASS | 117 entries |  |  |  |
| latest listing | PASS | 117 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sawaranaide Kotesashi-kun, URL=`sawaranaide-kotesashi-kun` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 235/235 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 235/235 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangalix.com/.../sawaranaide-kotesashi-kun-cover.webp` (image/webp (encoding: lossy), 36278 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `sawaranaide-kotesashi-kun` |  |  |  |
| details thumbnail URL | PASS | `https://mangalix.com/.../sawaranaide-kotesashi-kun-cover.webp` |  |  |  |
| details author | PASS | Tsuzui |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Romance, School Life, Shonen, Ecchi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Kotesashi is a high school boy who despises physical contact. He genuinely hates being touched by anyone. One day, a beautiful, extremely touchy-feely gal named Koyuki accidentally discovers his phobia. Intrigued by his bizarre reaction, she begins relentlessly teasing him, constantly invading his personal space and trying to touch him at every given opportunity. What starts as pure annoyance slowly turns into something far more complicated as Kotesashi is forced to confront his extreme haphephobia and the surprisingly sweet, genuine intentions behind Koyuki's aggressive affection. 'Sawaranaide Kotesashi-kun' is an absolutely hilarious and surprisingly heartwarming romantic comedy that perfectly blends energetic teasing with genuine character growth. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 141 chapters |  |  |  |
| chapter dates | PASS | 141 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://scans.lastation.us/.../0001-001.png` (image/jpeg, 155084 bytes, 900x900; server Content-Type: image/png) |  |  |  |
