# Extension Validation Report

- Extension: tachiyomi-vi.ruahapchanhday-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 7438489045468990067
- Source name: Rùa Hấp Chanh Dây
- Source language: vi
- Selected manga input: popular offset 0: Ướt Át Đến Từng Hơi Thở~~ (`.../297`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Ướt Át Đến Từng Hơi Thở~~ (`.../297`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | SÓI TRỘM MẶT TRỜI (`.../831`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | NHẬT KÝ SUY NGHĨ TIÊU CỰC (`.../835`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Quái Vật Và Nàng Mù (`.../787`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ướt Át Đến Từng Hơi Thở~~ (`.../297`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ướt Át Đến Từng Hơi Thở~~ (`.../297`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | Chap 1 (`.../chap-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ướt Át Đến Từng Hơi Thở~~, URL=`297` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ruahapchanhday2.com/.../admin-ajax_result-6-175x238.webp` (image/webp (encoding: lossy), 9280 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `297` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ruahapchanhday2.com/.../admin-ajax_result-6.webp` (image/webp (encoding: lossy), 19528 bytes, 350x497) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | TTK team |  |  |  |
| details genres | PASS | 18+, Đã hoàn, GL, Manga, Tình cảm, Drama, Manhwa, Harem, Hiện đại, Huyền huyễn, Ngôn tình |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ruahapchanhday2.com/.../7_1_11zon.webp` (image/webp (container: extended), 149056 bytes, 1336x1920) |  |  |  |
