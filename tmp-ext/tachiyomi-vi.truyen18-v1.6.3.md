# Extension Validation Report

- Extension: tachiyomi-vi.truyen18-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7451996450063331380
- Source name: Truyen18
- Source language: vi
- Selected manga input: popular offset 0: Loạn Luân Cùng Chị Dâu (`.../loan-luan-cung-chi-dau`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Loạn Luân Cùng Chị Dâu (`.../loan-luan-cung-chi-dau`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 18 | Tẩy Não Nữ Đế Hancook (`.../tay-nao-nu-de-hancook`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 18 | Kế Hoạch Trao Đổi Mẹ (`.../ke-hoach-trao-doi-me`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | 〖18+〗- Sự Ngây Thơ Bị Vùi Lấp Trong Tro Tàn (`.../18-su-ngay-tho-bi-vui-lap-trong-tro-tan`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 18 | Kế Hoạch Trao Đổi Mẹ (`.../ke-hoach-trao-doi-me`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Loạn Luân Cùng Chị Dâu (`.../loan-luan-cung-chi-dau`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 30 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 18 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 90/90 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 90/90 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.truyen18.co/.../loan-luan-cung-chi-dau.webp` (image/webp (encoding: lossy), 11264 bytes, 250x331) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../loan-luan-cung-chi-dau` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.truyen18.co/.../loan-luan-cung-chi-dau.webp` |  |  |  |
| details author | PASS | ヨーグル本舗 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Hentai Màu, Milf, Ntr, Housewife, Loạn Luân, Cặc Bự, Hentai 3D, Cốt Truyện, Truyện Màu, Censored, Truyện Tranh 18+, Manga |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Nội dung cập nhật chapter truyện hentai Loạn Luân Cùng Chị Dâu mới nhất bên dưới. Các bạn cùng đón đọc truyện tranh sex manhwa hentai người lớn Loạn Luân Cùng Chị Dâu Hentai online miễn phí. Ủng hộ chúng mình bằng cách nhấn vào nút Like! Cảm ơn các bạn rất nhiều! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn2.tymanga.com/.../0.jpg` (image/jpeg, 246564 bytes, 1232x1760) |  |  |  |
