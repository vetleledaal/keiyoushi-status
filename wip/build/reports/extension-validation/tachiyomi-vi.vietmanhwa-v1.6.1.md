# Extension Validation Report

- Extension: tachiyomi-vi.vietmanhwa-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 242689715978074590
- Source name: VietManhwa
- Source language: vi
- Selected manga input: popular offset 0: Sex Toy Không Dây (`.../sextoy-ket-noi-khong-day`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Sex Toy Không Dây (`.../sextoy-ket-noi-khong-day`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Tân Sinh Viên Chưa Kịp Học, Đã Kịp Chịch (`.../tan-sinh-vien-chua-kip-hoc-a-kip-chich`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Thuần Hóa Chị Kế Của Tôi (`.../thuan-hoa-chi-ke-cua-toi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Tỉnh Dậy Được Skin Girl, Từ Newbie Thành Gái Dâm Huyền Thoại (`.../tinh-day-uoc-skin-girl-tu-newbie-thanh-gai-dam-huyen-thoai`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 18 | Sex Toy Không Dây (`.../sextoy-ket-noi-khong-day`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sex Toy Không Dây (`.../sextoy-ket-noi-khong-day`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 125 | Chương 1 (`.../chuong-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sex Toy Không Dây, URL=`sextoy-ket-noi-khong-day` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 138/138 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 138/138 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.vietmanhwa.org/.../image-1779675995996-e0ae42fc.webp` (image/webp (container: extended), 87912 bytes, 575x767) |  |  |  |
| details identity | PASS | Details preserved selected URL `sextoy-ket-noi-khong-day` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.vietmanhwa.org/.../image-1779675995996-e0ae42fc.webp` |  |  |  |
| details author | PASS | Swehwangjorongie |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Adult, Comedy, Harem, Romance, Sex Toys, Vanilla, Supernatural, X-ray |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Park Woojin, sinh viên kỹ thuật, ăn may mua được một cái Sếch Toy bí ẩn có chức năng kết nối không dây với cơ thể phụ nữ mà anh ta ghim.<br>Khi cậu dùng nó, mọi cú thúc sẽ truyền thẳng 100% đến cô gái mà cậu chọn (cô ấy sẽ “cảm nhận” như đang bị chịch thật).<br><br>Mục tiêu đầu tiên: Ahyoung – nữ thần xinh đẹp nhất trường.<br><br>**Tên khác:**<br>- Wireless Onahole |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 22 name |  |  |  |
| chapters | PASS | 125 chapters |  |  |  |
| chapter dates | PASS | 125 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://vietmanhwa.com/.../danh-sach.data <redacted query values: _routes, page, and sort>` to `https://vietmanhwa.org/.../danh-sach.data <redacted query values: _routes, page, and sort>` (1 redirects); popular: `https://vietmanhwa.com/.../danh-sach.data <redacted query values: _routes, page, and sort>` to `https://vietmanhwa.org/.../danh-sach.data <redacted query values: _routes, page, and sort>` (1 redirects); popular: `https://vietmanhwa.com/.../danh-sach.data <redacted query values: _routes, page, and sort>` to `https://vietmanhwa.org/.../danh-sach.data <redacted query values: _routes, page, and sort>` (1 redirects); popular: `https://vietmanhwa.com/.../sextoy-ket-noi-khong-day.data <redacted query values: _routes>` to `https://vietmanhwa.org/.../sextoy-ket-noi-khong-day.data <redacted query values: _routes>` (1 redirects); popular: `https://vietmanhwa.com/.../nang-cao.data <redacted query values: _routes, apply, page, q, and sort>` to `https://vietmanhwa.org/.../nang-cao.data <redacted query values: _routes, apply, page, q, and sort>` (1 redirects); popular: `https://vietmanhwa.com/.../chuong-1.data <redacted query values: _routes>` to `https://vietmanhwa.org/.../chuong-1.data <redacted query values: _routes>` (1 redirects); popular: `https://vietmanhwa.com/.../danh-sach.data <redacted query values: _routes, page, and sort>` to `https://vietmanhwa.org/.../danh-sach.data <redacted query values: _routes, page, and sort>` (1 redirects) |  |  |  |
| page load | PASS | `https://cdn.vietmanhwa.org/.../001_67de1e94a25b7-1779671208505-8b0d1082.webp` (image/webp (encoding: lossy), 958784 bytes, 729x15110) |  |  |  |
