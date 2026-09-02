# Extension Validation Report

- Extension: tachiyomi-ja.comicmedu-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7310112963091407823
- Source name: G-Comi
- Source language: ja
- Selected manga input: popular offset 0: 近すぎほたるで身を焦がす (`.../0ad0305b92e49`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 近すぎほたるで身を焦がす (`.../0ad0305b92e49`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | 爆乳バニーおばさん (`.../a862432d66d3c`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | 勇者さまは報酬に人妻をご希望です (`.../ec10b3f00d2ee`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 近すぎほたるで身を焦がす (`.../0ad0305b92e49`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 近すぎほたるで身を焦がす (`.../0ad0305b92e49`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 14 | 第1話 (`.../2edfa2561f02a`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=近すぎほたるで身を焦がす, URL=`.../0ad0305b92e49` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../202505291631024640A3C0A64DBC18DDD8E11D1E7FB56D4B4-lg.webp` (image/webp (encoding: lossy), 36702 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../0ad0305b92e49` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../202505291631024640A3C0A64DBC18DDD8E11D1E7FB56D4B4.png` (image/png, 2382732 bytes, 2560x1344) |  |  |  |
| details author | PASS | 渡辺こよ, キザキ |  |  |  |
| details artist | PASS | 渡辺こよ, キザキ |  |  |  |
| details genres | PASS | MeDu COMICS, ラブコメ, 恋愛, 日常, 夏の新連載, 青年マンガ, 男性向け |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 「ハガネとわかば」(双葉社)<br>タッグによる待望の<br>ラブコメ新連載!!!<br><br>無防備ゆるふわ乙女<br>　　×<br>純情ヤンキー<br>幼馴染ラブコメ開幕!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 14 chapters |  |  |  |
| chapter dates | PASS | 14 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.g-comi.jp/.../master-1748504476276-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 11, 7, 5, 6, 15, 13, 4, 9, 14, 3, 1, 0, 8, 12, 10\]` (image/jpeg, 351042 bytes, 1450x2048) |  |  |  |
