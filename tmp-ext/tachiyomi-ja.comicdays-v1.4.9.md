# Extension Validation Report

- Extension: tachiyomi-ja.comicdays-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5332604811772266259
- Source name: Comic Days
- Source language: ja
- Selected manga input: latest offset 0: 約10年彼氏いなかったが結婚できるか本気だしてみた　32歳からのマチアプ冒険記 (`.../12207421983943198915`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 334 | ゆーあーすらっがー (`.../12207421983529861572`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 92 | 約10年彼氏いなかったが結婚できるか本気だしてみた　32歳からのマチアプ冒険記 (`.../12207421983943198915`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 約10年彼氏いなかったが結婚できるか本気だしてみた　32歳からのマチアプ冒険記 (`.../12207421983943198915`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 約10年彼氏いなかったが結婚できるか本気だしてみた　32歳からのマチアプ冒険記 (`.../12207421983943198915`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 7 | 第１話　ぐいぐいアプローチのシュンスケくん① (`.../12207421983943198915`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 15 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 334 entries |  |  |  |
| latest listing | PASS | 92 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=約10年彼氏いなかったが結婚できるか本気だしてみた　32歳からのマチアプ冒険記, URL=`.../12207421983943198915` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 6 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 427/427 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 427/427 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.comic-days.com%2Fpublic%2Fseries-sub-thumbnail-square-with-logo%2F12207421983893924877-6f7e006626ca2a1624604975eb4e24e0%3F1783299643` (image/jpeg, 30585 bytes, 280x280) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12207421983943198915` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.comic-days.com%2Fpublic%2Fseries-thumbnail%2F12207421983893924877-8a9fb1bb0cc60d25152aaaaba41caa30%3F1786519297` (image/jpeg, 43094 bytes, 484x272) |  |  |  |
| details author | PASS | 磋藤にゅすけ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 約10年恋から遠ざかっていた漫画家。恋愛漫画を読み漁ることで恋愛を学んでいたつもりの「無自覚低恋愛経験値」な32歳は、果たしてマチアプで結婚できるのか！？絶対に結婚したい女の挑戦が始まる！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | PASS | 7 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn-img.comic-days.com/.../12207421983966160591-9d3ccbafc99dbf011f6f5b83a8cb2959` (image/jpeg, 288289 bytes, 1125x1600) |  |  |  |
