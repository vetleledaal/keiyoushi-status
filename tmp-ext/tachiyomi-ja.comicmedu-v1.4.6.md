# Extension Validation Report

- Extension: tachiyomi-ja.comicmedu-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 7310112963091407823
- Source name: G-Comi
- Source language: ja
- Selected manga input: popular offset 0: 全メ連 horny BAAAD (`.../b67e414c12363`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 全メ連 horny BAAAD (`.../b67e414c12363`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | 爆乳バニーおばさん (`.../a862432d66d3c`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | クズが知らない私の殺意 (`.../2c131adb4f1da`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 全メ連 horny BAAAD (`.../b67e414c12363`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 全メ連 horny BAAAD (`.../b67e414c12363`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 5 | 第1話 (`.../75646fa85e51b`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 30 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=全メ連 horny BAAAD, URL=`.../b67e414c12363` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20260522184220674B4F36336F31E4816BC0224FF9363B91C-lg.webp` (image/webp (encoding: lossy), 42314 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../b67e414c12363` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20260522184220674B4F36336F31E4816BC0224FF9363B91C.png` (image/png, 3567560 bytes, 2560x1344) |  |  |  |
| details author | PASS | やんちゃ |  |  |  |
| details artist | PASS | やんちゃ |  |  |  |
| details genres | PASS | picn, BLマンガ, 年の差, わんこ, 社会人, 女性向け |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | メスお兄さんの地位向上、保全、育成、をモットーとしたその団体の名は「全国メスお兄さん連盟」通称、全メ連。その団体のトップに君臨するキングオブメスお兄さんのみかめは最近、「勃ち」の悪さに悩んでいた。歳を感じヤケ酒を煽るみかめの前に現れたのは泥酔状態で口説いてくる子犬系男子の春光でーー？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.g-comi.jp/.../master-1778127472174-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 13, 11, 0, 5, 1, 7, 9, 4, 15, 3, 14, 12, 2, 10, 8\]` (image/jpeg, 503195 bytes, 1440x2048) |  |  |  |
