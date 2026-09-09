# Extension Validation Report

- Extension: tachiyomi-ar.hijala-v1.4.35
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 917436262447415426
- Source name: Hijala
- Source language: ar
- Selected manga input: latest offset 0: test (`.../test`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 5 | Lookism (`.../lookism`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 5 | fight class 3 (`.../fight-class-3`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 5 | test (`.../test`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 5 | Fog Land (`.../fog-land`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 5 | Childhood friend of the zenith (`.../childhood-friend-of-the-zenith-2`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | test (`.../test`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 2 | فصل 5641 (`.../test-5641`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 30 |  |  | <1s |

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
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | PASS | 5 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 2: title=test, URL=`.../test` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 25/25 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 25/25 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hijala.com/.../the-worn-and-torn-newbie-1-214x300.webp` (image/webp (encoding: lossy), 19486 bytes, 214x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../test` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hijala.com/.../the-worn-and-torn-newbie-1.webp` (image/webp (encoding: lossy), 108616 bytes, 772x1080) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Alternative Names: test |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hijala.com/.../01.webp` (image/webp (encoding: lossy), 921380 bytes, 800x8540) |  |  |  |
