# Extension Validation Report

- Extension: tachiyomi-zh.dogemanga-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5682212339981773078
- Source name: 漫畫狗
- Source language: zh
- Selected manga input: popular offset 0: 海賊王 (`.../gt9rgUMw`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 23 | 海賊王 (`.../gt9rgUMw`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 23 | 入间同学入魔了 (`.../hXMgwpFo`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 魔法禁書目錄 (`.../lNUiXSru`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Noise Ring (`.../Yjl54sHD`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | 海賊王資料設定集 (`.../Ln2Vg3Tx`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 海賊王 (`.../gt9rgUMw`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 796 | 1卷 (`.../W_-TLMTr`) |  | <1s |
| pages | `getPageList(chapter)` | success | 104 |  |  | 1-10s |

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
| popular listing | PASS | 23 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=海賊王, URL=`gt9rgUMw` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 118/118 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 118/118 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dogemanga.com/.../gt9rgUMw.jpg` (image/jpeg, 38101 bytes, 240x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `gt9rgUMw` |  |  |  |
| details thumbnail URL | PASS | `https://dogemanga.com/.../gt9rgUMw.jpg` |  |  |  |
| details author | PASS | 尾田榮一郎 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 他擁有世上一切財富,聲望和權力,他就是海盜王--葛魯多-羅渣. 他臨死前說的一句話,驅使全世界的人進入大海--想要我的財富嗎可以的.我把一切都放在那裡,你們去找吧! 于是,海盜時代開始了-- \[追逐夢想的少年\] '我要成為海賊王!' 這就是我們的主人公--魯夫的宣言.魯夫擁有惡魔果實能力,身體可以任意伸長,但永遠學不會游泳.他是典型單細胞的家夥,單純,熱血,少根筋,不過真的是很可愛呢~~~而他的周圍也逐漸聚集起一群同樣有夢想,有實力的熱血夥伴--佐羅,奈美,香吉士和烏索普. 路飛海盜團,向偉大航道進發吧! \[旅途\] -小鎮少年路飛乘著一條小小船出海了.目標是--海賊王! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 796 chapters |  |  |  |
| chapter dates | LINT | All 796 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=796 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 104 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://dogemanga.com/.../W_-TLMTr.jpg` (image/jpeg, 293783 bytes, 1428x1312) |  |  |  |
