# Extension Validation Report

- Extension: tachiyomi-tr.milasub-v1.6.58
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 23
- Lint: 0
- Warnings: 1
- Skipped: 11
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 5672794736121634742
- Source name: MilaSub
- Source language: tr
- Selected manga input: popular offset 0: Sıradan Bir İsekai Romanı Sanmıştım (`.../1854`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Sıradan Bir İsekai Romanı Sanmıştım (`.../1854`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Aşk-ı Memnu (`.../29248`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Kötü Sadece Sakin Bir Hayat İstiyor (`.../2647`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Mavi Boncuk (`.../58431`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sıradan Bir İsekai Romanı Sanmıştım (`.../1854`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | java.lang.Exception: Bu bölümü görüntülemek için WebView'da giriş yapın | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 115 | 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Bu bölümü görüntülemek için WebView'da giriş yapın | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | java.lang.Exception: Bu bölümü görüntülemek için WebView'da giriş yapın | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Bu bölümü görüntülemek için WebView'da giriş yapın | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sıradan Bir İsekai Romanı Sanmıştım, URL=`1854` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://millascan.com/.../kapk.jpg` -> all 45 manga URLs (examples: `1854`, `4304`, `3810`) |  |  |  |
| thumbnail | PASS | `https://millascan.com/.../kapk.jpg` (image/jpeg, 1487707 bytes, 1785x2560) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 115 chapters |  |  |  |
| chapter dates | PASS | 115 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Bu bölümü görüntülemek için WebView'da giriş yapın |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
