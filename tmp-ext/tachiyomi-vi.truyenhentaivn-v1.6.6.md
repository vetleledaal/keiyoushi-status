# Extension Validation Report

- Extension: tachiyomi-vi.truyenhentaivn-v1.6.6
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2450247754585878955
- Source name: TruyenHentaivn
- Source language: vi
- Selected manga input: popular offset 0: Hinata! Hinata! Yuuhan wa Hinata da! (Nekomiya Hinata) (`.../36398-doc-truyen-hinata-hinata-yuuhan-wa-hinata-da-nekomiya-hinata.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Hinata! Hinata! Yuuhan wa Hinata da! (Nekomiya Hinata) (`.../36398-doc-truyen-hinata-hinata-yuuhan-wa-hinata-da-nekomiya-hinata.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Chuyện bốn người và sự trả đũa (nguyên tác) (`.../36368-doc-truyen-chuyen-bon-nguoi-va-su-tra-dua-nguyen-tac.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Hinata! Hinata! Yuuhan wa Hinata da! (Nekomiya Hinata) (`.../36398-doc-truyen-hinata-hinata-yuuhan-wa-hinata-da-nekomiya-hinata.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Chuyện bốn người và sự trả đũa (nguyên tác) (`.../36368-doc-truyen-chuyen-bon-nguoi-va-su-tra-dua-nguyen-tac.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Hinata! Hinata! Yuuhan wa Hinata da! (Nekomiya Hinata) (`.../36398-doc-truyen-hinata-hinata-yuuhan-wa-hinata-da-nekomiya-hinata.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Hinata! Hinata! Yuuhan wa Hinata da! (Nekomiya Hinata) (`.../36398-doc-truyen-hinata-hinata-yuuhan-wa-hinata-da-nekomiya-hinata.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Oneshot (`.../36398-69290-xem-truyen-hinata-hinata-yuuhan-wa-hinata-da-nekomiya-hinata-oneshot.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hinata! Hinata! Yuuhan wa Hinata da! (Nekomiya Hinata), URL=`.../36398-doc-truyen-hinata-hinata-yuuhan-wa-hinata-da-nekomiya-hinata.html` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://upload.truyenhentaivn.store/.../iwz9deae.jpg` (image/jpeg, 1264489 bytes, 1200x1709) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../36398-doc-truyen-hinata-hinata-yuuhan-wa-hinata-da-nekomiya-hinata.html` |  |  |  |
| details thumbnail URL | PASS | `https://upload.truyenhentaivn.store/.../iwz9deae.jpg` |  |  |  |
| details author | PASS | shennai misha |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Handjob, Có che, Stockings, Rape, BlowJobs, Big Boobs, Oneshot, Ahegao |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Youtuber ảo nổi tiếng trên mạng chơi game gặp hack/cheat thì làm gì? Đừng nghĩ là có mấy Darktag là truyện mặn nhé. truyện hay lắm đấy. Đọc xong nhớ like ủng hộ để mình lewd thêm vài bé Loli nữa nhé. chúc các bạn đọc truyện vui vẻ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s1.truyenhentaivn.store/.../0.png <redacted query values: expires and token>` (image/png, 4048568 bytes, 3000x1684) |  |  |  |
