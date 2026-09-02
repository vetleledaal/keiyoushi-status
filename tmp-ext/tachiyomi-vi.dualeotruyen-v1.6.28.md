# Extension Validation Report

- Extension: tachiyomi-vi.dualeotruyen-v1.6.28
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1039830224122325226
- Source name: Dưa Leo Truyện
- Source language: vi
- Selected manga input: latest offset 0: Pheromone Nồng Nàn (`.../pheromone-nong-nan`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | Tuyển tập trôn có lài (`.../tuyen-tap-tron-co-lai`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 36 | Cho 50k Couple Lộn Xộn (`.../cho-em-order-50k-couple-lon-xon`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 36 | Pheromone Nồng Nàn (`.../pheromone-nong-nan`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 36 | CHÀNG NHO SINH DÂM LOẠN (`.../chang-nho-sinh-dam-loan`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Pheromone Nồng Nàn (`.../pheromone-nong-nan`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Pheromone Nồng Nàn (`.../pheromone-nong-nan`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 66 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 28 |  |  | 1-10s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Pheromone Nồng Nàn, URL=`.../pheromone-nong-nan` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.imgdualeo1.com/.../pheromone-nong-nan-1746809557.webp` (image/webp (encoding: lossy), 30520 bytes, 341x480) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../pheromone-nong-nan` |  |  |  |
| details thumbnail URL | PASS | `https://img.imgdualeo1.com/.../pheromone-nong-nan-1746809557.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhua, 18+, Đam Mỹ, Truyện Màu, BoyLove, Yaoi, Drama, Kịch Tính, Lãng Mạn, Tình Cảm, ABO |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Pheromone Nồng Nàn là bộ truyện tranh được nhiều độc giả yêu thích nhờ nội dung hấp dẫn. Truyện thuộc các thể loại Truyện Manhua, Truyện 18+, Truyện Đam Mỹ, Truyện Truyện Màu, Truyện BoyLove, Truyện Yaoi, Truyện Drama, Truyện Kịch Tính, Truyện Lãng Mạn, Truyện Tình Cảm, Truyện ABO, hiện đang được cập nhật đầy đủ tại DuaLeoTruyen. Độc giả có thể theo dõi Pheromone Nồng Nàn để không bỏ lỡ các chương mới nhất. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 66 chapters |  |  |  |
| chapter dates | LINT | 1 of 66 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.imgdualeo1.com/.../10031288211667576604.webp` (image/jpeg, 99087 bytes, 1123x600; server Content-Type: image/webp) |  |  |  |
