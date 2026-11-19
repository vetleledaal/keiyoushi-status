# Extension Validation Report

- Extension: tachiyomi-zh.kaobeimanhua-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4455255049118963922
- Source name: 拷貝漫畫
- Source language: zh
- Selected manga input: popular offset 0: 魔都精兵的奴隸 (`.../modujingbingdenuli`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 魔都精兵的奴隸 (`.../modujingbingdenuli`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | 異世界叔叔 (`.../yishijieshushu`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | 王領騎士 (`.../wanglingqishi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | 碧藍檔案 青春記錄 (`.../bilandanganqingchunjilu`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 30 | 魔都精兵的奴隸 (`.../modujingbingdenuli`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 魔都精兵的奴隸 (`.../modujingbingdenuli`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 236 | 其它汉化版：第95话 (`.../99473524-5da6-11ed-9918-024352452ce0`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=魔都精兵的奴隸, URL=`modujingbingdenuli` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 150/150 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 150/150 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://sm.mangafunb.fun/.../1684896820.jpg.328x422.jpg` (image/jpeg, 68623 bytes, 328x422) |  |  |  |
| details identity | PASS | Details preserved selected URL `modujingbingdenuli` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://sm.mangafunb.fun/.../1684896820.jpg` (image/jpeg, 607594 bytes, 1587x2494) |  |  |  |
| details author | PASS | 竹村洋平, タカヒロ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 冒險, 奇幻 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 日本 · 一般向(免費)<br><br>在未來，日本各地出現被稱為『魔都』的異空間──魔都內存在的『桃』由於只賦予女性超能力，由此男女力量關係崩壞，政府為將通往魔都異世界的大門收入管轄，從而成立了由擁有強大『桃之力量』的女性組成的特殊部隊『魔防隊』。某日，過著鬱悶人生的男子高中生──和倉優希突然闖進了魔都的入口。在那裡遇到的《魔防隊》七番組的美女隊長──羽前京香，被宣佈「你就是我的奴隸了」……！？<br><br>**別名:**<br>- 魔都精兵的奴隶 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 236 chapters |  |  |  |
| chapter dates | PASS | 236 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://sm.mangafunb.fun/.../1667720642140010.jpg.c1500x.jpg` (image/jpeg, 537781 bytes, 1069x1677) |  |  |  |
