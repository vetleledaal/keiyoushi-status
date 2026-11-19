# Extension Validation Report

- Extension: tachiyomi-en.mangatown-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2703831045012166262
- Source name: Mangatown
- Source language: en
- Selected manga input: popular offset 0: Shokugeki no Soma (`.../shokugeki_no_soma`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Shokugeki no Soma (`.../shokugeki_no_soma`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Tomo-chan wa Onnanoko! (`.../tomo_chan_wa_onnanoko`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Kingdom (`.../kingdom`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Star Martial God Technique (`.../star_martial_god_technique`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Shokugeki no Soma (`.../shokugeki_no_soma`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Shokugeki no Soma (`.../shokugeki_no_soma`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 400 | Shokugeki no Soma One Shot (`.../c000`) |  | <1s |
| pages | `getPageList(chapter)` | success | 45 |  |  | <1s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Shokugeki no Soma, URL=`.../shokugeki_no_soma` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 123/123 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 123/123 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://fmcdn.mangahere.com/.../ocover.jpg <redacted query values: token, ttl, and v>` (image/jpeg, 28487 bytes, 200x314) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../shokugeki_no_soma` |  |  |  |
| details thumbnail URL | PASS | `http://fmcdn.mangahere.com/.../ocover.jpg <redacted query values: token, ttl, and v>` |  |  |  |
| details author | PASS | TSUKUDA Yuuto |  |  |  |
| details artist | PASS | SAEKI Shun |  |  |  |
| details genres | PASS | Comedy, Cooking, Drama, Ecchi, Romance, School Life |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Yukihira Souma's dream is to become a full-time chef in his father's restaurant and surpass his father's culinary skill. But just as Yukihira graduates from middle schools his father, Yukihira Jouichirou, closes down the restaurant to cook in Europe. Although downtrodden, Souma's fighting spirit is rekindled by a challenge from Jouichirou which is to survive in an elite culinary school where only 10% of the students graduate. Can Souma survive?  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description, chapter 3 name, chapter 4 name, chapter 5 name, chapter 6 name, chapter 7 name, chapter 8 name, chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 24 name, chapter 25 name, chapter 26 name, chapter 27 name, chapter 28 name, chapter 30 name, chapter 31 name, chapter 32 name, chapter 33 name, chapter 34 name, chapter 35 name, chapter 36 name, chapter 37 name, chapter 38 name, chapter 39 name, chapter 40 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 44 name, chapter 45 name, chapter 46 name, chapter 47 name, chapter 48 name, chapter 49 name, chapter 50 name, chapter 51 name, chapter 52 name, chapter 53 name, chapter 54 name, chapter 55 name, chapter 56 name, chapter 57 name, chapter 58 name, chapter 59 name, chapter 60 name, chapter 61 name, chapter 62 name, chapter 63 name, chapter 64 name, chapter 65 name, chapter 66 name, chapter 68 name, chapter 69 name, chapter 70 name, chapter 71 name, chapter 72 name, chapter 73 name, chapter 74 name, chapter 75 name, chapter 76 name, chapter 77 name, chapter 79 name, chapter 80 name, chapter 82 name, chapter 83 name, chapter 84 name, chapter 85 name, chapter 87 name, chapter 88 name, chapter 89 name, chapter 91 name, chapter 94 name, chapter 101 name, chapter 102 name, chapter 104 name, chapter 107 name, chapter 109 name, chapter 110 name, chapter 305 name, chapter 306 name, chapter 398 name |  |  |  |
| chapters | PASS | 400 chapters |  |  |  |
| chapter dates | PASS | 400 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://zjcdn.mangahere.org/.../dimg002.jpg` (image/jpeg, 205843 bytes, 819x1200) |  |  |  |
