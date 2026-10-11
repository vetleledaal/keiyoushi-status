# Extension Validation Report

- Extension: tachiyomi-ja.hayacomic-v1.6.1
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
- Source ID: 5820719158683766054
- Source name: HAYA Comic
- Source language: ja
- Selected manga input: popular offset 0: 同志少女よ、敵を撃て (`.../09a83b31c6cff`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | 同志少女よ、敵を撃て (`.../09a83b31c6cff`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 今日の早川さん (`.../d6abe3f6e47a7`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 2 | と、ある日のすごくふしぎ (`.../3fc2c87c11cb1`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 同志少女よ、敵を撃て (`.../09a83b31c6cff`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 同志少女よ、敵を撃て (`.../09a83b31c6cff`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 23 | 同志少女よ、敵を撃て　第1話前半 (`.../3946d9c674d73`) |  | <1s |
| pages | `getPageList(chapter)` | success | 39 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=同志少女よ、敵を撃て, URL=`09a83b31c6cff` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20241007105531532F5541DCA8E1E69681D78A35E75B785FD-lg.webp` (image/webp (encoding: lossy), 41244 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `09a83b31c6cff` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20241007105531532F5541DCA8E1E69681D78A35E75B785FD.png` (image/png, 1567204 bytes, 1280x672) |  |  |  |
| details author | PASS | 逢坂冬馬, 鎌谷悠希, 速水螺旋人 |  |  |  |
| details artist | PASS | 逢坂冬馬, 鎌谷悠希, 速水螺旋人 |  |  |  |
| details genres | PASS | ミステリ, 冒険 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 独ソ戦が激化する1942年、モスクワ近郊の農村に暮らす少女セラフィマの日常は、突如崩壊した。急襲したドイツ軍により、村人たちそして母親が惨殺されたのだ。自らも射殺される寸前、セラフィマは赤軍の女性兵士イリーナに救われる。母たちを奪った敵を倒すため、セラフィマは仲間たちとともに一流の狙撃兵になるべく訓練を重ねてゆく――敵を討つ、その想いに燃える少女たちの果てしない闘いの行方。2022年本屋大賞受賞作・2022年高校生直木賞受賞作・2022年〈いちばん売れた小説〉が待望のコミック化。『少年ノート』『しまなみ誰そ彼』の鎌谷悠希氏がコミカライズ！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 23 chapters |  |  |  |
| chapter dates | PASS | 23 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 39 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.hayacomic.jp/.../master-1727316548137-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 2, 3, 12, 7, 13, 14, 1, 15, 0, 6, 9, 10, 5, 11, 8\]` (image/jpeg, 184748 bytes, 844x1200) |  |  |  |
