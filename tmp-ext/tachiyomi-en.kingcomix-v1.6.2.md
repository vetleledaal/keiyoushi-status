# Extension Validation Report

- Extension: tachiyomi-en.kingcomix-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8953466777316975228
- Source name: KingComiX
- Source language: en
- Selected manga input: popular offset 0: Toon Sluts – Deavalin (`.../toon-sluts-deavalin`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Toon Sluts – Deavalin (`.../toon-sluts-deavalin`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Honey and Sour Cream – Kat arts (`.../honey-and-sour-cream-kat-arts`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | Toon Sluts – Deavalin (`.../toon-sluts-deavalin`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Toon Sluts – Deavalin (`.../toon-sluts-deavalin`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../toon-sluts-deavalin`) |  | <1s |
| pages | `getPageList(chapter)` | success | 6 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Toon Sluts – Deavalin, URL=`.../toon-sluts-deavalin` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kingcomix.com/.../Toon-Sluts-Deavalin-01-263x365.webp` (image/webp (encoding: lossy), 28136 bytes, 263x365) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../toon-sluts-deavalin` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://kingcomix.com/.../Toon-Sluts-Deavalin-01.webp` (image/webp (encoding: lossy), 95430 bytes, 725x1024) |  |  |  |
| details author | PASS | KingComix |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Porn Comics, Big Ass, Big Boobs, Blowjob, Full Color, OnGoing |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://kingcomix.com/.../Toon-Sluts-Deavalin-01.webp` (image/webp (encoding: lossy), 95430 bytes, 725x1024) |  |  |  |
