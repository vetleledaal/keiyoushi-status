# Extension Validation Report

- Extension: tachiyomi-all.ososedki-v1.4.1
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
- Source ID: 703138310497011533
- Source name: OSOSEDKI
- Source language: all
- Selected manga input: popular offset 0: Yuzuki 13 (`.../-196439351_282852958`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Yuzuki 13 (`.../-196439351_282852958`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Adina Luna - Yor Forger - Spy X Family (`.../-10000001_10009434`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Caticornplay - Holo - Spice And Wolf Ookami To Koushinryou (`.../-10000001_10016053`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Tsubaki1314 - Marie Rose - Dead Or Alive (`.../-10000001_10016029`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Yuzuki 13 (`.../-196439351_282852958`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Yuzuki (`.../-196439351_282852958`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Gallery (`.../-196439351_282852958`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 56 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Yuzuki 13, URL=`-196439351_282852958` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ososedki.com/.../282852958.webp` (image/webp (encoding: lossy), 42086 bytes, 600x898) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Yuzuki 13 to Yuzuki |  |  |  |
| details thumbnail URL | PASS | `https://ososedki.com/.../282852958.webp` |  |  |  |
| details author | PASS | Yuzuki |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Yuzuki |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ososedki.com/.../457262383.webp` (image/webp (encoding: lossy), 65122 bytes, 1280x1917) |  |  |  |
