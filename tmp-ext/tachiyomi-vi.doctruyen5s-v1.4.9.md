# Extension Validation Report

- Extension: tachiyomi-vi.doctruyen5s-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7595811359698226104
- Source name: DocTruyen5s
- Source language: vi
- Selected manga input: latest offset 0: Yêu Thần Ký (`.../yeu-than-ky`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 42 | Mận xanh (`.../man-xanh`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 42 | Sự Trở Lại Của Pháp Sư Vĩ Đại Sau 4000 Năm (`.../su-tro-lai-cua-phap-su-vi-dai-sau-4000-nam`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 42 | Yêu Thần Ký (`.../yeu-than-ky`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 42 | Vận May Không Ngờ (`.../van-may-khong-ngo`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Yêu Thần Ký (`.../yeu-than-ky`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Yêu Thần Ký (`.../yeu-than-ky`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1139 | Yêu Th� (`.../yeu-th`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Yêu Thần Ký, URL=`.../yeu-than-ky` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 169/169 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 169/169 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga.io.vn/.../yeu-than-ky.jpg` (image/png, 133742 bytes, 200x280; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../yeu-than-ky` |  |  |  |
| details thumbnail URL | PASS | `https://manga.io.vn/.../yeu-than-ky.jpg` |  |  |  |
| details author | PASS | Đang cập nhật |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Truyện tranh Yêu Thần Ký được cập nhật nhanh và đầy đủ nhất tại MANGA.IO.VN. Bạn đọc đừng quên để lại bình luận và chia sẻ, ủng hộ MANGA.IO.VN ra các chương mới nhất của truyện Yêu Thần Ký |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1139 chapters |  |  |  |
| chapter dates | PASS | 1139 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://post-phinf.pstatic.net/.../661aabf966c92.jpg` could not be downloaded: java.net.UnknownHostException: post-phinf.pstatic.net: No address associated with hostname | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
