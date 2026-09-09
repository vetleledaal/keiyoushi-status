# Extension Validation Report

- Extension: tachiyomi-ja.jnbooks-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 29
- Lint: 0
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 2876739237900975302
- Source name: J-N Books
- Source language: ja
- Selected manga input: popular offset 0: 異世界でテイムした最強の使い魔は、幼馴染の美少女でした (`.../d2997c88e1a65`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 19 | 異世界でテイムした最強の使い魔は、幼馴染の美少女でした (`.../d2997c88e1a65`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 異世界でテイムした最強の使い魔は、幼馴染の美少女でした (`.../d2997c88e1a65`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 異世界でテイムした最強の使い魔は、幼馴染の美少女でした (`.../d2997c88e1a65`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 60 | 第1話① (`.../b5d46d0267d8a`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 25 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 19 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=異世界でテイムした最強の使い魔は、幼馴染の美少女でした, URL=`.../d2997c88e1a65` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 20/20 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 20/20 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../202409181738081344C2252A098A2B16AEEE44F0811FC7ECC-sm.webp` (image/webp (encoding: lossy), 14910 bytes, 320x168; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../d2997c88e1a65` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../202409181738081344C2252A098A2B16AEEE44F0811FC7ECC.png` (image/png, 1499578 bytes, 1280x672) |  |  |  |
| details author | PASS | すかいふぁーむ, 長谷川, 片桐 |  |  |  |
| details artist | PASS | すかいふぁーむ, 長谷川, 片桐 |  |  |  |
| details genres | PASS | ジャルダン, ファンタジー, 異世界・転生, 青年向け |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 異世界冒険ファンタジー！！<br>地味な男子高校生・筒井遥人は、クラスメイトたちと一緒に突然異世界に召喚される。<br>勇者として召喚され生徒たちの中でも、遥人は特別な能力があることがわかり…。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 60 chapters |  |  |  |
| chapter dates | PASS | 60 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.comic.j-nbooks.jp/.../master-1726638641165-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 5, 10, 13, 2, 6, 14, 11, 3, 8, 12, 15, 1, 0, 9, 4\]` (image/jpeg, 569892 bytes, 1351x1920) |  |  |  |
