# Extension Validation Report

- Extension: tachiyomi-en.inkr-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 1
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6949560025265725268
- Source name: INKR
- Source language: en
- Selected manga input: popular offset 0: DEBORAH IS MY RIVAL (`.../ik-title-2804`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | DEBORAH IS MY RIVAL (`.../ik-title-2804`) |  | 10s+ |
| popular_next | `getPopularManga(2)` | success | 20 | I'm a Saint but I've Had Enough With Humans So I Decided to Team up with the Demon Queen to Destroy The Human World (`.../ik-title-4466`) |  | 10s+ |
| latest | `getLatestUpdates(1)` | success | 20 | The Making of A Miraculous Doctor (`.../ik-title-4013`) |  | 10s+ |
| latest_next | `getLatestUpdates(2)` | success | 20 | I Died at Your Behest (`.../ik-title-5407`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 503 | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | DEBORAH IS MY RIVAL (`.../ik-title-2804`) |  | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Free Preview Chapter (`.../ik-chapter-157125`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 503 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | SKIP | HTTP error 503 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i1.inkr.com/.../900.jpg` (image/jpeg, 160610 bytes, 900x1350) |  |  |  |
| details identity | PASS | Details preserved selected URL `ik-title-2804` |  |  |  |
| details thumbnail URL | PASS | `https://i1.inkr.com/.../900.jpg` |  |  |  |
| details author | PASS | KAORU TADA, minato-pro/Mz-plan, MEDIADO |  |  |  |
| details artist | PASS | KAORU TADA, minato-pro/Mz-plan, MEDIADO |  |  |  |
| details genres | PASS | Manga, Comedy, Romance, Love Polygon, Teen Girls, Neighbors |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Asayo starts university and lives alone for the first time.  However the handsome blonde buy living next door turns out to be an Okama! Umenosuke Ichimatsu of the famous tea ceremony family is a cool guy who goes by the name of "Deborah." But unfortunately, he's a girl on the inside. So Asayo hangs out with him as a girlfriend… and falls in love with him? A super happy Rom-com!<br>This series has been published in Japan since 1996 which Japanese title name is "Deborah ga Rival" |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.inkr.com/.../w1600.ikc` (image/webp (container: extended), 337450 bytes, 1280x2018; server Content-Type: application/octet-stream) |  |  |  |
