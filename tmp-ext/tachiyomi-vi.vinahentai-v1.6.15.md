# Extension Validation Report

- Extension: tachiyomi-vi.vinahentai-v1.6.15
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4572372176917567711
- Source name: VinaHentai
- Source language: vi
- Selected manga input: popular offset 0: Sex Toy Không Dây (`.../sextoy-ket-noi-khong-day`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Sex Toy Không Dây (`.../sextoy-ket-noi-khong-day`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Ojisan Meat Shop (`.../ojisan-meat-shop`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 40 | Các Họa Sĩ Doujinshi Theo Đuổi Chủ Nghĩa Hiện Thực (`.../cac-hoa-si-doujinshi-theo-duoi-chu-nghia-hien-thuc`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 39 | Siêu Cấp Máy Dập Lạc Vào Công Ty Nữ (`.../sieu-cap-may-dap-lac-vao-cong-ty-nu`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 40 | Sex Toy Không Dây (`.../sextoy-ket-noi-khong-day`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sex Toy Không Dây (`.../sextoy-ket-noi-khong-day`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 106 | Chương 1 (`.../chuong-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sex Toy Không Dây, URL=`.../sextoy-ket-noi-khong-day` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 199/199 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 199/199 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://vnht.vinahentai.lat/.../image-1779675995793-a77e88f5.webp` (image/webp (container: extended), 48024 bytes, 360x480) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sextoy-ket-noi-khong-day` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://vnht.vinahentai.lat/.../image-1779675995996-e0ae42fc.webp` (image/webp (container: extended), 87912 bytes, 575x767) |  |  |  |
| details author | PASS | Swehwangjorongie1 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Vanilla, Supernatural, Adult, Comedy, Harem, Romance, Sex Toys, X-ray, Hentai không che, Manhwa 18+, Hentai 3D, Hentaivn, NTR |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Park Woojin, sinh viên kỹ thuật, ăn may mua được một cái Sếch Toy bí ẩn có chức năng kết nối không dây với cơ thể phụ nữ mà anh ta ghim. Khi cậu dùng nó, mọi cú thúc sẽ truyền thẳng 100% đến cô gái mà cậu chọn (cô ấy sẽ “cảm nhận” như đang bị chịch thật). Mục tiêu đầu tiên: Ahyoung – nữ thần xinh đẹp nhất trường. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 106 chapters |  |  |  |
| chapter dates | PASS | 106 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://vnht.vinahentai.lat/.../001_67de1e94a25b7-1779671208505-8b0d1082.webp` (image/webp (encoding: lossy), 958784 bytes, 729x15110) |  |  |  |
