# Extension Validation Report

- Extension: tachiyomi-vi.moetruyensuicao-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

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
| popular | `getPopularManga(1)` | success | 20 | Chị em nhà Mikadono dễ đối phó thật đấy (`.../219`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Cho đến trước khi cô bạn thanh mai trúc mã Gyaru qua đời! (`.../1429`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Pháp sư tro tàn (`.../553`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Honzuki no Gekokujou: Ferdinand no Yakata ni Te (`.../2089`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Chị em nhà Mikadono dễ đối phó thật đấy (`.../219`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Chị em nhà Mikadono dễ đối phó thật đấy (`.../219`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 225 | 1 (`.../7365`) |  | 1-10s |
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
| chapters | PASS | 225 chapters |  |  |  |
| chapter dates | PASS | 225 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 62 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i.truyen.moe/.../001_XoXns.webp <redacted query values: t>` (image/webp (encoding: lossy), 136450 bytes, 1400x888) |  |  |  |
