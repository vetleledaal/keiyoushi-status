# Extension Validation Report

- Extension: tachiyomi-vi.kirakira-v1.6.4
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
- Source ID: 6706783596626868301
- Source name: KiraKira
- Source language: vi
- Selected manga input: popular offset 0: Lời tỏ tình mạnh mẽ (`.../loi-to-tinh-manh-me`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 19 | Lời tỏ tình mạnh mẽ (`.../loi-to-tinh-manh-me`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 18 | Độc Lạ Dungeon (`.../doc-la-dungeon`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Hàng Xóm Mọt Sách Lại Là Chủ Nhân Ma Tháp ?! (`.../hang-xom-mot-sach-lai-la-chu-nhan-ma-thap`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 19 | Lọt Hố Ngài Hoàng Tử (`.../lot-ho-ngai-hoang-tu`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Lời tỏ tình mạnh mẽ (`.../loi-to-tinh-manh-me`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lời tỏ tình mạnh mẽ (`.../loi-to-tinh-manh-me`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 60 | Chapter 1 (`.../1`) |  | <1s |
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
| popular listing | PASS | 19 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lời tỏ tình mạnh mẽ, URL=`.../loi-to-tinh-manh-me` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 77/77 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 77/77 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.truyenkira.net/.../thumbnail-opt.webp` (image/webp (encoding: lossy), 67874 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../loi-to-tinh-manh-me` |  |  |  |
| details thumbnail URL | PASS | `https://images.truyenkira.net/.../thumbnail-opt.webp` |  |  |  |
| details author | PASS | Cà chua xí hổ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comic, Manhwa, Ngôn Tình, School Life, Truyện Màu, Webtoon, Slice of Life, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Yêu là một cảm giác cuồng nhiệt lạ kỳ... nhưng thế này thì hơi quá rồi!! Hari vì tình yêu đơn phương của mình mà vướng phải một lời nguyền, và Yura muốn "mượn" lời nguyền ấy. <br>Liệu Hari sẽ thổ lộ lòng mình với Jeongwon, chàng trai cô thầm thương trộm nhớ, hay sẽ từ bỏ mối tình này? Câu chuyện tình đầu mãnh liệt của Hari bắt đầu |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 60 chapters |  |  |  |
| chapter dates | PASS | 60 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://images.truyenkira.net/.../page-0.webp` (image/webp (encoding: lossy), 233934 bytes, 1440x1600) |  |  |  |
