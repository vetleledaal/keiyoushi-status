# Extension Validation Report

- Extension: tachiyomi-en.nuviatoon-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9071935154458913856
- Source name: Nuvia Toon
- Source language: en
- Selected manga input: popular offset 0: Heart Aching (`.../heart-aching`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Heart Aching (`.../heart-aching`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 18 | My Husband Was Definitely a Paladin [Novel] (`.../my-husband-was-definitely-a-paladin-novel`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 18 | Time Healer Ceres [Novel] (`.../time-healer-ceres-novel`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | After the possessor left (`.../after-the-possessor-left`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Heart Aching (`.../heart-aching`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Heart Aching (`.../heart-aching`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 22 | Chapter 1 (`.../1 <redacted query values: id>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 161 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Heart Aching, URL=`heart-aching` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://nuviatoon.com/.../beb6de0b-b410-456f-9b2a-5c4645518975.jpg` (image/jpeg, 1186693 bytes, 1023x1537) |  |  |  |
| details identity | PASS | Details preserved selected URL `heart-aching` |  |  |  |
| details thumbnail URL | PASS | `https://nuviatoon.com/.../beb6de0b-b410-456f-9b2a-5c4645518975.jpg` |  |  |  |
| details author | PASS | Jandirolppang |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Crime, Drama, Romance, Full Color, Webtoon/Webcomic, First Love, School Life, Shoujo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | My first love, Joo Arin, whom I met again after five years. Why has she changed so much? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 22 chapters |  |  |  |
| chapter dates | PASS | 22 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 161 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://nuviatoon.com/.../p-0001.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
