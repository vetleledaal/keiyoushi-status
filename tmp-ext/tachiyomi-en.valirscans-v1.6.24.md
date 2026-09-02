# Extension Validation Report

- Extension: tachiyomi-en.valirscans-v1.6.24
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9114028255622294379
- Source name: Valir Scans
- Source language: en
- Selected manga input: popular offset 0: I Don't Want to Be the Magpie Bridge (`.../cmlytxiky0004wqx4tfkp8it4`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | I Don't Want to Be the Magpie Bridge (`.../cmlytxiky0004wqx4tfkp8it4`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Your Majesty, Please Spare Me This Time (`.../cmm147j9z026qwqxahc0bsqp3`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Get Out of My Romance Fantasy (`.../cmta5zjgd0000d2qqzbl2p84m`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | The Pearl of Albrecht (`.../cmo0clszc02ragwqqpxjx5djh`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I Don't Want to Be the Magpie Bridge (`.../cmlytxiky0004wqx4tfkp8it4`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Don't Want to Be the Magpie Bridge (`.../cmlytxiky0004wqx4tfkp8it4`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 115 | Chapter 1 (`.../cmm14oe9l006qwqbzmiwp66uy`) |  | <1s |
| pages | `getPageList(chapter)` | success | 35 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Don't Want to Be the Magpie Bridge, URL=`cmlytxiky0004wqx4tfkp8it4` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://valirscans.org/.../cover-0d0ce2b1d94bba00e86824915873c260.webp` (image/webp (encoding: lossy), 529892 bytes, 1728x2474) |  |  |  |
| details identity | PASS | Details preserved selected URL `cmlytxiky0004wqx4tfkp8it4` |  |  |  |
| details thumbnail URL | PASS | `https://valirscans.org/.../cover-0d0ce2b1d94bba00e86824915873c260.webp` |  |  |  |
| details author | PASS | admins |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | MANHWA, KOREAN, Comedy, Fantasy, Isekai, Romance, School Life, Shoujo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | After being reborn into a novel, Shuryna, knowing her ultimate fate, plans to become a magic knight and retire rich. However, her biggest obstacle is the four men in love with her best friend, Hestia. They're supposed to chase after Hestia but want Shuryna to be their matchmaker. She refuses since that role was what led to her banishment, but the boys are relentless. Can Shuryna grasp the wealthy retirement she desperately desires? Or will Hestia's love interests lead to her downfall again?<br><br>Rating: 9.819444444444445<br>Type: MANHWA<br>Origin: KOREAN<br><br>Alternative titles: <br>- 오작교는 싫습니다<br>- I Don't Want To Be a Magpie Bridge<br>- I Don't Want to Be an Ojakgyo<br>- Не хочу быть Очжаккё<br>- Ojakgyoneun Silseumnida<br>- 恋の橋渡し役なんてまっぴらです<br>- 谢绝当鹊桥<br>- Tôi Không Muốn Làm Cầu Ô Thước<br>- Tôi Không Muốn Làm Người Mai Mối |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 115 chapters |  |  |  |
| chapter dates | PASS | 115 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://media.valirscans.org/.../p-550499dd-8121-4abf-bea8-0db1c67e6d1b.webp` (image/webp (encoding: lossy), 429530 bytes, 800x4000) |  |  |  |
