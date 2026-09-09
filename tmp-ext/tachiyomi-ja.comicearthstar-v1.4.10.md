# Extension Validation Report

- Extension: tachiyomi-ja.comicearthstar-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 28
- Lint: 1
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gigaviewer
- Source ID: 3574188328700228273
- Source name: Comic Earth Star
- Source language: ja
- Selected manga input: popular offset 0: 転生令嬢は米作りがしたい ～身代わり婚から始まる、旦那様とのおいしい辺境暮らし～ (`.../12207421984178800390`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 25 | 転生令嬢は米作りがしたい ～身代わり婚から始まる、旦那様とのおいしい辺境暮らし～ (`.../12207421984178800390`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 転生令嬢は米作りがしたい ～身代わり婚から始まる、旦那様とのおいしい辺境暮らし～ (`.../12207421984178800390`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 転生令嬢は米作りがしたい ～身代わり婚から始まる、旦那様とのおいしい辺境暮らし～ (`.../12207421984178800390`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | 第1話 (`.../12207421984178800390`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 43 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=転生令嬢は米作りがしたい ～身代わり婚から始まる、旦那様とのおいしい辺境暮らし～, URL=`.../12207421984178800390` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 26/26 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 26/26 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.comic-earthstar.com/.../12207421984178799646-4e976267c2665d06b48e9754c21a7bcd <redacted query values: 1788248047>` (image/jpeg, 26112 bytes, 311x176) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12207421984178800390` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.comic-earthstar.com%2Fpublic%2Fseries-thumbnail%2F12207421984178799646-4e976267c2665d06b48e9754c21a7bcd%3F1788248047` (image/jpeg, 25942 bytes, 311x176) |  |  |  |
| details author | PASS | 漫画：しまち.../%E3%82%AD%E3%83%A3%E3%83%A9%E3%82%AF%E3%82%BF%E3%83%BC%E5%8E%9F%E6%A1%88%EF%BC%9A%E5%86%85%E6%B2%B3 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 前世で米農家の娘だった、男爵令嬢エルシー・スカーレット。「故郷・青森のような、見渡す限りの稲穂畑を作る！」という野望を抱く彼女だったが、王都周辺は米作りには適さない土地だった。そんな中、従妹の身代わりとして、“醜悪辺境伯”と噂されるブルーフォレスト辺境伯のもとへ嫁ぐことが決まった。なんと嫁ぎ先は、念願の米作りにぴったりの土地で……？おいしいご飯で旦那様を健康に、お米も愛もたっぷり実る、異世界農業ラブストーリー開幕！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 43 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.comic-earthstar.com/.../12207421984178842303-e44f23197b3ef7ad13bf89818a7a3c26` (image/jpeg, 559821 bytes, 1351x1920) |  |  |  |
