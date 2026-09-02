# Extension Validation Report

- Extension: tachiyomi-ja.comicpash-v1.4.6
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
- Source ID: 6626616605316433619
- Source name: Comic Pash
- Source language: ja
- Selected manga input: popular offset 0: 虐げられた秀才令嬢と隣国の腹黒研究者様の甘やかな薬草実験室 (`.../b45b9dc323a36`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 虐げられた秀才令嬢と隣国の腹黒研究者様の甘やかな薬草実験室 (`.../b45b9dc323a36`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 10 | 私の主人は大きな犬系騎士様 (`.../2def70d04d78c`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 虐げられた秀才令嬢と隣国の腹黒研究者様の甘やかな薬草実験室 (`.../b45b9dc323a36`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 虐げられた秀才令嬢と隣国の腹黒研究者様の甘やかな薬草実験室 (`.../b45b9dc323a36`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 25 | 第1話 (`.../0d4e1ef4ccf70`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 29 |  |  | 1-10s |

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
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=虐げられた秀才令嬢と隣国の腹黒研究者様の甘やかな薬草実験室, URL=`.../b45b9dc323a36` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 43/43 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 43/43 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20250605164711933207A12A161CDC5F02220AE367906BA41-lg.webp` (image/webp (encoding: lossy), 36762 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../b45b9dc323a36` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20250605164711933207A12A161CDC5F02220AE367906BA41.png` (image/png, 3839164 bytes, 2560x1344) |  |  |  |
| details author | PASS | 椎葉きのこ, 琴乃葉, さんど |  |  |  |
| details artist | PASS | 椎葉きのこ, 琴乃葉, さんど |  |  |  |
| details genres | PASS | 令嬢・宮廷, 女性向け, 恋愛 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ジルギスタ国の薬草研究者であるライラは<br>同じ研究所の婚約者や妹に「雑用係」と罵られ、<br>重ねた努力を誰からも認められない日々を過ごしていた。<br>挙句の果てには婚約破棄まで言い渡され、<br>研究所を去ることを決意したライラ。<br>そんな時、隣国で研究者をしているというアシュレンに出会う。<br>「ここで愛を囁けばロマンティックなのだろうが、俺は貴女をスカウトしに来た」<br>その誘いに希望を見出し、アシュレンの研究仲間として隣国に渡ったライラ。<br>そこで充実した日々を過ごすうちに、二人の心は変化し始め――？︎ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 25 chapters |  |  |  |
| chapter dates | PASS | 25 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.comicpash.jp/.../master-1749195610206-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 4, 2, 7, 1, 3, 8, 9, 0, 15, 5, 13, 10, 11, 14, 12\]` (image/jpeg, 229572 bytes, 720x1024) |  |  |  |
