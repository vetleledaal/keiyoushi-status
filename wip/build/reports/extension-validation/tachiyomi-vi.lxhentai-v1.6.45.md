# Extension Validation Report

- Extension: tachiyomi-vi.lxhentai-v1.6.45
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6495630445796108150
- Source name: LXManga
- Source language: vi
- Selected manga input: popular offset 0: Mẹ kế và những người bạn (`.../me-ke-va-nhung-nguoi-ban`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | Mẹ kế và những người bạn (`.../me-ke-va-nhung-nguoi-ban`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 60 | Zenin Shikkaku - Hahaoya no Mesubuta Sex Choukyou Kiroku (`.../zenin-shikkaku-hahaoya-no-mesubuta-sex-choukyou-kiroku`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 60 | THÔI MIÊN THAY ĐỔI MẸ ( REMAKE AI ) (`.../thoi-mien-thay-doi-me-remake-ai`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 60 | [Thomas] Chounyuu K-Cup no Yawaniku Elf to Umi de Sokunuki Berochuu Koubi (`.../thomas-chounyuu-k-cup-no-yawaniku-elf-to-umi-de-sokunuki-berochuu-koubi`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Mẹ kế và những người bạn (`.../me-ke-va-nhung-nguoi-ban`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mẹ kế và những người bạn (`.../me-ke-va-nhung-nguoi-ban`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 147 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IllegalStateException: Captcha needs interaction, but the app isn't in the foreground | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IllegalStateException: Captcha needs interaction, but the app isn't in the foreground | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mẹ kế và những người bạn, URL=`.../me-ke-va-nhung-nguoi-ban` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 241/241 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 241/241 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s3.lxmanga.xyz/.../1599372704534.jpg` (image/jpeg, 15482 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../me-ke-va-nhung-nguoi-ban` |  |  |  |
| details thumbnail URL | PASS | `https://s3.lxmanga.xyz/.../1599372704534.jpg` |  |  |  |
| details author | PASS | Đang cập nhật |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Adult, Series, full color, big breasts, LXHENTAI |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Tên khác: Mẹ kế và những người bạn, Mẹ kế và những người bạn<br><br>Cùng Seok Oh khám phá Mẹ kế và những người bạn của mẹ kế đi nào!!! Geminikun96 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 147 chapters |  |  |  |
| chapter dates | PASS | 147 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Captcha needs interaction, but the app isn't in the foreground |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
