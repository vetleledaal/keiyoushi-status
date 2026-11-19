# Extension Validation Report

- Extension: tachiyomi-zh.jcomic-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 2
- Warnings: 0
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
- Selected manga input: popular offset 0: 二次元コミックマガジン TS異種姦孕ませ 女体化した俺たちが異種の子を宿すまで Vol.1  (`.../%E4%BA%8C%E6%AC%A1%E5%85%83%E3%82%B3%E3%83%9F%E3%83%83%E3%82%AF%E3%83%9E%E3%82%AC%E3%82%B8%E3%83%B3%20TS%E7%95%B0%E7%A8%AE%E5%A7%A6%E5%AD%95%E3%81%BE%E3%81%9B%20%E5%A5%B3%E4%BD%93%E5%8C%96%E3%81%97%E3%81%9F%E4%BF%BA%E3%81%9F%E3%81%A1%E3%81%8C%E7%95%B0%E7%A8%AE%E3%81%AE%E5%AD%90%E3%82%92%E5%AE%BF%E3%81%99%E3%81%BE%E3%81%A7%20Vol.1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 二次元コミックマガジン TS異種姦孕ませ 女体化した俺たちが異種の子を宿すまで Vol.1  (`.../%E4%BA%8C%E6%AC%A1%E5%85%83%E3%82%B3%E3%83%9F%E3%83%83%E3%82%AF%E3%83%9E%E3%82%AC%E3%82%B8%E3%83%B3%20TS%E7%95%B0%E7%A8%AE%E5%A7%A6%E5%AD%95%E3%81%BE%E3%81%9B%20%E5%A5%B3%E4%BD%93%E5%8C%96%E3%81%97%E3%81%9F%E4%BF%BA%E3%81%9F%E3%81%A1%E3%81%8C%E7%95%B0%E7%A8%AE%E3%81%AE%E5%AD%90%E3%82%92%E5%AE%BF%E3%81%99%E3%81%BE%E3%81%A7%20Vol.1`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | (C97)MOUSOU THEATER 63 (Fate/Grand Order)  (`.../(C97)MOUSOU%20THEATER%2063%20(Fate%7CAGrand%20Order)`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | My Dress Up Darling Double NTR（AI）  (`.../My%20Dress%20Up%20Darling%20Double%20NTR%EF%BC%88AI%EF%BC%89`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | 徹夜明け、睡眠中、布団の中でケイちゃんが… | 彻夜通宵、于睡梦中、被钻进被窝的凯伊酱偷摸…  (`.../%E5%BE%B9%E5%A4%9C%E6%98%8E%E3%81%91%E3%80%81%E7%9D%A1%E7%9C%A0%E4%B8%AD%E3%80%81%E5%B8%83%E5%9B%A3%E3%81%AE%E4%B8%AD%E3%81%A7%E3%82%B1%E3%82%A4%E3%81%A1%E3%82%83%E3%82%93%E3%81%8C%7CD%20%7C%20%E5%BD%BB%E5%A4%9C%E9%80%9A%E5%AE%B5%E3%80%81%E4%BA%8E%E7%9D%A1%E6%A2%A6%E4%B8%AD%E3%80%81%E8%A2%AB%E9%92%BB%E8%BF%9B%E8%A2%AB%E7%AA%9D%E7%9A%84%E5%87%AF%E4%BC%8A%E9%85%B1%E5%81%B7%E6%91%B8%7CD`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 二次元コミックマガジン TS異種姦孕ませ 女体化した俺たちが異種の子を宿すまで Vol.1  (`.../%E4%BA%8C%E6%AC%A1%E5%85%83%E3%82%B3%E3%83%9F%E3%83%83%E3%82%AF%E3%83%9E%E3%82%AC%E3%82%B8%E3%83%B3%20TS%E7%95%B0%E7%A8%AE%E5%A7%A6%E5%AD%95%E3%81%BE%E3%81%9B%20%E5%A5%B3%E4%BD%93%E5%8C%96%E3%81%97%E3%81%9F%E4%BF%BA%E3%81%9F%E3%81%A1%E3%81%8C%E7%95%B0%E7%A8%AE%E3%81%AE%E5%AD%90%E3%82%92%E5%AE%BF%E3%81%99%E3%81%BE%E3%81%A7%20Vol.1`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 单章节 (`.../%E4%BA%8C%E6%AC%A1%E5%85%83%E3%82%B3%E3%83%9F%E3%83%83%E3%82%AF%E3%83%9E%E3%82%AC%E3%82%B8%E3%83%B3%20TS%E7%95%B0%E7%A8%AE%E5%A7%A6%E5%AD%95%E3%81%BE%E3%81%9B%20%E5%A5%B3%E4%BD%93%E5%8C%96%E3%81%97%E3%81%9F%E4%BF%BA%E3%81%9F%E3%81%A1%E3%81%8C%E7%95%B0%E7%A8%AE%E3%81%AE%E5%AD%90%E3%82%92%E5%AE%BF%E3%81%99%E3%81%BE%E3%81%A7%20Vol.1`) |  | <1s |
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
| manga title and URL | PASS | 120/120 listing manga have titles and URLs; popular: 24/30 relative; popular_next: 25/30 relative; latest: 27/30 relative; latest_next: 13/30 relative; 31 pipe-containing URLs skipped from classification |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.jcomic.net/.../001.jpg <redacted query values: X-Amz-Content-Sha256, X-Amz-Algorithm, X-Amz-Credential, X-Amz-Date, X-Amz-SignedHeaders, X-Amz-Expires, and X-Amz-Signature>` (image/jpeg, 170536 bytes, 705x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%E4%BA%8C%E6%AC%A1%E5%85%83%E3%82%B3%E3%83%9F%E3%83%83%E3%82%AF%E3%83%9E%E3%82%AC%E3%82%B8%E3%83%B3 TS異種姦孕ませ 女体化した俺たちが異種の子を宿すまで Vol.1` |  |  |  |
| details thumbnail URL | PASS | `https://images.jcomic.net/.../001.jpg <redacted query values: X-Amz-Content-Sha256, X-Amz-Algorithm, X-Amz-Credential, X-Amz-Date, X-Amz-SignedHeaders, X-Amz-Expires, and X-Amz-Signature>` |  |  |  |
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
