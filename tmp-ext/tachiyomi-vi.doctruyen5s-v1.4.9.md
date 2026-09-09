# Extension Validation Report

- Extension: tachiyomi-vi.doctruyen5s-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: liliana
- Source ID: 7595811359698226104
- Source name: DocTruyen5s
- Source language: vi
- Selected manga input: popular offset 0: Cái Thế Đế Tôn (`.../cai-the-de-ton`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 42 | Cái Thế Đế Tôn (`.../cai-the-de-ton`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 42 | Khi tôi trở về quê nhà, bạn thuở nhỏ của tôi đã thay đổi (`.../khi-toi-tro-ve-que-nha-ban-thuo-nho-cua-toi-da-thay-doi`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 42 | Đại Quản Gia Là Ma Hoàng (`.../dai-quan-gia-la-ma-hoang`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 42 | Vận May Không Ngờ (`.../van-may-khong-ngo`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Cái Thế Đế Tôn (`.../cai-the-de-ton`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Cái Thế Đế Tôn (`.../cai-the-de-ton`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 501 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| popular listing | PASS | 42 entries |  |  |  |
| latest listing | PASS | 42 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cái Thế Đế Tôn, URL=`.../cai-the-de-ton` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 169/169 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 169/169 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga.io.vn/.../cai-the-de-ton.jpg` (image/jpeg, 77423 bytes, 360x468) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cai-the-de-ton` |  |  |  |
| details thumbnail URL | PASS | `https://manga.io.vn/.../cai-the-de-ton.jpg` |  |  |  |
| details author | PASS | Đang cập nhật |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Truyện tranh Cái Thế Đế Tôn được cập nhật nhanh và đầy đủ nhất tại MANGA.IO.VN. Bạn đọc đừng quên để lại bình luận và chia sẻ, ủng hộ MANGA.IO.VN ra các chương mới nhất của truyện Cái Thế Đế Tôn |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 501 chapters |  |  |  |
| chapter dates | PASS | 501 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://post-phinf.pstatic.net/.../6602956b0e634.jpg` could not be downloaded: java.net.UnknownHostException: post-phinf.pstatic.net: No address associated with hostname | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
