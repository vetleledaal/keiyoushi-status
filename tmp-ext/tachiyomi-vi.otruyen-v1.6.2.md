# Extension Validation Report

- Extension: tachiyomi-vi.otruyen-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 28
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 2
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8070757025584294717
- Source name: OTruyen
- Source language: vi
- Selected manga input: popular offset 0: Cám Dỗ (`.../cam-do`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Cám Dỗ (`.../cam-do`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Chiếc Túi Bí Mật Của Tiểu Thư Xấu Xí (`.../chiec-tui-bi-mat-cua-tieu-thu-xau-xi`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Xuyên Thành Tiểu Muội Của Đại Lão Giấu Mặt (`.../xuyen-thanh-tieu-muoi-cua-dai-lao-giau-mat`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 5 | Cám Dỗ (`.../cam-do`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Cám Dỗ (`.../cam-do`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 52 | Chapter 1 :  (`.../651034b1474e7dd8243f39e5:cam-do`) |  | <1s |
| pages | `getPageList(chapter)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cám Dỗ, URL=`cam-do` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Timed out waiting for 30000 ms |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 77/77 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 77/77 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.otruyenapi.com/.../cam-do-thumb.jpg` (image/jpeg, 53172 bytes, 160x252) |  |  |  |
| details identity | PASS | Details preserved selected URL `cam-do` |  |  |  |
| details thumbnail URL | PASS | `https://img.otruyenapi.com/.../cam-do-thumb.jpg` |  |  |  |
| details author | PASS | LEE Hyeon, Sook |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Romance, School Life |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Cô giáo trẻ Jung Da Un phải đau đầu vị cậu học sinh ngang ngược nhưng nổi tiếng là cao to, đẹp trai và thông minh nhất trường. Cậu ta đã gây rắc rối cho cô: "Cô có biết không, lúc nào em cũng nhìn cô cả... Nhìn bờ môi cô... Và tưởng tượng... Nếu được kề cùng làn môi ấy" Cô giáo Da Un phải làm thế nào đây? Quá khứ đen tối đằng sau thằng nhóc ấy là gì? |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name, chapter 5 name, chapter 6 name, chapter 7 name, chapter 8 name, chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 24 name, chapter 25 name, chapter 26 name, chapter 27 name, chapter 28 name, chapter 29 name, chapter 30 name, chapter 31 name, chapter 32 name, chapter 33 name, chapter 34 name, chapter 35 name, chapter 36 name, chapter 37 name, chapter 38 name, chapter 39 name, chapter 40 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 44 name, chapter 45 name, chapter 46 name, chapter 47 name, chapter 48 name, chapter 49 name, chapter 50 name, chapter 51 name, chapter 52 name |  |  |  |
| chapters | PASS | 52 chapters |  |  |  |
| chapter dates | PASS | 52 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Timed out waiting for 30000 ms |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
