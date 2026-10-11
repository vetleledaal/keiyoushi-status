# Extension Validation Report

- Extension: tachiyomi-ja.yanmaga-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 0
- Warnings: 1
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 2126618372106431410
- Source name: ヤンマガ（マンガ）
- Source language: ja
- Selected manga input: popular offset 0: サルビアの解憶 (`.../%E3%82%B5%E3%83%AB%E3%83%93%E3%82%A2%E3%81%AE%E8%A7%A3%E6%86%B6`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | サルビアの解憶 (`.../%E3%82%B5%E3%83%AB%E3%83%93%E3%82%A2%E3%81%AE%E8%A7%A3%E6%86%B6`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | 妻と僕の小規模な育児 (`.../%E5%A6%BB%E3%81%A8%E5%83%95%E3%81%AE%E5%B0%8F%E8%A6%8F%E6%A8%A1%E3%81%AA%E8%82%B2%E5%85%90`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | ジエイナドライヴ (`.../%E3%82%B8%E3%82%A8%E3%82%A4%E3%83%8A%E3%83%89%E3%83%A9%E3%82%A4%E3%83%B4`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | サルビアの解憶 (`.../%E3%82%B5%E3%83%AB%E3%83%93%E3%82%A2%E3%81%AE%E8%A7%A3%E6%86%B6`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | サルビアの解憶 (`.../%E3%82%B5%E3%83%AB%E3%83%93%E3%82%A2%E3%81%AE%E8%A7%A3%E6%86%B6`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | 第１話　知ってる (`.../079554c7110871f7700cc716c2c00558`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Could not find chapter ID | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Could not find chapter ID | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=サルビアの解憶, URL=`.../%E3%82%B5%E3%83%AB%E3%83%93%E3%82%A2%E3%81%AE%E8%A7%A3%E6%86%B6` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 55/55 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 55/55 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://eh96lnrmau.user-space.cdn.idcfcloud.net/.../2464.jpg` (image/jpeg, 99905 bytes, 1200x630) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%E3%82%B5%E3%83%AB%E3%83%93%E3%82%A2%E3%81%AE%E8%A7%A3%E6%86%B6` |  |  |  |
| details thumbnail URL | PASS | `https://eh96lnrmau.user-space.cdn.idcfcloud.net/.../2464.jpg` |  |  |  |
| details author | PASS | 高部額 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | #裏社会, #ミステリー・サスペンス, #ラブストーリー, #シリアス, #刑事 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 口に入れた物の”記憶”を読み取ってしまう特殊体質に悩む高校生・花守いよりは、近所で花屋を営むおじさん・安藤に密かに想いを寄せる。しかしある日突然おじさんがとある事件の容疑者として緊急逮捕されてしまう。それはかつて世間を震撼させた未解決連続殺人事件・通称「サルビア事件」。鳴り響くパトカーの警笛、野次馬達の喧噪の中、勇気を持って踏み出した大きな一歩によって、いよりは事件の重大な手がかりを得る！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Could not find chapter ID |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://yanmaga.jp/.../079554c7110871f7700cc716c2c00558` to `https://yanmaga.jp/.../079554c7110871f7700cc716c2c00558 <redacted query values: cid>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
