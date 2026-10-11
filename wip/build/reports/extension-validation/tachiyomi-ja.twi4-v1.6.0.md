# Extension Validation Report

- Extension: tachiyomi-ja.twi4-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 28
- Lint: 1
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 493846804748918744
- Source name: Twi4
- Source language: ja
- Selected manga input: popular offset 0: 徒然チルドレン (`.../tsuredure`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 102 | 徒然チルドレン (`.../tsuredure`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 徒然チルドレン (`.../tsuredure`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 徒然チルドレン (`.../tsuredure`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1096 | 1 - 告白（タイトル） (`.../0001.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 102 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=徒然チルドレン, URL=`.../tsuredure` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 103/103 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 103/103 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://sai-zen-sen.jp/.../cover.png` (image/png, 236000 bytes, 640x340) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tsuredure` |  |  |  |
| details thumbnail URL | PASS | `https://sai-zen-sen.jp/.../cover.png` |  |  |  |
| details author | PASS | 若林稔弥 |  |  |  |
| details artist | PASS | 若林稔弥 |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 忘れられない青春がもう一度色づいたｰｰ若林稔弥の青春ラブコメ４コマの傑作『徒然チルドレン』が全ページ・フルカラー版で登場！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1096 chapters |  |  |  |
| chapter dates | LINT | All 1096 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1096 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://sai-zen-sen.jp/.../twi4` to `https://sai-zen-sen.jp/.../twi4` (1 redirects); popular: `https://sai-zen-sen.jp/.../twi4` to `https://sai-zen-sen.jp/.../twi4` (1 redirects); popular: `https://sai-zen-sen.jp/.../twi4` to `https://sai-zen-sen.jp/.../twi4` (1 redirects) |  |  |  |
| page load | PASS | `https://sai-zen-sen.jp/.../0001.3Ps1zVJl8qaWM23PD99hrsHn0PItnV4A.jpg` (image/jpeg, 29609 bytes, 1280x3680) |  |  |  |
