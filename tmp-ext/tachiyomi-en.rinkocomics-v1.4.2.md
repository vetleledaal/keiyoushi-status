# Extension Validation Report

- Extension: tachiyomi-en.rinkocomics-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4915548839286527736
- Source name: Rinko Comics
- Source language: en
- Selected manga input: popular offset 0: Tsunami Warning (`.../tsunami-warning`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 8 | Tsunami Warning (`.../tsunami-warning`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | A Life for a Lie (`.../a-life-for-a-lie`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | The Nerd Next Door Turned Out To Be The Magic Tower Master (`.../the-nerd-next-door-turned-out-to-be-the-magic-tower-master`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Tsunami Warning (`.../tsunami-warning`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Tsunami Warning (`.../tsunami-warning`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 8 | Chapter 1 (`.../tsunami-warning-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 28 |  |  | <1s |

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
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tsunami Warning, URL=`.../tsunami-warning` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rinkocomics.com/.../6bf97fdb-2ff4-4dd8-bd3a-e1840df84547-207x300.webp` (image/webp (encoding: lossy), 17964 bytes, 207x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tsunami-warning` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://rinkocomics.com/.../6bf97fdb-2ff4-4dd8-bd3a-e1840df84547-708x1024.webp` (image/webp (encoding: lossy), 116380 bytes, 708x1024) |  |  |  |
| details author | PASS | Unknown Author |  |  |  |
| details artist | PASS | Manhwa |  |  |  |
| details genres | PASS | Comedy, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Lee Dan-bi, a third‑year developer, had a simple life motto: Don't crave the world outside your well. Be satisfied with reality. That's why she could even give up on a hopeless crush that was beyond her station. But then — On a morning that began with an unsettling fortune, her new team leader turns out to be… her first love from school days? And that gigantic tsunami comes crashing straight into Dan‑bi's humble life! "I don't understand. The Lee Dan‑bi I know likes me." At those dizzyingly unfamiliar words, her heart began to pound wildly once again. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.rinkocomics.com/.../01__95f23b02-e0b6-4f8d-939b-8b922e4a7fd5.webp` (image/webp (encoding: lossy), 471116 bytes, 800x6775) |  |  |  |
