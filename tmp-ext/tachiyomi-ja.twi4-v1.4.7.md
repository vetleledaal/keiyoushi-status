# Extension Validation Report

- Extension: tachiyomi-ja.twi4-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 493846804748918744
- Source name: Twi4
- Source language: ja
- Selected manga input: popular offset 0: 悪役令嬢の四畳半 (`.../yojouhan`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 102 | 悪役令嬢の四畳半 (`.../yojouhan`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | 悪役令嬢の四畳半 (`.../yojouhan`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 悪役令嬢の四畳半 (`.../yojouhan`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 516 | 1 - プロローグ１ (`.../0001.html`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=悪役令嬢の四畳半, URL=`.../yojouhan` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 104/104 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 104/104 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://sai-zen-sen.jp/.../cover.png` (image/png, 290831 bytes, 640x340) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../yojouhan` |  |  |  |
| details thumbnail URL | PASS | `https://sai-zen-sen.jp/.../cover.png` |  |  |  |
| details author | PASS | 岡野く仔 |  |  |  |
| details artist | PASS | 岡野く仔 |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 婚約破棄された悪役令嬢が“やけくそ魔術”で四畳半の和室を召喚⁉︎現代の日本で癒される！異世界転移コメディ！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 516 chapters |  |  |  |
| chapter dates | LINT | All 516 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=516 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://sai-zen-sen.jp/.../0001.2aLf2o1169evU3885BnqrvBsaOrJfak1.jpg` (image/jpeg, 341168 bytes, 1920x2880) |  |  |  |
