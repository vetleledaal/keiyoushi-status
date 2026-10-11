# Extension Validation Report

- Extension: tachiyomi-ko.goodtoon-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 2738031143723682744
- Source name: GoodToon
- Source language: ko
- Selected manga input: popular offset 0: 무선 연결 오나홀 (`.../gt-17614`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 63 | 무선 연결 오나홀 (`.../gt-17614`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 31 | 뷰티풀데이즈 (`.../gt-20214`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 63 | 마황의 귀환 (`.../gt-16503`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 63 | 프롤로그에서 30년이 흘렀다 (`.../gt-60585`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 무선 연결 오나홀 (`.../gt-17614`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 무선 연결 오나홀 (`.../gt-17614`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 125 | 무선 연결 오나홀 1화 (`.../944898`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 83 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=무선 연결 오나홀, URL=`.../gt-17614` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 221/221 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 221/221 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.goodtoon9001.top/.../cover.jpg <redacted query values: v>` (image/jpeg, 170265 bytes, 437x613) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../gt-17614` |  |  |  |
| details thumbnail URL | PASS | `https://img.goodtoon9001.top/.../cover.jpg <redacted query values: v>` |  |  |  |
| details author | PASS | 쇠황조롱이,오뚜기,하루3딸, 쇠황조롱이,오뚜기,하루3딸 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 로맨스, 성인 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “오나홀이… 움직였어?!”우연히 주변 여자와 연동되는 오나홀을 사버린 공대생 박우진 일단 우리 학과 최고 여신 아영이부터 ? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 125 chapters |  |  |  |
| chapter dates | PASS | 125 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 83 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.goodtoon005.com/.../recommend` to `https://www.goodtoon007.com/.../recommend` (1 redirects); popular: `https://www.goodtoon005.com` to `https://www.goodtoon007.com <redacted query values: mcat>` (2 redirects); popular: `https://www.goodtoon005.com/.../recommend <redacted query values: pg>` to `https://www.goodtoon007.com/.../recommend <redacted query values: pg>` (1 redirects); popular: `https://www.goodtoon005.com/.../gt-17614` to `https://www.goodtoon007.com/.../gt-17614` (1 redirects); popular: `https://www.goodtoon005.com <redacted query values: q>` to `https://www.goodtoon007.com <redacted query values: q>` (1 redirects); popular: `https://www.goodtoon005.com/.../chapters` to `https://www.goodtoon007.com/.../chapters` (1 redirects); popular: `https://www.goodtoon005.com <redacted query values: pg>` to `https://www.goodtoon007.com <redacted query values: mcat and pg>` (2 redirects); popular: `https://www.goodtoon005.com/.../944898` to `https://www.goodtoon007.com/.../944898` (1 redirects) |  |  |  |
| page load | PASS | `https://www.goodtoon007.com/.../reader_top_1791708927.gif` (image/gif (format: 89a), 358026 bytes, 720x100) |  |  |  |
