# Extension Validation Report

- Extension: tachiyomi-ja.magcomi-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gigaviewer
- Source ID: 8643773902904736600
- Source name: MAGCOMI
- Source language: ja
- Selected manga input: popular offset 0: 魔導具師ダリヤはうつむかない ～Dahliya Wilts No More～ (`.../10834108156763513460`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | 魔導具師ダリヤはうつむかない ～Dahliya Wilts No More～ (`.../10834108156763513460`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 100 | お飾り聖女のはずが、真の力に目覚めたようです THE COMIC (`.../2550912964574573845`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 魔導具師ダリヤはうつむかない ～Dahliya Wilts No More～ (`.../10834108156763513460`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 魔導具師ダリヤはうつむかない ～Dahliya Wilts No More～ (`.../10834108156763513460`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 131 | 第0話 (`.../10834108156763618313`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 34 |  |  | 1-10s |

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
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=魔導具師ダリヤはうつむかない ～Dahliya Wilts No More～, URL=`10834108156763513460` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.magcomi.com/.../10834108156763513460-d88b48110132e931777c09ed986b86af <redacted query values: 1788185498>` (image/jpeg, 582983 bytes, 1320x880) |  |  |  |
| details identity | PASS | Details preserved selected URL `10834108156763513460` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.magcomi.com/.../10834108156763513460-d88b48110132e931777c09ed986b86af <redacted query values: 1788185498>` |  |  |  |
| details author | PASS | 住川 惠.../%E9%A7%92%E7%94%B0%E3%83%8F%E3%83%81 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 【毎月第2･4火曜日更新】スライムの防水布、小型魔導コンロ、人工魔剣や妖精結晶のメガネ…。転生前の知識を活かした斬新な発想で、大好きな魔導具作りに没頭するダリヤは明るい気持ちでいっぱい。二度目の人生を謳歌する、異世界ものづくりファンタジー開幕！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 131 chapters |  |  |  |
| chapter dates | PASS | 131 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 34 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.magcomi.com/.../13933686331753574974-7498a6ee300a8a660fffd35621e64335` (image/jpeg, 905481 bytes, 1350x1920) |  |  |  |
