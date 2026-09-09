# Extension Validation Report

- Extension: tachiyomi-vi.meosss-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6733296438137670174
- Source name: MeoSSS
- Source language: vi
- Selected manga input: popular offset 0: Kiện Tôi Đi Nào, Bé Iu! (`.../kien-toi-di-nao-be-iu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Kiện Tôi Đi Nào, Bé Iu! (`.../kien-toi-di-nao-be-iu`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 28 | Chàng Cún Thuần Khiết (`.../chang-cun-thuan-khiet`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 28 | Câu Lạc Bộ Chị Đẹp (`.../cau-lac-bo-chi-dep`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kiện Tôi Đi Nào, Bé Iu! (`.../kien-toi-di-nao-be-iu`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kiện Tôi Đi Nào, Bé Iu! (`.../kien-toi-di-nao-be-iu`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | Chap 0 (`.../chap-0`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 6 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 28 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kiện Tôi Đi Nào, Bé Iu!, URL=`.../kien-toi-di-nao-be-iu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 77/77 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 77/77 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://meosss.com/.../Kien-Toi-Di-Nao-Be-Iu-300x400.webp` (image/webp (encoding: lossy), 13694 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kien-toi-di-nao-be-iu` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://meosss.com/.../Kien-Toi-Di-Nao-Be-Iu-450x600.webp` (image/webp (encoding: lossy), 24378 bytes, 450x600) |  |  |  |
| details author | PASS | 구운야채믹스 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 18+, 1x1, Hiện Đại, Lãng Mạn, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.meosss.com/.../cf0f056c1c88-0-credit-meosss.webp` (image/webp (container: extended), 43490 bytes, 720x720) |  |  |  |
