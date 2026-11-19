# Extension Validation Report

- Extension: tachiyomi-vi.lorangeteam-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7564037529443123547
- Source name: L'orange Team
- Source language: vi
- Selected manga input: popular offset 0: 00 Thân Yêu (`.../00-than-yeu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 23 | 00 Thân Yêu (`.../00-than-yeu`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 23 | Hướng Đến Người (`.../huong-en-nguoi`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 00 Thân Yêu (`.../00-than-yeu`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 00 Thân Yêu (`.../00-than-yeu`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 30 | Chap 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | <1s |

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
| popular listing | PASS | 23 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=00 Thân Yêu, URL=`.../00-than-yeu` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 47/47 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 47/47 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lorangeteam.art/.../YrRoNKBa693thoFHHYuqm8YrU2YjxtvGp8aRD3jP.jpg` (image/jpeg, 21919 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../00-than-yeu` |  |  |  |
| details thumbnail URL | PASS | `https://lorangeteam.art/.../YrRoNKBa693thoFHHYuqm8YrU2YjxtvGp8aRD3jP.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Boy Love, Công bán manh (meo meo), Fantasy, Guideverse, Manhwa, Mỹ nhân công, Thụ đô con |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ✨Tags: SF/cận tương lai, guideverse, phi nhân loại/ tồn tại siêu nhiên, dị năng/ siêu năng lực, mỹ nhân công, công bán manh, công đỉnh cấp (không ai sánh kịp), mỹ nam thụ, thụ đô con, thụ nguyện hy sinh. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 30 chapters |  |  |  |
| chapter dates | PASS | 30 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://lorangeteam.art/.../UvHB4AZZtgiYlKJLaavyH128YBKCXXI2VRzgqR5v.jpg` (image/jpeg, 90407 bytes, 1195x337) |  |  |  |
