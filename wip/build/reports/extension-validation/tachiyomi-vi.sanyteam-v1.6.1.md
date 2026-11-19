# Extension Validation Report

- Extension: tachiyomi-vi.sanyteam-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5675386432395414474
- Source name: Sany Team
- Source language: vi
- Selected manga input: popular offset 0: Tình Nhân 4 Tuần (`.../tinh-nhan`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | Tình Nhân 4 Tuần (`.../tinh-nhan`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 15 | [Drop] Phải Chăng Là Định Mệnh (`.../phai-chang-la-dinh-menh`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 15 | MƯỜI NĂM (`.../muoi-nam`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 15 | QUẢN LÝ CỦA TÔI (`.../quan-ly-cua-toi`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tình Nhân 4 Tuần (`.../tinh-nhan`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tình Nhân 4 Tuần (`.../tinh-nhan`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 138 | Tình Nhân 4 Tuần Chap 1 (`.../tinh-nhan-4-tuan-chap-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 6 |  |  | <1s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tình Nhân 4 Tuần, URL=`.../tinh-nhan` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.teamsany.com/.../1cover.jpg` (image/jpeg, 316183 bytes, 1120x1600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tinh-nhan` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.teamsany.com/.../1cover.jpg` |  |  |  |
| details author | PASS | M |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | \[Link raw ủng hộ tác giả\](https://ridibooks.com/.../4296000001 <redacted query values: _rdt_sid and _rdt_idx>)<br><br>🗓 LỊCH ĐĂNG: 6H SÁNG CÁC NGÀY 08,18,28<br><br>\[***LINK ANIMATION***\](https://teamsany.com/.../animation-tinh-nhan-4-tuan-tap-1-2) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 138 chapters |  |  |  |
| chapter dates | PASS | 138 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.teamsany.com/.../01-2.jpg` (image/jpeg, 886381 bytes, 1280x11257) |  |  |  |
