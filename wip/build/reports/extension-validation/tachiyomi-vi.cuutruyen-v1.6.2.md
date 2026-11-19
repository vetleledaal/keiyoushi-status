# Extension Validation Report

- Extension: tachiyomi-vi.cuutruyen-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 8222087175453285202
- Source name: CuuTruyen
- Source language: vi
- Selected manga input: popular offset 0: Spy x Family (FULL HD) (`.../152`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Spy x Family (FULL HD) (`.../152`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Dreamland Adventure (`.../748`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Fantastic Four 2025 (`.../4991`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Taidana Akuhazukashime Kizoku ni Tensei Shita Ore, Scenario wo Bukkowashitara Kikaku Gai No Maryoku de Saikyou ni Natta (`.../2251`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 5 | Spy x Family (FULL HD) (`.../152`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Spy x Family (FULL HD) (`.../152`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 176 | Chương 1 These chapter belong to MTO - Manga Translation Organisation. (`.../2420`) |  | <1s |
| pages | `getPageList(chapter)` | success | 75 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Spy x Family (FULL HD), URL=`152` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 113/113 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 113/113 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage-bravo.cuutruyen.net/.../processed-f7d09a1d2f13b6eb0677d9b811bf10df.jpg` (image/jpeg, 50610 bytes, 224x336) |  |  |  |
| details identity | PASS | Details preserved selected URL `152` |  |  |  |
| details thumbnail URL | PASS | `https://storage-bravo.cuutruyen.net/.../processed-f7d09a1d2f13b6eb0677d9b811bf10df.jpg` |  |  |  |
| details author | PASS | Endou Tatsuya |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | chất lượng cao, tội phạm, siêu nhiên, hành động, đang tiến hành, hài hước, học đường, đời thường, manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Follow Fanpage Spy x Family: Anya và những người bạn để cập nhật những thông tin mới nhất về bộ truyệnChương 1-34 được Việt hóa bởi MTO - Manga Translation Organisation<br>Chương 35 trở đi được Việt hóa bởi Shyobz Team |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 102 name |  |  |  |
| chapters | PASS | 176 chapters |  |  |  |
| chapter dates | PASS | 176 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 75 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://storage-bravo.cuutruyen.net/.../scrambled-10ce0ed1a38a9be4d0b240480784d9c8.jpg` (image/jpeg, 336637 bytes, 900x930) |  |  |  |
