# Extension Validation Report

- Extension: tachiyomi-ja.kadocomi-v1.6.3
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
- Source ID: 8396089563187142394
- Source name: カドコミ
- Source language: ja
- Selected manga input: popular offset 0: 死に戻りの魔法学校生活を、元恋人とプロローグから（※ただし好感度はゼロ） (`.../KC_005339_S`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 死に戻りの魔法学校生活を、元恋人とプロローグから（※ただし好感度はゼロ） (`.../KC_005339_S`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | 王妃になった魔女様 (`.../KC_020122_S`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | 古城で暮らす私たち　～魔女と学者と少年の一見穏やかな日々～ (`.../KC_021621_S`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | 戦利品令嬢シェリルは自分を殺す夫を籠絡したい (`.../KC_008497_S`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 死に戻りの魔法学校生活を、元恋人とプロローグから（※ただし好感度はゼロ） (`.../KC_005339_S`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 死に戻りの魔法学校生活を、元恋人とプロローグから（※ただし好感度はゼロ） (`.../KC_005339_S`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 104 | 第1話　二度目の入学式① (`.../018d8cce-b4fa-778a-ab2c-f23cbc2a415e`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=死に戻りの魔法学校生活を、元恋人とプロローグから（※ただし好感度はゼロ）, URL=`.../KC_005339_S` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.comic-walker.com/.../coverImage_2b99e122f5394da1a1ad80db0d1a27e6.jpg` (image/jpeg, 41077 bytes, 350x498) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../KC_005339_S` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.comic-walker.com/.../coverImage_2b99e122f5394da1a1ad80db0d1a27e6.jpg` |  |  |  |
| details author | PASS | 六つ花えいこ |  |  |  |
| details artist | PASS | 白川蟻ん |  |  |  |
| details genres | PASS | 少女, ファンタジー, コミカライズ, 異世界, なろう系, 小説家になろう, 死に戻り |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ラーゲン魔法学校に通うオリアナには、ヴィンセントという最愛の恋人がいた。優しくて一途なヴィンセントは、彼女にとってまさに理想の人だった。いつまでも続くと思われた幸せな学校生活。だが17歳の春、原因不明の死が二人を襲う。目が覚めた時、オリアナは７歳の姿に戻っていて――…。<br>つぎラノ2021にもノミネートされた、大人気ＷＥＢ小説のコミカライズ☆<br><br>Next Update: 未定 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 104 chapters |  |  |  |
| chapter dates | PASS | 104 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.comic-walker.com/.../1_cd630cb633efa8b74dd12bfa462f2a475747324b37b655279c80f2b786688544.webp <redacted query values: Policy, Signature, and Key-Pair-Id>` (image/webp (container: extended), 83296 bytes, 650x924; server Content-Type: application/octet-stream) |  |  |  |
