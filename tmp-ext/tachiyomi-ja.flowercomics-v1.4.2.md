# Extension Validation Report

- Extension: tachiyomi-ja.flowercomics-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6525907185900913523
- Source name: Flower Comics
- Source language: ja
- Selected manga input: popular offset 0: Bite Maker～王様のΩ～ (`.../5863`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Bite Maker～王様のΩ～ (`.../5863`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 41 | やおよろず取扱説明書 (`.../5752`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Bite Maker～王様のΩ～ (`.../5863`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Bite Maker～王様のΩ～ (`.../5863`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 97 | 第1話 -1 (`.../131806`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 25 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 41 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Bite Maker～王様のΩ～, URL=`5863` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 63/63 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 63/63 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.flowercomics.jp/.../5863.webp <redacted query values: h and e>` (image/webp (encoding: lossy), 181822 bytes, 1920x1440) |  |  |  |
| details identity | PASS | Details preserved selected URL `5863` |  |  |  |
| details thumbnail URL | PASS | `https://img.flowercomics.jp/.../5863.webp <redacted query values: h and e>` |  |  |  |
| details author | PASS | 杉山美和子 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 恋愛, バース系・特殊設定, クール男子, 完結 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 頭脳明晰・容姿端麗10万人に一人の確率で存在するα。その中でも絶対強者の信長。 そんな彼が「運命の番」を探し、遺伝子レベルの恋をする！ 杉山美和子の新境地・オメガバース×少女漫画。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 97 chapters |  |  |  |
| chapter dates | PASS | 97 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.flowercomics.jp/.../1.webp.enc <redacted query values: h and e>` (image/webp (encoding: lossy), 42946 bytes, 764x1200; server Content-Type: application/octet-stream) |  |  |  |
