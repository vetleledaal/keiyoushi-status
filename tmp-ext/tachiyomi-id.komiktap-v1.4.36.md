# Extension Validation Report

- Extension: tachiyomi-id.komiktap-v1.4.36
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8162933120097302217
- Source name: Komiktap
- Source language: id
- Selected manga input: popular offset 0: Secret Class (`.../secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 25 | Secret Class (`.../secret-class`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 25 | Living With a MILF (`.../living-with-a-milf`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 25 | Wireless Onahole (`.../wireless-onahole`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 25 | Shitataru Kano Haha (`.../shitataru-kano-haha`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | Secret Class (`.../secret-class`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Secret Class (`.../secret-class`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 315 | Chapter 01 (`.../secret-class-chapter-1`) |  | 1-10s |
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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`.../secret-class` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 103/103 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 103/103 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://komiktap.info/.../SECRET-CLASS-PORTA-006.jpg` (image/jpeg, 28873 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-class` |  |  |  |
| details thumbnail URL | PASS | `https://komiktap.info/.../SECRET-CLASS-PORTA-006.jpg` |  |  |  |
| details author | PASS | Wang Kang Cheol |  |  |  |
| details artist | PASS | Mina-chan |  |  |  |
| details genres | PASS | Adult, Drama, Full color, Harem, Manhwa, Romance, Seinen, Webtoon, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | yang jelas anak di buang dan netnot ama bibinya<br><br>Alternative Names: 비밀수업, 秘密教學 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 315 chapters |  |  |  |
| chapter dates | LINT | 196 of 315 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=196 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.komikindo.info/.../1.jpg` (image/jpeg, 59325 bytes, 720x880) |  |  |  |
