# Extension Validation Report

- Extension: tachiyomi-ja.raw18-v1.6.27
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
- Source theme: wpcomics
- Source ID: 2238636513447052332
- Source name: Raw18
- Source language: ja
- Selected manga input: latest offset 0: エンバーミング・マジック 魔法を殺す魔法 (`.../enbamingumazitsuku-mo-fa-wosha-sumo-fa`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | 成長チートでなんでもできるようになったが、無職だけは辞められないようです (`.../cheng-chang-chitodenandemodekiruyouninatsutaga-wu-zhi-dakehaci-merarenaiyoudesu`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 36 | 俺は星間国家の悪徳領主！ (`.../an-haxing-jian-guo-jia-noe-de-ling-zhu`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 36 | エンバーミング・マジック 魔法を殺す魔法 (`.../enbamingumazitsuku-mo-fa-wosha-sumo-fa`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 36 | 転生社畜のチート菜園　～万能スキルと便利な使い魔妖精を駆使してたら、気づけば大陸一の生産拠点ができていた～ (`.../zhuan-sheng-she-chu-nochitocai-yuan-mo-neng-sukirutobian-li-nashi-imo-yao-jing-woqu-shi-shitetara-qi-dukebada-lu-yi-nosheng-chan-ju-dian-gadekiteita`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | エンバーミング・マジック 魔法を殺す魔法 (`.../enbamingumazitsuku-mo-fa-wosha-sumo-fa`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | エンバーミング・マジック 魔法を殺す魔法 (`.../enbamingumazitsuku-mo-fa-wosha-sumo-fa`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 11 | 第1話 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 59 |  |  | 1-10s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=エンバーミング・マジック 魔法を殺す魔法, URL=`.../enbamingumazitsuku-mo-fa-wosha-sumo-fa` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://iphotomg.com/.../enbamingumazitsuku-mo-fa-wosha-sumo-fa.webp` (image/webp (encoding: lossy), 20960 bytes, 300x430) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../enbamingumazitsuku-mo-fa-wosha-sumo-fa` |  |  |  |
| details thumbnail URL | PASS | `https://iphotomg.com/.../enbamingumazitsuku-mo-fa-wosha-sumo-fa.webp` |  |  |  |
| details author | PASS | 更新中 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Fantasy, Drama |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 説明 「普段は人を殺すような人間でも、今回だけ誰かを助けてもいいのか？」 目の前で、一人の少女が車にはねられた。その日、若き魔術師・霧切静は禁忌を犯した。彼は一般人に魔法を使い、その少女の命を救ったのだ。しかし、その代償として、少女・家入なぎは猫へと変身してしまった――？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | PASS | 11 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 59 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://iphotomg.com/.../0.webp` (image/webp (container: extended), 133932 bytes, 836x1200) |  |  |  |
