# Extension Validation Report

- Extension: tachiyomi-ja.magkan-v1.6.1
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
- Source theme: comiciviewer
- Source ID: 8826192789792786070
- Source name: MagKan
- Source language: ja
- Selected manga input: popular offset 0: ララティーナの婚約 前世、戦場で共に散った私と騎士様は――今世、田舎の伯爵令嬢と耳の聞こえない侯爵令息に生まれ変わって〈百年の恋〉を叶えます (`.../dfadc73bc5c8d`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | ララティーナの婚約 前世、戦場で共に散った私と騎士様は――今世、田舎の伯爵令嬢と耳の聞こえない侯爵令息に生まれ変わって〈百年の恋〉を叶えます (`.../dfadc73bc5c8d`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | MAGKAN漫画賞 (`.../5847788403bdd`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 後宮小説 (`.../4d8d8b62b1bdc`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | ララティーナの婚約 前世、戦場で共に散った私と騎士様は――今世、田舎の伯爵令嬢と耳の聞こえない侯爵令息に生まれ変わって〈百年の恋〉を叶えます (`.../dfadc73bc5c8d`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ララティーナの婚約 前世、戦場で共に散った私と騎士様は――今世、田舎の伯爵令嬢と耳の聞こえない侯爵令息に生まれ変わって〈百年の恋〉を叶えます (`.../dfadc73bc5c8d`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 9 | 第1話 (`.../42b4d214a8359`) |  | <1s |
| pages | `getPageList(chapter)` | success | 56 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ララティーナの婚約 前世、戦場で共に散った私と騎士様は――今世、田舎の伯爵令嬢と耳の聞こえない侯爵令息に生まれ変わって〈百年の恋〉を叶えます, URL=`dfadc73bc5c8d` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../2026012112351419487DE18D8D1A1B9A5F768ED983FD44CDE-lg.webp` (image/webp (encoding: lossy), 41728 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `dfadc73bc5c8d` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../2026012112351419487DE18D8D1A1B9A5F768ED983FD44CDE.png` (image/png, 4432163 bytes, 2560x1344) |  |  |  |
| details author | PASS | 三香, カ加羽, 逆木ルミヲ |  |  |  |
| details artist | PASS | 三香, カ加羽, 逆木ルミヲ |  |  |  |
| details genres | PASS | コミカライズ, 薬師, 転生 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 田舎の伯爵令嬢・ララティーナは八歳の時に前世を思い出す。それは英雄と讃えられた騎士と共に迎えた薬師としての最期の記憶。戦乱に巻き込まれた過酷な前世と比べ、今世は心温かい家族に愛され満ち足りた日々を送る彼女だったが、愛する騎士のことを想うたび、人知れず涙を流していた。だが、ララティーナはまだ知らない。騎士は耳の聞こえない侯爵令息として同じ時代に転生していたことを——。百年越しの恋を巡る、儚くも美しい転生婚約物語。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.kansai.mag-garden.co.jp/.../master-1768966490847-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 6, 13, 10, 9, 0, 3, 2, 8, 11, 12, 5, 7, 1, 14, 4\]` (image/jpeg, 498875 bytes, 1025x1457) |  |  |  |
