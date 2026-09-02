# Extension Validation Report

- Extension: tachiyomi-it.hastateam-v1.6.6
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3278618591126542009
- Source name: Hasta Team
- Source language: it
- Selected manga input: popular offset 0: 10th Dimension Boys (`.../10th_dimension_boys`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 62 | 10th Dimension Boys (`.../10th_dimension_boys`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Karate Shoukoushi Kohinata Minoru (`.../karate_shoukoushi_kohinata_minoru`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 10th Dimension Boys (`.../10th_dimension_boys`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 10th Dimension Boys (`.../10th_dimension_boys`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 174 | Vol.0 Ch.1 - Una casa nel bosco (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 3 |  |  | 1-10s |

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
| popular listing | PASS | 62 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=10th Dimension Boys, URL=`.../10th_dimension_boys` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://reader.hastateam.com/.../10th_dimension_boys_icon.png <redacted query values: v>` (image/png, 21421 bytes, 220x220) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../10th_dimension_boys` |  |  |  |
| details thumbnail URL | PASS | `https://reader.hastateam.com/.../10th_dimension_boys_icon.png <redacted query values: v>` |  |  |  |
| details author | PASS | Cutbu |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Commedia, Slice of Life |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Storie brevi dei ragazzi nella decima dimensione. Scoregge, cagate, volgarità e comicità becera... Ma ha anche dei difetti!
<br>
<br>Non dimenticate di aggiungere gli sticker Telegram di 10th Dimension Boys! Li potete trovare qui: https://t.me/.../TenthDimension |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name, chapter 5 name, chapter 6 name, chapter 7 name, chapter 8 name, chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 24 name, chapter 25 name, chapter 26 name, chapter 27 name, chapter 28 name, chapter 29 name, chapter 30 name, chapter 31 name, chapter 32 name, chapter 33 name, chapter 34 name, chapter 35 name, chapter 36 name, chapter 37 name, chapter 38 name, chapter 39 name, chapter 40 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 44 name, chapter 45 name, chapter 46 name, chapter 47 name, chapter 48 name, chapter 49 name, chapter 50 name, chapter 51 name, chapter 52 name, chapter 53 name, chapter 54 name, chapter 55 name |  |  |  |
| chapters | PASS | 174 chapters |  |  |  |
| chapter dates | PASS | 174 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 3 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://reader.hastateam.com/.../10th_Dimension_Boys_c001_p01%5BHTT%5D.png <redacted query values: v>` (image/png, 102021 bytes, 500x1268) |  |  |  |
