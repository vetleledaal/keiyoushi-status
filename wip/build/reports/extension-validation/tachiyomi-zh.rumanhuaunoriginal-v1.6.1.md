# Extension Validation Report

- Extension: tachiyomi-zh.rumanhuaunoriginal-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6075779468319464999
- Source name: 如漫画 (unoriginal)
- Source language: zh
- Selected manga input: popular offset 0: 纯情丫头火辣辣 (`.../507050`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | 纯情丫头火辣辣 (`.../507050`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | 医统·乱世 (`.../513601`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 纯情丫头火辣辣 (`.../507050`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 352 | 第1话 (`.../oXKl3hlDG5.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 40/40 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 40/40 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://p6.ecombdimg.com/.../3bd78cebfd9d48089861eb74ea3f5ba1~tplv-scl3phc04j-image.jpeg` (image/jpeg, 18356 bytes, 210x280) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../507050` |  |  |  |
| details thumbnail URL | PASS | `https://p6.ecombdimg.com/.../3bd78cebfd9d48089861eb74ea3f5ba1~tplv-scl3phc04j-image.jpeg` |  |  |  |
| details author | PASS | 北京三福 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 恋爱, 都市, 少女 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 洛瑶瑶，一夜醉酒她竟把那翻手云复手雨的黑道帝王当成牛郎给上了?怎么办,跑吧!2年后,她是中国第一企业的电梯小姐却终日被一个帅哥同事所骚扰“喂!喂!喂!不要玩了好不好?在玩下去我就该怀孕了,我到底是哪里惹了你了?”“哪里?”男人阴沉的一笑,再度将她按到:“小东西2年前我叫你跑了,2年后我一定将你吃的连骨头都不剩。”虾米?这个帅哥同事就是2年前的黑道帝王?虾米?他现在还是中国第一集团的总裁?偶买噶...“求求你,放过我吧好不好? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 352 chapters |  |  |  |
| chapter dates | LINT | 351 of 352 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=351 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://dmw.546457.xyz/.../7a0e0a3876b7c0494377f73713c7db28.webp` (image/webp (encoding: lossy), 105118 bytes, 800x1132) |  |  |  |
