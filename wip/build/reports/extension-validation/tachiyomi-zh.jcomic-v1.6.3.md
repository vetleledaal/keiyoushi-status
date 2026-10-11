# Extension Validation Report

- Extension: tachiyomi-zh.jcomic-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 28
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7044663852863780949
- Source name: JComic
- Source language: zh
- Selected manga input: popular offset 0: 島風しました!  (`.../%E5%B3%B6%E9%A2%A8%E3%81%97%E3%81%BE%E3%81%97%E3%81%9F!`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 島風しました!  (`.../%E5%B3%B6%E9%A2%A8%E3%81%97%E3%81%BE%E3%81%97%E3%81%9F!`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | アゲアゲでいきましょ〜!!  (`.../%E3%82%A2%E3%82%B2%E3%82%A2%E3%82%B2%E3%81%A7%E3%81%84%E3%81%8D%E3%81%BE%E3%81%97%E3%82%87%E3%80%9C!!`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | [Patreon] Love4UAndAI（AI）  (`.../[Patreon]%20Love4UAndAI%EF%BC%88AI%EF%BC%89`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | HACKING GHOST~除了身体之外毫无价值的学校~.../%E9%AA%87%E7%81%B5%EF%BC%9A%E9%AB%98%E6%BD%AE%E5%A4%BA%E8%88%8D  (`.../HACKING%20GHOST~%E9%99%A4%E4%BA%86%E8%BA%AB%E4%BD%93%E4%B9%8B%E5%A4%96%E6%AF%AB%E6%97%A0%E4%BB%B7%E5%80%BC%E7%9A%84%E5%AD%A6%E6%A0%A1~%7CA%E9%AA%87%E7%81%B5%EF%BC%9A%E9%AB%98%E6%BD%AE%E5%A4%BA%E8%88%8D`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 島風しました!  (`.../%E5%B3%B6%E9%A2%A8%E3%81%97%E3%81%BE%E3%81%97%E3%81%9F!`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 单章节 (`.../%E5%B3%B6%E9%A2%A8%E3%81%97%E3%81%BE%E3%81%97%E3%81%9F!`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IllegalArgumentException: bad base-64 | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IllegalArgumentException: bad base-64 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and URLs; popular: 23/30 relative; popular_next: 29/30 relative; latest: 27/30 relative; latest_next: 23/30 relative; 18 pipe-containing URLs skipped from classification |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.jcomic.net/.../0000.jpg <redacted query values: X-Amz-Content-Sha256, X-Amz-Algorithm, X-Amz-Credential, X-Amz-Date, X-Amz-SignedHeaders, X-Amz-Expires, and X-Amz-Signature>` (image/jpeg, 162736 bytes, 704x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%E5%B3%B6%E9%A2%A8%E3%81%97%E3%81%BE%E3%81%97%E3%81%9F!` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://images.jcomic.net/.../0000.jpg <redacted query values: X-Amz-Content-Sha256, X-Amz-Algorithm, X-Amz-Credential, X-Amz-Date, X-Amz-SignedHeaders, X-Amz-Expires, and X-Amz-Signature>` (image/jpeg, 162736 bytes, 704x1000) |  |  |  |
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
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | bad base-64 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
