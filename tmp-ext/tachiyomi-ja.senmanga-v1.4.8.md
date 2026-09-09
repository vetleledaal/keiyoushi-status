# Extension Validation Report

- Extension: tachiyomi-ja.senmanga-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 1
- Warnings: 0
- Skipped: 1
- Failed: 2
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7715542271185249444
- Source name: Sen Manga
- Source language: ja
- Selected manga input: latest offset 0: Nankuru Nee-san (`.../nankuru-nee-san`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Tensei Shitara Joban de Shinu Naka Boss Datta - Heroine Kenzokuka de Ikinokoru (`.../tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | One Piece (`.../one-piece`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 39 | Nankuru Nee-san (`.../nankuru-nee-san`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 24 | Tensei Shitara Joban de Shinu Naka Boss Datta - Heroine Kenzokuka de Ikinokoru (`.../tensei-shitara-joban-de-shinu-naka-boss-datta-heroine-kenzokuka-de-ikinokoru`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Nankuru Nee-san (`.../nankuru-nee-san`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 2 | Chapter 29 (`.../29.399043`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 39 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 24 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | HTTP error 500 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 111/111 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 111/111 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rawkuma.net/.../i327154.jpg` (image/jpeg, 10878 bytes, 160x227) |  |  |  |
| details identity | PASS | Details preserved selected URL `nankuru-nee-san` |  |  |  |
| details thumbnail URL | PASS | `https://rawkuma.net/.../i327154.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy,Ecchi,Romance,Seinen,Slice of Life |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Issa Kinishi, a young man who worries and concerns himself too much over many different things, and spends his life being harmless and inoffensive. One day he meets a beautiful, tanned enigmatic young woman. This young woman uses a smartphone with a cracked screen, goes into restaurants without caring about their online ratings, and makes \[…\] |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://kuma.kyut.dev/.../1.jpg` (image/jpeg, 416765 bytes, 975x1400) |  |  |  |
