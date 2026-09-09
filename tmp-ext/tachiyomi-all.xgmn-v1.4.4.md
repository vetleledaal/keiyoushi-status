# Extension Validation Report

- Extension: tachiyomi-all.xgmn-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 29
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 2
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2870097240566002663
- Source name: 性感美女
- Source language: all
- Selected manga input: latest offset 0: [XiuRen秀人网]FW0606 (`.../Xiuren35415.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 100 | [XiuRen秀人网]FW0606 (`.../Xiuren35415.html`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 100 | [XiuRen秀人网]FW0606 (`.../Xiuren35415.html`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | [XiuRen秀人网]FW0606 (`.../Xiuren35415.html`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | [XiuRen秀人网]FW0606 秀人番外 李若汐 – 《豹纹》 主题写真 [82P] (`.../Xiuren35415.html`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 82 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | SKIP | HTTP error 500 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 200/200 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 200/200 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://xgmn8.vip/.../35415.jpg` (image/webp (encoding: lossy), 82280 bytes, 600x900; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../Xiuren35415.html` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | 李若汐 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 82 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `http://xgmn8.vip/.../top.html` to `http://192.876512.xyz/.../top.html` (1 redirects); latest: `http://xgmn8.vip/.../new.html` to `http://192.876512.xyz/.../new.html` (1 redirects); latest: `http://xgmn8.vip/.../35415.jpg` to `https://m4.ik5.cc/.../35415.jpg` (2 redirects); search: `http://xgmn8.vip/.../index.asp <redacted query values: keyword and p>` to `http://192.876512.xyz/.../index.asp <redacted query values: keyword and p>` (1 redirects); details: `http://xgmn8.vip/.../Xiuren35415.html` to `http://192.876512.xyz/.../Xiuren35415.html` (1 redirects); chapters: `http://xgmn8.vip/.../Xiuren35415.html` to `http://192.876512.xyz/.../Xiuren35415.html` (1 redirects); pages: `http://xgmn8.vip/.../Xiuren35415.html` to `http://192.876512.xyz/.../Xiuren35415.html` (1 redirects); pages: `http://xgmn8.vip/.../Xiuren35415.html` to `http://192.876512.xyz/.../Xiuren35415.html` (1 redirects); pages: `http://xgmn8.vip/.../889427694.jpg` to `https://m4.ik5.cc/.../889427694.jpg` (2 redirects) |  |  |  |
| page load | FAIL | First page URL `http://xgmn8.vip/.../889427694.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
