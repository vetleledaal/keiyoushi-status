# Extension Validation Report

- Extension: tachiyomi-all.ftvhunter-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: masonry
- Source ID: 2424130356866336342
- Source name: FTV Hunter
- Source language: all
- Selected manga input: popular offset 0: Beautiful blonde exposes her perfect boobs (`.../beautiful-blonde-exposes-her-perfect-boobs`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 17 | Beautiful blonde exposes her perfect boobs (`.../beautiful-blonde-exposes-her-perfect-boobs`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 14 | Hot youngster Isabel lets us see her slender body nicely (`.../hot-youngster-isabel-lets-us-see-her-slender-body-nicely-13296`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Valery in Bikini Finale from Ftv Girls (`.../valery-in-bikini-finale`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Dafne in Bondage Theme from Ftv Girls (`.../dafne-in-bondage-theme`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Beautiful blonde exposes her perfect boobs (`.../beautiful-blonde-exposes-her-perfect-boobs`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Beautiful blonde exposes her perfect boobs (`.../beautiful-blonde-exposes-her-perfect-boobs`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../beautiful-blonde-exposes-her-perfect-boobs`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | <1s |

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
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Beautiful blonde exposes her perfect boobs, URL=`.../beautiful-blonde-exposes-her-perfect-boobs` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.ftvhunter.com/.../5147_masonry_600.jpg` (image/jpeg, 208515 bytes, 600x901) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../beautiful-blonde-exposes-her-perfect-boobs` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Addison |  |  |  |
| details artist | PASS | Addison |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | \[Addison\](https://www.ftvhunter.com/.../addison) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.ftvhunter.com/.../beautiful-blonde-exposes-her-perfect-boobs-01.jpg` (image/jpeg, 260482 bytes, 666x1000) |  |  |  |
