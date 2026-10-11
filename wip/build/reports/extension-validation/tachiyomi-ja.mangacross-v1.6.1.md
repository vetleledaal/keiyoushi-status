# Extension Validation Report

- Extension: tachiyomi-ja.mangacross-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4711824862797870329
- Source name: Champion Cross
- Source language: ja
- Selected manga input: popular offset 0: 魔入りました！入間くん【TVアニメ配信中】 (`.../8016373c7a6b3`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | 魔入りました！入間くん【TVアニメ配信中】 (`.../8016373c7a6b3`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 妖精国の騎士Ballad 〜継ぐ視の守護者〜 (`.../8996f9f3bb2d8`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 横浜チャイニャン (`.../781bef89fa470`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 魔入りました！入間くん【TVアニメ配信中】 (`.../8016373c7a6b3`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 魔入りました！入間くん【TVアニメ配信中】 (`.../8016373c7a6b3`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 462 | 第1話 (`.../4ba181178e095`) |  | <1s |
| pages | `getPageList(chapter)` | success | 48 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=魔入りました！入間くん【TVアニメ配信中】, URL=`8016373c7a6b3` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../2024032512423556399A7DD27FCAEEAE1F280EF3FB57E5B3C-lg.webp` (image/webp (encoding: lossy), 41398 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `8016373c7a6b3` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../2024032512423556399A7DD27FCAEEAE1F280EF3FB57E5B3C.png` (image/png, 1138363 bytes, 1280x672) |  |  |  |
| details author | PASS | 西修 |  |  |  |
| details artist | PASS | 西修 |  |  |  |
| details genres | PASS | アニメ化, コメディ, ファンタジー・SF, 学園モノ, 少年・青年誌, 週刊少年チャンピオン, 青春 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | TVアニメ最新第3シリーズ各種サービスにて配信中！ 両親の私欲で悪魔に売られた不憫な少年・入間くん。孫のいない悪魔に溺愛されて悪魔の学校に通うことになり!?悪魔たちと楽しく(?)過ごす魔界学園ファンタジー!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 462 chapters |  |  |  |
| chapter dates | PASS | 462 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.championcross.jp/.../master-1709730006524-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 6, 5, 0, 7, 15, 3, 11, 12, 2, 9, 4, 10, 14, 1, 13\]` (image/jpeg, 205282 bytes, 777x1200) |  |  |  |
