# Extension Validation Report

- Extension: tachiyomi-all.comikey-v1.6.15
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 2769857481066602061
- Source name: Comikey
- Source language: en
- Selected manga input: latest offset 0: It’s Not Easy Being Cute (`.../1046`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Kengan Omega (`.../10`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | Smoking Behind the Supermarket with You (`.../527`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | It’s Not Easy Being Cute (`.../1046`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Inescapable Runaway Love (`.../877`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | It’s Not Easy Being Cute (`.../1046`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | It’s Not Easy Being Cute (`.../1046`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 11 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=It’s Not Easy Being Cute, URL=`.../1046` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.comikey.com/.../640cbad68778.png` (image/jpeg, 21244 bytes, 240x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1046` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://comikey.com/.../61de3aa1d9ad.png` (image/png, 1471536 bytes, 800x1200) |  |  |  |
| details author | PASS | Sho Asahina |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | School Life, Comedy, Suspense, Manga |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | "College student Himesaki Nozomi was a girl who took her beauty into her own hands through plastic surgery. One day she was asked by the natural beauty Tennōji Ruka to teach her how to be "cute.""<br><br>At first, Nozomi was irked by her ignorance. How could she ask her for something like that when she had never even tasted the pain of being ugly? However, she soon learns that Ruka has her own struggles: she’s trapped by a "princely" image that prevents her from being the girl she truly wants to be. Together, they navigate the pressures of modern lookism to forge their own paths. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | PASS | 11 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Timed out waiting for 30000 ms |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
