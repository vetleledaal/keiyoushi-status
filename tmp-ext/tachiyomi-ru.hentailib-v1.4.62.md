# Extension Validation Report

- Extension: tachiyomi-ru.hentailib-v1.4.62
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: libgroup
- Source ID: 6425650164840473547
- Source name: HentaiLib
- Source language: ru
- Selected manga input: latest offset 0: Collection from Satow Tewu (`.../224335--collection-from-satow-tewu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 60 | Adabana (`.../33052--adabana`) |  | 10s+ |
| popular_next | `fetchPopularManga(2)` | success | 60 | From Me to You (`.../56835--from-me-to-you`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 15 | Collection from Satow Tewu (`.../224335--collection-from-satow-tewu`) |  | 10s+ |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | I Sold My Body To a God (`.../116432--i-sold-my-body-to-a-god`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Collection from Satow Tewu (`.../224335--collection-from-satow-tewu`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Collection from Satow Tewu (`.../224335--collection-from-satow-tewu`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 3 | Том 1. Глава 1 (`.../chapter <redacted query values: , volume, and number>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Collection from Satow Tewu, URL=`.../224335--collection-from-satow-tewu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 151/151 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 151/151 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.cdnlibs.org/.../ed580625-f53b-4e8f-97ea-2e5ef9a604e7.jpg` (image/jpeg, 54008 bytes, 375x525) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../224335--collection-from-satow-tewu` |  |  |  |
| details thumbnail URL | PASS | `https://cover.cdnlibs.org/.../ed580625-f53b-4e8f-97ea-2e5ef9a604e7.jpg` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | Satow Tewu |  |  |  |
| details genres | PASS | Манга, 18+ (RX), Яой, Анал, Анилингус, Много парней |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Сборник от Satow Tewu<br>★★★★☆ 8.4 (голосов: 58)<br>Больше работ на странице нашей команды или в разделе “похожее”<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 404 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
