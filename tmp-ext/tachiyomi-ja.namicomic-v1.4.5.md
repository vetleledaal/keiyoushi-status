# Extension Validation Report

- Extension: tachiyomi-ja.namicomic-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1860491637286237325
- Source name: Nami Comic
- Source language: ja
- Selected manga input: popular offset 0: 地味子がド派手にモテてる件 (`.../9092669370aeb`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 地味子がド派手にモテてる件 (`.../9092669370aeb`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 4 | 二部次長は人たらし。 (`.../8b54399779e50`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 地味子がド派手にモテてる件 (`.../9092669370aeb`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 地味子がド派手にモテてる件 (`.../9092669370aeb`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 28 | 第1話　いちばん可愛いのは私じゃないの!? (`.../b39cb88785fd4`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 4 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=地味子がド派手にモテてる件, URL=`.../9092669370aeb` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../c0708b81de44dbc0-lg.webp` (image/webp (encoding: lossy), 84146 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../9092669370aeb` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../c0708b81de44dbc0.jpg` (image/jpeg, 217172 bytes, 1200x630) |  |  |  |
| details author | PASS | 文哉 |  |  |  |
| details artist | PASS | 文哉 |  |  |  |
| details genres | PASS | 少年, カラー, ギャグ・コメディ, ラブコメ, 恋愛, 学園, ラブストーリー, ヒューマンドラマ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 男子は全員、ぼっちなあの子にメロメロ!?地味な見た目の綿貫ちゃんが、みんなにとって高嶺の花なんて…！私は自他ともに認める学園のアイドル！一方でいつも暗い綿貫ちゃんはみんなの陰口の対象になっていた。も～みんなダメだよ！他人を貶めて得る自己肯定感なんて意味ないんだから！そんなスクールカースト上位と下位な私たち。でも、“ある出来事”をきっかけに男子たちは豹変して!?「俺たち綿貫さんのこと好きだぁぁぁ！」――はぁぁぁ!?突如として始まる地味子争奪戦。でも綿貫ちゃんにはモテることより大事なことがあって!? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 28 chapters |  |  |  |
| chapter dates | PASS | 28 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.namicomic.jp/.../master-1784105162266-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 3, 13, 11, 15, 12, 2, 5, 7, 1, 6, 14, 9, 0, 4, 10\]` (image/jpeg, 428238 bytes, 1000x1412) |  |  |  |
