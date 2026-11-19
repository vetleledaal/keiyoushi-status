# Extension Validation Report

- Extension: tachiyomi-ja.rawbaka-v1.6.57
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6022634600056613514
- Source name: RawBaka
- Source language: ja
- Selected manga input: popular offset 0: ジャンがあぶない！ (Raw – Free) (`.../%E3%82%B8%E3%83%A3%E3%83%B3%E3%81%8C%E3%81%82%E3%81%B6%E3%81%AA%E3%81%84%EF%BC%81-raw-free`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | ジャンがあぶない！ (Raw – Free) (`.../%E3%82%B8%E3%83%A3%E3%83%B3%E3%81%8C%E3%81%82%E3%81%B6%E3%81%AA%E3%81%84%EF%BC%81-raw-free`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | グレイキースの魔界語訳録 (Raw – Free) (`.../%E3%82%B0%E3%83%AC%E3%82%A4%E3%82%AD%E3%83%BC%E3%82%B9%E3%81%AE%E9%AD%94%E7%95%8C%E8%AA%9E%E8%A8%B3%E9%8C%B2-raw-free`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 15 | ワンピース Raw Free (`.../%E3%83%AF%E3%83%B3%E3%83%94%E3%83%BC%E3%82%B9raw-free`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | のあ先輩はともだち。 Raw Free (`.../no-a-senpai-ha-tomodachi-48519`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | ジャンがあぶない！ (Raw – Free) (`.../%E3%82%B8%E3%83%A3%E3%83%B3%E3%81%8C%E3%81%82%E3%81%B6%E3%81%AA%E3%81%84%EF%BC%81-raw-free`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ジャンがあぶない！ (Raw – Free) (`.../%E3%82%B8%E3%83%A3%E3%83%B3%E3%81%8C%E3%81%82%E3%81%B6%E3%81%AA%E3%81%84%EF%BC%81-raw-free`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 第1話 (`.../%E3%82%B8%E3%83%A3%E3%83%B3%E3%81%8C%E3%81%82%E3%81%B6%E3%81%AA%E3%81%84%EF%BC%81-raw-free <redacted query values: chapter>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ジャンがあぶない！ (Raw – Free), URL=`.../%E3%82%B8%E3%83%A3%E3%83%B3%E3%81%8C%E3%81%82%E3%81%B6%E3%81%AA%E3%81%84%EF%BC%81-raw-free` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://rawbaka.site/.../KAGURABACHI.jpg` -> 2 manga URLs (examples: `.../kagurabachi-english-raw-free`, `.../kagurabachi-74895`), `https://rawbaka.site/.../SAKAMOTO-DAYS-175x225-1.jpg` -> 2 manga URLs (examples: `.../sakamoto-days-raw-free-english`, `.../sakamotodeizu-51689`) |  |  |  |
| thumbnail | PASS | `https://rawbaka.site/.../%E3%82%B8%E3%83%A3%E3%83%B3%E3%81%8C%E3%81%82%E3%81%B6%E3%81%AA%E3%81%84%EF%BC%81.jpg` (image/jpeg, 124039 bytes, 500x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%E3%82%B8%E3%83%A3%E3%83%B3%E3%81%8C%E3%81%82%E3%81%B6%E3%81%AA%E3%81%84%EF%BC%81-raw-free` |  |  |  |
| details thumbnail URL | PASS | `https://rawbaka.site/.../%E3%82%B8%E3%83%A3%E3%83%B3%E3%81%8C%E3%81%82%E3%81%B6%E3%81%AA%E3%81%84%EF%BC%81.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ジャンがあぶない！ 漫画 raw, ジャンがあぶない！ 漫画, ジャンがあぶない！ raw, ジャンがあぶない！rar, ジャンがあぶない！ torrent,ジャンがあぶない！ zip |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
