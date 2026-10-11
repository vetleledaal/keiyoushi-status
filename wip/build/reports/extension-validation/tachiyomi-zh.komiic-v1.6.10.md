# Extension Validation Report

- Extension: tachiyomi-zh.komiic-v1.6.10
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 792932060924485302
- Source name: Komiic
- Source language: zh
- Selected manga input: popular offset 0: 魔都精兵的奴隸 (`.../533`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 魔都精兵的奴隸 (`.../533`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | 午夜心旋律 (`.../2100`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | 愛管閒事的女生，戀愛了 (`.../10830`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | 可愛原學姐喜歡可愛的早乙女君！ (`.../5621`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | 魔都精兵的奴隸 (`.../533`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 魔都精兵的奴隸 (`.../533`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 212 | 第 01 卷 (`.../8706`) |  | <1s |
| pages | `getPageList(chapter)` | success | 202 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=魔都精兵的奴隸, URL=`.../533` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 123/123 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 123/123 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://public.komiic.com/.../cover.jpg` (image/jpeg, 114400 bytes, 829x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../533` |  |  |  |
| details thumbnail URL | PASS | `https://public.komiic.com/.../cover.jpg` |  |  |  |
| details author | PASS | 竹村洋平，タカヒロ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 冒險, 戰鬥, 魔幻, 校園, 異世界, 後宮, 熱血, 性暗示, 暴力 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 數十年前，日本各地突然出現連接異空間「魔都」的神祕門戶「枯那道」，由此出現的怪物「醜鬼」不斷侵擾人類社會。魔都中的「桃」只能賦予女性特殊能力，導致社會逐漸演變為女尊男卑的格局，並由具有異能的女性組成「魔防隊」對抗醜鬼。平凡高中生和倉優希在某天意外闖入魔都，被魔防隊七番組組長羽前京香以其能力「無窮的鎖（スレイブ）」收為奴隸，獲得了超乎常人的戰鬥力。優希在成為京香奴隸兼七番組宿舍管理人後，憑藉擅長的家事與戰場上的奮勇表現，逐漸贏得各組女性組員的信賴與好感。故事在後宮式的溫馨日常與激烈的魔都戰鬥之間交替推進，展現出主角從平凡少年成長為真正英雄的歷程。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 212 chapters |  |  |  |
| chapter dates | PASS | 212 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 202 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://komiic.com/.../4e2a7d06-7691-44a2-92dd-a4ee4703c7e8` (image/jpeg, 240538 bytes, 1150x1500) |  |  |  |
