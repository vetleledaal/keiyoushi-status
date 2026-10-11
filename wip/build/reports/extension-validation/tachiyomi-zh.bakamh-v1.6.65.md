# Extension Validation Report

- Extension: tachiyomi-zh.bakamh-v1.6.65
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 3712194609356981776
- Source name: 巴卡漫画
- Source language: zh
- Selected manga input: latest offset 0: Who Cares if it’s a Lie? (`.../14209`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | 社团学姐 (`.../2975`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | 黑道千金 (`.../9591`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Who Cares if it’s a Lie? (`.../14209`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | 误入极私领域 (`.../14448`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Who Cares if it’s a Lie? (`.../14209`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Who Cares if it’s a Lie? (`.../14209`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 27 | Episode 1 (`.../c-1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Who Cares if it’s a Lie?, URL=`14209` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bakamh.com/.../2492844626a239b93478645.jpg` (image/jpeg, 39296 bytes, 270x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `14209` |  |  |  |
| details thumbnail URL | PASS | `https://bakamh.com/.../2492844626a239b93478645.jpg` |  |  |  |
| details author | PASS | SUWHA, Twain |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 英文漫画, Comedy, Drama, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | They live comfortably on small lies, because, really… who cares if it’s a lie? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 27 chapters |  |  |  |
| chapter dates | LINT | 1 of 27 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 403 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
