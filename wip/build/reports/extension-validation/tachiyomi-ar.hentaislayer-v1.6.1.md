# Extension Validation Report

- Extension: tachiyomi-ar.hentaislayer-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 17
- Lint: 0
- Warnings: 0
- Skipped: 18
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: fuzzydoodle
- Source ID: 1383489648660567366
- Source name: هنتاي سلاير
- Source language: ar
- Selected manga input: popular offset 0: Your Creepy Bucketlist (`.../your-creepy-bucketlist`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Your Creepy Bucketlist (`.../your-creepy-bucketlist`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Troublesome Employee Warning (`.../troublesome-employee-warning`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | أمي كوسبلاي جميلة (`.../%D8%A7%D9%85%D9%8A-%D9%83%D9%88%D8%B3%D8%A8%D9%84%D8%A7%D9%8A-%D8%AC%D9%85%D9%8A%D9%84%D8%A9`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | ارجوكِ دعيني استريح (`.../%D8%A7%D8%B1%D8%AC%D9%88%D9%83-%D8%AF%D8%B9%D9%8A%D9%86%D9%8A-%D8%A7%D8%B3%D8%AA%D8%B1%D9%8A%D8%AD`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Your Creepy Bucketlist (`.../your-creepy-bucketlist`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Your Creepy Bucketlist, URL=`.../your-creepy-bucketlist` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaislayer.net/.../6afe46af16c7f.webp` (image/webp (encoding: lossy), 26466 bytes, 300x450) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
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
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
