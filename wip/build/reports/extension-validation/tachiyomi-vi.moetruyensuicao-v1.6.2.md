# Extension Validation Report

- Extension: tachiyomi-vi.moetruyensuicao-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7257946851767599928
- Source name: MoeTruyenSuiCao (unoriginal)
- Source language: vi
- Selected manga input: popular offset 0: Chị em nhà Mikadono dễ đối phó thật đấy (`.../219`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Chị em nhà Mikadono dễ đối phó thật đấy (`.../219`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Goblin Slayer (`.../1099`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | TS Medic's Battlefield Diary (`.../882`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | HAPPINESS - Ứng Dụng Toại Nguyện Điều Ước (`.../2510`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Chị em nhà Mikadono dễ đối phó thật đấy (`.../219`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Chị em nhà Mikadono dễ đối phó thật đấy (`.../219`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 228 | 1 (`.../7365`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 62 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Chị em nhà Mikadono dễ đối phó thật đấy, URL=`219` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://u.truyen.moe/.../219-ba-chi-em-nha-mikadono-de-doi-pho-that-day.webp <redacted query values: t>` (image/webp (encoding: lossy), 56108 bytes, 358x514) |  |  |  |
| details identity | PASS | Details preserved selected URL `219` |  |  |  |
| details thumbnail URL | PASS | `https://u.truyen.moe/.../219-ba-chi-em-nha-mikadono-de-doi-pho-that-day.webp <redacted query values: t>` |  |  |  |
| details author | PASS | Hirakawa Aya |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Drama, School Life, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Yuu- con trai của nữ diễn viên huyền thoại Subaru, sau khi mẹ của cậu mất đã được gia chủ nhà Mikadono nhận nuôi. Nhà Mikadono nổi tiếng với ba chị em thiên tài Kazuki, Niko, Miwa. Liệu một đứa bất tài, chỉ thừa hưởng được nhan sắc của mẹ có thể xoay ba chị em thiên tài kia như chong chóng được không...? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 228 chapters |  |  |  |
| chapter dates | PASS | 228 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 62 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://i.truyen.moe/.../001_XoXns.js <redacted query values: t>` could not be downloaded: java.lang.IllegalArgumentException: Unsupported IMGX version: 4 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
