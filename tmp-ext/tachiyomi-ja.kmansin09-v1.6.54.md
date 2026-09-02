# Extension Validation Report

- Extension: tachiyomi-ja.kmansin09-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4046163527731172053
- Source name: Kmansin09
- Source language: ja
- Selected manga input: popular offset 0: 俺だけレベルアップな件 (`.../3540`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | 俺だけレベルアップな件 (`.../3540`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | 剣術名家の末息子 (`.../3063`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | 転生した暗殺者は剣術の天才 (`.../4993`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 10 | 鉄槌教師 (`.../752`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | 俺だけレベルアップな件〜ラグナロク〜 (`.../5420`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 俺だけレベルアップな件 (`.../3540`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 217 | Chapter 第196話 (`.../chapter-196`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 2: title=俺だけレベルアップな件, URL=`3540` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 43/43 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 43/43 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kmansin09.top/.../Fm7do2JagAAnlV9-350x476.jpg` (image/jpeg, 64720 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `3540` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://kmansin09.top/.../Fm7do2JagAAnlV9-193x278.jpg` (image/jpeg, 33654 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | サスペンス, ファンタジー, 冒険, 王様・貴族, 異世界, 転生 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | クラマンガでウェブコミックのカラフルな世界を発見しよう！ 当サイトでは、恋愛、ファンタジー、ドラマ、アクション、ミステリーなど、あらゆるジャンルの作品を毎日更新しています。 「俺だけレベルアップな件」から、私たちのプラットフォームはあなたを楽しませ続けるためにオリジナル作品とIPを紹介します. クラマンガで最高の漫画を探そう！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 217 chapters |  |  |  |
| chapter dates | LINT | 1 of 217 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://kmansin09.top/.../Output1.jpg` (image/jpeg, 1117372 bytes, 760x15783) |  |  |  |
