# Extension Validation Report

- Extension: tachiyomi-en.reimanga-v1.6.5
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 23
- Lint: 1
- Warnings: 1
- Skipped: 10
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5627909338430537186
- Source name: ReiManga
- Source language: en
- Selected manga input: popular offset 0: Behind the Stage (`.../behind-the-stage-99362`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | Behind the Stage (`.../behind-the-stage-99362`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Jinx (`.../jinx-82002`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Solitude Murder (`.../solitude-murder-108153`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Azur Lane - Akagi² (`.../azur-lane-akagi-108013`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Behind the Stage (`.../behind-the-stage-99362`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Behind the Stage (`.../behind-the-stage-99362`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Behind the Stage, URL=`behind-the-stage-99362` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Dear Door, URL=`dear-door-o38a7ec-47331` at page 1 offset 1 and page 2 offset 12, title=Dangerous Convenience Store, URL=`dangerous-convenience-store-qw-64958` at page 1 offset 4 and page 2 offset 7, title=Payback, URL=`payback-70187` at page 1 offset 10 and page 2 offset 17, title=Roses and Champagne, URL=`roses-and-champagne-71208` at page 1 offset 14 and page 2 offset 1, title=Shutline, URL=`shutline-b-69533` at page 1 offset 22 and page 2 offset 6 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 173/173 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 173/173 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://reimanga.net/.../thumbnail.png` (image/jpeg, 10933 bytes, 200x271; server Content-Type: image/png) |  |  |  |
| details identity | PASS | Details preserved selected URL `behind-the-stage-99362` |  |  |  |
| details thumbnail URL | PASS | `https://reimanga.net/.../thumbnail.png` |  |  |  |
| details author | PASS | Kim Gunsu |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Long Strip, Boys' Love, Yaoi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★☆ 8.98<br><br>Jin-woo, a dedicated model student, experiences his first time clubbing, leading to an impulsive one-night stand with a handsome stranger. He wakes up alone to find 50,000 won bills, mistakenly believing he was paid for sex, an incident he tries to forget. The art style features clean lines and vibrant colors, immediately establishing a contemporary setting. Upon returning to university, Jin-woo assists his juniors with a performance, and on stage, he spots the man from that night: Kwon Tae-young. Tae-young, with a striking visual presence, locks eyes with Jin-woo and declares, “Found you.” This chance encounter sets the stage for a dramatic and potentially comedic romance within a university environment, hinting at a dynamic between the earnest Jin-woo and the charismatic Tae-young.<br><br>Alternative Titles:<br>- 스테이지 비하인드<br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
