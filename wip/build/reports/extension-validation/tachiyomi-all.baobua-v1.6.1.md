# Extension Validation Report

- Extension: tachiyomi-all.baobua-v1.6.1
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
- Source ID: 514187608699312366
- Source name: BaoBua
- Source language: all
- Selected manga input: popular offset 0: Vẻ đẹp quyến rũ của Bắc Kinh trong những ngày chớm Đông (`.../SWdvbTlxRlNra3d2bXR2Uzd5V1lHUT09.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Vẻ đẹp quyến rũ của Bắc Kinh trong những ngày chớm Đông (`.../SWdvbTlxRlNra3d2bXR2Uzd5V1lHUT09.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Nàng hậu Khánh Hòa cao 1,76m, body nóng bỏng, học Kiến trúc rồi lấy bằng thạc sĩ MBA, tuổi 30 vừa xinh đẹp vừa là giám đốc (`.../SzNZYmJrNzRiaWxWZGU1NWljRFAwQT09.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | Vẻ đẹp quyến rũ của Bắc Kinh trong những ngày chớm Đông (`.../SWdvbTlxRlNra3d2bXR2Uzd5V1lHUT09.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Vẻ đẹp quyến rũ của Bắc Kinh trong những ngày chớm Đông (`.../SWdvbTlxRlNra3d2bXR2Uzd5V1lHUT09.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../SWdvbTlxRlNra3d2bXR2Uzd5V1lHUT09.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Vẻ đẹp quyến rũ của Bắc Kinh trong những ngày chớm Đông, URL=`.../SWdvbTlxRlNra3d2bXR2Uzd5V1lHUT09.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://go.thismore.fun/.../aStvd0pWU2JoOEZRdzVrT3lGSGlpZEdabzZyajhzQVdyNjB5cW5hR1cweEZaS0VDRGxnNS9FdSt3YUg0WEZBTGdabE9pMmdiTEZSYWdxNmFDYlhaMHQ4U0N1UVJGZnR5UmRFM09sMWlHS1JoS2twam5JUy82WklWa1hXN2dENVQ-d.jpg` (image/jpeg, 122807 bytes, 960x646) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../SWdvbTlxRlNra3d2bXR2Uzd5V1lHUT09.html` |  |  |  |
| details thumbnail URL | PASS | `https://go.thismore.fun/.../aStvd0pWU2JoOEZRdzVrT3lGSGlpZEdabzZyajhzQVdyNjB5cW5hR1cweEZaS0VDRGxnNS9FdSt3YUg0WEZBTGdabE9pMmdiTEZSYWdxNmFDYlhaMHQ4U0N1UVJGZnR5UmRFM09sMWlHS1JoS2twam5JUy82WklWa1hXN2dENVQ-d.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | chớm, Bắc Kinh, Di Hòa Viên, cảnh sắc |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://go.thismore.fun/.../aStvd0pWU2JoOEZRdzVrT3lGSGlpZEdabzZyajhzQVdyNjB5cW5hR1cweEZaS0VDRGxnNS9FdSt3YUg0WEZBTGdabE9pMmdiTEZSYWdxNmFDYlhaMHVMenAwUW9oWkRGczRuWGVyeGdxVjVHN2paS3dVOVpwMUhDT0JjOGhLbEY-d.jpg` (image/jpeg, 195470 bytes, 960x671) |  |  |  |
