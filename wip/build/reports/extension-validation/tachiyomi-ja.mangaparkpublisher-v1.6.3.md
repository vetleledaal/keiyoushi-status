# Extension Validation Report

- Extension: tachiyomi-ja.mangaparkpublisher-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2905661176145448719
- Source name: Manga-Park
- Source language: ja
- Selected manga input: popular offset 0: 社交界の毒婦とよばれる私～素敵な辺境伯令息に腕を折られたので、責任とってもらいます～ (`.../82650`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 社交界の毒婦とよばれる私～素敵な辺境伯令息に腕を折られたので、責任とってもらいます～ (`.../82650`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 80 | 担当アイドルとHしてはイケません!! ～ブラック企業から転職したらアイドル業界もブラックでした～ (`.../111305`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 社交界の毒婦とよばれる私～素敵な辺境伯令息に腕を折られたので、責任とってもらいます～ (`.../82650`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 社交界の毒婦とよばれる私～素敵な辺境伯令息に腕を折られたので、責任とってもらいます～ (`.../82650`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 74 | 🆓 第1話 (`.../676452`) |  | <1s |
| pages | `getPageList(chapter)` | success | 30 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 80 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=社交界の毒婦とよばれる私～素敵な辺境伯令息に腕を折られたので、責任とってもらいます～, URL=`.../82650` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 111/111 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 111/111 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga-park.com/.../2\$noyQ6gw.jpg <redacted query values: fEl_BEfHO3RF4n6v8fcvNrtmnvSalCQ6rZ4Ncjqn2eg>` (image/jpeg, 65216 bytes, 540x540) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../82650` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manga-park.com/.../1\$qoyQ6gw.jpg <redacted query values: yZTh04n72XVXpar2L6Ke89SYiSkpLo8aJBL0sRgbeTw>` (image/jpeg, 77052 bytes, 750x450) |  |  |  |
| details author | PASS | 原作：来須みかん（ツギクル）　漫画：霜月かいり |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 女子向け, Parkオリジナル, 異世界・転生 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 私は昔から空気を読むのがうまかった。だから、悲劇のヒロインになりたい異母妹マリンの望み通り、悪役を演じている。そうしないと、マリンを溺愛している父に食事を抜かれてしまうから。今日の夜会でのマリンのお目当てはバルゴア辺境伯の令息リオだ。――はいはい、私がマリンのお望みどおり頭からワインをぶっかけてあげるから、あなたたちはさっさとくっついてイチャイチャしなさいよ……と思っていたら、バルゴア令息に捕まれた私の手首がゴギッと鈍い音を出して―？劇的な出逢いによって運命の歯車が一つに繋がりはじめる―。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 74 chapters |  |  |  |
| chapter dates | PASS | 74 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://manga-park.com/.../2h\$hI_n5ww.jpg.enc <redacted query values: 5rf7rw3gsvPDnZvI6TEBgJDX1dylJ8iEDw8R-dAfZaxgp_opQGGALgxCvNH5K9cAkwJdIltI>` (image/jpeg, 258381 bytes, 960x1378; server Content-Type: application/octet-stream) |  |  |  |
