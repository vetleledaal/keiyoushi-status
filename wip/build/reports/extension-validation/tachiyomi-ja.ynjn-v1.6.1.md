# Extension Validation Report

- Extension: tachiyomi-ja.ynjn-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 26
- Lint: 4
- Warnings: 1
- Skipped: 5
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3322701627784242064
- Source name: Young Jump+
- Source language: ja
- Selected manga input: popular offset 0: こういうのがいい (`.../1267`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | こういうのがいい (`.../1267`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 9 | GANTZ:E (`.../1077`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | こういうのがいい (`.../1267`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 315 | 1発目 ① 恋人 (`.../80288`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 9 entries |  |  |  |
| search listing | SKIP | HTTP error 500 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 59/59 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 59/59 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://public.ynjn.jp/.../thumbnail_kouiunogaii_2409.png` (image/png, 116466 bytes, 501x501) |  |  |  |
| details identity | PASS | Details preserved selected URL `1267` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://public.ynjn.jp/.../08X10000000071294500_cover_0.jpg` (image/jpeg, 964770 bytes, 1440x2048; server Content-Type: application/octet-stream) |  |  |  |
| details author | PASS | 双龍 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | お色気, ラブコメ |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | ノーモア彼女。グッバイ彼氏。束縛彼女にモラハラ彼氏、過去の恋人関係に辟易していた村田♂と友香♀は、オンラインゲームのオフ会で意気投合し、そのままラブホテルへ。一夜限りでもなく、付き合う訳でもなく、身体のみの関係でもない、ゆるくて気楽で、なおかつえっちぃ――自由な男女が織りなす大人の日常系、スタート。【※アプリ配信用に一部修正を入れております】 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 32 name, chapter 33 name, chapter 34 name, chapter 35 name, chapter 36 name |  |  |  |
| chapters | PASS | 315 chapters |  |  |  |
| chapter dates | LINT | All 315 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=315 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://public.ynjn.jp/.../001.webp` (image/jpeg, 205060 bytes, 800x1142; server Content-Type: binary/octet-stream) |  |  |  |
