# Extension Validation Report

- Extension: tachiyomi-ja.mangasaison-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7468001507218227155
- Source name: Manga Saison
- Source language: ja
- Selected manga input: popular offset 0: 雑用付与術師が自分の最強に気付くまで（コミック） (`.../1048368`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 100 | 雑用付与術師が自分の最強に気付くまで（コミック） (`.../1048368`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | 愛されないとわかっていても～捨てられ王女は黒騎士の激重執愛に囚われる～４ (`.../2299323`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | 今度こそ幸せになりたくて離婚を決意したところ、無表情な旦那様が「愛してる」と言ってきました。18 (`.../1911537`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | 雑用付与術師が自分の最強に気付くまで（コミック） 分冊版 (`.../1061539`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 雑用付与術師が自分の最強に気付くまで（コミック） (`.../1048368`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 12 | 雑用付与術師が自分の最強に気付くまで（コミック） 1 (`.../d165d45d-24ec-4bed-b50b-f968316ef149`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 168 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=雑用付与術師が自分の最強に気付くまで（コミック）, URL=`1048368` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 162/162 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 162/162 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image.mechacomi.jp/.../1048368.jpg <redacted query values: ver>` (image/jpeg, 53664 bytes, 238x338) |  |  |  |
| details identity | PASS | Details preserved selected URL `1048368` |  |  |  |
| details thumbnail URL | PASS | `https://image.mechacomi.jp/.../1048368.jpg <redacted query values: ver>` |  |  |  |
| details author | PASS | アラカワシン, 戸倉儚 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 青年, ファンタジー |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 〝付与術師〟としてサポートに徹する非戦闘員のヴィムは、仲間の危機を救うために立ち上がり、単独で階層主を倒すことに成功する。しかし、手柄を横取りされたと激昂したリーダーのクロノスによって、パーティーから追放されてしまう。途方に暮れるヴィムだったが、幼馴染のハイデマリーによって見出され、最大手パーティー「夜蜻蛉」の勧誘を受けることになるのだが……。自身の能力に無自覚な〝雑用係〟がその真の力に気付くとき――世界は震撼することになる。<br><br>Alternative Title: ザツヨウフヨジュツシガジブンノサイキョウニキヅクマデコミック<br><br>Publisher: 双葉社 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | PASS | 12 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 168 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://api.distribution.mediadotech.com/.../BT000240009900100101900209_00120260820110120.uze <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/jpeg, 307167 bytes, 1125x1600; server Content-Type: binary/octet-stream) |  |  |  |
