# Extension Validation Report

- Extension: tachiyomi-vi.truyen18-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source ID: 7451996450063331380
- Source name: Truyen18
- Source language: vi
- Selected manga input: popular offset 0: Sự Dâm Loạn Ở Bệnh Viện (`.../su-dam-loan-o-benh-vien`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Sự Dâm Loạn Ở Bệnh Viện (`.../su-dam-loan-o-benh-vien`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Tẩy Não Nữ Đế Hancook (`.../tay-nao-nu-de-hancook`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Kế Hoạch Trao Đổi Mẹ (`.../ke-hoach-trao-doi-me`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | 〖18+〗- Sự Ngây Thơ Bị Vùi Lấp Trong Tro Tàn (`.../18-su-ngay-tho-bi-vui-lap-trong-tro-tan`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 18 | Ero: Công Chúa Khuất Phục (`.../ero-cong-chua-khuat-phuc`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sự Dâm Loạn Ở Bệnh Viện (`.../su-dam-loan-o-benh-vien`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 57 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 5: title=Sự Dâm Loạn Ở Bệnh Viện, URL=`.../su-dam-loan-o-benh-vien` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 90/90 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 90/90 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.truyen18.co/.../su-dam-loan-o-benh-vien.webp` (image/webp (encoding: lossy), 99214 bytes, 720x1186) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../su-dam-loan-o-benh-vien` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.truyen18.co/.../su-dam-loan-o-benh-vien.webp` |  |  |  |
| details author | PASS | Đang cập nhật |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Censored, Truyện Tranh 18+, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Nội dung cập nhật chapter truyện hentai Sự Dâm Loạn Ở Bệnh Viện mới nhất bên dưới. Các bạn cùng đón đọc truyện tranh sex manhwa hentai người lớn Sự Dâm Loạn Ở Bệnh Viện Hentai online miễn phí. Ủng hộ chúng mình bằng cách nhấn vào nút Like! Cảm ơn các bạn rất nhiều! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 57 chapters |  |  |  |
| chapter dates | PASS | 57 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn2.tymanga.com/.../1.webp` (image/webp (encoding: lossy), 41022 bytes, 642x1769) |  |  |  |
