# Extension Validation Report

- Extension: tachiyomi-en.valirscans-v1.6.26
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
- Source theme: vinetheme
- Source ID: 9114028255622294379
- Source name: Valir Scans
- Source language: en
- Selected manga input: popular offset 0: Actually, I Was the Real One (`.../cmlu718xb000lwqgvliv2qz1i`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Actually, I Was the Real One (`.../cmlu718xb000lwqgvliv2qz1i`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Marquis of Marron (`.../cmmn9c7m402irxnqqza3r0sxk`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | I’ll Quit as The Empress (`.../cmuvdumvw04q0xhqq8kpmqibu`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | The Simp Villainess Is Getting a Divorce! (`.../cmmz38u6t00026xqq4hybgxgl`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Actually, I Was the Real One (`.../cmlu718xb000lwqgvliv2qz1i`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Actually, I Was the Real One (`.../cmlu718xb000lwqgvliv2qz1i`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 163 | Chapter 1 (`.../cmlzu1pm90002wq90d7ouohox`) |  | <1s |
| pages | `getPageList(chapter)` | success | 32 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Actually, I Was the Real One, URL=`cmlu718xb000lwqgvliv2qz1i` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://valirscans.org/.../cover-770332d559510411aaf0f766f5649dd3.webp` (image/webp (container: extended), 675864 bytes, 1792x2400) |  |  |  |
| details identity | PASS | Details preserved selected URL `cmlu718xb000lwqgvliv2qz1i` |  |  |  |
| details thumbnail URL | PASS | `https://valirscans.org/.../cover-770332d559510411aaf0f766f5649dd3.webp` |  |  |  |
| details author | PASS | admins |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | MANHWA, KOREAN, Drama, Fantasy, Romance, Shoujo |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Executed as a "fake" daughter after dedicating her entire life to winning her father's affection, she learns a cruel truth moments before her death: she was the real daughter all along. When she miraculously travels back in time, she decides to abandon her desperate need for her family's approval. Fake or real, it doesn't matter anymore. In her second life, her only goal is to live freely for herself, make true friends, and finally find her own happiness.<br><br>Rating: 9.2<br>Type: MANHWA<br>Origin: KOREAN<br><br>Alternative titles: <br>- 사실은 내가 진짜였다<br>- Actually i was the real one<br>- Actually, I'm the Real One<br>- 実は私が本物だった<br>- 事实上，我才是真的<br>- 真与假的精灵师少女<br>- 其实我才是真的<br>- 其實我才是正牌千金<br>- Sasireun Naega Jinjjayeotda<br>- Sasil-eun Naega Jinjjayeossda<br>- La vraie, c'est moi !<br>- Eu sou a verdadeira<br>- En realidad, yo era la verdadera<br>- Насправді, я була справжньою<br>- На самом деле, я была настоящей<br>- ฉันนี่แหละที่เป็นตัวจริง<br>- Chị đây mới là hàng thật nha cưng!<br>- Sesungguhnya, Akulah yang asli<br>- Gerçek Olan Bendim<br>- Үнэндээ би жинхэнэ охин нь байсан<br>- Die wahre Tochter bin ich<br>- La verdad es que soy la auténtica<br>- Իրականում ես իրականն էի |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 163 chapters |  |  |  |
| chapter dates | PASS | 163 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.valirscans.org/.../p-d3eab686-addd-43af-8c6e-f294b05a3b48.webp` (image/webp (encoding: lossy), 469644 bytes, 800x3995) |  |  |  |
