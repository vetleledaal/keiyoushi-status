# Extension Validation Report

- Extension: tachiyomi-pt.pinkrosa-v1.6.21
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 8456404960509331854
- Source name: Pink Rosa
- Source language: pt-BR
- Selected manga input: popular offset 0: Kanchigai no Atelier Meister (`.../kanchigai-no-atelier-meister_5.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Kanchigai no Atelier Meister (`.../kanchigai-no-atelier-meister_5.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | The Stellar Swordmaster (`.../the-stellar-swordmaster.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kanchigai no Atelier Meister (`.../kanchigai-no-atelier-meister_5.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kanchigai no Atelier Meister (`.../kanchigai-no-atelier-meister_5.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 56 | Chapter 01 (`.../cap-01_5.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 38 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kanchigai no Atelier Meister, URL=`.../kanchigai-no-atelier-meister_5.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../00.jpg` (image/jpeg, 203475 bytes, 600x855) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kanchigai-no-atelier-meister_5.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../00.jpg` (image/jpeg, 538068 bytes, 1123x1600) |  |  |  |
| details author | PASS | Tokino Yousuke, Hurukawa Naharu |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasia |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Kuruto é expulso da equipe do herói por ser muito inútil. No entanto, ele descobre que em todo o resto, como cozinhar, construir, criar ferramentas mágicas, etc., ele é classificado como SSS. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 56 chapters |  |  |  |
| chapter dates | PASS | 56 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../AVvXsEgvnDslKpdWd2NYVMY99bXBuge9ekvyZMEjymJ4OF5ib7WzvG_HL8KDQ604yjJMrIdd6aYJ2Zc9rH9pq1D3tUwUPhz3v8FnwMj0sEdS2D2eU5y_AyqoqWOBXUBEKy9KSuF2qML7Az_IWVWMTnaCas5_luwjKTL9-VJ8s31LJmqSJXfV81agkoE5yppsFw` (image/jpeg, 354588 bytes, 1080x1536) |  |  |  |
