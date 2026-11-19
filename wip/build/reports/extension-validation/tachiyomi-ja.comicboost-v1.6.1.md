# Extension Validation Report

- Extension: tachiyomi-ja.comicboost-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 24
- Lint: 1
- Warnings: 2
- Skipped: 9
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1188951475836296058
- Source name: Comic Boost
- Source language: ja
- Selected manga input: popular offset 0: 伯爵令嬢は、契約結婚した俺にいつ恋をする？ (`.../01690001`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 伯爵令嬢は、契約結婚した俺にいつ恋をする？ (`.../01690001`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | 魔法少女×金太郎 (`.../01810001`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 伯爵令嬢は、契約結婚した俺にいつ恋をする？ (`.../01690001`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 伯爵令嬢は、契約結婚した俺にいつ恋をする？ (`.../01690001`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | 第1話 (`.../01690001`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Log in via WebView and purchase this chapter to read. | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Log in via WebView and purchase this chapter to read. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=伯爵令嬢は、契約結婚した俺にいつ恋をする？, URL=`.../01690001` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.comic-boost.com/.../S0169_kv_th.jpg` (image/jpeg, 94459 bytes, 360x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../01690001` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.comic-boost.com/.../S0169_kv_sp.jpg` (image/jpeg, 356143 bytes, 720x506) |  |  |  |
| details author | PASS | カタイチ, 高透レイコ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 小説家になろう, コミカライズ, 恋愛, ミステリー |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 王家の血を引く麗人の王国騎士妻×貧乏男爵の地味七男坊夫の、 契約結婚から始まる、ラブ？サスペンスストーリー、開幕！ その結婚は、秘密と策略渦巻く、 十三年前の【犯人捜し】の始まり──。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Log in via WebView and purchase this chapter to read. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://comic-boost.com/.../01690001` to `https://comic-boost.com/.../viewer.html <redacted query values: cid and com-access-no-history>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
