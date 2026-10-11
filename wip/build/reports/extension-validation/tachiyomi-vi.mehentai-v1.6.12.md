# Extension Validation Report

- Extension: tachiyomi-vi.mehentai-v1.6.12
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: manhwaz
- Source ID: 1503074002208879050
- Source name: MeHentai
- Source language: vi
- Selected manga input: popular offset 0: Anna Ojou-sama no Yashikinai Ryuugaku | Mistress Anna Studies Abroad in a Mansion (`.../anna-ojou-sama-no-yashikinai-ryuugaku-mistress-anna-studies-abroad-in-a-mansion-4131373`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | Anna Ojou-sama no Yashikinai Ryuugaku | Mistress Anna Studies Abroad in a Mansion (`.../anna-ojou-sama-no-yashikinai-ryuugaku-mistress-anna-studies-abroad-in-a-mansion-4131373`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Truyện Kẻ muốn tinh dịch của tôi Tiếng Việt | SayHentai (`.../truyen-ke-muon-tinh-dich-cua-toi-tieng-viet-sayhentai`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Truyện Tôi Là Ma Cà Rồng Tiếng Việt | SayHentai (`.../truyen-toi-la-ma-ca-rong-tieng-viet-sayhentai`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Anna Ojou-sama no Yashikinai Ryuugaku | Mistress Anna Studies Abroad in a Mansion (`.../anna-ojou-sama-no-yashikinai-ryuugaku-mistress-anna-studies-abroad-in-a-mansion-4131373`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Anna Ojou-sama no Yashikinai Ryuugaku | Mistress Anna Studies Abroad in a Mansion (`.../anna-ojou-sama-no-yashikinai-ryuugaku-mistress-anna-studies-abroad-in-a-mansion-4131373`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../hitomi-4131373`) |  | <1s |
| pages | `getPageList(chapter)` | success | 49 |  |  | 1-10s |

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
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Anna Ojou-sama no Yashikinai Ryuugaku \| Mistress Anna Studies Abroad in a Mansion, URL=`.../anna-ojou-sama-no-yashikinai-ryuugaku-mistress-anna-studies-abroad-in-a-mansion-4131373` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 47/47 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 47/47 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` (image/webp (encoding: lossy), 127336 bytes, 864x1227) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../anna-ojou-sama-no-yashikinai-ryuugaku-mistress-anna-studies-abroad-in-a-mansion-4131373` |  |  |  |
| details thumbnail URL | PASS | `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` |  |  |  |
| details author | PASS | uziga waita |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Harem, Manga, anal, rough translation, amputee, pregnant, vaginal birth, artist:uziga waita, Truyện tranh |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 49 HTTP page URLs |  |  |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 2, 3, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 4, 5, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 6, 7, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 8, 9, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 10, 11, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 12, 13, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 14, 15, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 16, 17, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 18, 19, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 20, 21, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 22, 23, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 24, 25, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 26, 27, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 28, 29, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 30, 31, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 32, 33, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 34, 35, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 36, 37, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 38, 39, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 40, 41, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 42, 43, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 44, 45, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 46, 47, `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` at pages 48, 49 |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://api.khotruyen.site/.../content <redacted query values: expires, signature, and proxy>` (image/webp (encoding: lossy), 127336 bytes, 864x1227) |  |  |  |
