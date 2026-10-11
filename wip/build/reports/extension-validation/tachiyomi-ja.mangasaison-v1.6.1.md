# Extension Validation Report

- Extension: tachiyomi-ja.mangasaison-v1.6.1
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
- Source ID: 7468001507218227155
- Source name: Manga Saison
- Source language: ja
- Selected manga input: popular offset 0: 転生したらスライムだった件 (`.../342494`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 転生したらスライムだった件 (`.../342494`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | アマチュアビジランテ (`.../1682230`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | 愛人は逃げる【電子単行本版】 第5巻 (`.../2393594`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | 騙されて溺愛再婚しました！ 第54話 (`.../2041859`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 32 | 転生したらスライムだった件 (`.../342494`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 転生したらスライムだった件 (`.../342494`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 33 | 転生したらスライムだった件（１） (`.../001yplp2`) |  | <1s |
| pages | `getPageList(chapter)` | success | 244 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=転生したらスライムだった件, URL=`342494` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 152/152 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 152/152 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image.mechacomi.jp/.../342494.jpg <redacted query values: ver>` (image/jpeg, 45979 bytes, 238x338) |  |  |  |
| details identity | PASS | Details preserved selected URL `342494` |  |  |  |
| details thumbnail URL | PASS | `https://image.mechacomi.jp/.../342494.jpg <redacted query values: ver>` |  |  |  |
| details author | PASS | 川上泰樹, 伏瀬, みっつばー |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少年, SF, バトル・格闘・アクション, ファンタジー, 異世界 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | WEBで記録的なPVを集めた異世界転生モノの名作を、原作者完全監修でコミカライズ！ 巻末には原作者書き下ろしの短編小説を収録した、ファン必携の単行本いよいよ発売！＊「転スラ」スピンオフ５作品の第１話をまとめた試し読みパック付き！<br><br>Alternative Title: テンセイシタラスライムダッタケン<br><br>Publisher: 講談社<br><br>Magazine: 月刊少年シリウス |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 33 chapters |  |  |  |
| chapter dates | PASS | 33 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 244 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://api.distribution.mediadotech.com/.../BT000245886600100101900206_00120261001150118.uze <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/jpeg, 229866 bytes, 1125x1600; server Content-Type: binary/octet-stream) |  |  |  |
