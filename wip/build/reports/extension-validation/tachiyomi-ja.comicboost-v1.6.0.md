# Extension Validation Report

- Extension: tachiyomi-ja.comicboost-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Selected manga input: popular offset 0: なりそこないの竜殺し (`.../01800001`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | なりそこないの竜殺し (`.../01800001`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | ぼっち自衛官の異世界奮戦記 (`.../00970001`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | なりそこないの竜殺し (`.../01800001`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | なりそこないの竜殺し (`.../01800001`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 読み切り (`.../01800001`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=なりそこないの竜殺し, URL=`.../01800001` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.comic-boost.com/.../S0180_kv_th.jpg` (image/jpeg, 248754 bytes, 360x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../01800001` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.comic-boost.com/.../S0180_kv_sp.jpg` (image/jpeg, 522935 bytes, 720x506) |  |  |  |
| details author | PASS | ガマゾウ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | アクション・バトル, SF, 読み切り |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | ナニモノでもない、人外たちがうごめく街。 竜神が治めるこの街に生きる者たちの唯一の希望は、100年に一度の転生祭だった。 「古の竜の遺物」を探し出し、供物として竜神に捧げることのできた者は、絶対上位である竜へと転生することができるのだ。 今日もまた、わずかな希望にかけた者たちが竜の城へと列をなす――。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Log in via WebView and purchase this chapter to read. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://comic-boost.com/.../01800001` to `https://comic-boost.com/.../viewer.html <redacted query values: cid and com-access-no-history>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
