# Extension Validation Report

- Extension: tachiyomi-vi.dualeotruyen-v1.6.28
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
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
- Selected manga input: popular offset 0: Tuyển tập trôn có lài (`.../tuyen-tap-tron-co-lai`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | Tuyển tập trôn có lài (`.../tuyen-tap-tron-co-lai`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 36 | ONESHOT VICERA COMICS HOUSE (`.../oneshot-vicera-comics-house`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 36 | Cứu tinh của Thứ Hai (`.../cuu-tinh-cua-thu-hai`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 36 | Ian's Binding (`.../ian-s-binding`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tuyển tập trôn có lài (`.../tuyen-tap-tron-co-lai`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tuyển tập trôn có lài (`.../tuyen-tap-tron-co-lai`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 219 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 40 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tuyển tập trôn có lài, URL=`.../tuyen-tap-tron-co-lai` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.imgdualeo1.com/.../1774496965024-769195286.webp` (image/webp (encoding: lossy), 33442 bytes, 300x424) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tuyen-tap-tron-co-lai` |  |  |  |
| details thumbnail URL | PASS | `https://cover.imgdualeo1.com/.../1774496965024-769195286.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, 18+, Truyện Màu, BoyLove, Hentai, Oneshot, Doujinshi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Tuyển tập trôn có lài là bộ truyện tranh được nhiều độc giả yêu thích nhờ nội dung hấp dẫn. Truyện thuộc các thể loại Truyện Manga, Truyện 18+, Truyện Truyện Màu, Truyện BoyLove, Truyện Hentai, Truyện Oneshot, Truyện Doujinshi, hiện đang được cập nhật đầy đủ tại DuaLeoTruyen. Độc giả có thể theo dõi Tuyển tập trôn có lài để không bỏ lỡ các chương mới nhất. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 219 chapters |  |  |  |
| chapter dates | PASS | 219 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://dualeotruyenuv.com/.../truyen-tranh-hot <redacted query values: page>` to `https://dualeotruyenlr.com/.../truyen-tranh-hot <redacted query values: page>` (1 redirects); popular: `https://dualeotruyenuv.com/.../truyen-moi-cap-nhat <redacted query values: page>` to `https://dualeotruyenlr.com/.../truyen-moi-cap-nhat <redacted query values: page>` (1 redirects); popular: `https://dualeotruyenuv.com/.../truyen-tranh-hot <redacted query values: page>` to `https://dualeotruyenlr.com/.../truyen-tranh-hot <redacted query values: page>` (1 redirects); popular: `https://dualeotruyenuv.com/.../tuyen-tap-tron-co-lai` to `https://dualeotruyenlr.com/.../tuyen-tap-tron-co-lai` (1 redirects); popular: `https://dualeotruyenuv.com/.../tim-kiem <redacted query values: key>` to `https://dualeotruyenlr.com/.../tim-kiem <redacted query values: key>` (1 redirects); popular: `https://dualeotruyenuv.com` to `https://dualeotruyenlr.com` (1 redirects); popular: `https://dualeotruyenuv.com/.../chapter-1` to `https://dualeotruyenlr.com/.../chapter-1` (1 redirects); popular: `https://dualeotruyenuv.com/.../truyen-moi-cap-nhat <redacted query values: page>` to `https://dualeotruyenlr.com/.../truyen-moi-cap-nhat <redacted query values: page>` (1 redirects) |  |  |  |
| page load | PASS | `https://img.imgdualeo1.com/.../10031288211667576604.webp` (image/jpeg, 99087 bytes, 1123x600; server Content-Type: image/webp) |  |  |  |
