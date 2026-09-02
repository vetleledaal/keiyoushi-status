# Extension Validation Report

- Extension: tachiyomi-vi.truyenhentaiz-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7162158808407514407
- Source name: TruyenHentaiz
- Source language: vi
- Selected manga input: popular offset 0: Tẩy Não Nữ Đế Hancook (`.../tay-nao-nu-de-hancook.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Tẩy Não Nữ Đế Hancook (`.../tay-nao-nu-de-hancook.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Black Pirate (`.../black-pirate.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Vị Khách Trong Đêm (`.../vi-khach-trong-dem.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Nhà Của Mẹ Và Con Gái (`.../nha-cua-me-va-con-gai.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tẩy Não Nữ Đế Hancook (`.../tay-nao-nu-de-hancook.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tẩy Não Nữ Đế Hancook (`.../tay-nao-nu-de-hancook.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | One Shot (`.../one-shot.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tẩy Não Nữ Đế Hancook, URL=`.../tay-nao-nu-de-hancook.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://truyenhentaiz.net/.../tay-nao-nu-de-hancook.webp` (image/webp (encoding: lossy), 30688 bytes, 500x662) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tay-nao-nu-de-hancook.html` |  |  |  |
| details thumbnail URL | PASS | `https://truyenhentaiz.net/.../tay-nao-nu-de-hancook.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Doujinshi, Hentai Màu, Không Che, Mind Control, Ngực Lớn, One Shot |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Đọc truyện hentai Tẩy Não Nữ Đế Hancook Tiếng việt mới nhất tại TruyenhentaiZ. Truyện Tẩy Não Nữ Đế Hancook thuộc thể loại Adult, Doujinshi, Hentai Màu, Không Che, Mind Control, Ngực Lớn, One Shot dịch Tiếng Việt mới nhất được tổng hợp từ các nhóm dịch trên Internet và từ HentaiZ. Chia sẻ truyện hentai này đến với mọi người để ủng hộ TruyenHentaiZ phát triển và ra nhiều chương truyện tương tự Tẩy Não Nữ Đế Hancook nhé. Cảm ơn các bạn. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
