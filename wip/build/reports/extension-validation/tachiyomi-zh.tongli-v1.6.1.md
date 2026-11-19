# Extension Validation Report

- Extension: tachiyomi-zh.tongli-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 2
- Warnings: 1
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5530823947742715441
- Source name: 東立
- Source language: zh
- Selected manga input: popular offset 0: 膽大黨 (`.../b43a73a3-5dfa-eb11-8110-00155d020a17,true`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | 膽大黨 (`.../b43a73a3-5dfa-eb11-8110-00155d020a17,true`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | 龍狼傳 王霸立國篇 (`.../d837132c-6a96-e811-a947-00155d020a17,true`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | 紫陽花牢籠 (`.../3a053793-e8c5-f011-80d3-40f2e9cd029d,false`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | 膽大黨 (`.../b43a73a3-5dfa-eb11-8110-00155d020a17,false`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 膽大黨 (`.../b43a73a3-5dfa-eb11-8110-00155d020a17,true`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | 第1話 (`.../ff00c709-3a11-4cf6-da05-08d95e2e1db1`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 400 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 400 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=膽大黨, URL=`b43a73a3-5dfa-eb11-8110-00155d020a17,true` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 63/63 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 63/63 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.tongli.com.tw/.../88bee5a7e4d14111339908df4159eefb.jpg` (image/jpeg, 55889 bytes, 400x567) |  |  |  |
| details identity | PASS | Details preserved selected URL `b43a73a3-5dfa-eb11-8110-00155d020a17,true` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://tongliebookpic.blob.core.windows.net/.../88bee5a7e4d14111339908df4159eefb.jpg` (image/jpeg, 470353 bytes, 1128x1600; server Content-Type: image/jpg) |  |  |  |
| details author | PASS | 龍 幸伸 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 高倉是個相信幽浮卻不相信幽靈的阿宅少年，綾瀨是個相信幽靈卻不相信幽浮的辣妹少女，原本沒有交集的兩人因故相識，而彼此打賭要證明幽浮／幽靈的存在，於是——驚奇百怪的遭遇就此展開！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | LINT | All 4 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=4 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 400 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
