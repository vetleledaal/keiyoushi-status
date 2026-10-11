# Extension Validation Report

- Extension: tachiyomi-ja.mangaspa-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 2566686121922544500
- Source name: Manga SPA
- Source language: ja
- Selected manga input: popular offset 0: 毎日、病んでます (`.../34a4726607447`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 31 | 毎日、病んでます (`.../34a4726607447`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 少年イン・ザ・フッド (`.../f5215732204fd`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | バズマン (`.../0b63ceea8fdaf`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 毎日、病んでます (`.../34a4726607447`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 毎日、病んでます (`.../34a4726607447`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | 毎日、病んでます (`.../cd24d8093f521`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 31 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=毎日、病んでます, URL=`34a4726607447` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../202602241034196355F9EBA72F9659C3348EC1A59C327BADA-lg.webp` (image/webp (encoding: lossy), 30142 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `34a4726607447` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../202602241034196355F9EBA72F9659C3348EC1A59C327BADA.png` (image/png, 3541884 bytes, 2560x1344) |  |  |  |
| details author | PASS | 桜壱バーゲン |  |  |  |
| details artist | PASS | 桜壱バーゲン |  |  |  |
| details genres | PASS | エッセイ・ノンフィクション, 日常, マンガSPA!オリジナル |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 夫婦で漫画家。<br>妻は眩い光を浴び、夫は影に沈んでいた――。<br> <br>売れること、売れないこと。<br>支えること、支えられること。<br> <br>お互いの“今できないこと”を引き受けて、生きる。<br> <br>実録系漫画の鬼才・桜壱バーゲンが描いた、はじめての夫婦愛。 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 3 name |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.mangaspa.nikkan-spa.jp/.../master-1766667032202-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 1, 11, 7, 14, 13, 6, 3, 10, 0, 9, 12, 2, 5, 15, 8\]` (image/jpeg, 357646 bytes, 850x1200) |  |  |  |
