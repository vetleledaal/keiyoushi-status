# Extension Validation Report

- Extension: tachiyomi-ja.comicfuz-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 32
- Lint: 2
- Warnings: 0
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7341666123577520203
- Source name: COMIC FUZ
- Source language: ja
- Selected manga input: latest offset 0: 異世界カーチャン (`.../3924`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 60 | 愛したがりと、愛されたがり (`.../1818`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 60 | 愛したがりと、愛されたがり (`.../1818`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 63 | 異世界カーチャン (`.../3924`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 異世界カーチャン (`.../3924`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 異世界カーチャン (`.../3924`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 31 | 第1子 (`.../73131`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 22 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 63 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=異世界カーチャン, URL=`.../3924` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 184/184 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 184/184 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.comic-fuz.com/.../t7.webp <redacted query values: h and e>` (image/webp (encoding: lossy), 34840 bytes, 1080x675) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../3924` |  |  |  |
| details thumbnail URL | PASS | `https://img.comic-fuz.com/.../t7.webp <redacted query values: h and e>` |  |  |  |
| details author | PASS | 日向隼人 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 水曜日, オリジナル, 男性向け, バトル・アクション, FUZコミックス, オリジナル作品の最新話が無料化！, ギャグ・コメディ, 異世界, 日常 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 退屈な人生から一転、夢の異世界ライフがいま始まる———！ただし、カーチャン付きで。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 31 chapters |  |  |  |
| chapter dates | LINT | 1 of 31 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.comic-fuz.com/.../0.jpeg.enc <redacted query values: h, e, key, and iv>` (image/jpeg, 914524 bytes, 1351x1920) |  |  |  |
