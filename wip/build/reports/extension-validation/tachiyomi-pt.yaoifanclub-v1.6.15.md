# Extension Validation Report

- Extension: tachiyomi-pt.yaoifanclub-v1.6.15
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 1
- Lint: 0
- Warnings: 1
- Skipped: 33
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 3609380518472019202
- Source name: Yaoi Fan Club
- Source language: pt-BR

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 0 |  |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | error | 0 |  | kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 0: Expected start of the object '{', but had '<' instead at path: \$<br>JSON input: <!DOCTYPE html><br><html lang="pt..... | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | skipped | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | skipped | 0 |  |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | skipped | 0 |  |  | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | ERROR | kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 0: Expected start of the object '{', but had '<' instead at path: \$<br>JSON input: <!DOCTYPE html><br><html lang="pt..... | REVIEW | INSUFFICIENT_EVIDENCE |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | SKIP | No manga was returned by popular or latest |  |  |  |
| details operation | SKIP | No manga was returned by popular or latest |  |  |  |
| chapters operation | SKIP | No manga was returned by popular or latest |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest listing | SKIP | Unexpected JSON token at offset 0: Expected start of the object '{', but had '<' instead at path: \$<br>JSON input: <!DOCTYPE html><br><html lang="pt..... |  |  |  |
| search listing | SKIP | No manga was returned by popular or latest |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 has no manga to check |  |  |  |
| latest pagination | SKIP | Unexpected JSON token at offset 0: Expected start of the object '{', but had '<' instead at path: \$<br>JSON input: <!DOCTYPE html><br><html lang="pt..... |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | SKIP | No manga to check |  |  |  |
| thumbnail URLs | SKIP | No manga to check |  |  |  |
| duplicate thumbnail URLs | SKIP | No manga to check |  |  |  |
| thumbnail | SKIP | No manga to check |  |  |  |
| details identity | SKIP | No selected manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | SKIP | No details metadata to check |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://www.yaoifanclub.com` to `https://yaoifanclub.com` (1 redirects); popular: `https://www.yaoifanclub.com/.../Series <redacted query values: alt, orderby, max-results, and start-index>` to `https://yaoifanclub.com` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
