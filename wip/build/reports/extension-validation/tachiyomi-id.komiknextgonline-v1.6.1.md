# Extension Validation Report

- Extension: tachiyomi-id.komiknextgonline-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 0
- Warnings: 3
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5850393134813310906
- Source name: Komik Next G Online
- Source language: id
- Selected manga input: popular offset 0: Murah sih, tapi (`.../murah-sih-tapi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Murah sih, tapi (`.../murah-sih-tapi`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Cokelat atau Matcha (`.../cokelat-atau-matcha`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Murah sih, tapi… (`.../murah-sih-tapi`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Murah sih, tapi... (`.../murah-sih-tapi`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../murah-sih-tapi`) |  | <1s |
| pages | `getPageList(chapter)` | success | 5 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Murah sih, tapi…, URL=`.../murah-sih-tapi` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://komiknextgonline.com/.../Murah-sih-tapi-cover-150x150.jpeg` (image/jpeg, 7564 bytes, 150x150) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Murah sih, tapi to Murah sih, tapi... |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://komiknextgonline.com/.../Murah-sih-tapi-cover.jpeg` (image/jpeg, 121185 bytes, 1024x1024) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Baca komik Murah sih, tapi... gratis di Komik Next G Online. Komik anak Indonesia yang seru, ringan, dan aman |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://komiknextgonline.com/.../1` to `https://komiknextgonline.com/.../comic` (1 redirects) |  |  |  |
| page load | PASS | `https://komiknextgonline.com/.../Murah-sih-tapi-cover-bw.jpeg` (image/jpeg, 245771 bytes, 1024x1024) |  |  |  |
