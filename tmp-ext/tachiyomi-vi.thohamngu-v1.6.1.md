# Extension Validation Report

- Extension: tachiyomi-vi.thohamngu-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 0
- Warnings: 2
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 955691323709162100
- Source name: Thỏ Ham Ngủ
- Source language: vi
- Selected manga input: popular offset 0: Nam Chính Bệnh Hoạn Ám Ảnh Với Sức Khoẻ Của Tôi (`.../nam-chinh-benh-hoan-am-anh-voi-suc-khoe-cua-toi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 19 | Nam Chính Bệnh Hoạn Ám Ảnh Với Sức Khoẻ Của Tôi (`.../nam-chinh-benh-hoan-am-anh-voi-suc-khoe-cua-toi`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 21 | Chẳng Phải Tôi Là Nữ Chính Của Tiểu Thuyết Hối Hận Sao? (`.../chang-phai-toi-la-nu-chinh-cua-tieu-thuyet-hoi-han-sao`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Công Tước Phu Nhân Đang Tìm Chồng (`.../cong-tuoc-phu-nhan-dang-tim-chong`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Nam Chính Bệnh Hoạn Ám Ảnh Với Sức Khoẻ Của Tôi (`.../nam-chinh-benh-hoan-am-anh-voi-suc-khoe-cua-toi`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Nam Chính Bệnh Hoạn Ám Ảnh Với Sức Khoẻ Của Tôi (`.../nam-chinh-benh-hoan-am-anh-voi-suc-khoe-cua-toi`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 77 | Chương 1 (`.../nam-chinh-benh-hoan-am-anh-voi-suc-khoe-cua-toi-chuong-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 27 |  |  | 1-10s |

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
| popular listing | PASS | 19 entries |  |  |  |
| latest listing | PASS | 21 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Nam Chính Bệnh Hoạn Ám Ảnh Với Sức Khoẻ Của Tôi, URL=`.../nam-chinh-benh-hoan-am-anh-voi-suc-khoe-cua-toi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Có Nhiều Nam Chính Quá Đi!, URL=`.../co-nhieu-nam-chinh-qua-di` at page 1 offset 20 and page 2 offset 4 |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 1 manga entry: title=Nam Phụ À, Anh Nói Đó Chỉ Là Hôn Nhân Hợp Đồng Thôi Mà?, URL=`.../nam-phu-a-anh-noi-do-chi-la-hon-nhan-hop-dong-thoi-ma` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 52/52 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 52/52 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thohamngu.xyz/.../B50.webp` (image/webp (container: extended), 894424 bytes, 2142x3059) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../nam-chinh-benh-hoan-am-anh-voi-suc-khoe-cua-toi` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://thohamngu.xyz/.../B50-400x540.webp` (image/webp (container: extended), 75654 bytes, 400x540) |  |  |  |
| details author | PASS | Đang cập nhật |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Âu Cổ, Baby, Bé Con, Chuyển Sinh, Chữa Lành, Manhwa, Lãng Mạng |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Tôi đã được tái sinh thành một diễn viên quần chúng. Người bạn thời thơ ấu bị lãng quên của nam chính, diễn viên quần chúng chết sớm trong một cuốn tiểu thuyết. Vì tôi bị bệnh nan y, tôi thậm chí không thể tránh được lá cờ tử thần, nên tôi chỉ cố gắng sống chung với nó… Nhưng sau đó… “Tại sao cậu không khỏe vậy?” “Tôi đã bảo cậu phải khỏe mạnh mà.” “Tại sao em lại ốm nữa? Phải xin phép trước khi bị ốm chứ.” Nam chính biến thành một kẻ điên cuồng ám ảnh về sức khỏe. Aaa, ai đó làm ơn đưa tên này cho khuất mắt tôi với! — Xem Thêm — |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 77 chapters |  |  |  |
| chapter dates | PASS | 77 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://thohamngu.xyz/.../IMG_2645.webp` (image/webp (container: extended), 68510 bytes, 1280x1067) |  |  |  |
