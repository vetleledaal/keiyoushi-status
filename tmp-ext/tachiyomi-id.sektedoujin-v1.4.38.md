# Extension Validation Report

- Extension: tachiyomi-id.sektedoujin-v1.4.38
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7949854430526190429
- Source name: Sekte Doujin
- Source language: id
- Selected manga input: popular offset 0: Secret Class (`.../secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Secret Class (`.../secret-class`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Got a Room? (Uncensored) (`.../got-a-room-uncensored`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Mind Control (`.../mind-control`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | The Teachers’ Effort (`.../the-teachers-effort`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Secret Class (`.../secret-class`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Secret Class (`.../secret-class`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 314 | Chapter 01 (`.../secret-class-chapter-01`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 23 |  |  | 1-10s |

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
| details identity | PASS | Details preserved selected URL `.../secret-class` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i3.wp.com/.../1630325449-6140-1599143273-1587994562-18d05012257a6c75f0716ca4809cdb40.jpg` (image/jpeg, 33496 bytes, 434x600) |  |  |  |
| details author | PASS | Wang Kang Cheol |  |  |  |
| details artist | PASS | Wang Kang Cheol |  |  |  |
| details genres | PASS | Adult, Drama, Harem, Romance, Seinen, Webtoon, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | yang jelas anak di buang dan netnot ama bibinya<br><br>Alternative Names: 비밀수업, 秘密教學 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 314 chapters |  |  |  |
| chapter dates | PASS | 314 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.komikindo.info/.../1.jpg` (image/jpeg, 59325 bytes, 720x880) |  |  |  |
