# Extension Validation Report

- Extension: tachiyomi-fr.scantradunion-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 29
- Lint: 1
- Warnings: 2
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 155525085323453412
- Source name: Scantrad Union
- Source language: fr
- Selected manga input: popular offset 0: Aiki (`.../aiki`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 210 | Aiki (`.../aiki`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 186 | Giant Killing (`.../giant-killing`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 4 | Aiki-S (`.../aiki-s`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Aiki (`.../aiki`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 98 | 1 (`.../page-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| popular listing | PASS | 210 entries |  |  |  |
| latest listing | PASS | 186 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Aiki, URL=`.../aiki` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 7 manga entries; Latest page 1 repeats 168 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 400/400 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 400/400 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://scantrad-union.com/.../default.svg` -> 2 manga URLs (examples: `.../series-licenciees`, `.../series-licenciees-2`) |  |  |  |
| thumbnail | PASS | `https://scantrad-union.com/.../Aiki-2-e1542056582787.jpg` (image/jpeg, 10980 bytes, 200x172) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../aiki` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://scantrad-union.com/.../Aiki-Tome-1-Chap-01-00.jpg` (image/jpeg, 198323 bytes, 873x1200) |  |  |  |
| details author | PASS | Itsutoshi |  |  |  |
| details artist | PASS | Itsutoshi |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Le lycée Juzenji enseigne divers arts martiaux. Après le départ en voyage de son directeur, des batailles font rages pour la position de dominant. Deux filles semblent être en course pour régner : Miu Takatori avec à sa solde la quasi totalité des clubs contre la petite fille du directeur soutenue par deux professeurs. Cette dernière va aller chercher l'aide d'un jeune homme fou de sexe et maître dans l'art du combat. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 scanlator, chapter 2 scanlator, chapter 3 scanlator, chapter 4 scanlator, chapter 5 scanlator, chapter 6 scanlator, chapter 7 scanlator, chapter 8 scanlator, chapter 9 scanlator, chapter 10 scanlator, chapter 11 scanlator, chapter 12 scanlator, chapter 13 scanlator, chapter 14 scanlator, chapter 15 scanlator, chapter 16 scanlator, chapter 17 scanlator, chapter 18 scanlator, chapter 19 scanlator, chapter 20 scanlator, chapter 21 scanlator, chapter 22 scanlator, chapter 23 scanlator, chapter 24 scanlator, chapter 25 scanlator, chapter 26 scanlator, chapter 27 scanlator, chapter 28 scanlator, chapter 29 scanlator, chapter 30 scanlator, chapter 31 scanlator, chapter 32 scanlator, chapter 33 scanlator, chapter 34 scanlator, chapter 35 scanlator, chapter 36 scanlator, chapter 37 scanlator, chapter 38 scanlator, chapter 39 scanlator, chapter 40 scanlator, chapter 41 scanlator, chapter 42 scanlator, chapter 43 scanlator, chapter 44 scanlator, chapter 45 scanlator, chapter 46 scanlator, chapter 47 scanlator, chapter 48 scanlator, chapter 49 scanlator, chapter 50 scanlator, chapter 51 scanlator, chapter 52 scanlator, chapter 53 scanlator, chapter 54 scanlator, chapter 55 scanlator, chapter 56 scanlator, chapter 57 scanlator, chapter 58 scanlator, chapter 59 scanlator, chapter 60 scanlator, chapter 61 scanlator, chapter 62 scanlator, chapter 63 scanlator, chapter 64 scanlator, chapter 65 scanlator, chapter 66 scanlator, chapter 67 scanlator, chapter 68 scanlator, chapter 69 scanlator, chapter 70 scanlator, chapter 71 scanlator, chapter 72 scanlator, chapter 73 scanlator, chapter 74 scanlator, chapter 75 scanlator, chapter 76 scanlator, chapter 77 scanlator, chapter 78 scanlator, chapter 79 scanlator, chapter 80 scanlator, chapter 81 scanlator, chapter 82 scanlator, chapter 83 scanlator, chapter 84 scanlator, chapter 85 scanlator, chapter 86 scanlator, chapter 87 scanlator, chapter 88 scanlator, chapter 89 scanlator, chapter 90 scanlator, chapter 91 scanlator, chapter 92 scanlator, chapter 93 scanlator, chapter 94 scanlator, chapter 95 scanlator, chapter 96 scanlator, chapter 97 scanlator, chapter 98 scanlator |  |  |  |
| chapters | PASS | 98 chapters |  |  |  |
| chapter dates | PASS | 98 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://scantrad-union.com/.../Aiki-Tome-1-Chap-01-00.jpg` (image/jpeg, 267436 bytes, 873x1200) |  |  |  |
