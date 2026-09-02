# Extension Validation Report

- Extension: tachiyomi-vi.kamicomic-v1.6.5
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 26
- Lint: 1
- Warnings: 4
- Skipped: 3
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4858507068999692510
- Source name: KamiComic
- Source language: vi
- Selected manga input: popular offset 0: Manitto (`.../manitto`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | Manitto (`.../manitto`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 33 | Con Sói Ăn Cắp Mặt Trời (`.../con-soi-an-cap-mat-troi`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 23 | Hoa Hồng Ẩn Giấu Sao Băng (`.../hoa-hong-an-giau-sao-bang`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 27 | Kẻ Chuyên Gây Bê Bối Đã Trở Lại (`.../ke-chuyen-gay-be-boi-da-tro-lai`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | Manitto (`.../manitto`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Manitto (`.../manitto`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 83 | 🔒 Chương 1 (`.../chuong-1`) |  | 1-10s |
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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 23 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Manitto, URL=`.../manitto` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Tình Yêu Méo Mó, URL=`.../tinh-yeu-meo-mo` at page 1 offsets 1, 31 and page 2 offset 32, title=Cánh Đồng Bị Lãng Quên, URL=`.../canh-dong-bi-lang-quen` at page 1 offsets 3, 23 and page 2 offset 24, title=Nữ Hầu Bí Mật Của Nhà Bá Tước, URL=`.../nu-hau-bi-mat-cua-nha-ba-tuoc` at page 1 offsets 4, 27 and page 2 offset 28, title=Mang Thai Trong Sự Phục Tùng, URL=`.../mang-thai-trong-su-phuc-tung` at page 1 offsets 9, 24 and page 2 offset 25, title=Mộ Thiên Nga, URL=`.../mo-thien-nga` at page 1 offsets 11, 30 and page 2 offset 31, title=Bí Mật Của Tiền Bối Hoàn Hảo, URL=`.../bi-mat-cua-tien-boi-hoan-hao` at page 1 offset 25 and page 2 offsets 11, 26, title=Hang Kiến \[Bản Hoàn Chỉnh\], URL=`.../hang-kien-ban-hoan-chinh` at page 1 offset 26 and page 2 offsets 12, 27, title=Chuyến Đi Hội Thảo Cùng Các Sếp, URL=`.../chuyen-di-hoi-thao-cung-cac-sep` at page 1 offset 28 and page 2 offset 29, title=Giới Hạn Của Sự Ám Ảnh, URL=`.../gioi-han-cua-su-am-anh` at page 1 offset 29 and page 2 offset 30 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Bí Mật Của Tiền Bối Hoàn Hảo, URL=`.../bi-mat-cua-tien-boi-hoan-hao` at page 1 offsets 5, 16 and page 2 offset 20, title=Mang Thai Trong Sự Phục Tùng, URL=`.../mang-thai-trong-su-phuc-tung` at page 1 offsets 7, 15 and page 2 offset 19, title=Hang Kiến \[Bản Hoàn Chỉnh\], URL=`.../hang-kien-ban-hoan-chinh` at page 1 offsets 8, 17 and page 2 offset 21, title=Nữ Hầu Bí Mật Của Nhà Bá Tước, URL=`.../nu-hau-bi-mat-cua-nha-ba-tuoc` at page 1 offsets 10, 18 and page 2 offset 22, title=Cánh Đồng Bị Lãng Quên, URL=`.../canh-dong-bi-lang-quen` at page 1 offsets 12, 14 and page 2 offset 18, title=Chuyến Đi Hội Thảo Cùng Các Sếp, URL=`.../chuyen-di-hoi-thao-cung-cac-sep` at page 1 offset 19 and page 2 offsets 1, 23, title=Giới Hạn Của Sự Ám Ảnh, URL=`.../gioi-han-cua-su-am-anh` at page 1 offset 20 and page 2 offset 24, title=Mộ Thiên Nga, URL=`.../mo-thien-nga` at page 1 offset 21 and page 2 offset 25, title=Tình Yêu Méo Mó, URL=`.../tinh-yeu-meo-mo` at page 1 offset 22 and page 2 offset 26 |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 5 manga entries; Popular page 2 repeats 2 manga entries: title=Bí Mật Của Tiền Bối Hoàn Hảo, URL=`.../bi-mat-cua-tien-boi-hoan-hao`, title=Hang Kiến \[Bản Hoàn Chỉnh\], URL=`.../hang-kien-ban-hoan-chinh`; Latest page 1 repeats 5 manga entries; Latest page 2 repeats 1 manga entry: title=Chuyến Đi Hội Thảo Cùng Các Sếp, URL=`.../chuyen-di-hoi-thao-cung-cac-sep` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 125/125 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 124/125 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kamicomi.com/.../MANITTO-4-300x400.webp` (image/webp (container: extended), 22508 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manitto` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://kamicomi.com/.../MANITTO-4.webp` (image/webp (container: extended), 74176 bytes, 720x970) |  |  |  |
| details author | PASS | Chocochip |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 18+, Adult, Comedy, Manhwa, Romance, Smut, Webtoon |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Giới thiệu Manitto Khi Ji Yoon bị lạc trong khuôn viên đại học, Joon Young đã ra tay giúp đỡ. Kể từ ngày hôm đó, cô luôn mong được gặp lại cậu. Đường đời của họ lại giao nhau trong buổi tập huấn, khi cả hai bất ngờ gặp lại nhau… Trong trò chơi đi tìm Manitto, cùng với những người bạn của mình, Ji Yoon đã dần thay đổi! “Cuộc gặp gỡ đầu tiên, người đầu tiên đối xử tốt với tôi, Manitto của tôi, chính là…” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 83 chapters |  |  |  |
| chapter dates | PASS | 83 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
