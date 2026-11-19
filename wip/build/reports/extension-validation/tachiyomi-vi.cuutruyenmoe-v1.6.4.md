# Extension Validation Report

- Extension: tachiyomi-vi.cuutruyenmoe-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 1
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3973269831131863421
- Source name: CuuTruyen (unoriginal)
- Source language: vi
- Selected manga input: popular offset 0: Youkai gakkou no Sensei Hajimemashita! (`.../youkai-gakkou-no-sensei-hajimemashita`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | Youkai gakkou no Sensei Hajimemashita! (`.../youkai-gakkou-no-sensei-hajimemashita`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 60 | Mikoto-chan không muốn bị ghét! (`.../mikoto-chan-khong-muon-bi-ghet`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 60 | Fantastic Four 2025 (`.../fantastic-four-2025`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 60 | Hey! Devil Girl! (`.../hey-devil-girl`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Youkai gakkou no Sensei Hajimemashita! (`.../youkai-gakkou-no-sensei-hajimemashita`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 121 | Chap 1: Chào mừng tới học viện Hyakki (`.../chao-mung-toi-hoc-vien-hyakki-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 55 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | SKIP | HTTP error 500 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 240/240 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 240/240 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ct.shousetsu.dev/.../07170fc8-aed7-4d48-b063-393ee50991b1-1758578971.jpg` (image/jpeg, 36520 bytes, 224x336) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../youkai-gakkou-no-sensei-hajimemashita` |  |  |  |
| details thumbnail URL | PASS | `https://ct.shousetsu.dev/.../07170fc8-aed7-4d48-b063-393ee50991b1-1758578971.jpg` |  |  |  |
| details author | PASS | Tanaka Mai |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Haruaki, một chàng trai nhát gan với sở thích đặc biệt là đồng phục thuỷ thủ, anh có ước muốn trở thành một giáo viên tốt. Tuy nhiên, ngôi trường mới mà anh đến dạy lại không giống như những gì anh nghĩ: đó là một học viện dành cho yêu quái, ma quỷ và đủ loại sinh vật siêu nhiên!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 121 chapters |  |  |  |
| chapter dates | PASS | 121 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ct.shousetsu.dev/.../0.jpg` (image/jpeg, 216004 bytes, 723x1082) |  |  |  |
