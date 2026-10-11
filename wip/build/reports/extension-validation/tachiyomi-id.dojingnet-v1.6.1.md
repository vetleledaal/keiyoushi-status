# Extension Validation Report

- Extension: tachiyomi-id.dojingnet-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source theme: mangathemesia
- Source ID: 8062443260299418342
- Source name: Dojing.net
- Source language: id
- Selected manga input: popular offset 0: Lustful Wife Widia (`.../lustful-wife-widia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Lustful Wife Widia (`.../lustful-wife-widia`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | Meniduri Ibunya Saat Putrinya tidak ada di Rumah (`.../meniduri-ibunya-saat-putrinya-tidak-ada-di-rumah`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Teknik Ekstraksi Sperma Perbedaan Tinggi Badan (`.../teknik-ekstraksi-sperma-perbedaan-tinggi-badan`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Istri Yang Baik – Good Wife (`.../istri-yang-baik-good-wife`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Lustful Wife Widia (`.../lustful-wife-widia`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lustful Wife Widia (`.../lustful-wife-widia`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../lustful-wife-widia`) |  | <1s |
| pages | `getPageList(chapter)` | success | 46 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lustful Wife Widia, URL=`.../lustful-wife-widia` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dojing.net/.../01-picsay_compress27-214x300.jpg` (image/jpeg, 17849 bytes, 214x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lustful-wife-widia` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://dojing.net/.../01-picsay_compress27.jpg` (image/jpeg, 51228 bytes, 732x1024) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Big breasts, Cheating, Full color, Hijab, Milf, Mother, Oldman, Sedarah, Sub indo, Uncensored, Wife, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://manga.komik.me/.../01.webp` (image/webp (container: extended), 161028 bytes, 1463x2048) |  |  |  |
