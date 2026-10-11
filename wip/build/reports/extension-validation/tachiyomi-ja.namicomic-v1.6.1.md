# Extension Validation Report

- Extension: tachiyomi-ja.namicomic-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 1860491637286237325
- Source name: Nami Comic
- Source language: ja
- Selected manga input: popular offset 0: ちっちゃいキミが、でっかい私をおんぶして！ (`.../394f0b6367836`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | ちっちゃいキミが、でっかい私をおんぶして！ (`.../394f0b6367836`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | だってワタシ、120点だもの。 (`.../8d366d073a115`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 悪役令嬢として死刑宣告されたら大悪魔に愛でられました (`.../dfcda458dc541`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | ちっちゃいキミが、でっかい私をおんぶして！ (`.../394f0b6367836`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ちっちゃいキミが、でっかい私をおんぶして！ (`.../394f0b6367836`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 16 | 第1話　身長190センチの私って可愛くないですか？？ (`.../bc4aae2a53cc0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ちっちゃいキミが、でっかい私をおんぶして！, URL=`394f0b6367836` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../fa60cd460699e4bd-lg.webp` (image/webp (encoding: lossy), 98504 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `394f0b6367836` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../fa60cd460699e4bd.jpg` (image/jpeg, 244200 bytes, 1200x630) |  |  |  |
| details author | PASS | ゆるちん教祖 |  |  |  |
| details artist | PASS | ゆるちん教祖 |  |  |  |
| details genres | PASS | 少年, カラー, ギャグ・コメディ, ラブコメ, 恋愛, 学園, ラブストーリー, ヒューマンドラマ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 身長190cmの私と150cmのキミ！でもでも恋に身長差なんて関係な～いッッ！でっかい私をおんぶおんぶ～おんぶして～！――身長差40cmで凹凸コンビの私たち！鉄塔ギャルと狂犬チワワとはよく言われたもんよっ！黒板に手が届かないキミのために、私がぴゅーんっと高いたか～いッ！持ち上げてあげるの～！そんな関係性～<redacted URL #1: resource; relative; no scheme; workstation or local network; query parameters: ちっちゃくたっていいじゃんッ！うんうん、そうだよッ、だって私にとっては男子全員手乗りサイズ！でっかいワタシの想い、キミに届け～！> |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 16 chapters |  |  |  |
| chapter dates | PASS | 16 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.namicomic.jp/.../master-1785314893931-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 5, 13, 15, 2, 3, 11, 7, 0, 1, 12, 9, 14, 4, 10, 8\]` (image/jpeg, 460848 bytes, 1000x1412) |  |  |  |
