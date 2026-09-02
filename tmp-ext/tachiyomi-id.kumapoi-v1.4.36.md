# Extension Validation Report

- Extension: tachiyomi-id.kumapoi-v1.4.36
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 27
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5075847076783200426
- Source name: KumaPoi
- Source language: id
- Selected manga input: popular offset 0: Secret Class (`.../secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Secret Class (`.../secret-class`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | The Main Character is the Villain (`.../the-main-character-is-the-villain`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Mind Control (`.../mind-control`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | The Teachers’ Effort (`.../the-teachers-effort`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Secret Class (`.../secret-class`) |  | <1s |
| details | `fetchMangaDetails(manga)` | error | 0 |  | java.lang.NullPointerException | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 314 | Chapter 01 (`.../secret-class-chapter-01`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 23 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`.../secret-class` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i3.wp.com/.../1630325449-6140-1599143273-1587994562-18d05012257a6c75f0716ca4809cdb40.jpg <redacted query values: resize>` (image/jpeg, 7806 bytes, 165x225) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 314 chapters |  |  |  |
| chapter dates | LINT | 127 of 314 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=127 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.komikindo.info/.../1.jpg` (image/jpeg, 59325 bytes, 720x880) |  |  |  |
