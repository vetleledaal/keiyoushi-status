# Extension Validation Report

- Extension: tachiyomi-vi.damconuong-v1.6.21
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2680345917627448572
- Source name: DamCoNuong
- Source language: vi
- Selected manga input: popular offset 0: Sextoy kết nối không dây (`.../sextoy-ket-noi-khong-day`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Sextoy kết nối không dây (`.../sextoy-ket-noi-khong-day`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Mẹ Vợ Vẫn Là Tuyệt Nhất! (`.../me-vo-van-la-tuyet-nhat-1`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Câu chuyện Mùa hè của tôi cùng Chị ấy đã bắt đầu (`.../cau-chuyen-mua-he-cua-toi-cung-chi-ay-da-bat-dau`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Người mẹ bất cẩn thản nhiên đến chỗ con trai (`.../nguoi-me-bat-can-than-nhien-den-cho-con-trai`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Sextoy kết nối không dây (`.../sextoy-ket-noi-khong-day`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sextoy kết nối không dây (`.../sextoy-ket-noi-khong-day`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 132 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | kotlinx.serialization.MissingFieldException: Field 'e' is required for type with serial name 'eu.kanade.tachiyomi.extension.vi.damconuong.PagesResponse', but it was missing | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | kotlinx.serialization.MissingFieldException: Field 'e' is required for type with serial name 'eu.kanade.tachiyomi.extension.vi.damconuong.PagesResponse', but it was missing | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sextoy kết nối không dây, URL=`.../sextoy-ket-noi-khong-day` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 123/123 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 123/123 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://zs.wtcdn.xyz/.../08480820-bb4b-412c-a696-9fb43f517fef6a73161a67b6a.jpg` (image/jpeg, 61776 bytes, 500x662) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sextoy-ket-noi-khong-day` |  |  |  |
| details thumbnail URL | PASS | `https://zs.wtcdn.xyz/.../08480820-bb4b-412c-a696-9fb43f517fef6a73161a67b6a.jpg` |  |  |  |
| details author | PASS | Swehwangjorongie |  |  |  |
| details artist | PASS | Ottogi |  |  |  |
| details genres | PASS | Drama, Manhwa, Comedy, Ecchi, Fantasy, Milf, Adult, Ahegao, Comic, Harem, Romance, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Park Woojin, sinh viên kỹ thuật, mua nhầm một cái onahole “xịn” có chức năng kết nối không dây với cơ thể phụ nữ gần đó. Khi cậu dùng nó, mọi cảm giác sẽ truyền thẳng 100% đến cô gái mà cậu chọn (cô ấy sẽ “cảm nhận” như đang bị làm thật). Ngược lại, phản ứng của cô ấy cũng làm onahole tự cử động theo. Câu đầu tiên cậu shock: “Ủa, cái onahole… tự động rồi?!” Mục tiêu đầu tiên: Ahyoung – nữ thần xinh đẹp nhất trường. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 132 chapters |  |  |  |
| chapter dates | PASS | 132 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Field 'e' is required for type with serial name 'eu.kanade.tachiyomi.extension.vi.damconuong.PagesResponse', but it was missing |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://damconuong.cool/.../tim-kiem <redacted query values: sort and page>` to `https://damconuong.tech/.../tim-kiem <redacted query values: sort and page>` (1 redirects); popular: `https://damconuong.cool/.../tim-kiem <redacted query values: page>` to `https://damconuong.tech/.../tim-kiem <redacted query values: page>` (1 redirects); popular: `https://damconuong.cool/.../tim-kiem <redacted query values: sort and page>` to `https://damconuong.tech/.../tim-kiem <redacted query values: sort and page>` (1 redirects); popular: `https://damconuong.cool/.../sextoy-ket-noi-khong-day` to `https://damconuong.tech/.../sextoy-ket-noi-khong-day` (1 redirects); popular: `https://damconuong.cool/.../tim-kiem <redacted query values: page, sort, and filter\[name\]>` to `https://damconuong.tech/.../tim-kiem <redacted query values: page, sort, and filter\[name\]>` (1 redirects); popular: `https://damconuong.cool/.../bookmark.js` to `https://damconuong.tech/.../bookmark.js` (1 redirects); popular: `https://damconuong.cool/.../tim-kiem <redacted query values: page>` to `https://damconuong.tech/.../tim-kiem <redacted query values: page>` (1 redirects); popular: `https://damconuong.cool/.../pages <redacted query values: _>` to `https://damconuong.tech/.../pages <redacted query values: _>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
