# Extension Validation Report

- Extension: tachiyomi-ja.booklive-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7845281380500415137
- Source name: BookLive
- Source language: ja
- Selected manga input: popular offset 0: 悪女は美しき獣の愛に咲く（単話版） (`.../20120216`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | 悪女は美しき獣の愛に咲く（単話版） (`.../20120216`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 100 | ブチ切れ令嬢は報復を誓いました。 (`.../1293529`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 100 | 昭和の不思議101 (`.../2230831`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 100 | お嬢様、僕はその罪を忘れていません【タテヨミ】 (`.../2371244`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 悪女は美しき獣の愛に咲く（単話版） (`.../20120216`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 悪女は美しき獣の愛に咲く（単話版） (`.../20120216`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 16 | 第1話 (`.../001`) |  | <1s |
| pages | `getPageList(chapter)` | success | 37 |  |  | 1-10s |

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
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=悪女は美しき獣の愛に咲く（単話版）, URL=`20120216` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 401/401 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 401/401 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://res.booklive.jp/.../X.jpg` (image/jpeg, 1054197 bytes, 1500x2133) |  |  |  |
| details identity | PASS | Details preserved selected URL `20120216` |  |  |  |
| details thumbnail URL | PASS | `https://res.booklive.jp/.../X.jpg` |  |  |  |
| details author | PASS | 斎賀菜月, 烏丸紫明 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少女マンガ, 広告で人気の本, ヒューマンドラマ, ラブコメ, ラブストーリー, 先行配信, 令嬢・聖女 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ケダモノ辺境伯×悪女と呼ばれる令嬢の極上ラブロマンス！ ありもしない悪評を流され、悪女の烙印を押された侯爵令嬢のカリナは、義母のたくらみでケダモノ伯などと呼ばれる人嫌いで有名なノクトのもとに嫁がされる。悪女と名高いカリナは歓迎されず、使用人の誰もが冷たく接するが、ノクトだけはカリナを尊重し、優しく接してきて……！ 薄幸の令嬢がとろけるほど熱く甘く愛されて、華麗に花開いてゆく――。 (C)斎賀菜月 (C)烏丸紫明／フレックスコミックス |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 16 chapters |  |  |  |
| chapter dates | LINT | All 16 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=16 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://booklive.jp/.../keyword <redacted query values: sort and page_no>` to `https://booklive.jp/.../keyword <redacted query values: sort>` (1 redirects); popular: `https://booklive.jp/.../keyword <redacted query values: sort and page_no>` to `https://booklive.jp/.../keyword <redacted query values: sort>` (1 redirects); popular: `https://booklive.jp/.../20120216` to `https://booklive.jp/.../001` (1 redirects); popular: `https://booklive.jp/.../keyword <redacted query values: keyword, sort, and page_no>` to `https://booklive.jp/.../keyword <redacted query values: keyword and sort>` (1 redirects) |  |  |  |
| page load | PASS | `https://binb.booklive.jp/.../sbcGetImg.php <redacted query values: cid, src, p, q, vm, and dmytime>` (image/jpeg, 727752 bytes, 1350x1920) |  |  |  |
