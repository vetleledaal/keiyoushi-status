# Extension Validation Report

- Extension: tachiyomi-ja.jnbooks-v1.6.1
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
- Source ID: 2876739237900975302
- Source name: J-N Books
- Source language: ja
- Selected manga input: popular offset 0: 転生聖女は引きこもりスローライフを目指したい！ (`.../f36d699f1a92a`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | 転生聖女は引きこもりスローライフを目指したい！ (`.../f36d699f1a92a`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 異世界でテイムした最強の使い魔は、幼馴染の美少女でした (`.../d2997c88e1a65`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | ごはんのおともをあと少し (`.../a6ee80d166d0a`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 転生聖女は引きこもりスローライフを目指したい！ (`.../f36d699f1a92a`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 転生聖女は引きこもりスローライフを目指したい！ (`.../f36d699f1a92a`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 28 | 第1話 (`.../5f8df26dc8f85`) |  | <1s |
| pages | `getPageList(chapter)` | success | 31 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=転生聖女は引きこもりスローライフを目指したい！, URL=`f36d699f1a92a` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20250624115625086A5382391CF6ADEE1A321840AF23C3C71-lg.webp` (image/webp (encoding: lossy), 48490 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `f36d699f1a92a` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20250624115625086A5382391CF6ADEE1A321840AF23C3C71.png` (image/png, 4317963 bytes, 2560x1344) |  |  |  |
| details author | PASS | 餅西うまし, アトハ, 昌未 |  |  |  |
| details artist | PASS | 餅西うまし, アトハ, 昌未 |  |  |  |
| details genres | PASS | コミカライズ, リュエル, ロマンス, 女性向け, 恋愛, 異世界・転生 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 国に酷使され、無残な最期を迎えた大聖女エミーリア……という前世を思い出したエミリア。<br>今世こそは平穏に生きたいと、聖なる力を隠すことを決意するが…。<br>ブラック国家はもうこりごり！<br>無自覚才女のドタバタ胸キュンスローライフ！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 28 chapters |  |  |  |
| chapter dates | PASS | 28 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.comic.j-nbooks.jp/.../master-1750733222091-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 5, 12, 10, 0, 8, 4, 11, 9, 13, 2, 14, 3, 1, 7, 6\]` (image/jpeg, 196744 bytes, 720x1024) |  |  |  |
