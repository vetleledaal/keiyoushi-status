# Extension Validation Report

- Extension: tachiyomi-en.readnanatsunotaizai7deadlysinsmangaonline-v1.4.11
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 22
- Lint: 4
- Warnings: 1
- Skipped: 8
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3945031984510180731
- Source name: Read Nanatsu no Taizai 7 Deadly Sins Manga Online
- Source language: en
- Selected manga input: popular offset 0: Four Horsemen of the Apocalypse (`https://ww8.read7deadlysins.com/.../four-horsemen-of-the-apocalypse`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 11 | Four Horsemen of the Apocalypse (`https://ww8.read7deadlysins.com/.../four-horsemen-of-the-apocalypse`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Four Horsemen of the Apocalypse (`https://ww8.read7deadlysins.com/.../four-horsemen-of-the-apocalypse`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Four Horsemen of the Apocalypse (`https://ww8.read7deadlysins.com/.../four-horsemen-of-the-apocalypse`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 254 | Four Horsemen of the Apocalypse Chapter 1 - The boy Sets off (`https://ww8.read7deadlysins.com/.../four-horsemen-of-the-apocalypse-chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 71 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 11 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Four Horsemen of the Apocalypse, URL=`https://ww8.read7deadlysins.com/.../four-horsemen-of-the-apocalypse` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 1 manga entry: title=Four Horsemen of the Apocalypse, URL=`https://ww8.read7deadlysins.com/.../four-horsemen-of-the-apocalypse` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | LINT | 12/12 listing manga have titles and URLs; popular: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://ww8.read7deadlysins.com/.../four-horsemen-of-the-apocalypse`, popular entry 2: `https://ww8.read7deadlysins.com/.../mayoe-nanatsu-no-taizai-gakuen`, popular entry 3: `https://ww8.read7deadlysins.com/.../nanatsu-no-taizai-seven-days` |  |  |  |
| thumbnail URLs | LINT | 0/12 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `https://ww8.read7deadlysins.com/.../four-horsemen-of-the-apocalypse` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../kgIqH74.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Alternative name: Mokushiroku no Yonkishi The Four Horsemen of the Apocalypse 「黙示録の四人の騎士, Mokushiroku no shi-ri no kishi」are an extremely powerful group of four elite warriors of the Britannia's largest clans. It's main goal is to bring a new holy war to the world. All its members are children of the Seven Deadly Sins. In addition, everyone has peculiarities that set them apart from their clans. Each of them has a symbol embedded in his body, symbolizing which knight he is Each horsemen has a special ability, called the "Horse," which names them within the group. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 254 chapters |  |  |  |
| chapter dates | LINT | All 254 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=254 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 254 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 71 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.readneverland.com/.../2.jpeg <redacted query values: t>` (image/jpeg, 148329 bytes, 1067x1600) |  |  |  |
