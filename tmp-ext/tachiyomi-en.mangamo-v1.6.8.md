# Extension Validation Report

- Extension: tachiyomi-en.mangamo-v1.6.8
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6458420328066857684
- Source name: Mangamo
- Source language: en
- Selected manga input: popular offset 0: The Beginning of the End (`.../the-beginning-of-the-end <redacted query values: series>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | The Beginning of the End (`.../the-beginning-of-the-end <redacted query values: series>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | A.D.A (`.../a.d.a <redacted query values: series>`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 19 | FAIRY TAIL: 100 Years Quest (`.../fairy-tail%3A-100-years-quest <redacted query values: series>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 19 | The Daughter of Duke Doesn't Want To Be Spoiled (`.../the-daughter-of-duke-doesn%27t-want-to-be-spoiled <redacted query values: series>`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Beginning of the End (`.../the-beginning-of-the-end <redacted query values: series>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Beginning of the End (`.../the-beginning-of-the-end <redacted query values: series>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 11 | Chapter 1 (`<redacted URL #1: selected resource; relative; no scheme; query parameters: series and chapter>`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 55 |  |  | <1s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 19 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Beginning of the End, URL=`.../the-beginning-of-the-end <redacted query values: series>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 139/139 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 139/139 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://d12dr45elu3egb.cloudfront.net/.../title_art_fbb168c9-4057-4018-8d75-3fb65d1d3521.jpg` (image/jpeg, 86931 bytes, 285x450; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-beginning-of-the-end <redacted query values: series>` |  |  |  |
| details thumbnail URL | PASS | `https://d12dr45elu3egb.cloudfront.net/.../title_art_fbb168c9-4057-4018-8d75-3fb65d1d3521.jpg` |  |  |  |
| details author | PASS | Yoshida Hiroya |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Horror, Drama, Supernatural |  |  |  |
| details status | PASS | ON_HIATUS (6) |  |  |  |
| details description | PASS | One day, a giant egg appears in the middle of Tokyo and begins a countdown. People flock to it, imagining that it marks the beginning of a new utopia! But when the count reaches zero, what emerges from the egg will have devastating consequences for humanity. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | PASS | 11 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://d1yf5y28hthcut.cloudfront.net/.../0.jpg <redacted query values: Expires, Key-Pair-Id, and Signature>` (image/jpeg, 863093 bytes, 1414x2000) |  |  |  |
