# Extension Validation Report

- Extension: tachiyomi-zh.komiic-v1.6.11
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Selected manga input: popular offset 0: 腦洞學生會 (`.../1696`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 腦洞學生會 (`.../1696`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | 異世界好色無雙錄 (`.../2475`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | 最終Boss魔女和冷面侍從的戀戀二三事 (`.../11928`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | JK小說家 (`.../5076`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 14 | 腦洞學生會 (`.../1696`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 腦洞學生會 (`.../1696`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 203 | 第 01 卷 (`.../40740`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 174 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=腦洞學生會, URL=`.../1696` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 134/134 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 134/134 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://public.komiic.com/.../cover.jpg` (image/jpeg, 23087 bytes, 180x240) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1696` |  |  |  |
| details thumbnail URL | PASS | `https://public.komiic.com/.../cover.jpg` |  |  |  |
| details author | PASS | むちまろ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 愛情, 搞笑, 校園, 生活, 性暗示 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 《腦洞學生會》（日文原名：生徒会にも穴はある！）是由日本漫畫家むちまろ（無知麻呂）創作的日常系浪漫喜劇漫畫。故事圍繞私立藤成學園的學生會展開，講述高一文藝青年水之江梅因理科成績不佳，面臨留級危機，經導師建議加入學生會以提升評價。在這裡，他遇到了個性鮮明的學生會成員，包括悶騷的學生會長古都吹壽子、清純派會計照井有棲、囂張可愛的男孩子尾鳥綻，以及嬌小的庶務陸奧駒絽。故事以幽默風趣的方式描繪了他們在學生會中的日常生活和各種趣事。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 203 chapters |  |  |  |
| chapter dates | PASS | 203 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 174 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://komiic.com/.../e981570b-ec9d-49cd-9481-aa1cfaa625ff` (image/jpeg, 193832 bytes, 900x1280) |  |  |  |
