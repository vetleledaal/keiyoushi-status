# Extension Validation Report

- Extension: tachiyomi-en.akazascans-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8513894820944573933
- Source name: Akaza Scans
- Source language: en
- Selected manga input: latest offset 0: Cryptocurrency Revenge (`.../coin-revenge`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 17 | Fair Trade Commission (`.../fair-trade-commission`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 17 | Cryptocurrency Revenge (`.../coin-revenge`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Cryptocurrency Revenge (`.../coin-revenge`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Cryptocurrency Revenge (`.../coin-revenge`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 3 | Chapter 11 (`.../coin-revenge-chapter-11`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 25 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | PASS | 17 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cryptocurrency Revenge, URL=`.../coin-revenge` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 35/35 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 35/35 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://akazascans.org/.../2-cover_1732136035423-207x300.webp` (image/webp (encoding: lossy), 12716 bytes, 207x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../coin-revenge` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://akazascans.org/.../2-cover_1732136035423.webp` (image/webp (encoding: lossy), 186702 bytes, 690x1000) |  |  |  |
| details author | PASS | Park seong-hyun |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Drama, Seinen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Yoo Beom, a genius college student who lost his family by an organization that manipulated cryptocurrency prices. Deciding to seek revenge, he hides his identity and infiltrates the cryptocurrency gangster organization , ‘ONE’ .He uses his genius brain to begin a bloody revenge on the cryptocurrency organization that ruined his life. This is a new cryptocurrency crime noir work.<br><br>Alternative Names: Coin Revenge Cryptocurrency Revenge 코인 리벤지 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://akazascans.org/.../d17d0d37c777ae8378295df879b96eaa.webp` (image/webp (encoding: lossy), 1944790 bytes, 800x9525) |  |  |  |
