# Extension Validation Report

- Extension: tachiyomi-vi.luvaholic-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
- Warnings: 2
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1369379704953903278
- Source name: Luvaholic
- Source language: vi
- Selected manga input: popular offset 0: Bà chị thích ‘chơi trần’ ở cửa hàng tiện lợi (`.../ba-chi-thich-choi-tran-o-cua-hang-tien-loi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | Bà chị thích ‘chơi trần’ ở cửa hàng tiện lợi (`.../ba-chi-thich-choi-tran-o-cua-hang-tien-loi`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Tuyển tập Oneshort của tác giả @R_Kitada (`.../tuyen-tap-oneshort-cua-tac-gia-r_kitada`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Cô Bạn Gái Nhiều Tay (`.../co-ban-gai-nhieu-tay`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Bà chị thích ‘chơi trần’ ở cửa hàng tiện lợi (`.../ba-chi-thich-choi-tran-o-cua-hang-tien-loi`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Bà chị thích ‘chơi trần’ ở cửa hàng tiện lợi (`.../ba-chi-thich-choi-tran-o-cua-hang-tien-loi-ba-chi-thich-choi-tran-o-cua-hang-tien-loi`) |  | <1s |
| pages | `getPageList(chapter)` | success | 2 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 35/35 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 35/35 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://luvaholic.website/.../IMG_8987-225x300.jpeg` (image/jpeg, 18779 bytes, 225x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ba-chi-thich-choi-tran-o-cua-hang-tien-loi` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://luvaholic.website/.../IMG_8987-768x1024.jpeg` (image/jpeg, 112850 bytes, 768x1024) |  |  |  |
| details author | PASS | @se7sierra |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Modern, Oneshot, Romcom, X/Twitter Comic |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Truyện được dịch bởi Luvaholic – Hội chứng cuồng yêu |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 2 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://luvaholic.website/.../kho-truyen <redacted query values: sort>` to `https://luvaholic.website/.../kho-truyen <redacted query values: sort>` (1 redirects); popular: `https://luvaholic.website/.../2 <redacted query values: sort>` to `https://luvaholic.website/.../2 <redacted query values: sort>` (1 redirects) |  |  |  |
| page load | PASS | `https://luvaholic.website/.../tg-proxy <redacted query values: fid>` (image/jpeg, 467558 bytes, 864x1152) |  |  |  |
