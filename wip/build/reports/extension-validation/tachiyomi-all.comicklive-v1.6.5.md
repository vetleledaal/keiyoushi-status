# Extension Validation Report

- Extension: tachiyomi-all.comicklive-v1.6.5
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 20
- Lint: 2
- Warnings: 1
- Skipped: 10
- Failed: 4
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4972933717624256217
- Source name: Comick (Unoriginal)
- Source language: all
- Selected manga input: popular offset 0: Calamity Summoner (`.../calamity-summoner`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 9 | Calamity Summoner (`.../calamity-summoner`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 9 | Calamity Summoner (`.../calamity-summoner`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 100 | Social Coin: Your Price (`.../social-coin-your-price`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 100 | Who Made Mea Princess (`.../who-made-mea-princess`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Calamity Summoner (`.../calamity-summoner`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 9 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | SKIP | HTTP error 403 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | UNUSUAL | Overlapping manga: title=True Sword, URL=`true-sword` at page 1 offsets 58, 82, 83, 84 and page 2 offset 99, title=Office Worker's Love Hotel Guys' Night, URL=`office-workers-love-hotel-guys-night` at page 1 offset 94 and page 2 offsets 7, 8, 9, 29, 32, 33, 34, 35 |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 25 manga entries; Latest page 2 repeats 55 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 218/218 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 218/218 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn1.comicknew.pictures/.../40bb6193.webp` (image/webp (encoding: lossy), 35950 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `calamity-summoner` |  |  |  |
| details thumbnail URL | PASS | `https://cdn1.comicknew.pictures/.../40bb6193.webp` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Action, Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Calamity Summoner summary: Reborn in an alternate world, a protagonist vows to save humanity at all costs by summoning every disaster level boss to fight on their side.<br><br>Original Webtoon: AC.QQ, BiliBili, KuaiKan<br><br> Alternative Titles: <br>- Summoner of Calamity, Invocador de calamidades, Призыватель Плети, 天灾召唤师 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
