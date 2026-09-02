# Extension Validation Report

- Extension: tachiyomi-all.taddyink-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2332326521515456967
- Source name: Taddy INK (Webtoons)
- Source language: all
- Selected manga input: popular offset 0: Skylark (`https://taddy.org/.../80f1c270-4782-4689-b6b7-d309b6f0fe93`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 25 | Skylark (`https://taddy.org/.../80f1c270-4782-4689-b6b7-d309b6f0fe93`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 25 | Dream of Snow (`https://taddy.org/.../9792360c-eb8e-451b-80e4-1f3698289b06`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Skylark (`https://taddy.org/.../80f1c270-4782-4689-b6b7-d309b6f0fe93`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Skylark (`https://taddy.org/.../80f1c270-4782-4689-b6b7-d309b6f0fe93`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Adventure in New Lark City Part 1 (`https://taddy.org/.../80f1c270-4782-4689-b6b7-d309b6f0fe93`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 177 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Skylark, URL=`https://taddy.org/.../80f1c270-4782-4689-b6b7-d309b6f0fe93` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 51/51 listing manga have titles and URLs; popular: all absolute; popular_next: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://taddy.org/.../80f1c270-4782-4689-b6b7-d309b6f0fe93`, popular entry 2: `https://taddy.org/.../e94ba567-b555-4290-9b5a-c517795064d4`, popular entry 3: `https://taddy.org/.../b4e0e78c-8c1a-4787-80bc-11f34fa933a4` |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ax1.taddy.org/.../cover-sm.webp` (image/webp (encoding: lossy), 72476 bytes, 320x480; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `https://taddy.org/.../80f1c270-4782-4689-b6b7-d309b6f0fe93` |  |  |  |
| details thumbnail URL | PASS | `https://ax1.taddy.org/.../cover-sm.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | When a young and hard of hearing artist named Arthena "Art" Lavender arrives is the vibrant and colorful "New Lark City" she encounters the adventurous Robin Skylark and her uniquely found family of outcasts called "The Skylarks" Art is soon offered to join their family. Will she accept? And in a city full of danger, powerful Rogues, and a very crippling debt will she and her newfound family survive? The start of a brand new legend begins! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 1 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 177 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ay1.taddy.org/.../story.webp` (image/webp (encoding: lossy), 66488 bytes, 800x1280; server Content-Type: application/octet-stream) |  |  |  |
