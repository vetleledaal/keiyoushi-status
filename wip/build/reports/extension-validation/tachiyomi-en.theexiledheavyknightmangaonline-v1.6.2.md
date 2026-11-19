# Extension Validation Report

- Extension: tachiyomi-en.theexiledheavyknightmangaonline-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 24
- Lint: 3
- Warnings: 1
- Skipped: 9
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7393909338134202317
- Source name: Read The Exiled Heavy Knight Manga Online
- Source language: en
- Selected manga input: popular offset 0: The Exiled Heavy Knight (`<redacted URL #1: manga resource; relative; no scheme>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 1 | The Exiled Heavy Knight (`<redacted URL #1: selected resource; relative; no scheme>`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Exiled Heavy Knight (`<redacted URL #1: selected resource; relative; no scheme>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Exiled Heavy Knight (`<redacted URL #1: selected resource; relative; no scheme>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 185 | Chapter 1 (`.../the-exiled-heavy-knight-knows-how-to-game-the-system-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 36 |  |  | <1s |

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
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Exiled Heavy Knight, URL=`/` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 2/2 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | LINT | 0/2 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `/` |  |  |  |
| details thumbnail URL | PASS | `https://w4.theexiledheavyknight.com/.../The-Exiled-Heavy-Knight-Knows-How-to-Game-the-System.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Read The Exiled Heavy Knight Knows How to Game the System Manga - High-Quality English Scans – Available for Free at theexiledheavyknight.com. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 185 chapters |  |  |  |
| chapter dates | LINT | All 185 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=185 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | details: `https://w3.theexiledheavyknight.com` to `https://w4.theexiledheavyknight.com` (1 redirects); details: `https://w3.theexiledheavyknight.com/.../the-exiled-heavy-knight-knows-how-to-game-the-system-chapter-1` to `https://w4.theexiledheavyknight.com/.../the-exiled-heavy-knight-knows-how-to-game-the-system-chapter-1` (1 redirects) |  |  |  |
| page load | PASS | `https://pic.readkakegurui.com/.../1.webp` (image/webp (encoding: lossy), 134270 bytes, 800x1148) |  |  |  |
