# Extension Validation Report

- Extension: tachiyomi-zh.kuaikanmanhua-v1.4.13
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 26
- Lint: 0
- Warnings: 1
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8099870292642776005
- Source name: 快看漫画
- Source language: zh-Hans
- Selected manga input: popular offset 0: 怦然心动 (`.../766`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 42 | 怦然心动 (`.../766`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 42 | 快把我哥带走 (`.../116`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 48 | specify  命运 (`.../28303`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 48 | 极致推拉 (`.../28246`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | 怦然心动 (`.../766`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 怦然心动 (`.../766`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 0 |  |  | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 42 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=怦然心动, URL=`.../766` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 182/182 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 182/182 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tn1-f2.kkmh.com/.../brBOLprTO.webp-w320.w.jpg` (image/jpeg, 25803 bytes, 320x424) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../766` |  |  |  |
| details thumbnail URL | PASS | `https://tn1-f2.kkmh.com/.../brBOLprTO.webp-w320.w.jpg` |  |  |  |
| details author | PASS | ※kid岁 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 少男少女同住一个屋檐下，一同历经青春的懵懂和烦恼。画风温馨的超人气少女漫，感受青春悸动的萌芽，这一部就够！【独家.../%E5%8F%8C%E5%91%A8%E4%BA%8C%E6%9B%B4%E6%96%B0 责编：林早上】 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | details: `https://www.kuaikanmanhua.com/.../766` to `https://www.kuaikanmanhua.com/.../766` (1 redirects); chapters: `https://www.kuaikanmanhua.com/.../766` to `https://www.kuaikanmanhua.com/.../766` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
