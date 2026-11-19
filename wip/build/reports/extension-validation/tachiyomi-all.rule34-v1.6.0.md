# Extension Validation Report

- Extension: tachiyomi-all.rule34-v1.6.0
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
- Source ID: 6421345590175893162
- Source name: Rule34
- Source language: all
- Selected manga input: popular offset 0: Post 12071379 (`.../12071379`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 42 | Post 12071379 (`.../12071379`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 42 | Post 240457 (`.../240457`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 42 | Post 19407429 (`.../19407429`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 42 | Post 18049942 (`.../18049942`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Post 12071379 (`.../12071379`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Post (`.../12071379`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | 1-10s |

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
| popular listing | PASS | 42 entries |  |  |  |
| latest listing | PASS | 42 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 168/168 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 168/168 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wimg.rule34.xxx/.../thumbnail_828277bd0bd5d13e66f7d54f21205e48.jpg <redacted query values: 12071379>` (image/jpeg, 63113 bytes, 841x677) |  |  |  |
| details identity | PASS | Details preserved selected URL `post/12071379` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://wimg.rule34.xxx/.../828277bd0bd5d13e66f7d54f21205e48.jpeg <redacted query values: 12071379>` was not downloaded |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | rinn mayy |  |  |  |
| details genres | PASS | yandere simulator, yandere simulator (1980s), ritsuko chikanari, rinn mayy, 1girls, ass, ass focus, ball (object), beach ball, blue hair, boobs, female, looking at viewer, medium ass, red lingerie, short hair, sitting, sitting on ball, sitting on beach ball, solo, tits |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Rating: Explicit · **Score:** 80571 · **Size:** 841x677 · **Uploader:** onabis |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://wimg.rule34.xxx/.../828277bd0bd5d13e66f7d54f21205e48.jpeg <redacted query values: 12071379>` (image/jpeg, 63113 bytes, 841x677) |  |  |  |
