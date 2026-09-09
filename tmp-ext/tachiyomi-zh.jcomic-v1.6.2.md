# Extension Validation Report

- Extension: tachiyomi-zh.jcomic-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 32
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 3
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7044663852863780949
- Source name: JComic
- Source language: zh
- Selected manga input: popular offset 0: Little Red and the Big Bad Wolf（小红帽与大坏狼）  (`.../Little%20Red%20and%20the%20Big%20Bad%20Wolf%EF%BC%88%E5%B0%8F%E7%BA%A2%E5%B8%BD%E4%B8%8E%E5%A4%A7%E5%9D%8F%E7%8B%BC%EF%BC%89`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Little Red and the Big Bad Wolf（小红帽与大坏狼）  (`.../Little%20Red%20and%20the%20Big%20Bad%20Wolf%EF%BC%88%E5%B0%8F%E7%BA%A2%E5%B8%BD%E4%B8%8E%E5%A4%A7%E5%9D%8F%E7%8B%BC%EF%BC%89`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | 拷問報告 FILE人間サンドバッグ (メトロイド) [中国翻訳]  (`.../%E6%8B%B7%E5%95%8F%E5%A0%B1%E5%91%8A%20FILE%E4%BA%BA%E9%96%93%E3%82%B5%E3%83%B3%E3%83%89%E3%83%90%E3%83%83%E3%82%B0%20(%E3%83%A1%E3%83%88%E3%83%AD%E3%82%A4%E3%83%89)%20[%E4%B8%AD%E5%9B%BD%E7%BF%BB%E8%A8%B3]`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Ume Hanami（AI）  (`.../Ume%20Hanami%EF%BC%88AI%EF%BC%89`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | るるかさんは甘やかしたい (名探偵プリキュア!)  (`.../%E3%82%8B%E3%82%8B%E3%81%8B%E3%81%95%E3%82%93(43)%E3%81%AF%E7%94%98%E3%82%84%E3%81%8B%E3%81%97%E3%81%9F%E3%81%84%20(%E5%90%8D%E6%8E%A2%E5%81%B5%E3%83%97%E3%83%AA%E3%82%AD%E3%83%A5%E3%82%A2!)`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Little Red and the Big Bad Wolf（小红帽与大坏狼）  (`.../Little%20Red%20and%20the%20Big%20Bad%20Wolf%EF%BC%88%E5%B0%8F%E7%BA%A2%E5%B8%BD%E4%B8%8E%E5%A4%A7%E5%9D%8F%E7%8B%BC%EF%BC%89`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 单章节 (`.../Little%20Red%20and%20the%20Big%20Bad%20Wolf%EF%BC%88%E5%B0%8F%E7%BA%A2%E5%B8%BD%E4%B8%8E%E5%A4%A7%E5%9D%8F%E7%8B%BC%EF%BC%89`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and URLs; popular: 25/30 relative; popular_next: 25/30 relative; latest: 28/30 relative; latest_next: 24/30 relative; 18 pipe-containing URLs skipped from classification |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.jcomic.net/.../00000001.jpg <redacted query values: X-Amz-Content-Sha256, X-Amz-Algorithm, X-Amz-Credential, X-Amz-Date, X-Amz-SignedHeaders, X-Amz-Expires, and X-Amz-Signature>` (image/jpeg, 112078 bytes, 1000x821) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../Little Red and the Big Bad Wolf（小红帽与大坏狼）` |  |  |  |
| details thumbnail URL | PASS | `https://images.jcomic.net/.../00000001.jpg <redacted query values: X-Amz-Content-Sha256, X-Amz-Algorithm, X-Amz-Credential, X-Amz-Date, X-Amz-SignedHeaders, X-Amz-Expires, and X-Amz-Signature>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | LINT | Untrimmed fields: title |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | FAIL | 18 of 18 pages have invalid URLs: page 1: no nonblank URL (imageUrl=<empty>, url=<empty>), page 2: no nonblank URL (imageUrl=<empty>, url=<empty>), page 3: no nonblank URL (imageUrl=<empty>, url=<empty>), page 4: no nonblank URL (imageUrl=<empty>, url=<empty>), page 5: no nonblank URL (imageUrl=<empty>, url=<empty>), and 13 more | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL is invalid: no nonblank URL (imageUrl=<empty>, url=<empty>); image request: java.lang.IllegalArgumentException: Expected URL scheme 'http' or 'https' but no scheme was found for  | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
