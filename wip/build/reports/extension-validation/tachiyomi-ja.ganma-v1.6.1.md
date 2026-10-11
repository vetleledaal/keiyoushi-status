# Extension Validation Report

- Extension: tachiyomi-ja.ganma-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8045942616403978870
- Source name: GANMA!
- Source language: ja
- Selected manga input: popular offset 0: 春雷とノイズ (`.../shunnrainoizu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 35 | 春雷とノイズ (`.../shunnrainoizu`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | カッコいい女の子と12センチの約束 (`.../12cm`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | カッコいい女の子と12センチの約束 (`.../12cm`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 春雷とノイズ (`.../shunnrainoizu`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 春雷とノイズ (`.../shunnrainoizu`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 15 | 第1話 春に落ちる雷 (`.../9fc9a6d0-1b5c-11f1-9636-66f6359df335`) |  | <1s |
| pages | `getPageList(chapter)` | success | 49 |  |  | <1s |

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
| popular listing | PASS | 35 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=春雷とノイズ, URL=`shunnrainoizu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 76/76 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 76/76 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://d1bzi54d5ruxfk.cloudfront.net/.../45b43b75-f3b3-4f95-888a-14e00f45f546.jpg <redacted query values: Policy, Signature, and Key-Pair-Id>` (image/jpeg, 602392 bytes, 1180x1770) |  |  |  |
| details identity | PASS | Details preserved selected URL `shunnrainoizu` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://d1bzi54d5ruxfk.cloudfront.net/.../9cc83480-1ebb-11f1-8140-eafbcf678c42.jpg <redacted query values: Policy, Signature, and Key-Pair-Id>` (image/jpeg, 474715 bytes, 1180x1180) |  |  |  |
| details author | PASS | きさわさき |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 恋愛, 学園, 女性向け, ドラマ, 青春, 広告掲載中, 見逃し厳禁の新連載 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 「たかが友達の妹のはずなのに…どうして私に関わるの？」<br><br>派手な兄と比較され、勝手な期待と幻滅をされ続けたことで他人との関わりを避けていた鈴。<br>しかし、妹だとバレたことで彼女の平穏な高校生活は崩壊する——<br><br>打算で擦り寄る生徒、兄と比較してくる生徒に囲まれる日々に逆戻り。<br>挙げ句の果てに兄を逆恨みしている不良に襲われてしまう。<br><br>絶体絶命の鈴を救ってくれたのは、最も関わりたくない兄の友達・秦だった。<br><br>たかが友達の妹のはずなのに、なぜか鈴を気にかける秦。<br>彼の強引な優しさで鈴の世界は、少しずつ鮮やかに色づいていくー |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 15 chapters |  |  |  |
| chapter dates | PASS | 15 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 49 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://d1bzi54d5ruxfk.cloudfront.net/.../1.jpg <redacted query values: Policy, Signature, Key-Pair-Id, and w>` (image/jpeg, 649571 bytes, 1313x1850) |  |  |  |
