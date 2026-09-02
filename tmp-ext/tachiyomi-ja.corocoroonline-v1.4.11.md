# Extension Validation Report

- Extension: tachiyomi-ja.corocoroonline-v1.4.11
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7153368437486297689
- Source name: Corocoro Online
- Source language: ja
- Selected manga input: latest offset 0: デュエル・マスターズGT3 -Glitch of the Twin heart- (`.../1009`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 17 | ぷにるはかわいいスライム (`.../38`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 14 | デュエル・マスターズGT3 -Glitch of the Twin heart- (`.../1009`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 5 | デュエル・マスターズGT3 -Glitch of the Twin heart- (`.../1009`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | デュエル・マスターズGT3 -Glitch of the Twin heart- (`.../1009`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 23 | 第1話 (`.../45838`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 30 |  |  | 1-10s |

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
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | PASS | 14 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=デュエル・マスターズGT3 -Glitch of the Twin heart-, URL=`1009` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 36/36 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 36/36 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.www.corocoro.jp/.../1009.webp <redacted query values: h and e>` (image/webp (encoding: lossy), 238712 bytes, 1920x1440) |  |  |  |
| details identity | PASS | Details preserved selected URL `1009` |  |  |  |
| details thumbnail URL | PASS | `https://img.www.corocoro.jp/.../1009.webp <redacted query values: h and e>` |  |  |  |
| details author | PASS | 【作】菊妻ヒロキ, 【構成】川﨑大輔 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | デュエル・マスターズ屈指の超大人気シリーズ、ドラゴン・サーガ編の新たな物語を漫画化!!グラッサ＆タレット率いる「テクノ・サムライ」が、ハゲしき超技術とアツかりし魂で超獣世界を駆けめぐる!!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 23 chapters |  |  |  |
| chapter dates | PASS | 23 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.www.corocoro.jp/.../1.webp.enc <redacted query values: h and e>` (image/webp (encoding: lossy), 173950 bytes, 1414x2048; server Content-Type: application/octet-stream) |  |  |  |
