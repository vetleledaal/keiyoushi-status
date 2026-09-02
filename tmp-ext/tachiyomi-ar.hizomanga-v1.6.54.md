# Extension Validation Report

- Extension: tachiyomi-ar.hizomanga-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 16
- Lint: 0
- Warnings: 0
- Skipped: 18
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4177563748162518441
- Source name: Hizo Manga
- Source language: ar
- Selected manga input: latest offset 0: even if i fall into a horror story, i still have to go to work (`.../160224`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Your Eternal Lies (`.../12346`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | I’ve been Proposed to by a Villain (`.../5726`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | even if i fall into a horror story, i still have to go to work (`.../160224`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Lion Heart (Choi Soo-hyun) (`.../24805`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | even if i fall into a horror story, i still have to go to work (`.../160224`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | java.lang.NullPointerException | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | java.lang.NullPointerException | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=even if i fall into a horror story, i still have to go to work, URL=`160224` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hizomanga.net/.../%D8%AD%D8%AA%D9%89-%D9%84%D9%88-%D9%88%D9%82%D8%B9%D8%AA-%D9%81%D9%8A-%D9%82%D8%B5%D8%A9-%D8%B1%D8%B9%D8%A8-%D9%8A%D8%AC%D8%A8-%D8%A3%D9%86-%D8%A3%D8%B0%D9%87%D8%A8-%D9%84%D9%84%D8%B9%D9%85%D9%84.png` (image/png, 1449710 bytes, 720x1030) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | SKIP | No details metadata to check |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
