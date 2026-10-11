# Extension Validation Report

- Extension: tachiyomi-vi.jellycomics-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 0
- Warnings: 3
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 4660543217906056734
- Source name: Jelly Comics
- Source language: vi
- Selected manga input: popular offset 0: Tuyển Tập Trôn Có Lài (`.../tuyen-tap-tron-co-lai`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Tuyển Tập Trôn Có Lài (`.../tuyen-tap-tron-co-lai`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | [21+] Tới Khi Người Vệ Sĩ Trung Thành Vạch Trần Bộ Mặt Thật Của Tiểu Thư (`.../21-toi-khi-nguoi-ve-si-trung-thanh-vach-tran-bo-mat-that-cua-tieu-thu-2`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Đúng đắn hay sai lầm (`.../dung-dan-hay-sai-lam`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Bức Chân Dung Của Niềm Kiêu Hãnh (`.../buc-chan-dung-cua-niem-kieu-hanh`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 25 | Tuyển tập trôn có lài (`.../tuyen-tap-tron-co-lai-2`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tuyển Tập Trôn Có Lài (`.../tuyen-tap-tron-co-lai`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 173 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Tuyển Tập Trôn Có Lài, URL=`.../tuyen-tap-tron-co-lai` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 125/125 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 125/125 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://jellycomics.online/.../admin-ajax.php` -> 2 manga URLs (examples: `.../secret-roommate`, `.../just-family`) |  |  |  |
| thumbnail | PASS | `https://cdn-jellycomics.mystino.xyz/.../tuyen-tap-tron-co-lai.jpg` (image/jpeg, 383018 bytes, 1280x1780) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tuyen-tap-tron-co-lai` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-jellycomics.mystino.xyz/.../tuyen-tap-tron-co-lai.webp` (image/webp (encoding: lossy), 12978 bytes, 175x238) |  |  |  |
| details author | PASS | Đang cập nhật... |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Doujinshi, MANGA, Oneshot, Yaoi, 18+, Boylove, Hentai, Truyện Tranh |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Jelly Comics (JC) là trang web truyện tranh hàng đầu dành cho những người đam mê truyện tranh. Với một bộ sưu tập đa dạng và phong phú, trang web đem đến cho bạn những giờ phút giải trí tuyệt vời và một trải nghiệm truyện tranh hoàn toàn miễn phí. Nếu bạn là một fan hâm mộ truyện tranh, hãy đến với JC để khám phá thế giới truyện tranh không giới hạn! Hãy truy cập vào Jelly Comics ngay hôm nay để khám phá thế giới truyện tranh đa dạng và thú vị. Là điểm đến lý tưởng cho những bạn đam mê truyện tranh và muốn khám phá thế giới đa dạng và thú vị của truyện tranh miễn phí. Thế giới truyện tranh đang chờ bạn khám phá!<br><br>Alternative Names: Tuyển Tập Trôn Có Lài |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 173 chapters |  |  |  |
| chapter dates | PASS | 173 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://jellycomics.online/.../chapter-1` to `https://jellycomics.online/.../chapter-1` (1 redirects) |  |  |  |
| page load | FAIL | First page URL `https://cdn-jellycomics.mystino.xyz/.../1.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
