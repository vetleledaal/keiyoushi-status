# Extension Validation Report

- Extension: tachiyomi-all.mangatoon-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 4795663388852759880
- Source name: MangaToon (Limited)
- Source language: en
- Selected manga input: popular offset 0: My Beloved Fool (`.../my-beloved-fool <redacted query values: content_id>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | My Beloved Fool (`.../my-beloved-fool <redacted query values: content_id>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 18 | Sweet Bites (`.../sweet-bites <redacted query values: content_id>`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 18 | CONGO THE SHIROGAMI TALWARBAAZ (`.../congo-the-shirogami-talwarbaaz <redacted query values: content_id>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | When Day Touches Night (`.../when-day-touches-night <redacted query values: content_id>`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | My Beloved Fool (`.../my-beloved-fool <redacted query values: content_id>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | My Beloved Fool (`.../my-beloved-fool <redacted query values: content_id>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | Episode 1 (`.../162995`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My Beloved Fool, URL=`.../my-beloved-fool <redacted query values: content_id>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cn-e-pic-aliyun.mangatoon.mobi/.../3446130fc77.webp-posterend6` (image/webp (encoding: lossy), 39904 bytes, 450x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../my-beloved-fool <redacted query values: content_id>` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cn-e-pic.mangatoon.mobi/.../3446130fc77.jpg-posterend6` (image/jpeg, 47202 bytes, 450x600) |  |  |  |
| details author | PASS | Kuaikan Comics |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Boys’ Love, LGBT+, Urban Romance, Tragic |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | After falling in love at first sight with his young brother's friend, Li Yu, Jian Suiying started employing various tactics to win favor with this cool-faced beauty, demonstrating a plethora of flirting techniques. He thought he had managed to win over Li Yu's heart, but then he discovered that Li Yu was using himself as bait, only to taste the bitterness of betrayal and hurt... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://en-c-pic.mangatoon.mobi/.../Y.jpg` (image/jpeg, 143079 bytes, 1000x1800) |  |  |  |
