# Extension Validation Report

- Extension: tachiyomi-ja.hakusensha-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3812676510487645204
- Source name: Hakusensha e-net
- Source language: ja
- Selected manga input: popular offset 0: 婚約者は溺愛のふり (`.../kondeki`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 17 | 婚約者は溺愛のふり (`.../kondeki`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 304 | 藍子さんは甘えたい［ばら売り］［DRUNK!］ (`.../p-aikosan`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | 婚約者は溺愛のふり (`.../kondeki`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 婚約者は溺愛のふり (`.../kondeki`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 8 | 1巻 (`.../59222121kondeki00111`) |  | <1s |
| pages | `getPageList(chapter)` | success | 170 |  |  | 1-10s |

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
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | PASS | 304 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=婚約者は溺愛のふり, URL=`kondeki` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 324/324 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 324/324 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://assets.hakusensha-e.net/.../v-kondeki_008_1_1.jpg` (image/jpeg, 2616485 bytes, 1629x2560) |  |  |  |
| details identity | PASS | Details preserved selected URL `kondeki` |  |  |  |
| details thumbnail URL | PASS | `https://assets.hakusensha-e.net/.../v-kondeki_008_1_1.jpg` |  |  |  |
| details author | PASS | 仲野えみこ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ラブ, コメディ, ファンタジー, 結婚 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 恋愛初心者バリキャリ女子×オールパーフェクト男子の偽装婚約!?ジャハリー家のラチエルは困窮する家のため、見た目・家柄・財力◎のアウレシア家次男：ファハドとの政略結婚を企てる。ダメ元で求婚したところ、何とまさかの OK!?皆の前では いちゃいちゃアピールをしようとするけれど、恋愛が苦手なラチエルはファハドに振り回されっぱなしで…？「帝の至宝」の仲野えみこが描く、嘘からはじまる恋物語 開幕!!（このコミックスには「婚約者は溺愛のふり［1話売り］　story01～04」を収録しております） |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 170 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://bsreader.hakusensha-e.net/.../diazepam_hybrid <redacted query values: mode, reqtype, vm, file, and param>` (image/jpeg, 352048 bytes, 764x1200) |  |  |  |
