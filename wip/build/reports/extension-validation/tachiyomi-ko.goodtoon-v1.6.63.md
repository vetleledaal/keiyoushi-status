# Extension Validation Report

- Extension: tachiyomi-ko.goodtoon-v1.6.63
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 2738031143723682744
- Source name: GoodToon
- Source language: ko
- Selected manga input: popular offset 0: 재혼 황후 (`.../gt-15370`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 63 | 재혼 황후 (`.../gt-15370`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 63 | 0골드로 시작하는 악녀 생활 (`.../gt-62824`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 63 | 선무제존 (`.../gt-13985`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 63 | 선무제존 (`.../gt-13985`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 재혼 황후 (`.../gt-15370`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 재혼 황후 (`.../gt-15370`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 252 | 0001 - 1화 (`.../309704`) |  | <1s |
| pages | `getPageList(chapter)` | success | 44 |  |  | 1-10s |

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
| popular listing | PASS | 63 entries |  |  |  |
| latest listing | PASS | 63 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=재혼 황후, URL=`.../gt-15370` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 253/253 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 253/253 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.goodtoon9001.top/.../cover.jpg <redacted query values: v>` (image/jpeg, 313275 bytes, 454x618) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../gt-15370` |  |  |  |
| details thumbnail URL | PASS | `https://img.goodtoon9001.top/.../cover.jpg <redacted query values: v>` |  |  |  |
| details author | PASS | 알파타르트,숨풀, 알파타르트,숨풀 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 드라마, 로맨스, 판타지 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 동대제국의 완벽한 황후였던 나비에 황제인 남편이 정부를 황후로 만들려는 것을 알고 이혼을 택한다 그리고 결심한다 이곳에서 황후가 될 수 없다면 다른 곳에서 황후가 되겠다고 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 252 chapters |  |  |  |
| chapter dates | PASS | 252 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 44 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.goodtoon010.com/.../recommend` to `https://www.goodtoon012.com/.../recommend` (1 redirects); popular: `https://www.goodtoon010.com` to `https://www.goodtoon012.com <redacted query values: pg and mcat>` (2 redirects); popular: `https://www.goodtoon010.com/.../recommend <redacted query values: pg>` to `https://www.goodtoon012.com/.../recommend <redacted query values: pg>` (1 redirects); popular: `https://www.goodtoon010.com/.../gt-15370` to `https://www.goodtoon012.com/.../gt-15370` (1 redirects); popular: `https://www.goodtoon010.com <redacted query values: q>` to `https://www.goodtoon012.com <redacted query values: q>` (1 redirects); popular: `https://www.goodtoon010.com/.../chapters` to `https://www.goodtoon012.com/.../chapters` (1 redirects); popular: `https://www.goodtoon010.com <redacted query values: pg>` to `https://www.goodtoon012.com <redacted query values: pg and mcat>` (2 redirects); popular: `https://www.goodtoon010.com/.../309704` to `https://www.goodtoon012.com/.../309704` (1 redirects) |  |  |  |
| page load | PASS | `https://www.goodtoon012.com/.../reader_top_1793081747.gif` (image/gif (format: 89a), 1238119 bytes, 720x100) |  |  |  |
