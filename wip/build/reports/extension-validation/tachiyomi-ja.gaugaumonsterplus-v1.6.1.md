# Extension Validation Report

- Extension: tachiyomi-ja.gaugaumonsterplus-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9220365500598403749
- Source name: がうがうモンスター＋
- Source language: ja
- Selected manga input: popular offset 0: 義妹に婚約者を奪われた落ちこぼれ令嬢は、天才魔術師に溺愛される (`.../61a6e369776561ccfa090000`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | 義妹に婚約者を奪われた落ちこぼれ令嬢は、天才魔術師に溺愛される (`.../61a6e369776561ccfa090000`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | Re:Re:Re:Kiss (`.../5YYjOiIolVrhFcy6jjl2DXtS0`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 義妹に婚約者を奪われた落ちこぼれ令嬢は、天才魔術師に溺愛される (`.../61a6e369776561ccfa090000`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 義妹に婚約者を奪われた落ちこぼれ令嬢は、天才魔術師に溺愛される (`.../61a6e369776561ccfa090000`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | 第1話 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 30 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=義妹に婚約者を奪われた落ちこぼれ令嬢は、天才魔術師に溺愛される, URL=`.../61a6e369776561ccfa090000` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 21/21 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 21/21 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gaugau.futabanet.jp/.../70f6c2a7-b20d-4f58-a705-35d280ca4ba5.jpg` (image/jpeg, 33348 bytes, 259x259) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../61a6e369776561ccfa090000` |  |  |  |
| details thumbnail URL | PASS | `https://gaugau.futabanet.jp/.../70f6c2a7-b20d-4f58-a705-35d280ca4ba5.jpg` |  |  |  |
| details author | PASS | オザイ, 瑪々子, みつなり都 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 恋, 女主人公, 溺愛, イケメン, 婚約破棄, 令嬢, 悪役令嬢, 異世界, 女性向け, 恋愛, 結婚, 貴族, 魔法, 胸キュン, なろう, 天才, ざまぁ |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 魔術師の家系で魔法が使えない落ちこぼれのイリス。婚約者を妹に奪われ家を追われた彼女は、とある家で侍女として働くことに。 「落ちこぼれとして生きるより、侍女として穏やかに生きる方が幸せだわ」 そう思って侍女生活を満喫し出したイリスは、なぜか主人である超絶美形の天才魔術師に、気に入られてしまい…!? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | LINT | All 6 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://gaugau.futabanet.jp/.../M_H.jpg` (image/jpeg, 608495 bytes, 1126x1600) |  |  |  |
